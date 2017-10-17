package com.modeush.amazon.dao;

import com.modeush.amazon.entity.AzActionNativeEntity;

public interface AzActionNativeEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AzActionNativeEntity record);

    int insertSelective(AzActionNativeEntity record);

    AzActionNativeEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AzActionNativeEntity record);

    int updateByPrimaryKey(AzActionNativeEntity record);
}