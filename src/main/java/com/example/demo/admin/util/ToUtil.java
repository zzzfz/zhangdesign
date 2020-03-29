package com.example.demo.admin.util;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ToUtil {
//////////////////////通用/////////////////////////////////////////////////////////////////
    @RequestMapping(value = "/login")
    public String toLogin(){
        return "/jsp/admin/main/login";
    }
    @RequestMapping("/userhome")
    public String toUserHome(){
        return "/jsp/admin/main/start";
    }
    @RequestMapping("/welcome")
    public String toWelcome(){
        return "/jsp/admin/main/vipshow";
    }
    @RequestMapping("/logout")
    public String toLogout(){
        return "/jsp/admin/main/login";
    }
////////////////////评价模型/////////////////////////////////////////////////////////////////////
    @RequestMapping("/maintenance")
    public String toMaintenance(){
        return "/jsp/appraise/appraise_model/targetstand";
    }
    @RequestMapping("/proportion")
    public String toProportion(){
        return "/jsp/appraise/appraise_model/appraiseprojectsproportion";
    }
    @RequestMapping("/standard")
    public String toStandard(){
        return "/jsp/appraise/appraise_model/valuestand";
    }
    @RequestMapping("/indexProportion")
    public String toIndexProportion(){
        return "/jsp/appraise/appraise_model/indexproportionmaintenance";
    }
    @RequestMapping("/integralStandard")
    public String toIntegralStandard(){
        return "/jsp/appraise/appraise_model/integralstandard";
    }
    @RequestMapping("/clientCategory")
    public String toClientCategory(){
        return "/jsp/appraise/appraise_model/typestandard";
    }
    /////////////////评价操作//////////////////////////////////////////////////////////////////////////////////
    @RequestMapping("/resultsCheck")
    public String toResultsCheck(){
        return "/jsp/appraise/appraise_operation/appraiseresultscheck";
    }
    @RequestMapping("/appraiseInput")
    public String toAppraiseInput(){
        return "/jsp/appraise/appraise_operation/clientappraiseinput";
    }
    @RequestMapping("/appraiseCount")
    public String toAppraiseCount(){
        return "/jsp/appraise/appraise_operation/appraisecount";
    }
    //////////////////评价查询///////////////////////////////////////////////////////////////////////////////////
    @RequestMapping("/appraisequery")
    public String toAppraiseQuery(){
        return "/jsp/appraise/appraise_query/appraisequery";
    }
    @RequestMapping("/clientsortquery")
    public String toClientSortQuery(){
        return "/jsp/appraise/appraise_query/clientsortquery";
    }
    @RequestMapping("/classifiedfluctuation")
    public String toClassifiedFluctuation(){
        return "/jsp/appraise/appraise_query/classifiedfluctuationquery";
    }
//////////////////////门户系统///////////////////////////////////////////////////////////
    @RequestMapping("/app")
    public String toApp(){
        return "/jsp/admin/app/app";
    }
    @RequestMapping("/user")
    public String toUSer(){
        return "/jsp/admin/user/user";
    }
}
