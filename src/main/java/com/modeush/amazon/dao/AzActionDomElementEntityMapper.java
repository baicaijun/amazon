package com.modeush.amazon.dao;

import com.modeush.amazon.entity.AzActionDomElementEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface AzActionDomElementEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AzActionDomElementEntity record);

    int insertSelective(AzActionDomElementEntity record);

    AzActionDomElementEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AzActionDomElementEntity record);

    int updateByPrimaryKey(AzActionDomElementEntity record);

    List<AzActionDomElementEntity> selectGroupDomElement(@Param("groupId") Long groupId);
}