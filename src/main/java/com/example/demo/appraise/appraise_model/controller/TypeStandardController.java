package com.example.demo.appraise.appraise_model.controller;

//客户类别维护

import com.example.demo.appraise.appraise_model.model.TCCTypestandard;
import com.example.demo.appraise.appraise_model.model.TCCTypestandardExample;
import com.example.demo.appraise.appraise_model.service.TCCTypeStandardService;
import com.example.demo.admin.util.IdUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TypeStandardController {
    @Autowired
    private TCCTypeStandardService tccTypeStandardService;
//    初始列表
    @RequestMapping(value = "/typeList",method = RequestMethod.GET)
    @ResponseBody
    public List<TCCTypestandard> typeList()throws Exception{
        TCCTypestandardExample example = new TCCTypestandardExample();
        List<TCCTypestandard>tccTypestandards = tccTypeStandardService.selectByExample(example);
        return tccTypestandards;
    }

//    添加
    @RequestMapping(value = "/typeAdd",method = RequestMethod.POST)
    @ResponseBody
    public TCCTypestandard typeAdd(@RequestBody TCCTypestandard tccTypestandard){
        tccTypestandard.setTypecode(IdUtil.nextId());
        tccTypeStandardService.insert(tccTypestandard);
        return tccTypestandard;
    }
//    修改
    @RequestMapping(value = "/typeEdit",method = RequestMethod.PUT)
    @ResponseBody
    public TCCTypestandard typeEdit(@RequestBody TCCTypestandard tccTypestandard){
        tccTypeStandardService.updateByPrimaryKeySelective(tccTypestandard);
        return tccTypestandard;
    }
//    删除
    @RequestMapping(value = "/typeDel",method = RequestMethod.DELETE)
    @ResponseBody
    public String typeDel(@RequestBody TCCTypestandard tccTypestandard){
        tccTypeStandardService.deleteByPrimaryKey(tccTypestandard.getTypecode());
        return "200";
    }
}
