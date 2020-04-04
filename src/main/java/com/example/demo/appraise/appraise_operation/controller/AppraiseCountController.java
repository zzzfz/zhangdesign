package com.example.demo.appraise.appraise_operation.controller;

//评价结果计算

import com.example.demo.appraise.appraise_operation.model.TCCAppraiseinput;
import com.example.demo.appraise.appraise_operation.model.TCCAppraiseinputExample;
import com.example.demo.appraise.appraise_operation.model.TCCSaleExample;
import com.example.demo.appraise.appraise_operation.service.TCCAppraiseinputService;
import com.example.demo.appraise.appraise_operation.service.TCCSaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.text.DecimalFormat;
import java.util.List;

@Controller
public class AppraiseCountController {
    @Autowired
    private TCCAppraiseinputService tccAppraiseinputService;
    @Autowired
    private TCCSaleService tccSaleService;

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

    @RequestMapping(value = "/appraiseCount",method = RequestMethod.POST)
    @ResponseBody
    public String AppraiseCount(HttpServletRequest request){
        String month = request.getParameter("month");
        String selFormula = request.getParameter("selFormula");
        TCCAppraiseinputExample example = new TCCAppraiseinputExample();
        example.createCriteria().andMonthEqualTo(month).andAppraiseEqualTo("已评价");
        List<TCCAppraiseinput> tccAppraiseinputs = tccAppraiseinputService.selectByExample(example);
        Double num = 0.00;
        DecimalFormat df = new DecimalFormat("#.00");
        for (TCCAppraiseinput t :tccAppraiseinputs){
            Double credit = new Double(t.getCredit());
            Double depend = new Double(t.getDepend());
            TCCSaleExample example1 = new TCCSaleExample();
            example1.createCriteria().andMonthEqualTo(month);
            Double saleVolume = new Double(tccSaleService.selectByExample(example1).get(0).getSalevolume());
            Double money = new Double(tccSaleService.selectByExample(example1).get(0).getMoney());
            if (selFormula.equals("1")){
                num = (credit + depend) * (saleVolume * 0.5) *(money * 0.005);
            }else if (selFormula.equals("2")){
                num = credit * ((saleVolume * money) * 0.5) * (1 + depend);
            }
            t.setAutonum(df.format(num));
            tccAppraiseinputService.updateByPrimaryKeySelective(t);
        }
        return "";
    }
}
