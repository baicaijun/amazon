package com.modeush.amazon.dao;

import com.modeush.amazon.entity.GeneratorEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GeneratorDao {
    int deleteByPrimaryKey(Integer id);

    int insert(GeneratorEntity record);

    int insertSelective(GeneratorEntity record);

    GeneratorEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GeneratorEntity record);

    int updateByPrimaryKey(GeneratorEntity record);

    List<GeneratorEntity> selectAllGenetorEntity();
}
