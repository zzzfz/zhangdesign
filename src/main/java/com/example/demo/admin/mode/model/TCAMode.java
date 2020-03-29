package com.example.demo.admin.mode.model;

import java.io.Serializable;

/**
 * t_c_a_mode
 * @author 
 */
public class TCAMode implements Serializable {
    private String modeid;

    private String modename;

    /**
     * 模块代码
     */
    private String modecode;

    private String modeurl;

    private String theappname;

    private String modenote;

    private static final long serialVersionUID = 1L;

    public String getModeid() {
        return modeid;
    }

    public void setModeid(String modeid) {
        this.modeid = modeid;
    }

    public String getModename() {
        return modename;
    }

    public void setModename(String modename) {
        this.modename = modename;
    }

    public String getModecode() {
        return modecode;
    }

    public void setModecode(String modecode) {
        this.modecode = modecode;
    }

    public String getModeurl() {
        return modeurl;
    }

    public void setModeurl(String modeurl) {
        this.modeurl = modeurl;
    }

    public String getTheappname() {
        return theappname;
    }

    public void setTheappname(String theappname) {
        this.theappname = theappname;
    }

    public String getModenote() {
        return modenote;
    }

    public void setModenote(String modenote) {
        this.modenote = modenote;
    }
}