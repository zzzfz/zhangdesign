package com.example.demo.appraise.appraise_operation.mapper;

import com.example.demo.appraise.appraise_operation.model.TCCAppraiseinput;
import com.example.demo.appraise.appraise_operation.model.TCCAppraiseinputExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface TCCAppraiseinputDAO {
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
}