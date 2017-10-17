package com.modeush.amazon.dao;

import com.modeush.amazon.entity.AzUserEntity;
import org.springframework.stereotype.Service;

@Service
public interface AzUserEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AzUserEntity record);

    int insertSelective(AzUserEntity record);

    AzUserEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AzUserEntity record);

    int updateByPrimaryKey(AzUserEntity record);
}