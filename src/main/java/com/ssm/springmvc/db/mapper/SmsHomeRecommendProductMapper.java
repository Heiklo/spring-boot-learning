package com.ssm.springmvc.db.mapper;

import com.ssm.springmvc.db.entity.SmsHomeRecommendProduct;

public interface SmsHomeRecommendProductMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SmsHomeRecommendProduct record);

    int insertSelective(SmsHomeRecommendProduct record);

    SmsHomeRecommendProduct selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsHomeRecommendProduct record);

    int updateByPrimaryKey(SmsHomeRecommendProduct record);
}