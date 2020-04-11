package com.example.demo.appraise.appraise_query.controller;

//客户分类查询

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
@SuppressWarnings("all")
public class ClientTypeController {
    @Autowired
    private TCCAppraiseinputService tccAppraiseinputService;

//    查询
    @RequestMapping(value = "/typeQuery")
    public String typeQuery(Model model, HttpServletRequest request){
        String humangrade = request.getParameter("humangrade");
        String route = request.getParameter("route");
        model.addAttribute("humangrade",humangrade);
        model.addAttribute("route",route);
        return "/jsp/appraise/appraise_query/clientsortquery";
    }


//    查询列表
    @RequestMapping(value = "/clientTypeList",
            method = RequestMethod.GET)
    public @ResponseBody
    Object clientTypeList(Model model, HttpServletRequest request){
        String humangrade = request.getParameter("humangrde");
        String route = request.getParameter("route");

        TCCAppraiseinputExample example = new TCCAppraiseinputExample();
        TCCAppraiseinputExample.Criteria criteria
                = example.createCriteria();

        if (null != humangrade && !"".equalsIgnoreCase(humangrade)){
            criteria.andMonthEqualTo(humangrade);
        }
        if (null != route && !"".equalsIgnoreCase(route)){
            criteria.andRouteEqualTo(route);
        }

        List<TCCAppraiseinput> tccAppraiseinputs
                = tccAppraiseinputService.selectByExample(example);
        return tccAppraiseinputs;
    }

}
