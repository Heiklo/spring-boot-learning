package com.ssm.springmvc.config.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class RealmConfig extends AuthorizingRealm {


    /**
     * 大坑！，必须重写此方法，不然Shiro会报错
     */
    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof JWTToken;
    }


    /**
     * 用户授权
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        String token = (String) principalCollection.getPrimaryPrincipal();
        String username = JWTUtil.getUsername(token);
        List<String> stringRole=new ArrayList<>();
        List<String> stringPermission=new ArrayList<>();

        //写一个方法根据token中的用户名获得用户角色和权限信息,返回信息

        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.addRoles(stringRole);
        info.addStringPermissions(stringPermission);
        return info;
    }

    /**
     * 用户验证,登录验证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String token = (String) authenticationToken.getPrincipal();

        if (loginVerify(token)){
            throw new AuthenticationException("用户名密码错误");
        }
        return new SimpleAuthenticationInfo(token,token,"myRealm");
    }

    public boolean loginVerify(String token) throws AuthenticationException{

        if (StringUtils.isEmpty(token)){
            return false;
        }
        String username = JWTUtil.getUsername(token);
        if (StringUtils.isEmpty(username)){
            return false;
        }
        String password = "123456";
        //根据用户查询数据库中的用户是否存在，获得用户名和密码

        if (!JWTUtil.verify(token,username,password)){
            return false;
        }
        return true;

    }

}
