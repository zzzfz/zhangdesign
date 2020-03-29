package com.example.demo.appraise.appraise_model.service;

import com.example.demo.appraise.appraise_model.model.TCCTargetstand;
import com.example.demo.appraise.appraise_model.model.TCCTargetstandExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TCCTargetStandService {
    long countByExample(TCCTargetstandExample example);

    int deleteByExample(TCCTargetstandExample example);

    int deleteByPrimaryKey(String targetcode);

    int insert(TCCTargetstand record);

    int insertSelective(TCCTargetstand record);

    List<TCCTargetstand> selectByExample(TCCTargetstandExample example);

    TCCTargetstand selectByPrimaryKey(String targetcode);

    int updateByExampleSelective(@Param("record") TCCTargetstand record, @Param("example") TCCTargetstandExample example);

    int updateByExample(@Param("record") TCCTargetstand record, @Param("example") TCCTargetstandExample example);

    int updateByPrimaryKeySelective(TCCTargetstand record);

    int updateByPrimaryKey(TCCTargetstand record);
}
