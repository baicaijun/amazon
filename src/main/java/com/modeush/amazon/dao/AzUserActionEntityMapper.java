package com.modeush.amazon.dao;

import com.modeush.amazon.entity.AzUserActionEntity;
import org.springframework.stereotype.Service;

@Service
public interface AzUserActionEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AzUserActionEntity record);

    int insertSelective(AzUserActionEntity record);

    AzUserActionEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AzUserActionEntity record);

    int updateByPrimaryKey(AzUserActionEntity record);
}