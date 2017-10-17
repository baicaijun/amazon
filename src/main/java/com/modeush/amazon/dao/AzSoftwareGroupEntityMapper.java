package com.modeush.amazon.dao;

import com.modeush.amazon.entity.AzSoftwareGroupEntity;

public interface AzSoftwareGroupEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AzSoftwareGroupEntity record);

    int insertSelective(AzSoftwareGroupEntity record);

    AzSoftwareGroupEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AzSoftwareGroupEntity record);

    int updateByPrimaryKey(AzSoftwareGroupEntity record);
}