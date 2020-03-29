package com.example.demo.admin.login.service.impl;

import com.example.demo.admin.login.mapper.TCAUserloginDAO;
import com.example.demo.admin.login.model.TCAUserlogin;
import com.example.demo.admin.login.model.TCAUserloginExample;
import com.example.demo.admin.login.service.TCAUserloginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TCAUserloginServiceImpl implements TCAUserloginService {
    @Autowired
    private TCAUserloginDAO tcaUserloginDAO;
    @Override
    public long countByExample(TCAUserloginExample example) {
        return tcaUserloginDAO.countByExample(example);
    }

    @Override
    public int deleteByExample(TCAUserloginExample example) {
        return tcaUserloginDAO.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String loginid) {
        return tcaUserloginDAO.deleteByPrimaryKey(loginid);
    }

    @Override
    public int insert(TCAUserlogin record) {
        return tcaUserloginDAO.insert(record);
    }

    @Override
    public int insertSelective(TCAUserlogin record) {
        return tcaUserloginDAO.insert(record);
    }

    @Override
    public List<TCAUserlogin> selectByExample(TCAUserloginExample example) {
        return tcaUserloginDAO.selectByExample(example);
    }

    @Override
    public TCAUserlogin selectByPrimaryKey(String loginid) {
        return tcaUserloginDAO.selectByPrimaryKey(loginid);
    }

    @Override
    public int updateByExampleSelective(TCAUserlogin record, TCAUserloginExample example) {
        return tcaUserloginDAO.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TCAUserlogin record, TCAUserloginExample example) {
        return tcaUserloginDAO.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(TCAUserlogin record) {
        return tcaUserloginDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TCAUserlogin record) {
        return tcaUserloginDAO.updateByPrimaryKey(record);
    }
}
