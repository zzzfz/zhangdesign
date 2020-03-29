package com.example.demo.admin.app.mapper;

import com.example.demo.admin.app.model.TCAApp;
import com.example.demo.admin.app.model.TCAAppExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TCAAppDAO {
    long countByExample(TCAAppExample example);

    int deleteByExample(TCAAppExample example);

    int deleteByPrimaryKey(String appid);

    int insert(TCAApp record);

    int insertSelective(TCAApp record);

    List<TCAApp> selectByExample(TCAAppExample example);

    TCAApp selectByPrimaryKey(String appid);

    int updateByExampleSelective(@Param("record") TCAApp record, @Param("example") TCAAppExample example);

    int updateByExample(@Param("record") TCAApp record, @Param("example") TCAAppExample example);

    int updateByPrimaryKeySelective(TCAApp record);

    int updateByPrimaryKey(TCAApp record);
}