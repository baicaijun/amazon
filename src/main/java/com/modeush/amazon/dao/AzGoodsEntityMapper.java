package com.modeush.amazon.dao;

import com.modeush.amazon.entity.AzGoodsEntity;

public interface AzGoodsEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AzGoodsEntity record);

    int insertSelective(AzGoodsEntity record);

    AzGoodsEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AzGoodsEntity record);

    int updateByPrimaryKey(AzGoodsEntity record);
}