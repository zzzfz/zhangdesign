package com.example.demo.appraise.appraise_model.mapper;

import com.example.demo.appraise.appraise_model.model.TCCIntegralstandard;
import com.example.demo.appraise.appraise_model.model.TCCIntegralstandardExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TCCIntegralstandardDAO {
    long countByExample(TCCIntegralstandardExample example);

    int deleteByExample(TCCIntegralstandardExample example);

    int deleteByPrimaryKey(String serialnum);

    int insert(TCCIntegralstandard record);

    int insertSelective(TCCIntegralstandard record);

    List<TCCIntegralstandard> selectByExample(TCCIntegralstandardExample example);

    TCCIntegralstandard selectByPrimaryKey(String serialnum);

    int updateByExampleSelective(@Param("record") TCCIntegralstandard record, @Param("example") TCCIntegralstandardExample example);

    int updateByExample(@Param("record") TCCIntegralstandard record, @Param("example") TCCIntegralstandardExample example);

    int updateByPrimaryKeySelective(TCCIntegralstandard record);

    int updateByPrimaryKey(TCCIntegralstandard record);
}