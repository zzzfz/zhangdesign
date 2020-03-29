package com.example.demo.appraise.appraise_model.controller;

//评分标准维护

import com.example.demo.appraise.appraise_model.model.TCCValuestand;
import com.example.demo.appraise.appraise_model.model.TCCValuestandExample;
import com.example.demo.appraise.appraise_model.service.TCCValuestandService;
import com.example.demo.admin.util.IdUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ValueStandController {
    @Autowired
    private TCCValuestandService tccValueStandService;

    //    初始列表
    @RequestMapping(value = "/valueList", method = RequestMethod.GET)
    @ResponseBody
    public List<TCCValuestand> valueList() throws Exception {
        TCCValuestandExample example = new TCCValuestandExample();
        List<TCCValuestand> tccValuestands = tccValueStandService.selectByExample(example);
        return tccValuestands;
    }

//    添加
    @RequestMapping(value = "/valueAdd", method = RequestMethod.POST)
    @ResponseBody
    public TCCValuestand valueAdd(@RequestBody TCCValuestand tccValuestand) {
        tccValuestand.setValuecode(IdUtil.nextId());
        tccValueStandService.insert(tccValuestand);
        return tccValuestand;
    }
//    修改
    @RequestMapping(value = "/valueEdit",method = RequestMethod.PUT)
    @ResponseBody
    public TCCValuestand valueEdit(@RequestBody TCCValuestand tccValuestand){
        tccValueStandService.updateByPrimaryKeySelective(tccValuestand);
        return tccValuestand;
    }
//    删除
    @RequestMapping(value = "/valueDel",method = RequestMethod.DELETE)
    @ResponseBody
    public String valueDel(@RequestBody TCCValuestand tccValuestand){
        tccValueStandService.deleteByPrimaryKey(tccValuestand.getValuecode());
        return "200";
    }
}