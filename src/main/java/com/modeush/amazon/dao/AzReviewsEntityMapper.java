package com.modeush.amazon.dao;

import com.modeush.amazon.entity.AzReviewsEntity;

public interface AzReviewsEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AzReviewsEntity record);

    int insertSelective(AzReviewsEntity record);

    AzReviewsEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AzReviewsEntity record);

    int updateByPrimaryKey(AzReviewsEntity record);
}