package com.ssm.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
public class PageController {

    @RequestMapping("/page")
    public String hello() {
        return "zz/index";
    }

    @RequestMapping("/login")
    public String login(HttpServletRequest httpServletRequest) {
        httpServletRequest.getSession().setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME,new Locale("en","US"));
        return "zz/core/login";
    }
}
