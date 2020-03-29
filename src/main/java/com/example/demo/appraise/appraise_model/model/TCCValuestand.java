package com.example.demo.appraise.appraise_model.model;

import java.io.Serializable;

/**
 * t_c_c_valuestand
 * @author 
 */
public class TCCValuestand implements Serializable {
    /**
     * 分值标准编码
     */
    private String valuecode;

    /**
     * 评价指标名称
     */
    private String targetname;

    /**
     * 分值标准名称
     */
    private String valuename;

    /**
     * 上限
     */
    private String upperLimit;

    /**
     * 下限
     */
    private String lowLimit;

    /**
     * 分值
     */
    private String scorevalue;

    /**
     * 流水号
     */
    private String bickid;

    private static final long serialVersionUID = 1L;

    public String getValuecode() {
        return valuecode;
    }

    public void setValuecode(String valuecode) {
        this.valuecode = valuecode;
    }

    public String getTargetname() {
        return targetname;
    }

    public void setTargetname(String targetname) {
        this.targetname = targetname;
    }

    public String getValuename() {
        return valuename;
    }

    public void setValuename(String valuename) {
        this.valuename = valuename;
    }

    public String getUpperLimit() {
        return upperLimit;
    }

    public void setUpperLimit(String upperLimit) {
        this.upperLimit = upperLimit;
    }

    public String getLowLimit() {
        return lowLimit;
    }

    public void setLowLimit(String lowLimit) {
        this.lowLimit = lowLimit;
    }

    public String getScorevalue() {
        return scorevalue;
    }

    public void setScorevalue(String scorevalue) {
        this.scorevalue = scorevalue;
    }

    public String getBickid() {
        return bickid;
    }

    public void setBickid(String bickid) {
        this.bickid = bickid;
    }
}