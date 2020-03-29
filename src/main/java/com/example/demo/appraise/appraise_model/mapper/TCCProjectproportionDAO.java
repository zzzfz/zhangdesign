package com.example.demo.appraise.appraise_model.mapper;

import com.example.demo.appraise.appraise_model.model.TCCProjectproportion;
import com.example.demo.appraise.appraise_model.model.TCCProjectproportionExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TCCProjectproportionDAO {
    long countByExample(TCCProjectproportionExample example);

    int deleteByExample(TCCProjectproportionExample example);

    int deleteByPrimaryKey(String projectproportionid);

    int insert(TCCProjectproportion record);

    int insertSelective(TCCProjectproportion record);

    List<TCCProjectproportion> selectByExample(TCCProjectproportionExample example);

    TCCProjectproportion selectByPrimaryKey(String projectproportionid);

    int updateByExampleSelective(@Param("record") TCCProjectproportion record, @Param("example") TCCProjectproportionExample example);

    int updateByExample(@Param("record") TCCProjectproportion record, @Param("example") TCCProjectproportionExample example);

    int updateByPrimaryKeySelective(TCCProjectproportion record);

    int updateByPrimaryKey(TCCProjectproportion record);
}