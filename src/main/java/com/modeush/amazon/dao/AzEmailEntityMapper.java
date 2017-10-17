package com.modeush.amazon.dao;

import com.modeush.amazon.entity.AzEmailEntity;

public interface AzEmailEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AzEmailEntity record);

    int insertSelective(AzEmailEntity record);

    AzEmailEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AzEmailEntity record);

    int updateByPrimaryKey(AzEmailEntity record);
}