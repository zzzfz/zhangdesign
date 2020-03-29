package com.example.demo.appraise.appraise_model.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * t_c_c_integralstandard
 * @author 
 */
public class TCCIntegralstandard implements Serializable {
    /**
     * 积分标准编码
     */
    private String serialnum;

    /**
     * 名称
     */
    private String intName;

    /**
     * 上限
     */
    private String upperLimit;

    /**
     * 下限
     */
    private String bottomLimit;

    /**
     * 分数
     */
    private String integral;

    /**
     * 备注
     */
    private String note;

    private String clientcode;

    public String getClientcode() {
        return clientcode;
    }

    public void setClientcode(String clientcode) {
        this.clientcode = clientcode;
    }

    private Map<String, String> ids;

    public Map<String, String> getIds() {
        return ids;
    }

    public void setIds(Map<String, String> ids) {
        this.ids = ids;
    }

    private static final long serialVersionUID = 1L;

    public String getSerialnum() {
        return serialnum;
    }

    public void setSerialnum(String serialnum) {
        this.serialnum = serialnum;
    }

    public String getIntName() {
        return intName;
    }

    public void setIntName(String intName) {
        this.intName = intName;
    }

    public String getUpperLimit() {
        return upperLimit;
    }

    public void setUpperLimit(String upperLimit) {
        this.upperLimit = upperLimit;
    }

    public String getBottomLimit() {
        return bottomLimit;
    }

    public void setBottomLimit(String bottomLimit) {
        this.bottomLimit = bottomLimit;
    }

    public String getIntegral() {
        return integral;
    }

    public void setIntegral(String integral) {
        this.integral = integral;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}