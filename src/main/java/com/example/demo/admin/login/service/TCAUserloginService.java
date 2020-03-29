package com.example.demo.admin.login.service;

import com.example.demo.admin.login.model.TCAUserlogin;
import com.example.demo.admin.login.model.TCAUserloginExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TCAUserloginService {
    long countByExample(TCAUserloginExample example);

    int deleteByExample(TCAUserloginExample example);

    int deleteByPrimaryKey(String loginid);

    int insert(TCAUserlogin record);

    int insertSelective(TCAUserlogin record);

    List<TCAUserlogin> selectByExample(TCAUserloginExample example);

    TCAUserlogin selectByPrimaryKey(String loginid);

    int updateByExampleSelective(@Param("record") TCAUserlogin record, @Param("example") TCAUserloginExample example);

    int updateByExample(@Param("record") TCAUserlogin record, @Param("example") TCAUserloginExample example);

    int updateByPrimaryKeySelective(TCAUserlogin record);

    int updateByPrimaryKey(TCAUserlogin record);
}
