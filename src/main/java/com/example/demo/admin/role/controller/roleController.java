package com.example.demo.admin.role.controller;

import com.example.demo.admin.role.model.TCARole;
import com.example.demo.admin.role.model.TCARoleExample;
import com.example.demo.admin.role.service.TCARoleService;
import com.example.demo.admin.util.IdUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class roleController {
    @Autowired
    private TCARoleService tcaRoleService;
//    初始列表
    @RequestMapping(value = "/roleList", method = RequestMethod.GET)
    @ResponseBody
    public List<TCARole> roleList() throws Exception {
        TCARoleExample example = new TCARoleExample();
        List<TCARole> roles = tcaRoleService.selectByExample(example);
        return roles;
    }
//    添加
    @RequestMapping(value = "/roleAdd", method = RequestMethod.POST)
    @ResponseBody
    public TCARole roleAdd(@RequestBody TCARole role) {
        role.setRoleid(IdUtil.nextId());
        tcaRoleService.insert(role);
        return role;
    }
//    修改
    @RequestMapping(value = "/roleEdit", method = RequestMethod.PUT)
    @ResponseBody
    public TCARole roleEdit(@RequestBody TCARole role) {
        tcaRoleService.updateByPrimaryKeySelective(role);
        return role;
    }
//    删除角色
    @RequestMapping(value = "/roleDel",method = RequestMethod.DELETE)
    @ResponseBody
    public String rolDel(@RequestBody TCARole role){
        tcaRoleService.deleteByPrimaryKey(role.getRoleid());
        return "200";
    }
}
