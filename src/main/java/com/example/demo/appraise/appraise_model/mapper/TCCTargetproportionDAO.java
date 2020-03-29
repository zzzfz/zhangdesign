package com.example.demo.appraise.appraise_model.mapper;

import com.example.demo.appraise.appraise_model.model.TCCTargetproportion;
import com.example.demo.appraise.appraise_model.model.TCCTargetproportionExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TCCTargetproportionDAO {
    long countByExample(TCCTargetproportionExample example);

    int deleteByExample(TCCTargetproportionExample example);

    int deleteByPrimaryKey(String targetprocode);

    int insert(TCCTargetproportion record);

    int insertSelective(TCCTargetproportion record);

    List<TCCTargetproportion> selectByExample(TCCTargetproportionExample example);

    TCCTargetproportion selectByPrimaryKey(String targetprocode);

    int updateByExampleSelective(@Param("record") TCCTargetproportion record, @Param("example") TCCTargetproportionExample example);

    int updateByExample(@Param("record") TCCTargetproportion record, @Param("example") TCCTargetproportionExample example);

    int updateByPrimaryKeySelective(TCCTargetproportion record);

    int updateByPrimaryKey(TCCTargetproportion record);
}