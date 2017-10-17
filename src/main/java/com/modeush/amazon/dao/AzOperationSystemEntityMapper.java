package com.modeush.amazon.dao;

import com.modeush.amazon.entity.AzOperationSystemEntity;

public interface AzOperationSystemEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AzOperationSystemEntity record);

    int insertSelective(AzOperationSystemEntity record);

    AzOperationSystemEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AzOperationSystemEntity record);

    int updateByPrimaryKey(AzOperationSystemEntity record);
}