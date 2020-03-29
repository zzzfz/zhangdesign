package com.example.demo.appraise.appraise_model.mapper;

import com.example.demo.appraise.appraise_model.model.TCCValuestand;
import com.example.demo.appraise.appraise_model.model.TCCValuestandExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TCCValuestandDAO {
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