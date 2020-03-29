package com.example.demo.admin.app.service.impl;

import com.example.demo.admin.app.mapper.TCAAppDAO;
import com.example.demo.admin.app.model.TCAApp;
import com.example.demo.admin.app.model.TCAAppExample;
import com.example.demo.admin.app.service.TCAAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TCAAppServiceImpl implements TCAAppService {
    @Autowired
    private TCAAppDAO tcaAppDAO;
    @Override
    public long countByExample(TCAAppExample example) {
        return tcaAppDAO.countByExample(example);
    }

    @Override
    public int deleteByExample(TCAAppExample example) {
        return tcaAppDAO.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String appid) {
        return tcaAppDAO.deleteByPrimaryKey(appid);
    }

    @Override
    public int insert(TCAApp record) {
        return tcaAppDAO.insert(record);
    }

    @Override
    public int insertSelective(TCAApp record) {
        return tcaAppDAO.insertSelective(record);
    }

    @Override
    public List<TCAApp> selectByExample(TCAAppExample example) {
        return tcaAppDAO.selectByExample(example);
    }

    @Override
    public TCAApp selectByPrimaryKey(String appid) {
        return tcaAppDAO.selectByPrimaryKey(appid);
    }

    @Override
    public int updateByExampleSelective(TCAApp record, TCAAppExample example) {
        return tcaAppDAO.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TCAApp record, TCAAppExample example) {
        return tcaAppDAO.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(TCAApp record) {
        return tcaAppDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TCAApp record) {
        return tcaAppDAO.updateByPrimaryKey(record);
    }
}
