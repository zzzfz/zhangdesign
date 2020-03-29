package com.example.demo.appraise.appraise_model.mapper;

import com.example.demo.appraise.appraise_model.model.TCCTypestandard;
import com.example.demo.appraise.appraise_model.model.TCCTypestandardExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TCCTypestandardDAO {
    long countByExample(TCCTypestandardExample example);

    int deleteByExample(TCCTypestandardExample example);

    int deleteByPrimaryKey(String typecode);

    int insert(TCCTypestandard record);

    int insertSelective(TCCTypestandard record);

    List<TCCTypestandard> selectByExample(TCCTypestandardExample example);

    TCCTypestandard selectByPrimaryKey(String typecode);

    int updateByExampleSelective(@Param("record") TCCTypestandard record, @Param("example") TCCTypestandardExample example);

    int updateByExample(@Param("record") TCCTypestandard record, @Param("example") TCCTypestandardExample example);

    int updateByPrimaryKeySelective(TCCTypestandard record);

    int updateByPrimaryKey(TCCTypestandard record);
}