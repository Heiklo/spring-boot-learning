package com.ssm.springmvc.config.shiro;

import org.apache.shiro.mgt.DefaultSessionStorageEvaluator;
import org.apache.shiro.mgt.DefaultSubjectDAO;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;

import javax.servlet.Filter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class ShiroConfig {

    @Bean("shiroFilter")
    public ShiroFilterFactoryBean factory(DefaultWebSecurityManager securityManager) {
        ShiroFilterFactoryBean factoryBean = new ShiroFilterFactoryBean();

        //设置如果未登录时需要跳转的url
        factoryBean.setLoginUrl("");

        // 添加自己的过滤器并且取名为jwt
        Map<String, Filter> filterMap = new HashMap<>();
        filterMap.put("jwt", new JWTFilter());
        factoryBean.setFilters(filterMap);

        factoryBean.setSecurityManager(securityManager);

//        //设置如果未登录时需要跳转的url
//        shiroFilterFactoryBean.setLoginUrl("");
//
//        //设置登陆成功后跳转的界面或者url，如果是前后端分离，则可以不写该选项
//        shiroFilterFactoryBean.setSuccessUrl("");
//
//        //登录成功后，但是未授权，则调到未授权的url
//        shiroFilterFactoryBean.setUnauthorizedUrl("");
//
//        //将自定义的角色过滤器放到map里面
//        Map<String , Filter> map = new LinkedHashMap<>();
//
//        //这里配置好角色过滤器时，拦截路径时的前缀要写成key的值
//        map.put("customRoles", 自定义的AuthorizationFilter);
//        //自定义的过滤器解决跨域
//        map.put("corsFilter", 自定义的跨域过滤器);
//
//        //将自定义的角色过滤器放到shiroFilterFactoryBean里面去
//        shiroFilterFactoryBean.setFilters(map);
//
////       ！！！！注意这里有个坑：一定要使用LinkedHashMap而不是hashmap，因为hashmap是无序的，
////        对于路径的映射，一旦匹配到就会立即返回，我们的配置也是有顺序的，可能有的小伙伴使用了hashmap，路径有时匹配成功，有时失败
//        //拦截器路径，同一拦截，注意要使用linkedHashMap保证过滤器的顺序
//        Map<String,String > filterMap=new LinkedHashMap<>();
//
//        //key是需要拦截的路径，value采用哪种过滤器，或者那种角色或权限
//        //跨域拦截
//        filterMap.put("/**", "corsFilter");
//
//        //登出过滤器
//        filterMap.put("", "logout");
//
//        //匿名访问，也就是说无需的登录即可访问
//        filterMap.put("", "anon");
//
//        //需要登录才能访问的
//        filterMap.put("", "authc");
//
//        //有相应角色才能访问的,例如管理员才能访问
//        filterMap.put("", "customRoles[admin,root]"); //这里对应上面自定义AuthorizationFilter的key
//
//        //有相应权限才能访问的，例如有
//        filterMap.put("", "perms[*]");
//
//        //全局拦截，避免遗漏哪些路径，放到最下面，这里也是要求必须使用linkedhashmap的理由
//        filterMap.put("/**", "authc");
//
//        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterMap);

        /*
         * 自定义url规则
         */
        Map<String, String> filterRuleMap = new LinkedHashMap<>();
        // 所有请求通过我们自己的JWT Filter
        filterRuleMap.put("/index", "jwt");
        filterRuleMap.put("/api/**", "jwt");
        filterRuleMap.put("/view/**", "jwt");
        filterRuleMap.put("/", "jwt");
        filterRuleMap.put("/**", "anon");
        // 访问错误页面不通过我们的Filter
//        filterRuleMap.put("/error/**", "anon");
//        filterRuleMap.put("/login", "anon");
//        //设置静态资源不通过filter
//        filterRuleMap.put("/js/**", "anon");
//        filterRuleMap.put("/css/**", "anon");
//        filterRuleMap.put("/font/**", "anon");
//        filterRuleMap.put("/images/**", "anon");
//        filterRuleMap.put("/img/**", "anon");
//        filterRuleMap.put("/layui/**", "anon");
//        filterRuleMap.put("/temp/**", "anon");
//        filterRuleMap.put("/mobile/**", "anon");
        factoryBean.setFilterChainDefinitionMap(filterRuleMap);
        return factoryBean;
    }

    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(DefaultWebSecurityManager securityManager) {
        AuthorizationAttributeSourceAdvisor advisor = new AuthorizationAttributeSourceAdvisor();
        advisor.setSecurityManager(securityManager);
        return advisor;
    }

    @Bean("securityManager")
    public DefaultWebSecurityManager getManager(@Lazy RealmConfig realm) {
        DefaultWebSecurityManager manager = new DefaultWebSecurityManager();
        // 使用自己的realm
        manager.setRealm(realm);
        //关闭session的存储
        DefaultSubjectDAO subjectDAO = new DefaultSubjectDAO();
        DefaultSessionStorageEvaluator defaultSessionStorageEvaluator = new DefaultSessionStorageEvaluator();
        defaultSessionStorageEvaluator.setSessionStorageEnabled(false);
        subjectDAO.setSessionStorageEvaluator(defaultSessionStorageEvaluator);
        manager.setSubjectDAO(subjectDAO);
        return manager;
    }

    /**
     * 下面的代码是添加注解支持
     */
    @Bean
    @DependsOn("lifecycleBeanPostProcessor")
    public DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator() {
        DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator = new DefaultAdvisorAutoProxyCreator();
        // 强制使用cglib，防止重复代理和可能引起代理出错的问题
        defaultAdvisorAutoProxyCreator.setProxyTargetClass(true);
        return defaultAdvisorAutoProxyCreator;
    }

    @Bean
    public LifecycleBeanPostProcessor lifecycleBeanPostProcessor() {
        return new LifecycleBeanPostProcessor();
    }
}

