package com.example.demo.appraise.appraise_model.service;

import com.example.demo.appraise.appraise_model.model.TCCIntegralstandard;
import com.example.demo.appraise.appraise_model.model.TCCIntegralstandardExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TCCIntegralstandardService {
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
