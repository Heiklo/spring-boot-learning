//package com.ssm.springmvc.controller.restful;
//
//import com.ssm.springmvc.db.entity.CMS_HELP;
//import com.ssm.springmvc.db.mapper.CMS_HELPMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//public class MybatisTestController {
//
//    @Autowired
//    private CMS_HELPMapper cms_helpMapper;
//
//    @GetMapping("test")
//    public List<CMS_HELP> test1(){
//
//      return  cms_helpMapper.selectList(null);
//    }
//
//}
