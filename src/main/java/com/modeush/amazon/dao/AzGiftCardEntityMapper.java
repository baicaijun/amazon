package com.modeush.amazon.dao;

import com.modeush.amazon.entity.AzGiftCardEntity;

public interface AzGiftCardEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AzGiftCardEntity record);

    int insertSelective(AzGiftCardEntity record);

    AzGiftCardEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AzGiftCardEntity record);

    int updateByPrimaryKey(AzGiftCardEntity record);
}