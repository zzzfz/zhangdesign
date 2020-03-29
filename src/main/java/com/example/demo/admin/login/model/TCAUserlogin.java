package com.example.demo.admin.login.model;

import java.io.Serializable;

/**
 * t_c_a_userlogin
 * @author 
 */
public class TCAUserlogin implements Serializable {
    /**
     * 登录id
     */
    private String loginid;

    private String userid;

    private String password;

    private static final long serialVersionUID = 1L;

    public String getLoginid() {
        return loginid;
    }

    public void setLoginid(String loginid) {
        this.loginid = loginid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}