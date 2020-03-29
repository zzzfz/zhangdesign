package com.example.demo.appraise.appraise_model.service;

import com.example.demo.appraise.appraise_model.model.TCCValuestand;
import com.example.demo.appraise.appraise_model.model.TCCValuestandExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TCCValuestandService {
    long countByExample(TCCValuestandExample example);

    int deleteByExample(TCCValuestandExample example);

    int deleteByPrimaryKey(String valuecode);

    int insert(TCCValuestand record);

    int insertSelective(TCCValuestand record);

    List<TCCValuestand> selectByExample(TCCValuestandExample example);

    TCCValuestand selectByPrimaryKey(String valuecode);

    int updateByExampleSelective(@Param("record") TCCValuestand record, @Param("example") TCCValuestandExample example);

    int updateByExample(@Param("record") TCCValuestand record, @Param("example") TCCValuestandExample example);

    int updateByPrimaryKeySelective(TCCValuestand record);

    int updateByPrimaryKey(TCCValuestand record);
}
