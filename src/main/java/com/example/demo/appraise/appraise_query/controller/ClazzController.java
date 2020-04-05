package com.example.demo.appraise.appraise_query.controller;

import com.example.demo.appraise.appraise_operation.model.TCCAppraiseinput;
import com.example.demo.appraise.appraise_operation.model.TCCAppraiseinputExample;
import com.example.demo.appraise.appraise_operation.service.TCCAppraiseinputService;
import com.example.demo.appraise.appraise_query.model.ClazzModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@SuppressWarnings("all")
public class ClazzController {

    @Autowired
    private TCCAppraiseinputService tccAppraiseinputService;

    @RequestMapping(value = "/clazz/{queryMonth}/{compareMonth}/{clientName}", method = RequestMethod.GET)
    @ResponseBody
    public List<ClazzModel> getClazzs(@PathVariable("queryMonth") String queryMonth, @PathVariable("compareMonth") String compareMonth, @PathVariable("clientName") String clientName){
        List<ClazzModel> list = new ArrayList<>();
        if (!queryMonth.equals("null") && !compareMonth.equals("null")){
            List<String> clientNames = new ArrayList<>();
            if (clientName.equals("null")){
                clientNames = tccAppraiseinputService.selectClientNameDictinct();
            }else {
                clientNames = tccAppraiseinputService.selectClientNameByName(clientName);
            }
            for (String c : clientNames){
                ClazzModel clazzModel = new ClazzModel();
                //设置客户简称
                clazzModel.setClientName(c);

                //设置查询月积分和分类
                TCCAppraiseinputExample example = new TCCAppraiseinputExample();
                example.createCriteria().andClientnameEqualTo(c).andMonthEqualTo(queryMonth);
                TCCAppraiseinput tccAppraiseinput = tccAppraiseinputService.selectByExample(example).get(0);
                //设置查询月自动积分
                clazzModel.setQueryAutoNum(tccAppraiseinput.getAutonum());
                //设置查询月人工积分
                clazzModel.setQueryHumanNum(tccAppraiseinput.getHuman());
                //设置查询月自动等级
                clazzModel.setQueryAutoType(tccAppraiseinput.getAutograde());
                //设置查询月人工等级
                clazzModel.setQueryHumanType(tccAppraiseinput.getHumangrade());

                //设置对照月积分和分类
                TCCAppraiseinputExample example1 = new TCCAppraiseinputExample();
                example1.createCriteria().andClientnameEqualTo(c).andMonthEqualTo(compareMonth);
                TCCAppraiseinput tccAppraiseinput1 = tccAppraiseinputService.selectByExample(example1).get(0);
                //设置对照月自动积分
                clazzModel.setCompareAutoNum(tccAppraiseinput1.getAutonum());
                //设置对照月人工积分
                clazzModel.setCompareHumanNum(tccAppraiseinput1.getHuman());
                //设置对照月自动等级
                clazzModel.setCompareAutoType(tccAppraiseinput1.getAutograde());
                //设置对照月人工等级
                clazzModel.setCompareHumanType(tccAppraiseinput1.getHumangrade());

                list.add(clazzModel);
            }
        }
        return list;
    }
}
