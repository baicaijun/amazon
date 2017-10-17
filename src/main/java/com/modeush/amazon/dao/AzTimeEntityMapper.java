package com.modeush.amazon.dao;

import com.modeush.amazon.entity.AzTimeEntity;

public interface AzTimeEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AzTimeEntity record);

    int insertSelective(AzTimeEntity record);

    AzTimeEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AzTimeEntity record);

    int updateByPrimaryKey(AzTimeEntity record);
}