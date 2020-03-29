package com.example.demo.admin.right.mapper;

import com.example.demo.admin.right.model.TCARight;
import com.example.demo.admin.right.model.TCARightExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TCARightDAO {
    long countByExample(TCARightExample example);

    int deleteByExample(TCARightExample example);

    int deleteByPrimaryKey(String userroleid);

    int insert(TCARight record);

    int insertSelective(TCARight record);

    List<TCARight> selectByExample(TCARightExample example);

    TCARight selectByPrimaryKey(String userroleid);

    int updateByExampleSelective(@Param("record") TCARight record, @Param("example") TCARightExample example);

    int updateByExample(@Param("record") TCARight record, @Param("example") TCARightExample example);

    int updateByPrimaryKeySelective(TCARight record);

    int updateByPrimaryKey(TCARight record);
}