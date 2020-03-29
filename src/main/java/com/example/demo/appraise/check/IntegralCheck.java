package com.example.demo.appraise.check;

//积分标准维护校验

import javax.validation.constraints.NotNull;

public class IntegralCheck {
//    名称
    @NotNull(message = "积分名称不能为空")
    private String intName;

//    分数
    @NotNull(message = "分数不能为空")
    private String integral;

//    上限
    @NotNull(message = "上限不能为空")
    private String upperLimit;

//    下限
    @NotNull(message = "下限不能为空")
    private String bottomLimit;
}
