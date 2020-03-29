package com.example.demo.admin.user.controller;

import com.example.demo.admin.login.model.TCAUserlogin;
import com.example.demo.admin.login.service.TCAUserloginService;
import com.example.demo.admin.user.model.TCAUser;
import com.example.demo.admin.user.model.TCAUserExample;
import com.example.demo.admin.user.service.TCAUserService;
import com.example.demo.admin.util.IdUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class userController {
    @Autowired
    private TCAUserService tcaUserService;
    private TCAUserloginService tcaUserloginService;
//    初始列表
    @RequestMapping(value = "/userList", method = RequestMethod.GET)
    @ResponseBody
    public List<TCAUser> userList()throws Exception{
        TCAUserExample example = new TCAUserExample();
        List<TCAUser> tcaUsers = tcaUserService.selectByExample(example);
        return tcaUsers;
    }
//    人员添加
    @RequestMapping(value = "/userAdd", method = RequestMethod.POST)
    @ResponseBody
    public TCAUser userAdd(@RequestBody TCAUser user){
        user.setUserid(IdUtil.nextId());
        tcaUserService.insert(user);
        return user;
    }
    //添加到人员登录表
    @RequestMapping(value = "/userLogin",method = RequestMethod.POST)
    @ResponseBody
    public TCAUserlogin userLogin(@RequestBody TCAUserlogin userlogin){
        userlogin.setLoginid(IdUtil.nextId());
        tcaUserloginService.insert(userlogin);
        return userlogin;
    }
//    人员修改
    @RequestMapping(value = "/userEdit", method = RequestMethod.PUT)
    @ResponseBody
    public TCAUser userEdit(@RequestBody TCAUser user) {
        tcaUserService.updateByPrimaryKeySelective(user);
        return user;
    }
//    人员注销
    @RequestMapping(value = "/userDel",method = RequestMethod.DELETE )
    @ResponseBody
    public String  appDel(@RequestBody TCAUser user) {
        tcaUserService.deleteByPrimaryKey(user.getUserid());
        return "200";
    }

}
