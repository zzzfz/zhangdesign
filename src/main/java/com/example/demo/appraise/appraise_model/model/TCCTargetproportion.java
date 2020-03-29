package com.example.demo.appraise.appraise_model.model;

import java.io.Serializable;

/**
 * t_c_c_targetproportion
 * @author 
 */
public class TCCTargetproportion implements Serializable {
    /**
     * 指标比重编码
     */
    private String targetprocode;

    /**
     * 项目名称
     */
    private String projectname;

    /**
     * 指标名称
     */
    private String targetname;

    /**
     * 比重
     */
    private String targetproportion;

    /**
     * 备注
     */
    private String note;

    private static final long serialVersionUID = 1L;

    public String getTargetprocode() {
        return targetprocode;
    }

    public void setTargetprocode(String targetprocode) {
        this.targetprocode = targetprocode;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public String getTargetname() {
        return targetname;
    }

    public void setTargetname(String targetname) {
        this.targetname = targetname;
    }

    public String getTargetproportion() {
        return targetproportion;
    }

    public void setTargetproportion(String targetproportion) {
        this.targetproportion = targetproportion;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}