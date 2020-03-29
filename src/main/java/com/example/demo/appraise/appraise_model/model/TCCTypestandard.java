package com.example.demo.appraise.appraise_model.model;

import java.io.Serializable;

/**
 * t_c_c_typestandard
 * @author 
 */
public class TCCTypestandard implements Serializable {
    /**
     * 分类编码
     */
    private String typecode;

    /**
     * 分类名称
     */
    private String typename;

    /**
     * 角色编码
     */
    private String empcode;

    /**
     * 人数
     */
    private String mancount;

    /**
     * 人数百分比
     */
    private String mancountper;

    /**
     * 分值上限
     */
    private String upperLimit;

    /**
     * 分值下限
     */
    private String downLimit;

    /**
     * 优先级
     */
    private String pri;

    private static final long serialVersionUID = 1L;

    public String getTypecode() {
        return typecode;
    }

    public void setTypecode(String typecode) {
        this.typecode = typecode;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public String getEmpcode() {
        return empcode;
    }

    public void setEmpcode(String empcode) {
        this.empcode = empcode;
    }

    public String getMancount() {
        return mancount;
    }

    public void setMancount(String mancount) {
        this.mancount = mancount;
    }

    public String getMancountper() {
        return mancountper;
    }

    public void setMancountper(String mancountper) {
        this.mancountper = mancountper;
    }

    public String getUpperLimit() {
        return upperLimit;
    }

    public void setUpperLimit(String upperLimit) {
        this.upperLimit = upperLimit;
    }

    public String getDownLimit() {
        return downLimit;
    }

    public void setDownLimit(String downLimit) {
        this.downLimit = downLimit;
    }

    public String getPri() {
        return pri;
    }

    public void setPri(String pri) {
        this.pri = pri;
    }
}