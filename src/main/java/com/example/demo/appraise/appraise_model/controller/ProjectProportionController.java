package com.example.demo.appraise.appraise_model.controller;

//评价项目比重

import com.example.demo.appraise.appraise_model.model.TCCProjectproportion;
import com.example.demo.appraise.appraise_model.model.TCCProjectproportionExample;
import com.example.demo.appraise.appraise_model.service.TCCProjectproportionService;
import com.example.demo.admin.util.IdUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ProjectProportionController {

    @Autowired
    private TCCProjectproportionService tccProjectproportionService;

//初始列表
    @RequestMapping(value = "/proList",method = RequestMethod.GET)
    @ResponseBody
    public List<TCCProjectproportion> proList() throws Exception{
        TCCProjectproportionExample example = new TCCProjectproportionExample();
        List<TCCProjectproportion> tccProjectProportions = tccProjectproportionService.selectByExample(example);
        return tccProjectProportions;
    }
//添加
    @RequestMapping(value = "/proAdd",method = RequestMethod.POST)
    @ResponseBody
    public TCCProjectproportion proAdd(@RequestBody TCCProjectproportion tccProjectproportion){
        tccProjectproportion.setProjectproportionid(IdUtil.nextId());
        tccProjectproportionService.insert(tccProjectproportion);
        return tccProjectproportion;
    }
//修改
    @RequestMapping(value = "/proEdit",method = RequestMethod.PUT)
    @ResponseBody
    public TCCProjectproportion proEdit(@RequestBody TCCProjectproportion tccProjectproportion){
        tccProjectproportionService.updateByPrimaryKeySelective(tccProjectproportion);
        return tccProjectproportion;
    }
//删除
    @RequestMapping(value = "/proDel",method = RequestMethod.DELETE)
    @ResponseBody
    public String proDel(@RequestBody TCCProjectproportion tccProjectproportion){
        tccProjectproportionService.deleteByPrimaryKey(tccProjectproportion.getProjectproportionid());
        return "200";
    }
}
