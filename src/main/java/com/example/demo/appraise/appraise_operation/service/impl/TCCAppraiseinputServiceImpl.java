package com.example.demo.appraise.appraise_operation.service.impl;

import com.example.demo.appraise.appraise_operation.mapper.TCCAppraiseinputDAO;
import com.example.demo.appraise.appraise_operation.model.TCCAppraiseinput;
import com.example.demo.appraise.appraise_operation.model.TCCAppraiseinputExample;
import com.example.demo.appraise.appraise_operation.service.TCCAppraiseinputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TCCAppraiseinputServiceImpl implements TCCAppraiseinputService {
    @Autowired
    private TCCAppraiseinputDAO tccAppraiseinputDAO;
    @Override
    public long countByExample(TCCAppraiseinputExample example) {
        return tccAppraiseinputDAO.countByExample(example);
    }

    @Override
    public int deleteByExample(TCCAppraiseinputExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(String clientcode) {
        return 0;
    }

    @Override
    public int insert(TCCAppraiseinput record) {
        return 0;
    }

    @Override
    public int insertSelective(TCCAppraiseinput record) {
        return 0;
    }

    @Override
    public List<TCCAppraiseinput> selectByExample(TCCAppraiseinputExample example) {
        return tccAppraiseinputDAO.selectByExample(example);
    }

    @Override
    public TCCAppraiseinput selectByPrimaryKey(String clientcode) {
        return tccAppraiseinputDAO.selectByPrimaryKey(clientcode);
    }

    @Override
    public int updateByExampleSelective(TCCAppraiseinput record, TCCAppraiseinputExample example) {
        return tccAppraiseinputDAO.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TCCAppraiseinput record, TCCAppraiseinputExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(TCCAppraiseinput record) {
        return tccAppraiseinputDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TCCAppraiseinput record) {
        return 0;
    }
}
