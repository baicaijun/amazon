package com.modeush.amazon.dao;

import com.modeush.amazon.entity.AzCreditCardEntity;

public interface AzCreditCardEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AzCreditCardEntity record);

    int insertSelective(AzCreditCardEntity record);

    AzCreditCardEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AzCreditCardEntity record);

    int updateByPrimaryKey(AzCreditCardEntity record);
}