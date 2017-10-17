package com.modeush.amazon.dao;

import com.modeush.amazon.entity.AzVmEntity;

public interface AzVmEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AzVmEntity record);

    int insertSelective(AzVmEntity record);

    AzVmEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AzVmEntity record);

    int updateByPrimaryKey(AzVmEntity record);
}