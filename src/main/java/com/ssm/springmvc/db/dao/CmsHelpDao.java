package com.ssm.springmvc.db.dao;

import com.ssm.springmvc.db.entity.CmsHelpCategory;
import com.ssm.springmvc.db.mapper.CmsHelpMapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Resource(name = "CmsHelpDao")
public interface CmsHelpDao extends CmsHelpMapper {

    @Select("select * from cms_help_category where id=#{id}")
    @Results(id = "selectCategory",value = {
            @Result(column = "id",property = "id"),
            @Result(column = "name",property = "name"),
            @Result(column = "icon",property = "icon")
    })
    CmsHelpCategory selectCategory(Long id);
}