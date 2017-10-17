package com.modeush.amazon.dao;

import com.modeush.amazon.entity.AzActionGroupEntity;

public interface AzActionGroupEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AzActionGroupEntity record);

    int insertSelective(AzActionGroupEntity record);

    AzActionGroupEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AzActionGroupEntity record);

    int updateByPrimaryKey(AzActionGroupEntity record);
}