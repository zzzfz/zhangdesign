package com.example.demo.appraise.appraise_operation.model;

import java.io.Serializable;

/**
 * t_c_c_sale
 * @author 
 */
public class TCCSale implements Serializable {
    private String salecode;

    private String month;

    /**
     * 月均销量
     */
    private String salevolume;

    /**
     * 条均价
     */
    private String money;

    private static final long serialVersionUID = 1L;

    public String getSalecode() {
        return salecode;
    }

    public void setSalecode(String salecode) {
        this.salecode = salecode;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getSalevolume() {
        return salevolume;
    }

    public void setSalevolume(String salevolume) {
        this.salevolume = salevolume;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }
}