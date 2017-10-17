package com.modeush.amazon.dao;

import com.modeush.amazon.entity.AzUserBasicInfoEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AzUserBasicInfoEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AzUserBasicInfoEntity record);

    int insertSelective(AzUserBasicInfoEntity record);

    AzUserBasicInfoEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AzUserBasicInfoEntity record);

    int updateByPrimaryKey(AzUserBasicInfoEntity record);

    List<AzUserBasicInfoEntity> selectAzUserInfoList();
}