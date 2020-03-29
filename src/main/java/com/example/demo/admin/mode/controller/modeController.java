package com.example.demo.admin.mode.controller;

import com.example.demo.admin.app.service.TCAAppService;
import com.example.demo.admin.mode.model.TCAMode;
import com.example.demo.admin.mode.model.TCAModeExample;
import com.example.demo.admin.mode.service.TCAModeService;
import com.example.demo.admin.util.IdUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class modeController {
    @Autowired
    private TCAModeService tcaModeService;
    @Autowired
    private TCAAppService tcaAppService;
    //    初始列表
    @RequestMapping(value = "/modeList/{name}",method = RequestMethod.GET)
    @ResponseBody
    public List<TCAMode> modeList(@PathVariable("name") String name)throws Exception{
        List<TCAMode> childmodes=new ArrayList<>();
        TCAModeExample example=new TCAModeExample();
        example.createCriteria().andTheappnameEqualTo(name);
        childmodes=tcaModeService.selectByExample(example);
        return childmodes;
    }
//    添加
    @RequestMapping(value = "/modAdd",method = RequestMethod.POST)
    @ResponseBody
    public TCAMode modAdd(@RequestBody TCAMode mode) {
        mode.setModeid(IdUtil.nextId());
        tcaModeService.insert(mode);
        return mode;
    }
//    修改
    @RequestMapping(value = "/modEdit",method = RequestMethod.PUT)
    @ResponseBody
    public TCAMode modEdit(@RequestBody TCAMode mode) {
        tcaModeService.updateByPrimaryKeySelective(mode);
        return mode;
    }
//    删除
    @RequestMapping(value = "/modDel",method = RequestMethod.DELETE )
    @ResponseBody
    public String modDel(@RequestBody TCAMode mode){
        tcaModeService.deleteByPrimaryKey(mode.getModeid());
        return "200";
    }
}
