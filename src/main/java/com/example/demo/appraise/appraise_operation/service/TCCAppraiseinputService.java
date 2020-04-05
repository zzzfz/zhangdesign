package com.example.demo.appraise.appraise_operation.service;

import com.example.demo.appraise.appraise_operation.model.TCCAppraiseinput;
import com.example.demo.appraise.appraise_operation.model.TCCAppraiseinputExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TCCAppraiseinputService {
    long countByExample(TCCAppraiseinputExample example);

    int deleteByExample(TCCAppraiseinputExample example);

    int deleteByPrimaryKey(String clientcode);

    int insert(TCCAppraiseinput record);

    int insertSelective(TCCAppraiseinput record);

    List<TCCAppraiseinput> selectByExample(TCCAppraiseinputExample example);

    TCCAppraiseinput selectByPrimaryKey(String clientcode);

    int updateByExampleSelective(@Param("record") TCCAppraiseinput record, @Param("example") TCCAppraiseinputExample example);

    int updateByExample(@Param("record") TCCAppraiseinput record, @Param("example") TCCAppraiseinputExample example);

    int updateByPrimaryKeySelective(TCCAppraiseinput record);

    int updateByPrimaryKey(TCCAppraiseinput record);

    List<String> selectClientNameDictinct();

    List<String> selectClientNameByName(String clientName);
}
