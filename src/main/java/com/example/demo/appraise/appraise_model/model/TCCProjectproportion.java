package com.example.demo.appraise.appraise_model.model;

import java.io.Serializable;

/**
 * t_c_c_projectproportion
 * @author 
 */
public class TCCProjectproportion implements Serializable {
    /**
     * 项目比重编码
     */
    private String projectproportionid;

    /**
     * 项目名称
     */
    private String projectname;

    /**
     * 比重
     */
    private String proportion;

    private static final long serialVersionUID = 1L;

    public String getProjectproportionid() {
        return projectproportionid;
    }

    public void setProjectproportionid(String projectproportionid) {
        this.projectproportionid = projectproportionid;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public String getProportion() {
        return proportion;
    }

    public void setProportion(String proportion) {
        this.proportion = proportion;
    }
}