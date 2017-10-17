package com.modeush.amazon.dao;

import com.modeush.amazon.entity.AzLogEntity;

public interface AzLogEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AzLogEntity record);

    int insertSelective(AzLogEntity record);

    AzLogEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AzLogEntity record);

    int updateByPrimaryKey(AzLogEntity record);
}