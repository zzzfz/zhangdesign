package com.example.demo.admin.app.controller;

import com.example.demo.admin.app.model.TCAApp;
import com.example.demo.admin.app.model.TCAAppExample;
import com.example.demo.admin.app.service.TCAAppService;
import com.example.demo.admin.mode.model.TCAMode;
import com.example.demo.admin.mode.model.TCAModeExample;
import com.example.demo.admin.mode.service.TCAModeService;
import com.example.demo.admin.util.IdUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class appController {
    @Autowired
    private TCAAppService tcaAppService;
    @Autowired
    private TCAModeService tcaModeService;
//    初始列表
    @RequestMapping(value = "/appList",method = RequestMethod.GET)
    @ResponseBody
    public List<TCAApp> appList()throws Exception{
        TCAAppExample example=new TCAAppExample();
        List<TCAApp> apps = tcaAppService.selectByExample(example);
        return apps;
    }
//    添加
    @RequestMapping(value = "/appAdd",method = RequestMethod.POST)
    @ResponseBody
    public TCAApp appAdd(@RequestBody TCAApp app){
    //        System.out.println(application.getAppCode());
    //        appService.insertSelective(application);
        app.setAppid(IdUtil.nextId());
        tcaAppService.insert(app);
        return app;
    }
//    修改
    @RequestMapping(value = "/appEdit",method = RequestMethod.PUT)
    @ResponseBody
    public TCAApp appEdit(@RequestBody TCAApp app){
        tcaAppService.updateByPrimaryKeySelective(app);
        return app;
    }
//    删除
    @RequestMapping(value = "/appDel",method = RequestMethod.DELETE)
    @ResponseBody
    public String appDel(@RequestBody TCAApp tcaApp){
        tcaAppService.deleteByPrimaryKey(tcaApp.getAppid());
        return "200";
    }
//    删除
//    @RequestMapping(value = "/appDel",method = RequestMethod.DELETE )
//    @ResponseBody
//    public String  appDel(@RequestBody TCAApp application, TCAMode mode){
//        tcaAppService.deleteByPrimaryKey(application.getAppid());
//
//        TCAModeExample example=new TCAModeExample();
//        example.createCriteria().andTheappnameEqualTo(mode.getTheappname());
//        tcaModeService.deleteByExample(example);
//        return "200";
//    }
//    //    删除该应用下的所有模块
//    @RequestMapping(value = "/appmodeDel",method = RequestMethod.DELETE)
//    @ResponseBody
//    public String appmodeDel(@RequestBody TCAMode mode){
//        TCAModeExample example=new TCAModeExample();
//        example.createCriteria().andTheappnameEqualTo(mode.getTheappname());
//        tcaModeService.deleteByExample(example);
//        return "200";
//    }
}
