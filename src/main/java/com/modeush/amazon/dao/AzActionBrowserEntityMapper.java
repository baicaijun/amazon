package com.modeush.amazon.dao;

import com.modeush.amazon.entity.AzActionBrowserEntity;

public interface AzActionBrowserEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AzActionBrowserEntity record);

    int insertSelective(AzActionBrowserEntity record);

    AzActionBrowserEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AzActionBrowserEntity record);

    int updateByPrimaryKey(AzActionBrowserEntity record);
}