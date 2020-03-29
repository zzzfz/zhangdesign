package com.example.demo.appraise.appraise_model.controller;

//积分标准维护

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.appraise.appraise_model.model.TCCIntegralstandard;
import com.example.demo.appraise.appraise_model.model.TCCIntegralstandardExample;
import com.example.demo.appraise.appraise_model.service.TCCIntegralstandardService;
import com.example.demo.admin.util.IdUtil;
import com.example.demo.appraise.appraise_operation.model.TCCAppraiseinput;
import com.example.demo.appraise.appraise_operation.model.TCCAppraiseinputExample;
import com.example.demo.appraise.appraise_operation.service.TCCAppraiseinputService;
import com.example.demo.appraise.check.IntegralCheck;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;


@Controller
public class integralStandardController {
    @Autowired
    private TCCIntegralstandardService tccIntegralstandardService;
    @Autowired
    private TCCAppraiseinputService tccAppraiseinputService;

    //    初始列表
    @RequestMapping(value = "/integralList", method = RequestMethod.GET)
    @ResponseBody
    public List<TCCIntegralstandard> integralList() throws Exception {
        TCCIntegralstandardExample example = new TCCIntegralstandardExample();
        List<TCCIntegralstandard> tccIntegralstandards = tccIntegralstandardService.selectByExample(example);
        return tccIntegralstandards;
    }
//    添加

    @RequestMapping(value = "/integralAdd", method = RequestMethod.POST)
    @ResponseBody
    public TCCIntegralstandard integralAdd(@RequestBody TCCIntegralstandard tccIntegralstandard) {

        tccIntegralstandard.setSerialnum(IdUtil.nextId());
        tccIntegralstandardService.insert(tccIntegralstandard);
        return tccIntegralstandard;
    }

    //    @Valid
//    @Param
//    @RequestMapping("/integralAdd")
//    public String integralAdd(@Valid IntegralCheck integralCheck ){
//
//    }
//    修改
    @RequestMapping(value = "/integralEdit", method = RequestMethod.PUT)
    @ResponseBody
    TCCIntegralstandard integralEdit(@RequestBody TCCIntegralstandard tccIntegralstandard) {
        tccIntegralstandardService.updateByPrimaryKeySelective(tccIntegralstandard);
        return tccIntegralstandard;
    }

    //    删除
    @RequestMapping(value = "/integralDel", method = RequestMethod.DELETE)
    @ResponseBody
    public String integralDel(@RequestBody TCCIntegralstandard tccIntegralstandard) {
        tccIntegralstandardService.deleteByPrimaryKey(tccIntegralstandard.getSerialnum());
        return "200";
    }

    @RequestMapping(value = "/searchScoreById", method = RequestMethod.POST)
    @ResponseBody
    public String searchScoreById(@RequestBody TCCIntegralstandard target) {
        Map<String, String> ids = target.getIds();
//        for (int i = 0; i < ids.size(); i++) {
//            String integral = tccIntegralstandardService.selectByPrimaryKey(ids.get()).getIntegral();
//        }
        return null;
    }
}
