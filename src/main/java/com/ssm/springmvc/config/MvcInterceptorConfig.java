//package com.ssm.springmvc.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
//
//@EnableWebMvc
//@Configuration
//public class MvcInterceptorConfig extends WebMvcConfigurationSupport {
//
//    @Autowired
//    MyLoginInterceptor myLoginInterceptor;
//
//    @Override
//    protected void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(myLoginInterceptor).addPathPatterns("/**").excludePathPatterns("/login");
//        super.addInterceptors(registry);
//    }
//
//    @Override
//    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
//
//        registry.addResourceHandler("/cc/zz/**").addResourceLocations("classpath:/templates/").addResourceLocations("classpath:/static/")
//                .addResourceLocations("classpath:/META-INF/resources/")
//                .addResourceLocations("classpath:/public/")
//                .addResourceLocations("classpath:/resources/");
//        super.addResourceHandlers(registry);
//    }
//}
