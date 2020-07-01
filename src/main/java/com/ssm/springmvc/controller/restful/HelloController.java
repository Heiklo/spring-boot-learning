package com.ssm.springmvc.controller.restful;

import com.ssm.springmvc.db.entity.CmsHelp;
import com.ssm.springmvc.db.mapper.CmsHelpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Resource
    CmsHelpMapper cmsHelpMapper;

    @GetMapping("cc")
    public String hello(){
        return "sucess";
    }

    @GetMapping("test1/{id}")
    public CmsHelp get(@PathVariable("id") Long id){
      return cmsHelpMapper.selectByPrimaryKey(id);
    }

}
