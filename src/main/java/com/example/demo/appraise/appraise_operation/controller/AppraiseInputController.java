package com.example.demo.appraise.appraise_operation.controller;

//评价信息录入

import com.example.demo.appraise.appraise_operation.model.TCCAppraiseinput;
import com.example.demo.appraise.appraise_operation.model.TCCAppraiseinputExample;
import com.example.demo.appraise.appraise_operation.service.TCCAppraiseinputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class AppraiseInputController {

    @Autowired
    private TCCAppraiseinputService tccAppraiseinputService;

//    到筛选评价列表
    @RequestMapping("/inputSelect")
    public String inputSelect(Model model, HttpServletRequest request){
        String month = request.getParameter("month");
        String route = request.getParameter("route");
        model.addAttribute("month",month);
        model.addAttribute("route",route);
        return "/jsp/appraise/appraise_operation/clientappraiseinput";
    }
//     初始列表
    @RequestMapping(value = "/inputList",method = RequestMethod.GET)
    public @ResponseBody
    Object inputList(Model model, HttpServletRequest request){
        String month = request.getParameter("month");
        String route = request.getParameter("route");

        TCCAppraiseinputExample example = new TCCAppraiseinputExample();
        TCCAppraiseinputExample.Criteria criteria = example.createCriteria();

        if (null != month && !"".equalsIgnoreCase(month)){
            criteria.andMonthEqualTo(month);
        }
        if (null != route && !"".equalsIgnoreCase(route)){
            criteria.andRouteEqualTo(route);
        }

        List<TCCAppraiseinput> tccAppraiseinputs = tccAppraiseinputService.selectByExample(example);
        return tccAppraiseinputs;
    }

//    评价确认__修改状态
    @RequestMapping(value = "/appraiseSure",method = RequestMethod.PUT)
    @ResponseBody
    public TCCAppraiseinput appraiseSure(@RequestBody TCCAppraiseinput tccAppraiseinput){
        TCCAppraiseinputExample example = new TCCAppraiseinputExample();
        example.createCriteria().andClientcodeEqualTo(tccAppraiseinput.getClientcode());
        tccAppraiseinputService.updateByExampleSelective(tccAppraiseinput,example);
        return tccAppraiseinput;
    }

}
