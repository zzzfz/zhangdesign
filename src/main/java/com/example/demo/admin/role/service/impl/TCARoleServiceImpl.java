package com.example.demo.admin.role.service.impl;

import com.example.demo.admin.role.mapper.TCARoleDAO;
import com.example.demo.admin.role.model.TCARole;
import com.example.demo.admin.role.model.TCARoleExample;
import com.example.demo.admin.role.service.TCARoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TCARoleServiceImpl implements TCARoleService {
    @Autowired
    private TCARoleDAO tcaRoleDAO;
    @Override
    public long countByExample(TCARoleExample example) {
        return tcaRoleDAO.countByExample(example);
    }

    @Override
    public int deleteByExample(TCARoleExample example) {
        return tcaRoleDAO.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String roleid) {
        return tcaRoleDAO.deleteByPrimaryKey(roleid);
    }

    @Override
    public int insert(TCARole record) {
        return tcaRoleDAO.insert(record);
    }

    @Override
    public int insertSelective(TCARole record) {
        return tcaRoleDAO.insertSelective(record);
    }

    @Override
    public List<TCARole> selectByExample(TCARoleExample example) {
        return tcaRoleDAO.selectByExample(example);
    }

    @Override
    public TCARole selectByPrimaryKey(String roleid) {
        return tcaRoleDAO.selectByPrimaryKey(roleid);
    }

    @Override
    public int updateByExampleSelective(TCARole record, TCARoleExample example) {
        return tcaRoleDAO.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TCARole record, TCARoleExample example) {
        return tcaRoleDAO.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(TCARole record) {
        return tcaRoleDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TCARole record) {
        return tcaRoleDAO.updateByPrimaryKey(record);
    }
}
