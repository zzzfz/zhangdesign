package com.example.demo.appraise.appraise_operation.mapper;

import com.example.demo.appraise.appraise_operation.model.TCCSale;
import com.example.demo.appraise.appraise_operation.model.TCCSaleExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface TCCSaleDAO {
    long countByExample(TCCSaleExample example);

    int deleteByExample(TCCSaleExample example);

    int deleteByPrimaryKey(String salecode);

    int insert(TCCSale record);

    int insertSelective(TCCSale record);

    List<TCCSale> selectByExample(TCCSaleExample example);

    TCCSale selectByPrimaryKey(String salecode);

    int updateByExampleSelective(@Param("record") TCCSale record, @Param("example") TCCSaleExample example);

    int updateByExample(@Param("record") TCCSale record, @Param("example") TCCSaleExample example);

    int updateByPrimaryKeySelective(TCCSale record);

    int updateByPrimaryKey(TCCSale record);
}