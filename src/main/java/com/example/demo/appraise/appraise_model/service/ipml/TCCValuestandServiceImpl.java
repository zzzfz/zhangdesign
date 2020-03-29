package com.example.demo.appraise.appraise_model.service.ipml;

import com.example.demo.appraise.appraise_model.mapper.TCCValuestandDAO;
import com.example.demo.appraise.appraise_model.model.TCCValuestand;
import com.example.demo.appraise.appraise_model.model.TCCValuestandExample;
import com.example.demo.appraise.appraise_model.service.TCCValuestandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TCCValuestandServiceImpl implements TCCValuestandService {
    @Autowired
    private TCCValuestandDAO tccValuestandDAO;
    @Override
    public long countByExample(TCCValuestandExample example) {
        return tccValuestandDAO.countByExample(example);
    }

    @Override
    public int deleteByExample(TCCValuestandExample example) {
        return tccValuestandDAO.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String valuecode) {
        return tccValuestandDAO.deleteByPrimaryKey(valuecode);
    }

    @Override
    public int insert(TCCValuestand record) {
        return tccValuestandDAO.insert(record);
    }

    @Override
    public int insertSelective(TCCValuestand record) {
        return tccValuestandDAO.insertSelective(record);
    }

    @Override
    public List<TCCValuestand> selectByExample(TCCValuestandExample example) {
        return tccValuestandDAO.selectByExample(example);
    }

    @Override
    public TCCValuestand selectByPrimaryKey(String valuecode) {
        return tccValuestandDAO.selectByPrimaryKey(valuecode);
    }

    @Override
    public int updateByExampleSelective(TCCValuestand record, TCCValuestandExample example) {
        return tccValuestandDAO.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TCCValuestand record, TCCValuestandExample example) {
        return tccValuestandDAO.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(TCCValuestand record) {
        return tccValuestandDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TCCValuestand record) {
        return tccValuestandDAO.updateByPrimaryKey(record);
    }
}
