package com.example.demo.admin.right.service.impl;

import com.example.demo.admin.right.mapper.TCARightDAO;
import com.example.demo.admin.right.model.TCARight;
import com.example.demo.admin.right.model.TCARightExample;
import com.example.demo.admin.right.service.TCARightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TCARightServiceImpl implements TCARightService {
    @Autowired
    private TCARightDAO tcaRightDAO;
    @Override
    public long countByExample(TCARightExample example) {
        return tcaRightDAO.countByExample(example);
    }

    @Override
    public int deleteByExample(TCARightExample example) {
        return tcaRightDAO.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String userroleid) {
        return tcaRightDAO.deleteByPrimaryKey(userroleid);
    }

    @Override
    public int insert(TCARight record) {
        return tcaRightDAO.insert(record);
    }

    @Override
    public int insertSelective(TCARight record) {
        return tcaRightDAO.insertSelective(record);
    }

    @Override
    public List<TCARight> selectByExample(TCARightExample example) {
        return tcaRightDAO.selectByExample(example);
    }

    @Override
    public TCARight selectByPrimaryKey(String userroleid) {
        return tcaRightDAO.selectByPrimaryKey(userroleid);
    }

    @Override
    public int updateByExampleSelective(TCARight record, TCARightExample example) {
        return tcaRightDAO.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TCARight record, TCARightExample example) {
        return tcaRightDAO.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(TCARight record) {
        return tcaRightDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TCARight record) {
        return tcaRightDAO.updateByPrimaryKey(record);
    }
}
