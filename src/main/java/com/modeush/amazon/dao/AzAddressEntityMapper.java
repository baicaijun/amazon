package com.modeush.amazon.dao;

import com.modeush.amazon.entity.AzAddressEntity;

public interface AzAddressEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AzAddressEntity record);

    int insertSelective(AzAddressEntity record);

    AzAddressEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AzAddressEntity record);

    int updateByPrimaryKey(AzAddressEntity record);
}