package com.example.demo.appraise.appraise_operation.controller;

//评价结果审核

import com.example.demo.appraise.appraise_operation.model.TCCAppraiseinput;
import com.example.demo.appraise.appraise_operation.model.TCCAppraiseinputExample;
import com.example.demo.appraise.appraise_operation.service.TCCAppraiseinputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@SuppressWarnings("ALL")
public class AppraiseCheckController {

    @Autowired
    private TCCAppraiseinputService tccAppraiseinputService;

//    查询
    @RequestMapping("/checkSelect")
    public String checkSelect(Model model, HttpServletRequest request) {
        String month = request.getParameter("month");
        String clientName = request.getParameter("clientName");
        model.addAttribute("month", month);
        model.addAttribute("clientName", clientName);
        return "/jsp/appraise/appraise_operation/appraiseresultscheck";
    }

//    初始列表
    @RequestMapping(value = "/checkList",method = RequestMethod.GET)
    public @ResponseBody
    Object checkList(Model model, HttpServletRequest request){
        String month = request.getParameter("month");
        String clientName = request.getParameter("clientName");

        TCCAppraiseinputExample example = new TCCAppraiseinputExample();
        TCCAppraiseinputExample.Criteria criteria = example.createCriteria();

        if (null != clientName && !"".equalsIgnoreCase(clientName)){
            criteria.andClientnameEqualTo(clientName);
        }
        if (null != month && !"".equalsIgnoreCase(month)){
            criteria.andMonthEqualTo(month);
        }
        List<TCCAppraiseinput> tccAppraiseinputs = tccAppraiseinputService.selectByExample(example);
        return tccAppraiseinputs;
    }
//    审核
    @RequestMapping(value = "/checkSure",method = RequestMethod.PUT)
    @ResponseBody
    public TCCAppraiseinput checkSure(@RequestBody TCCAppraiseinput tccAppraiseinput){
        tccAppraiseinputService.updateByPrimaryKeySelective(tccAppraiseinput);
        return tccAppraiseinput;
    }
}
