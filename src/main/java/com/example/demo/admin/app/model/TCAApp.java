package com.example.demo.admin.app.model;

import java.io.Serializable;

/**
 * t_c_a_app
 * @author 
 */
public class TCAApp implements Serializable {
    private String appid;

    private String appname;

    /**
     * 应用代码
     */
    private String appcode;

    /**
     * 应用url
     */
    private String appurl;

    private String appnote;

    private static final long serialVersionUID = 1L;

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getAppname() {
        return appname;
    }

    public void setAppname(String appname) {
        this.appname = appname;
    }

    public String getAppcode() {
        return appcode;
    }

    public void setAppcode(String appcode) {
        this.appcode = appcode;
    }

    public String getAppurl() {
        return appurl;
    }

    public void setAppurl(String appurl) {
        this.appurl = appurl;
    }

    public String getAppnote() {
        return appnote;
    }

    public void setAppnote(String appnote) {
        this.appnote = appnote;
    }
}