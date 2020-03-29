package com.example.demo.appraise.appraise_model.model;

import java.io.Serializable;

/**
 * t_c_c_targetstand
 * @author 
 */
public class TCCTargetstand implements Serializable {
    /**
     * 评价指标编码
     */
    private String targetcode;

    /**
     * 期间类型
     */
    private String datetype;

    /**
     * 评价指标名称
     */
    private String targetname;

    /**
     * 取值方式
     */
    private String getvaluestyle;

    /**
     * 计算方式标示
     */
    private String countstyle;

    /**
     * 分值标准
     */
    private String valuestand;

    /**
     * 取值语句
     */
    private String putvaluesql;

    /**
     * 取值字段
     */
    private String getvaluefield;

    /**
     * 备注
     */
    private String note;

    private static final long serialVersionUID = 1L;

    public String getTargetcode() {
        return targetcode;
    }

    public void setTargetcode(String targetcode) {
        this.targetcode = targetcode;
    }

    public String getDatetype() {
        return datetype;
    }

    public void setDatetype(String datetype) {
        this.datetype = datetype;
    }

    public String getTargetname() {
        return targetname;
    }

    public void setTargetname(String targetname) {
        this.targetname = targetname;
    }

    public String getGetvaluestyle() {
        return getvaluestyle;
    }

    public void setGetvaluestyle(String getvaluestyle) {
        this.getvaluestyle = getvaluestyle;
    }

    public String getCountstyle() {
        return countstyle;
    }

    public void setCountstyle(String countstyle) {
        this.countstyle = countstyle;
    }

    public String getValuestand() {
        return valuestand;
    }

    public void setValuestand(String valuestand) {
        this.valuestand = valuestand;
    }

    public String getPutvaluesql() {
        return putvaluesql;
    }

    public void setPutvaluesql(String putvaluesql) {
        this.putvaluesql = putvaluesql;
    }

    public String getGetvaluefield() {
        return getvaluefield;
    }

    public void setGetvaluefield(String getvaluefield) {
        this.getvaluefield = getvaluefield;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}