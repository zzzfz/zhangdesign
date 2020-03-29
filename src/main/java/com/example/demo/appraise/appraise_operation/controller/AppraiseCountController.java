package com.example.demo.appraise.appraise_operation.controller;

//评价结果计算

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
public class AppraiseCountController {
    @Autowired
    private TCCAppraiseinputService tccAppraiseinputService;

//    查询
    @RequestMapping("/countSelect")
    public String inputSelect(Model model, HttpServletRequest request){
        String monthCon = request.getParameter("month");
        String routeCon = request.getParameter("route");
        model.addAttribute("month",monthCon);
        model.addAttribute("route",routeCon);
        return "/jsp/appraise/appraise_operation/appraisecount";
    }
//    评价结果列表
    @RequestMapping(value = "/countList",method = RequestMethod.GET)
    public @ResponseBody
    Object inputList(Model model, HttpServletRequest request){
        String monthCon = request.getParameter("month");
        String routeCon = request.getParameter("route");

        TCCAppraiseinputExample example = new TCCAppraiseinputExample();
        TCCAppraiseinputExample.Criteria criteria = example.createCriteria();

        if (null != monthCon && !"".equalsIgnoreCase(monthCon)){
            criteria.andMonthEqualTo(monthCon);
        }
        if (null != routeCon && !"".equalsIgnoreCase(routeCon)){
            criteria.andRouteEqualTo(routeCon);
        }

        List<TCCAppraiseinput> tccAppraiseinputs = tccAppraiseinputService.selectByExample(example);
        return tccAppraiseinputs;
    }
}
