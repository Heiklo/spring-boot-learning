package com.ssm.springmvc.controller.restful;

import com.ssm.springmvc.db.dao.CmsHelpDao;
import com.ssm.springmvc.db.entity.CmsHelp;
import com.ssm.springmvc.db.entity.CmsHelpCategory;
import com.ssm.springmvc.db.mapper.CmsHelpCategoryMapper;
import com.ssm.springmvc.db.mapper.CmsHelpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("mybatis")
public class MybatisTestController {

    @Resource
    CmsHelpMapper cmsHelpMapper;

    @Resource
    CmsHelpCategoryMapper cmsHelpCategoryMapper;

    @Resource
    CmsHelpDao cmsHelpDao;

    @GetMapping("/test1/{id}")
    public CmsHelp get(@PathVariable("id") Long id){
        return cmsHelpMapper.selectByPrimaryKey(id);
    }

    @GetMapping("/test2/{id}")
    public CmsHelpCategory getCategory(@PathVariable("id") Long id){
        return cmsHelpCategoryMapper.selectByPrimaryKey(id);
    }

    @GetMapping("/test3/{id}")
    public CmsHelpCategory getCategory2(@PathVariable("id") Long id){
//        return cmsHelpCategoryMapper.selectCategory(id);
        return cmsHelpDao.selectCategory(id);
    }

}
