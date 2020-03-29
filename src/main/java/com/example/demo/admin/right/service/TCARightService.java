package com.example.demo.admin.right.service;

import com.example.demo.admin.right.model.TCARight;
import com.example.demo.admin.right.model.TCARightExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TCARightService {
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
