package com.ssm.springmvc.db.mapper;

import com.ssm.springmvc.db.entity.CmsSubjectComment;
import org.apache.ibatis.annotations.Mapper;

public interface CmsSubjectCommentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CmsSubjectComment record);

    int insertSelective(CmsSubjectComment record);

    CmsSubjectComment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsSubjectComment record);

    int updateByPrimaryKey(CmsSubjectComment record);
}