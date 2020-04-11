package com.example.demo.appraise.appraise_operation.controller;

//评价结果计算

import com.example.demo.appraise.appraise_model.model.TCCTypestandard;
import com.example.demo.appraise.appraise_model.model.TCCTypestandardExample;
import com.example.demo.appraise.appraise_model.service.TCCTypeStandardService;
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

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Controller
@SuppressWarnings("all")
public class AppraiseCountController{
    @Autowired
    private TCCAppraiseinputService tccAppraiseinputService;
    @Autowired
    private TCCSaleService tccSaleService;
    @Autowired
    private TCCTypeStandardService tccTypeStandardService;

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

        List<TCCAppraiseinput> tccAppraiseinputs
                = tccAppraiseinputService.selectByExample(example);
        return tccAppraiseinputs;
    }

//    评价结果计算
    @RequestMapping(value = "/appraiseCount",method = RequestMethod.POST)
    @ResponseBody
    public void AppraiseCount(HttpServletRequest request){
        String month = request.getParameter("month");
        String selFormula = request.getParameter("selFormula");
        String selAppraiseWay
                = request.getParameter("selAppraiseWay");

        TCCAppraiseinputExample example = new TCCAppraiseinputExample();
        example.createCriteria().andMonthEqualTo(month)
                .andAppraiseEqualTo("已评价");
        List<TCCAppraiseinput> tccAppraiseinputs
                = tccAppraiseinputService.selectByExample(example);
        Double num = 0.00;
        DecimalFormat df = new DecimalFormat("#.00");
        for (TCCAppraiseinput t :tccAppraiseinputs){
            Double credit = new Double(t.getCredit());
            Double depend = new Double(t.getDepend());
            TCCSaleExample example1 = new TCCSaleExample();
            example1.createCriteria().andMonthEqualTo(month);
            Double saleVolume = new Double(tccSaleService
                    .selectByExample(example1).get(0).getSalevolume());
            Double money = new Double(tccSaleService
                    .selectByExample(example1).get(0).getMoney());
            //根据选择的不同公式计算分数
            if (selFormula.equals("1")){
                num = (credit + depend) *
                        (saleVolume * 0.5) *(money * 0.005);
            }else if (selFormula.equals("2")){
                num = credit *
                        ((saleVolume * money) * 0.5) * (1 + depend);
            }
            t.setAutonum(df.format(num));
            tccAppraiseinputService.updateByPrimaryKeySelective(t);
        }
        //根据选择的不同评分方式选择不同的方式
        TCCAppraiseinputExample ex = new TCCAppraiseinputExample();
        ex.createCriteria().
                andMonthEqualTo(month)
                .andAppraiseEqualTo("已评价");
        List<TCCAppraiseinput> ts
                = tccAppraiseinputService.selectByExample(ex);
        TCCTypestandardExample example2 = new TCCTypestandardExample();
        List<TCCTypestandard> tccTypestandards
                = tccTypeStandardService.selectByExample(example2);
        if (selAppraiseWay.equals("1")){
            //人数
            int [] manCount = new int[5];
            for (int i = 0; i < 5; i++) {
                manCount[i]
                        = Integer.valueOf(tccTypestandards
                        .get(i).getMancount());
            }
            //给将要分类的客户排序
            Collections.sort(ts, new c());
            //为已排序的客户分类
            for (int j = 0; j < 5; j++) {
                for (int i = 0; i < manCount[j]; i++) {
                    if (ts.size() > 0){
                        ts.get(0).setAutograde(tccTypestandards
                                .get(j).getTypename());
                        tccAppraiseinputService
                                .updateByPrimaryKeySelective(ts.get(0));
                        ts.remove(0);
                    } else {
                        break;
                    }
                }
            }
        }else if (selAppraiseWay.equals("2")){
            //人数百分比
            double [] manCountPer = new double[5];
            for (int i = 0; i < 5; i++) {
                manCountPer[i] = new Double(tccTypestandards
                        .get(i).getMancountper()) * 0.01;
            }
            //给将要分类的客户排序
            Collections.sort(ts, new c());
            //为已排序的客户分类
            //1.计算各百分比人数
            int [] c = new int[5];
            for (int i = 0; i < 5; i++) {
                c[i] = new Double(Math.ceil(manCountPer[i]
                        * ts.size())).intValue();
            }
            //2.为已排序的客户分类
            //为已排序的客户分类
            for (int j = 0; j < 5; j++) {
                for (int i = 0; i < c[j]; i++) {
                    if (ts.size() > 0){
                        ts.get(0).setAutograde(tccTypestandards
                                .get(j).getTypename());
                        tccAppraiseinputService
                                .updateByPrimaryKeySelective(ts.get(0));
                        ts.remove(0);
                    } else {
                        break;
                    }
                }
            }
        }else if (selAppraiseWay.equals("3")){
            //上下限
            for (TCCAppraiseinput t : ts){
                Double autoNum = new Double(t.getAutonum());
                for (int i = 0; i < tccTypestandards.size(); i++) {
                    Double up = new Double(tccTypestandards.get(i)
                            .getUpperLimit());
                    Double down = new Double(tccTypestandards.get(i)
                            .getDownLimit());
                    if (autoNum > down && autoNum <= up){
                        t.setAutograde(tccTypestandards.get(i)
                                .getTypename());
                        tccAppraiseinputService
                                .updateByPrimaryKeySelective(t);
                        break;
                    }
                }
            }
        }
    }
}

class c implements Comparator<TCCAppraiseinput> {

    @Override
    public int compare(TCCAppraiseinput o1, TCCAppraiseinput o2) {
        int d1 = Double.valueOf(o1.getAutonum()).intValue();
        int d2 = Double.valueOf(o2.getAutonum()).intValue();
        return d2 - d1;
    }
}
