package com.example.demo.appraise.appraise_model.service.ipml;

import com.example.demo.appraise.appraise_model.mapper.TCCTargetstandDAO;
import com.example.demo.appraise.appraise_model.model.TCCTargetstand;
import com.example.demo.appraise.appraise_model.model.TCCTargetstandExample;
import com.example.demo.appraise.appraise_model.service.TCCTargetStandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TCCTargetStandServiceImpl implements TCCTargetStandService {
    @Autowired
    private TCCTargetstandDAO tccTargetstandDAO;
    @Override
    public long countByExample(TCCTargetstandExample example) {
        return tccTargetstandDAO.countByExample(example);
    }

    @Override
    public int deleteByExample(TCCTargetstandExample example) {
        return tccTargetstandDAO.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String targetcode) {
        return tccTargetstandDAO.deleteByPrimaryKey(targetcode);
    }

    @Override
    public int insert(TCCTargetstand record) {
        return tccTargetstandDAO.insert(record);
    }

    @Override
    public int insertSelective(TCCTargetstand record) {
        return tccTargetstandDAO.insertSelective(record);
    }

    @Override
    public List<TCCTargetstand> selectByExample(TCCTargetstandExample example) {
        return tccTargetstandDAO.selectByExample(example);
    }

    @Override
    public TCCTargetstand selectByPrimaryKey(String targetcode) {
        return tccTargetstandDAO.selectByPrimaryKey(targetcode);
    }

    @Override
    public int updateByExampleSelective(TCCTargetstand record, TCCTargetstandExample example) {
        return tccTargetstandDAO.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TCCTargetstand record, TCCTargetstandExample example) {
        return tccTargetstandDAO.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(TCCTargetstand record) {
        return tccTargetstandDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TCCTargetstand record) {
        return tccTargetstandDAO.updateByPrimaryKey(record);
    }
}
