package com.example.demo.admin.right.model;

import java.io.Serializable;

/**
 * t_c_a_right
 * @author 
 */
public class TCARight implements Serializable {
    private String userroleid;

    private String userid;

    private String roleid;

    private static final long serialVersionUID = 1L;

    public String getUserroleid() {
        return userroleid;
    }

    public void setUserroleid(String userroleid) {
        this.userroleid = userroleid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }
}