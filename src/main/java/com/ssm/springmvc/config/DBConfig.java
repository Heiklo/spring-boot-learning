package com.ssm.springmvc.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.sql.DataSource;
import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


@Configuration
public class DBConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource getDataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        return dataSource;
    }


//    @WebServlet(name="druidStatViewServlet",urlPatterns={"/druid/*"},initParams = {
//            @WebInitParam(name="loginUsername",value = "root"),
//    @WebInitParam(name = "loginPassword",value = "123456"),
//    @WebInitParam(name = "resetEnable",value = "false"),
//    @WebInitParam(name="allow",value = "127.0.0.1")} )
//    public class DruidStatViewServlet extends StatViewServlet{
//
//    }
//
//
//    @WebFilter(filterName="druidWebStatFilter",urlPatterns={"/*"},initParams = {
//            @WebInitParam(name="exclusions",value = "*.css,*.js,/druid/*")} )
//    public class CCWebStatFilter extends WebStatFilter{
//
//    }


    @Bean
    public ServletRegistrationBean statccViewServlet(){

        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
        Map<String, String> initParameters = new HashMap<>();
//        initParameters.put("loginUsername", "admin");
//        initParameters.put("loginPassword", "123456");
        initParameters.put("resetEnable", "true");
        initParameters.put("allow", "");
        servletRegistrationBean.setInitParameters(initParameters);

        return servletRegistrationBean;

    }

    @Bean
    public FilterRegistrationBean webccStatFilter(){

        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new WebStatFilter());

        Map<String, String> initParameters = new HashMap<>();
        initParameters.put("sessionStatMaxCount","15");
        initParameters.put("exclusions","*.css,*.js,/druid/*");
        filterRegistrationBean.setUrlPatterns(Collections.singletonList("/*"));
        filterRegistrationBean.setInitParameters(initParameters);
        return filterRegistrationBean;

    }

}
