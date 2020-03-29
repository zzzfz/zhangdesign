package com.example.demo.admin.mode.mapper;

import com.example.demo.admin.mode.model.TCAMode;
import com.example.demo.admin.mode.model.TCAModeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper
public interface TCAModeDAO {
    long countByExample(TCAModeExample example);

    int deleteByExample(TCAModeExample example);

    int deleteByPrimaryKey(String modeid);

    int insert(TCAMode record);

    int insertSelective(TCAMode record);

    List<TCAMode> selectByExample(TCAModeExample example);

    TCAMode selectByPrimaryKey(String modeid);

    int updateByExampleSelective(@Param("record") TCAMode record, @Param("example") TCAModeExample example);

    int updateByExample(@Param("record") TCAMode record, @Param("example") TCAModeExample example);

    int updateByPrimaryKeySelective(TCAMode record);

    int updateByPrimaryKey(TCAMode record);
}