package com.example.demo.admin.mode.service;

import com.example.demo.admin.mode.model.TCAMode;
import com.example.demo.admin.mode.model.TCAModeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TCAModeService {
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
