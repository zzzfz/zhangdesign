package com.example.demo.appraise.appraise_query.controller;

//评价结果查询

import com.example.demo.appraise.appraise_operation.model.TCCAppraiseinput;
import com.example.demo.appraise.appraise_operation.model.TCCAppraiseinputExample;
import com.example.demo.appraise.appraise_operation.service.TCCAppraiseinputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class AppraiseQueryController {

    @Autowired
    private TCCAppraiseinputService tccAppraiseinputService;

//    查询
    @RequestMapping("/appraiseQuery")
    public String inputSelect(Model model, HttpServletRequest request){

        String clientCode = request.getParameter("clientCode");
        String clientName = request.getParameter("clientName");
        String month = request.getParameter("month");

        model.addAttribute("clientCode",clientCode);
        model.addAttribute("clientName",clientName);
        model.addAttribute("month",month);

        return "/jsp/appraise/appraise_query/appraisequery";
    }

//    查询结果列表
    @RequestMapping(value = "/appraiseList",method = RequestMethod.GET)
    public @ResponseBody
    Object inputList(Model model, HttpServletRequest request){

        String clientCode = request.getParameter("clientCode");
        String clientName = request.getParameter("clientName");
        String month = request.getParameter("month");

        TCCAppraiseinputExample example = new TCCAppraiseinputExample();
        TCCAppraiseinputExample.Criteria criteria = example.createCriteria();


        if (null != clientCode && !"".equalsIgnoreCase(clientCode)){
            criteria.andRouteEqualTo(clientCode);
        }
        if (null != clientName && !"".equalsIgnoreCase(clientName)){
            criteria.andMonthEqualTo(clientName);
        }
        if (null != month && !"".equalsIgnoreCase(month)){
            criteria.andMonthEqualTo(month);
        }
        List<TCCAppraiseinput> tccAppraiseinputs = tccAppraiseinputService.selectByExample(example);
        return tccAppraiseinputs;
    }
}
