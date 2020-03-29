package com.example.demo.admin.mode.service.impl;

import com.example.demo.admin.mode.mapper.TCAModeDAO;
import com.example.demo.admin.mode.model.TCAMode;
import com.example.demo.admin.mode.model.TCAModeExample;
import com.example.demo.admin.mode.service.TCAModeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TCAModeServiceImpl implements TCAModeService {
    @Autowired
    private TCAModeDAO tcaModeDAO;
    @Override
    public long countByExample(TCAModeExample example) {
        return tcaModeDAO.countByExample(example);
    }

    @Override
    public int deleteByExample(TCAModeExample example) {
        return tcaModeDAO.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String modeid) {
        return tcaModeDAO.deleteByPrimaryKey(modeid);
    }

    @Override
    public int insert(TCAMode record) {
        return tcaModeDAO.insert(record);
    }

    @Override
    public int insertSelective(TCAMode record) {
        return tcaModeDAO.insertSelective(record);
    }

    @Override
    public List<TCAMode> selectByExample(TCAModeExample example) {
        return tcaModeDAO.selectByExample(example);
    }

    @Override
    public TCAMode selectByPrimaryKey(String modeid) {
        return tcaModeDAO.selectByPrimaryKey(modeid);
    }

    @Override
    public int updateByExampleSelective(TCAMode record, TCAModeExample example) {
        return tcaModeDAO.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TCAMode record, TCAModeExample example) {
        return tcaModeDAO.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(TCAMode record) {
        return tcaModeDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TCAMode record) {
        return tcaModeDAO.updateByPrimaryKey(record);
    }
}
