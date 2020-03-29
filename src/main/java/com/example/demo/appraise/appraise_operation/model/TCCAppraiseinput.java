package com.example.demo.appraise.appraise_operation.model;

import java.io.Serializable;

/**
 * t_c_c_appraiseinput
 * @author 
 */
public class TCCAppraiseinput implements Serializable {
    /**
     * 客户简码
     */
    private String clientcode;

    /**
     * 客户简称
     */
    private String clientname;

    /**
     * 经营地址
     */
    private String address;

    /**
     * 店名
     */
    private String storename;

    /**
     * 是否评价
     */
    private String appraise;

    /**
     * 会计区间
     */
    private String month;

    /**
     * 路线名称
     */
    private String route;

    /**
     * 自动等级
     */
    private String autograde;

    /**
     * 自动分数
     */
    private String autonum;

    /**
     * 人工等级
     */
    private String humangrade;

    /**
     * 人工分数
     */
    private String human;

    /**
     * 配合度
     */
    private String cooperate;

    /**
     * 重要度
     */
    private String important;

    /**
     * 依存度
     */
    private String depend;

    /**
     * 诚信度
     */
    private String credit;

    /**
     * 贡献度
     */
    private String contribution;

    private static final long serialVersionUID = 1L;

    public String getClientcode() {
        return clientcode;
    }

    public void setClientcode(String clientcode) {
        this.clientcode = clientcode;
    }

    public String getClientname() {
        return clientname;
    }

    public void setClientname(String clientname) {
        this.clientname = clientname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStorename() {
        return storename;
    }

    public void setStorename(String storename) {
        this.storename = storename;
    }

    public String getAppraise() {
        return appraise;
    }

    public void setAppraise(String appraise) {
        this.appraise = appraise;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getAutograde() {
        return autograde;
    }

    public void setAutograde(String autograde) {
        this.autograde = autograde;
    }

    public String getAutonum() {
        return autonum;
    }

    public void setAutonum(String autonum) {
        this.autonum = autonum;
    }

    public String getHumangrade() {
        return humangrade;
    }

    public void setHumangrade(String humangrade) {
        this.humangrade = humangrade;
    }

    public String getHuman() {
        return human;
    }

    public void setHuman(String human) {
        this.human = human;
    }

    public String getCooperate() {
        return cooperate;
    }

    public void setCooperate(String cooperate) {
        this.cooperate = cooperate;
    }

    public String getImportant() {
        return important;
    }

    public void setImportant(String important) {
        this.important = important;
    }

    public String getDepend() {
        return depend;
    }

    public void setDepend(String depend) {
        this.depend = depend;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public String getContribution() {
        return contribution;
    }

    public void setContribution(String contribution) {
        this.contribution = contribution;
    }
}