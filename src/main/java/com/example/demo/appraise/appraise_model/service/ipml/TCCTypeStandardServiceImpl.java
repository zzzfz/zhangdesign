package com.example.demo.appraise.appraise_model.service.ipml;

import com.example.demo.appraise.appraise_model.mapper.TCCTypestandardDAO;
import com.example.demo.appraise.appraise_model.model.TCCTypestandard;
import com.example.demo.appraise.appraise_model.model.TCCTypestandardExample;
import com.example.demo.appraise.appraise_model.service.TCCTypeStandardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TCCTypeStandardServiceImpl implements TCCTypeStandardService {
    @Autowired
    private TCCTypestandardDAO tccTypestandardDAO;
    @Override
    public long countByExample(TCCTypestandardExample example) {
        return tccTypestandardDAO.countByExample(example);
    }

    @Override
    public int deleteByExample(TCCTypestandardExample example) {
        return tccTypestandardDAO.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String typecode) {
        return tccTypestandardDAO.deleteByPrimaryKey(typecode);
    }

    @Override
    public int insert(TCCTypestandard record) {
        return tccTypestandardDAO.insert(record);
    }

    @Override
    public int insertSelective(TCCTypestandard record) {
        return tccTypestandardDAO.insertSelective(record);
    }

    @Override
    public List<TCCTypestandard> selectByExample(TCCTypestandardExample example) {
        return tccTypestandardDAO.selectByExample(example);
    }

    @Override
    public TCCTypestandard selectByPrimaryKey(String typecode) {
        return tccTypestandardDAO.selectByPrimaryKey(typecode);
    }

    @Override
    public int updateByExampleSelective(TCCTypestandard record, TCCTypestandardExample example) {
        return tccTypestandardDAO.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TCCTypestandard record, TCCTypestandardExample example) {
        return tccTypestandardDAO.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(TCCTypestandard record) {
        return tccTypestandardDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TCCTypestandard record) {
        return tccTypestandardDAO.updateByPrimaryKey(record);
    }
}
