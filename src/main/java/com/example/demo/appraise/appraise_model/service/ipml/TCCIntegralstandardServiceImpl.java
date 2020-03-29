package com.example.demo.appraise.appraise_model.service.ipml;

import com.example.demo.appraise.appraise_model.mapper.TCCIntegralstandardDAO;
import com.example.demo.appraise.appraise_model.model.TCCIntegralstandard;
import com.example.demo.appraise.appraise_model.model.TCCIntegralstandardExample;
import com.example.demo.appraise.appraise_model.service.TCCIntegralstandardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TCCIntegralstandardServiceImpl implements TCCIntegralstandardService {
    @Autowired
    private TCCIntegralstandardDAO tccIntegralstandardDAO;
    @Override
    public long countByExample(TCCIntegralstandardExample example) {
        return tccIntegralstandardDAO.countByExample(example);
    }

    @Override
    public int deleteByExample(TCCIntegralstandardExample example) {
        return tccIntegralstandardDAO.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String serialnum) {
        return tccIntegralstandardDAO.deleteByPrimaryKey(serialnum);
    }

    @Override
    public int insert(TCCIntegralstandard record) {
        return tccIntegralstandardDAO.insert(record);
    }

    @Override
    public int insertSelective(TCCIntegralstandard record) {
        return tccIntegralstandardDAO.insertSelective(record);
    }

    @Override
    public List<TCCIntegralstandard> selectByExample(TCCIntegralstandardExample example) {
        return tccIntegralstandardDAO.selectByExample(example);
    }

    @Override
    public TCCIntegralstandard selectByPrimaryKey(String serialnum) {
        return tccIntegralstandardDAO.selectByPrimaryKey(serialnum);
    }

    @Override
    public int updateByExampleSelective(TCCIntegralstandard record, TCCIntegralstandardExample example) {
        return tccIntegralstandardDAO.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TCCIntegralstandard record, TCCIntegralstandardExample example) {
        return tccIntegralstandardDAO.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(TCCIntegralstandard record) {
        return tccIntegralstandardDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TCCIntegralstandard record) {
        return tccIntegralstandardDAO.updateByPrimaryKey(record);
    }
}
