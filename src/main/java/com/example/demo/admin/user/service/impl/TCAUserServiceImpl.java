package com.example.demo.admin.user.service.impl;

import com.example.demo.admin.user.mapper.TCAUserDAO;
import com.example.demo.admin.user.model.TCAUser;
import com.example.demo.admin.user.model.TCAUserExample;
import com.example.demo.admin.user.service.TCAUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TCAUserServiceImpl implements TCAUserService {
    @Autowired
    private TCAUserDAO userDAO;
    @Override
    public long countByExample(TCAUserExample example) {
        return userDAO.countByExample(example);
    }

    @Override
    public int deleteByExample(TCAUserExample example) {
        return userDAO.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String userid) {
        return userDAO.deleteByPrimaryKey(userid);
    }

    @Override
    public int insert(TCAUser record) {
        return userDAO.insert(record);
    }

    @Override
    public int insertSelective(TCAUser record) {
        return userDAO.insertSelective(record);
    }

    @Override
    public List<TCAUser> selectByExample(TCAUserExample example) {
        return userDAO.selectByExample(example);
    }

    @Override
    public TCAUser selectByPrimaryKey(String userid) {
        return userDAO.selectByPrimaryKey(userid);
    }

    @Override
    public int updateByExampleSelective(TCAUser record, TCAUserExample example) {
        return userDAO.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TCAUser record, TCAUserExample example) {
        return userDAO.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(TCAUser record) {
        return userDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TCAUser record) {
        return userDAO.updateByPrimaryKey(record);
    }
}
