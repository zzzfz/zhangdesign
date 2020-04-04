package com.example.demo.appraise.appraise_operation.service.impl;

import com.example.demo.appraise.appraise_operation.mapper.TCCSaleDAO;
import com.example.demo.appraise.appraise_operation.model.TCCSale;
import com.example.demo.appraise.appraise_operation.model.TCCSaleExample;
import com.example.demo.appraise.appraise_operation.service.TCCSaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TCCSaleServiceImpl implements TCCSaleService {
    @Autowired
    private TCCSaleDAO tccSaleDAO;

    @Override
    public long countByExample(TCCSaleExample example) {
        return tccSaleDAO.countByExample(example);
    }

    @Override
    public int deleteByExample(TCCSaleExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(String salecode) {
        return 0;
    }

    @Override
    public int insert(TCCSale record) {
        return 0;
    }

    @Override
    public int insertSelective(TCCSale record) {
        return 0;
    }

    @Override
    public List<TCCSale> selectByExample(TCCSaleExample example) {
        return tccSaleDAO.selectByExample(example);
    }

    @Override
    public TCCSale selectByPrimaryKey(String salecode) {
        return tccSaleDAO.selectByPrimaryKey(salecode);
    }

    @Override
    public int updateByExampleSelective(TCCSale record, TCCSaleExample example) {
        return 0;
    }

    @Override
    public int updateByExample(TCCSale record, TCCSaleExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(TCCSale record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(TCCSale record) {
        return 0;
    }
}
