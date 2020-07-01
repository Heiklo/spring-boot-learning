package com.ssm.springmvc.db.mapper;

import com.ssm.springmvc.db.entity.CmsMemberReport;

public interface CmsMemberReportMapper {
    int insert(CmsMemberReport record);

    int insertSelective(CmsMemberReport record);
}