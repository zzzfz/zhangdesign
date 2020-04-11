package com.example.demo.appraise.appraise_model.controller;

//指标比重维护

import com.example.demo.appraise.appraise_model.model.TCCTargetproportion;
import com.example.demo.appraise.appraise_model.model.TCCTargetproportionExample;
import com.example.demo.appraise.appraise_model.service.TCCTargetproportionService;
import com.example.demo.admin.util.IdUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TargetProportionController {
    @Autowired
    private TCCTargetproportionService tccTargetproportionService;
//    初始列表
    @RequestMapping(value = "/targetproList",method = RequestMethod.GET)
    @ResponseBody
    public List<TCCTargetproportion> targetproList()throws Exception{
        TCCTargetproportionExample example
                = new TCCTargetproportionExample();
        List<TCCTargetproportion> tccTargetproportions
                = tccTargetproportionService.selectByExample(example);
        return tccTargetproportions;
    }
//    添加
    @RequestMapping(value = "/targetproAdd",method = RequestMethod.POST)
    @ResponseBody
    public TCCTargetproportion targetproAdd(
            @RequestBody TCCTargetproportion tccTargetproportion){
        tccTargetproportion.setTargetprocode(IdUtil.nextId());
        tccTargetproportionService.insert(tccTargetproportion);
        return tccTargetproportion;
    }
//    修改
    @RequestMapping(value = "/targetproEdit",method = RequestMethod.PUT)
    @ResponseBody
    public TCCTargetproportion targetproEdit(
            @RequestBody TCCTargetproportion tccTargetproportion){
        tccTargetproportionService
                .updateByPrimaryKeySelective(tccTargetproportion);
        return tccTargetproportion;
    }
//    删除
    @RequestMapping(value = "/targetproDel",
            method = RequestMethod.DELETE)
    @ResponseBody
    public String targetproDel(
            @RequestBody TCCTargetproportion tccTargetproportion){
        tccTargetproportionService.deleteByPrimaryKey(
                tccTargetproportion.getTargetprocode());
        return "200";
    }
}
