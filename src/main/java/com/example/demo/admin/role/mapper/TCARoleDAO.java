package com.example.demo.admin.role.mapper;

import com.example.demo.admin.role.model.TCARole;
import com.example.demo.admin.role.model.TCARoleExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TCARoleDAO {
    long countByExample(TCARoleExample example);

    int deleteByExample(TCARoleExample example);

    int deleteByPrimaryKey(String roleid);

    int insert(TCARole record);

    int insertSelective(TCARole record);

    List<TCARole> selectByExample(TCARoleExample example);

    TCARole selectByPrimaryKey(String roleid);

    int updateByExampleSelective(@Param("record") TCARole record, @Param("example") TCARoleExample example);

    int updateByExample(@Param("record") TCARole record, @Param("example") TCARoleExample example);

    int updateByPrimaryKeySelective(TCARole record);

    int updateByPrimaryKey(TCARole record);
}