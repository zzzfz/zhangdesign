package com.example.demo.admin.role.model;

import java.io.Serializable;

/**
 * t_c_a_role
 * @author 
 */
public class TCARole implements Serializable {
    private String roleid;

    private String rolename;

    private String roleno;

    private static final long serialVersionUID = 1L;

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String getRoleno() {
        return roleno;
    }

    public void setRoleno(String roleno) {
        this.roleno = roleno;
    }
}