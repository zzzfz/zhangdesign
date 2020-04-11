package com.example.demo.appraise.appraise_model.controller;

//积分标准维护

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.appraise.appraise_model.model.*;
import com.example.demo.appraise.appraise_model.service.TCCIntegralstandardService;
import com.example.demo.admin.util.IdUtil;
import com.example.demo.appraise.appraise_model.service.TCCProjectproportionService;
import com.example.demo.appraise.appraise_model.service.TCCTargetproportionService;
import com.example.demo.appraise.appraise_model.service.TCCValuestandService;
import com.example.demo.appraise.appraise_operation.model.TCCAppraiseinput;
import com.example.demo.appraise.appraise_operation.model.TCCAppraiseinputExample;
import com.example.demo.appraise.appraise_operation.service.TCCAppraiseinputService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Controller
public class integralStandardController {
    @Autowired
    private TCCIntegralstandardService tccIntegralstandardService;
    @Autowired
    private TCCAppraiseinputService tccAppraiseinputService;
    @Autowired
    private TCCValuestandService tccValuestandService;
    @Autowired
    private TCCProjectproportionService tccProjectproportionService;
    @Autowired
    private TCCTargetproportionService tccTargetproportionService;

    //    初始列表
    @RequestMapping(value = "/integralList", method = RequestMethod.GET)
    @ResponseBody
    public List<TCCIntegralstandard> integralList() throws Exception {
        TCCIntegralstandardExample example
                = new TCCIntegralstandardExample();
        List<TCCIntegralstandard> tccIntegralstandards
                = tccIntegralstandardService.selectByExample(example);
        return tccIntegralstandards;
    }
//    添加

    @RequestMapping(value = "/integralAdd", method = RequestMethod.POST)
    @ResponseBody
    public TCCIntegralstandard integralAdd(
            @RequestBody TCCIntegralstandard tccIntegralstandard) {

        tccIntegralstandard.setSerialnum(IdUtil.nextId());
        tccIntegralstandardService.insert(tccIntegralstandard);
        return tccIntegralstandard;
    }

//    修改
    @RequestMapping(value = "/integralEdit", method = RequestMethod.PUT)
    @ResponseBody
    TCCIntegralstandard integralEdit(
            @RequestBody TCCIntegralstandard tccIntegralstandard) {
        tccIntegralstandardService
                .updateByPrimaryKeySelective(tccIntegralstandard);
        return tccIntegralstandard;
    }

    //    删除
    @RequestMapping(value = "/integralDel", method = RequestMethod.DELETE)
    @ResponseBody
    public String integralDel(
            @RequestBody TCCIntegralstandard tccIntegralstandard) {
        tccIntegralstandardService.deleteByPrimaryKey(
                tccIntegralstandard.getSerialnum());
        return "200";
    }
//评价确认记录评价结果
    @RequestMapping(value = "/searchScoreById",
            method = RequestMethod.POST)
    @ResponseBody
    public String searchScoreById(
            @RequestBody TCCIntegralstandard target) {
        Map<String, String> ids = target.getIds();
        List<String> targets = new ArrayList<>(ids.keySet());
        List<String> integrals = new ArrayList<>(ids.values());

        for (int i = 0; i < targets.size(); i++) {
            String s = ids.get(targets.get(i));
            String integral
                    = tccIntegralstandardService.selectByPrimaryKey(s)
                    .getIntegral();
            TCCValuestandExample example = new TCCValuestandExample();
            example.createCriteria().andTargetnameEqualTo(targets.get(i))
                    .andValuenameEqualTo(integral);
            TCCValuestand tccValuestand
                    = tccValuestandService
                    .selectByExample(example).get(0);
            ids.put(targets.get(i), tccValuestand.getScorevalue());
        }

        TCCProjectproportionExample example
                = new TCCProjectproportionExample();
        List<TCCProjectproportion> tccProjectproportions
                = tccProjectproportionService.selectByExample(example);
        for (TCCProjectproportion t : tccProjectproportions) {
            TCCTargetproportionExample example1
                    = new TCCTargetproportionExample();
            example1.createCriteria()
                    .andProjectnameEqualTo(t.getProjectname());
            List<TCCTargetproportion> tccTargetproportions
                    = tccTargetproportionService
                    .selectByExample(example1);
            Double num = 0.0;
            for (TCCTargetproportion t1 : tccTargetproportions) {
                Double score = new Double(ids.get(t1.getTargetname()));
                Double proportion
                        = new Double(t1.getTargetproportion()) * 0.01;
                num += score * proportion;
            }
            DecimalFormat df = new DecimalFormat("#.00");

            TCCAppraiseinputExample example2
                    = new TCCAppraiseinputExample();
            example2.createCriteria()
                    .andClientcodeEqualTo(target.getClientcode());
            TCCAppraiseinput tccAppraiseinput
                    = tccAppraiseinputService
                    .selectByExample(example2).get(0);
            if (t.getProjectname().equals("贡献度")){
                tccAppraiseinput.setContribution(df.format(num));
            } else if (t.getProjectname().equals("诚信度")){
                tccAppraiseinput.setCredit(df.format(num));
            } else if (t.getProjectname().equals("重要度")){
                tccAppraiseinput.setImportant(df.format(num));
            } else if (t.getProjectname().equals("依存度")){
                tccAppraiseinput.setDepend(df.format(num));
            } else if (t.getProjectname().equals("配合度")){
                tccAppraiseinput.setCooperate(num.toString());
            }
            tccAppraiseinputService
                    .updateByPrimaryKeySelective(tccAppraiseinput);
        }
        return null;
    }
}
