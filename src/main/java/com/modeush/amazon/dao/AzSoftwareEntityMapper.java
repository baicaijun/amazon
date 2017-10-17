package com.modeush.amazon.dao;

import com.modeush.amazon.entity.AzSoftwareEntity;

public interface AzSoftwareEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AzSoftwareEntity record);

    int insertSelective(AzSoftwareEntity record);

    AzSoftwareEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AzSoftwareEntity record);

    int updateByPrimaryKey(AzSoftwareEntity record);
}