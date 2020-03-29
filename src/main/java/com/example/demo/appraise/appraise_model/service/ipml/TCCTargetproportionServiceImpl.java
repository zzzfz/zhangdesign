package com.example.demo.appraise.appraise_model.service.ipml;

import com.example.demo.appraise.appraise_model.mapper.TCCTargetproportionDAO;
import com.example.demo.appraise.appraise_model.model.TCCTargetproportion;
import com.example.demo.appraise.appraise_model.model.TCCTargetproportionExample;
import com.example.demo.appraise.appraise_model.service.TCCTargetproportionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TCCTargetproportionServiceImpl implements TCCTargetproportionService {
    @Autowired
    private TCCTargetproportionDAO tccTargetproportionDAO;
    @Override
    public long countByExample(TCCTargetproportionExample example) {
        return tccTargetproportionDAO.countByExample(example);
    }

    @Override
    public int deleteByExample(TCCTargetproportionExample example) {
        return tccTargetproportionDAO.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String targetprocode) {
        return tccTargetproportionDAO.deleteByPrimaryKey(targetprocode);
    }

    @Override
    public int insert(TCCTargetproportion record) {
        return tccTargetproportionDAO.insert(record);
    }

    @Override
    public int insertSelective(TCCTargetproportion record) {
        return tccTargetproportionDAO.insertSelective(record);
    }

    @Override
    public List<TCCTargetproportion> selectByExample(TCCTargetproportionExample example) {
        return tccTargetproportionDAO.selectByExample(example);
    }

    @Override
    public TCCTargetproportion selectByPrimaryKey(String targetprocode) {
        return tccTargetproportionDAO.selectByPrimaryKey(targetprocode);
    }

    @Override
    public int updateByExampleSelective(TCCTargetproportion record, TCCTargetproportionExample example) {
        return tccTargetproportionDAO.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(TCCTargetproportion record, TCCTargetproportionExample example) {
        return tccTargetproportionDAO.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(TCCTargetproportion record) {
        return tccTargetproportionDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TCCTargetproportion record) {
        return tccTargetproportionDAO.updateByPrimaryKey(record);
    }
}
