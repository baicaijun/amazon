package com.modeush.amazon.dao;

import com.modeush.amazon.entity.AzMacEntity;

public interface AzMacEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AzMacEntity record);

    int insertSelective(AzMacEntity record);

    AzMacEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AzMacEntity record);

    int updateByPrimaryKey(AzMacEntity record);
}