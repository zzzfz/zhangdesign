package com.example.demo.admin.user.service;

import com.example.demo.admin.user.model.TCAUser;
import com.example.demo.admin.user.model.TCAUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TCAUserService {
    long countByExample(TCAUserExample example);

    int deleteByExample(TCAUserExample example);

    int deleteByPrimaryKey(String userid);

    int insert(TCAUser record);

    int insertSelective(TCAUser record);

    List<TCAUser> selectByExample(TCAUserExample example);

    TCAUser selectByPrimaryKey(String userid);

    int updateByExampleSelective(@Param("record") TCAUser record, @Param("example") TCAUserExample example);

    int updateByExample(@Param("record") TCAUser record, @Param("example") TCAUserExample example);

    int updateByPrimaryKeySelective(TCAUser record);

    int updateByPrimaryKey(TCAUser record);
}
