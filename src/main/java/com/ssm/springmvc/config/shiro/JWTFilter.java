package com.ssm.springmvc.config.shiro;

import org.apache.shiro.web.filter.AccessControlFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JWTFilter extends AccessControlFilter {

    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());




    /**
     * 判断用户是否想要登入。
     * 检测header里面是否包含Authorization字段即可
     */

    protected boolean isLoginAttempt(ServletRequest request, ServletResponse response) {

        return getToken(request,response) != null;
    }



    protected boolean executeLogin(ServletRequest request, ServletResponse response) throws Exception {
        String authorization = getToken(request,response);

        // 如果没有抛出异常则代表登入成功，返回true
        return true;
    }

    /**
     * 这里我们详细说明下为什么最终返回的都是true，即允许访问
     * 例如我们提供一个地址 GET /article
     * 登入用户和游客看到的内容是不同的
     * 如果在这里返回了false，请求会被直接拦截，用户看不到任何东西
     * 所以我们在这里返回true，Controller中可以通过 subject.isAuthenticated() 来判断用户是否登入
     * 如果有些资源只有登入用户才能访问，我们只需要在方法上面加上 @RequiresAuthentication 注解即可
     * 但是这样做有一个缺点，就是不能够对GET,POST等请求进行分别过滤鉴权(因为我们重写了官方的方法)，但实际上对应用影响不大
     */
    @Override
    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object o) throws Exception {
        String authorization = getToken(request,response);
        if (!StringUtils.isEmpty(authorization)){
            //执行登陆
            JWTToken token = new JWTToken(authorization);
            // 提交给realm进行登入，如果错误他会抛出异常并被捕获
            try {
                getSubject(request, response).login(token);
            }catch (Exception e){
                responselogin(request, response);
                return false ;
            }
        }else{
            responselogin(request, response);
            return false ;
        }
        return true ;
    }


    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
        return false;
    }




    /**
     * 对跨域提供支持
     */
    @Override
    protected boolean preHandle(ServletRequest request, ServletResponse response) throws Exception {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        httpServletResponse.setHeader("Access-control-Allow-Origin", httpServletRequest.getHeader("Origin"));
        httpServletResponse.setHeader("Access-Control-Allow-Methods", "GET,POST,OPTIONS,PUT,DELETE");
        httpServletResponse.setHeader("Access-Control-Allow-Headers", httpServletRequest.getHeader("Access-Control-Request-Headers"));
        // 跨域时会首先发送一个option请求，这里我们给option请求直接返回正常状态
        if (httpServletRequest.getMethod().equals(RequestMethod.OPTIONS.name())) {
            httpServletResponse.setStatus(HttpStatus.OK.value());
            return false;
        }
        return super.preHandle(request, response);
    }

    /**
     * 将非法请求跳转到 /401
     */
    private void response401(ServletRequest req, ServletResponse resp) {
        try {
            HttpServletResponse httpServletResponse = (HttpServletResponse) resp;
            httpServletResponse.sendRedirect("/error/401.html");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 未登录的请求跳到登陆页面
     */
    private void responselogin(ServletRequest request, ServletResponse resp) throws Exception{
        try {
            if (isMobile(request)){

                throw new Exception("请登录");
            }
            HttpServletResponse httpServletResponse = (HttpServletResponse) resp;
            httpServletResponse.sendRedirect("/login");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /*
        获取token
     */
    private String getToken(ServletRequest request, ServletResponse response){
        HttpServletRequest req = (HttpServletRequest) request;
        String token = null;
       // token = ((HttpServletRequest) request).getHeader("Authorization");
        Cookie[] cookies = ((HttpServletRequest) request).getCookies();
        if (cookies != null ) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("Authorization") && StringUtils.isEmpty(cookie.getValue())) {
                    token = cookie.getValue();
                }
            }
        }
        if (StringUtils.isEmpty(token)){
            token = ((HttpServletRequest) request).getHeader("Authorization");
        }
        return token;
    }

    /**
     * 判断请求是否为移动端请求
     * @return
     */
    public boolean isMobile(ServletRequest request){
        String s1 = ((HttpServletRequest) request).getHeader("user-agent");
        if(s1.contains("Android") || s1.contains("iPhone") || s1.contains("iPad")) {
            return true ;
        }
        return false ;
    }
}
