package com.example.demo.appraise.appraise_model.service.ipml;

import com.example.demo.appraise.appraise_model.mapper.TCCProjectproportionDAO;
import com.example.demo.appraise.appraise_model.model.TCCProjectproportion;
import com.example.demo.appraise.appraise_model.model.TCCProjectproportionExample;
import com.example.demo.appraise.appraise_model.service.TCCProjectproportionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TCCProjectproportionServiceImpl implements TCCProjectproportionService {
    @Autowired
    private TCCProjectproportionDAO tccProjectproportionDAO;
    @Override
    public long countByExample(TCCProjectproportionExample example) {
        return tccProjectproportionDAO.countByExample(example);
    }

    @Override
    public int deleteByExample(TCCProjectproportionExample example) {
        return tccProjectproportionDAO.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String projectproportionid) {
        return tccProjectproportionDAO.deleteByPrimaryKey(projectproportionid);
    }

    @Override
    public int insert(TCCProjectproportion record) {
        return tccProjectproportionDAO.insert(record);
    }

    @Override
    public int insertSelective(TCCProjectproportion record) {
        return tccProjectproportionDAO.insertSelective(record);
    }

    @Override
    public List<TCCProjectproportion> selectByExample(TCCProjectproportionExample example) {
        return tccProjectproportionDAO.selectByExample(example);
    }

    @Override
    public TCCProjectproportion selectByPrimaryKey(String projectproportionid) {
        return tccProjectproportionDAO.selectByPrimaryKey(projectproportionid);
    }

    @Override
    public int updateByExampleSelective(TCCProjectproportion record, TCCProjectproportionExample example) {
        return tccProjectproportionDAO.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TCCProjectproportion record, TCCProjectproportionExample example) {
        return tccProjectproportionDAO.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(TCCProjectproportion record) {
        return tccProjectproportionDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TCCProjectproportion record) {
        return tccProjectproportionDAO.updateByPrimaryKey(record);
    }
}
