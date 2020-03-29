package com.example.demo.appraise.appraise_model.controller;

//评价指标维护

import com.example.demo.appraise.appraise_model.model.TCCTargetstand;
import com.example.demo.appraise.appraise_model.model.TCCTargetstandExample;
import com.example.demo.appraise.appraise_model.model.TCCValuestand;
import com.example.demo.appraise.appraise_model.model.TCCValuestandExample;
import com.example.demo.appraise.appraise_model.service.TCCTargetStandService;
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
public class TargetStandController {
    @Autowired
    private TCCTargetStandService tccTargetStandService;
    @Autowired
    private TCCValuestandService tccValuestandService;
//    初始列表
    @RequestMapping(value = "/targetList",method = RequestMethod.GET)
    @ResponseBody
    public List<TCCTargetstand> targetList() throws Exception{
        TCCTargetstandExample example = new TCCTargetstandExample();
        List<TCCTargetstand> targetStands = tccTargetStandService.selectByExample(example);
        return targetStands;
    }
//    添加
    @RequestMapping(value = "/targetAdd",method = RequestMethod.POST)
    @ResponseBody
    public TCCTargetstand targetAdd(@RequestBody TCCTargetstand tccTargetstand){
        tccTargetstand.setTargetcode(IdUtil.nextId());
        tccTargetStandService.insert(tccTargetstand);
        return tccTargetstand;
    }
//    修改
    @RequestMapping(value = "/targetEdit",method = RequestMethod.PUT)
    @ResponseBody
    public TCCTargetstand targetEdit(@RequestBody TCCTargetstand tccTargetstand){
        tccTargetStandService.updateByPrimaryKeySelective(tccTargetstand);
        return tccTargetstand;
    }
//    删除
    @RequestMapping(value = "/targetDel",method = RequestMethod.DELETE)
    @ResponseBody
    public String targetDel(@RequestBody TCCTargetstand tccTargetstand){
        tccTargetStandService.deleteByPrimaryKey(tccTargetstand.getTargetcode());
        return "200";
    }
//    删除该指标再指标维护表中的指标比重
    @RequestMapping(value = "/tarProportionDel",method = RequestMethod.DELETE)
    @ResponseBody
    public String tarProportionDel(@RequestBody TCCValuestand tccValuestand){
        TCCValuestandExample example = new TCCValuestandExample();
        example.createCriteria().andTargetnameEqualTo(tccValuestand.getValuename());
        tccValuestandService.deleteByExample(example);
        return "200";
    }

}
