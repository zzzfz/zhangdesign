package com.example.demo.appraise.appraise_operation.model;

import java.util.ArrayList;
import java.util.List;

public class TCCAppraiseinputExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public TCCAppraiseinputExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andClientcodeIsNull() {
            addCriterion("clientCode is null");
            return (Criteria) this;
        }

        public Criteria andClientcodeIsNotNull() {
            addCriterion("clientCode is not null");
            return (Criteria) this;
        }

        public Criteria andClientcodeEqualTo(String value) {
            addCriterion("clientCode =", value, "clientcode");
            return (Criteria) this;
        }

        public Criteria andClientcodeNotEqualTo(String value) {
            addCriterion("clientCode <>", value, "clientcode");
            return (Criteria) this;
        }

        public Criteria andClientcodeGreaterThan(String value) {
            addCriterion("clientCode >", value, "clientcode");
            return (Criteria) this;
        }

        public Criteria andClientcodeGreaterThanOrEqualTo(String value) {
            addCriterion("clientCode >=", value, "clientcode");
            return (Criteria) this;
        }

        public Criteria andClientcodeLessThan(String value) {
            addCriterion("clientCode <", value, "clientcode");
            return (Criteria) this;
        }

        public Criteria andClientcodeLessThanOrEqualTo(String value) {
            addCriterion("clientCode <=", value, "clientcode");
            return (Criteria) this;
        }

        public Criteria andClientcodeLike(String value) {
            addCriterion("clientCode like", value, "clientcode");
            return (Criteria) this;
        }

        public Criteria andClientcodeNotLike(String value) {
            addCriterion("clientCode not like", value, "clientcode");
            return (Criteria) this;
        }

        public Criteria andClientcodeIn(List<String> values) {
            addCriterion("clientCode in", values, "clientcode");
            return (Criteria) this;
        }

        public Criteria andClientcodeNotIn(List<String> values) {
            addCriterion("clientCode not in", values, "clientcode");
            return (Criteria) this;
        }

        public Criteria andClientcodeBetween(String value1, String value2) {
            addCriterion("clientCode between", value1, value2, "clientcode");
            return (Criteria) this;
        }

        public Criteria andClientcodeNotBetween(String value1, String value2) {
            addCriterion("clientCode not between", value1, value2, "clientcode");
            return (Criteria) this;
        }

        public Criteria andClientnameIsNull() {
            addCriterion("clientName is null");
            return (Criteria) this;
        }

        public Criteria andClientnameIsNotNull() {
            addCriterion("clientName is not null");
            return (Criteria) this;
        }

        public Criteria andClientnameEqualTo(String value) {
            addCriterion("clientName =", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameNotEqualTo(String value) {
            addCriterion("clientName <>", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameGreaterThan(String value) {
            addCriterion("clientName >", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameGreaterThanOrEqualTo(String value) {
            addCriterion("clientName >=", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameLessThan(String value) {
            addCriterion("clientName <", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameLessThanOrEqualTo(String value) {
            addCriterion("clientName <=", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameLike(String value) {
            addCriterion("clientName like", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameNotLike(String value) {
            addCriterion("clientName not like", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameIn(List<String> values) {
            addCriterion("clientName in", values, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameNotIn(List<String> values) {
            addCriterion("clientName not in", values, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameBetween(String value1, String value2) {
            addCriterion("clientName between", value1, value2, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameNotBetween(String value1, String value2) {
            addCriterion("clientName not between", value1, value2, "clientname");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andStorenameIsNull() {
            addCriterion("storeName is null");
            return (Criteria) this;
        }

        public Criteria andStorenameIsNotNull() {
            addCriterion("storeName is not null");
            return (Criteria) this;
        }

        public Criteria andStorenameEqualTo(String value) {
            addCriterion("storeName =", value, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameNotEqualTo(String value) {
            addCriterion("storeName <>", value, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameGreaterThan(String value) {
            addCriterion("storeName >", value, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameGreaterThanOrEqualTo(String value) {
            addCriterion("storeName >=", value, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameLessThan(String value) {
            addCriterion("storeName <", value, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameLessThanOrEqualTo(String value) {
            addCriterion("storeName <=", value, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameLike(String value) {
            addCriterion("storeName like", value, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameNotLike(String value) {
            addCriterion("storeName not like", value, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameIn(List<String> values) {
            addCriterion("storeName in", values, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameNotIn(List<String> values) {
            addCriterion("storeName not in", values, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameBetween(String value1, String value2) {
            addCriterion("storeName between", value1, value2, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameNotBetween(String value1, String value2) {
            addCriterion("storeName not between", value1, value2, "storename");
            return (Criteria) this;
        }

        public Criteria andAppraiseIsNull() {
            addCriterion("appraise is null");
            return (Criteria) this;
        }

        public Criteria andAppraiseIsNotNull() {
            addCriterion("appraise is not null");
            return (Criteria) this;
        }

        public Criteria andAppraiseEqualTo(String value) {
            addCriterion("appraise =", value, "appraise");
            return (Criteria) this;
        }

        public Criteria andAppraiseNotEqualTo(String value) {
            addCriterion("appraise <>", value, "appraise");
            return (Criteria) this;
        }

        public Criteria andAppraiseGreaterThan(String value) {
            addCriterion("appraise >", value, "appraise");
            return (Criteria) this;
        }

        public Criteria andAppraiseGreaterThanOrEqualTo(String value) {
            addCriterion("appraise >=", value, "appraise");
            return (Criteria) this;
        }

        public Criteria andAppraiseLessThan(String value) {
            addCriterion("appraise <", value, "appraise");
            return (Criteria) this;
        }

        public Criteria andAppraiseLessThanOrEqualTo(String value) {
            addCriterion("appraise <=", value, "appraise");
            return (Criteria) this;
        }

        public Criteria andAppraiseLike(String value) {
            addCriterion("appraise like", value, "appraise");
            return (Criteria) this;
        }

        public Criteria andAppraiseNotLike(String value) {
            addCriterion("appraise not like", value, "appraise");
            return (Criteria) this;
        }

        public Criteria andAppraiseIn(List<String> values) {
            addCriterion("appraise in", values, "appraise");
            return (Criteria) this;
        }

        public Criteria andAppraiseNotIn(List<String> values) {
            addCriterion("appraise not in", values, "appraise");
            return (Criteria) this;
        }

        public Criteria andAppraiseBetween(String value1, String value2) {
            addCriterion("appraise between", value1, value2, "appraise");
            return (Criteria) this;
        }

        public Criteria andAppraiseNotBetween(String value1, String value2) {
            addCriterion("appraise not between", value1, value2, "appraise");
            return (Criteria) this;
        }

        public Criteria andMonthIsNull() {
            addCriterion("`month` is null");
            return (Criteria) this;
        }

        public Criteria andMonthIsNotNull() {
            addCriterion("`month` is not null");
            return (Criteria) this;
        }

        public Criteria andMonthEqualTo(String value) {
            addCriterion("`month` =", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotEqualTo(String value) {
            addCriterion("`month` <>", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThan(String value) {
            addCriterion("`month` >", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThanOrEqualTo(String value) {
            addCriterion("`month` >=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThan(String value) {
            addCriterion("`month` <", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThanOrEqualTo(String value) {
            addCriterion("`month` <=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLike(String value) {
            addCriterion("`month` like", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotLike(String value) {
            addCriterion("`month` not like", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthIn(List<String> values) {
            addCriterion("`month` in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotIn(List<String> values) {
            addCriterion("`month` not in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthBetween(String value1, String value2) {
            addCriterion("`month` between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotBetween(String value1, String value2) {
            addCriterion("`month` not between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andRouteIsNull() {
            addCriterion("route is null");
            return (Criteria) this;
        }

        public Criteria andRouteIsNotNull() {
            addCriterion("route is not null");
            return (Criteria) this;
        }

        public Criteria andRouteEqualTo(String value) {
            addCriterion("route =", value, "route");
            return (Criteria) this;
        }

        public Criteria andRouteNotEqualTo(String value) {
            addCriterion("route <>", value, "route");
            return (Criteria) this;
        }

        public Criteria andRouteGreaterThan(String value) {
            addCriterion("route >", value, "route");
            return (Criteria) this;
        }

        public Criteria andRouteGreaterThanOrEqualTo(String value) {
            addCriterion("route >=", value, "route");
            return (Criteria) this;
        }

        public Criteria andRouteLessThan(String value) {
            addCriterion("route <", value, "route");
            return (Criteria) this;
        }

        public Criteria andRouteLessThanOrEqualTo(String value) {
            addCriterion("route <=", value, "route");
            return (Criteria) this;
        }

        public Criteria andRouteLike(String value) {
            addCriterion("route like", value, "route");
            return (Criteria) this;
        }

        public Criteria andRouteNotLike(String value) {
            addCriterion("route not like", value, "route");
            return (Criteria) this;
        }

        public Criteria andRouteIn(List<String> values) {
            addCriterion("route in", values, "route");
            return (Criteria) this;
        }

        public Criteria andRouteNotIn(List<String> values) {
            addCriterion("route not in", values, "route");
            return (Criteria) this;
        }

        public Criteria andRouteBetween(String value1, String value2) {
            addCriterion("route between", value1, value2, "route");
            return (Criteria) this;
        }

        public Criteria andRouteNotBetween(String value1, String value2) {
            addCriterion("route not between", value1, value2, "route");
            return (Criteria) this;
        }

        public Criteria andAutogradeIsNull() {
            addCriterion("autoGrade is null");
            return (Criteria) this;
        }

        public Criteria andAutogradeIsNotNull() {
            addCriterion("autoGrade is not null");
            return (Criteria) this;
        }

        public Criteria andAutogradeEqualTo(String value) {
            addCriterion("autoGrade =", value, "autograde");
            return (Criteria) this;
        }

        public Criteria andAutogradeNotEqualTo(String value) {
            addCriterion("autoGrade <>", value, "autograde");
            return (Criteria) this;
        }

        public Criteria andAutogradeGreaterThan(String value) {
            addCriterion("autoGrade >", value, "autograde");
            return (Criteria) this;
        }

        public Criteria andAutogradeGreaterThanOrEqualTo(String value) {
            addCriterion("autoGrade >=", value, "autograde");
            return (Criteria) this;
        }

        public Criteria andAutogradeLessThan(String value) {
            addCriterion("autoGrade <", value, "autograde");
            return (Criteria) this;
        }

        public Criteria andAutogradeLessThanOrEqualTo(String value) {
            addCriterion("autoGrade <=", value, "autograde");
            return (Criteria) this;
        }

        public Criteria andAutogradeLike(String value) {
            addCriterion("autoGrade like", value, "autograde");
            return (Criteria) this;
        }

        public Criteria andAutogradeNotLike(String value) {
            addCriterion("autoGrade not like", value, "autograde");
            return (Criteria) this;
        }

        public Criteria andAutogradeIn(List<String> values) {
            addCriterion("autoGrade in", values, "autograde");
            return (Criteria) this;
        }

        public Criteria andAutogradeNotIn(List<String> values) {
            addCriterion("autoGrade not in", values, "autograde");
            return (Criteria) this;
        }

        public Criteria andAutogradeBetween(String value1, String value2) {
            addCriterion("autoGrade between", value1, value2, "autograde");
            return (Criteria) this;
        }

        public Criteria andAutogradeNotBetween(String value1, String value2) {
            addCriterion("autoGrade not between", value1, value2, "autograde");
            return (Criteria) this;
        }

        public Criteria andAutonumIsNull() {
            addCriterion("autoNum is null");
            return (Criteria) this;
        }

        public Criteria andAutonumIsNotNull() {
            addCriterion("autoNum is not null");
            return (Criteria) this;
        }

        public Criteria andAutonumEqualTo(String value) {
            addCriterion("autoNum =", value, "autonum");
            return (Criteria) this;
        }

        public Criteria andAutonumNotEqualTo(String value) {
            addCriterion("autoNum <>", value, "autonum");
            return (Criteria) this;
        }

        public Criteria andAutonumGreaterThan(String value) {
            addCriterion("autoNum >", value, "autonum");
            return (Criteria) this;
        }

        public Criteria andAutonumGreaterThanOrEqualTo(String value) {
            addCriterion("autoNum >=", value, "autonum");
            return (Criteria) this;
        }

        public Criteria andAutonumLessThan(String value) {
            addCriterion("autoNum <", value, "autonum");
            return (Criteria) this;
        }

        public Criteria andAutonumLessThanOrEqualTo(String value) {
            addCriterion("autoNum <=", value, "autonum");
            return (Criteria) this;
        }

        public Criteria andAutonumLike(String value) {
            addCriterion("autoNum like", value, "autonum");
            return (Criteria) this;
        }

        public Criteria andAutonumNotLike(String value) {
            addCriterion("autoNum not like", value, "autonum");
            return (Criteria) this;
        }

        public Criteria andAutonumIn(List<String> values) {
            addCriterion("autoNum in", values, "autonum");
            return (Criteria) this;
        }

        public Criteria andAutonumNotIn(List<String> values) {
            addCriterion("autoNum not in", values, "autonum");
            return (Criteria) this;
        }

        public Criteria andAutonumBetween(String value1, String value2) {
            addCriterion("autoNum between", value1, value2, "autonum");
            return (Criteria) this;
        }

        public Criteria andAutonumNotBetween(String value1, String value2) {
            addCriterion("autoNum not between", value1, value2, "autonum");
            return (Criteria) this;
        }

        public Criteria andHumangradeIsNull() {
            addCriterion("humanGrade is null");
            return (Criteria) this;
        }

        public Criteria andHumangradeIsNotNull() {
            addCriterion("humanGrade is not null");
            return (Criteria) this;
        }

        public Criteria andHumangradeEqualTo(String value) {
            addCriterion("humanGrade =", value, "humangrade");
            return (Criteria) this;
        }

        public Criteria andHumangradeNotEqualTo(String value) {
            addCriterion("humanGrade <>", value, "humangrade");
            return (Criteria) this;
        }

        public Criteria andHumangradeGreaterThan(String value) {
            addCriterion("humanGrade >", value, "humangrade");
            return (Criteria) this;
        }

        public Criteria andHumangradeGreaterThanOrEqualTo(String value) {
            addCriterion("humanGrade >=", value, "humangrade");
            return (Criteria) this;
        }

        public Criteria andHumangradeLessThan(String value) {
            addCriterion("humanGrade <", value, "humangrade");
            return (Criteria) this;
        }

        public Criteria andHumangradeLessThanOrEqualTo(String value) {
            addCriterion("humanGrade <=", value, "humangrade");
            return (Criteria) this;
        }

        public Criteria andHumangradeLike(String value) {
            addCriterion("humanGrade like", value, "humangrade");
            return (Criteria) this;
        }

        public Criteria andHumangradeNotLike(String value) {
            addCriterion("humanGrade not like", value, "humangrade");
            return (Criteria) this;
        }

        public Criteria andHumangradeIn(List<String> values) {
            addCriterion("humanGrade in", values, "humangrade");
            return (Criteria) this;
        }

        public Criteria andHumangradeNotIn(List<String> values) {
            addCriterion("humanGrade not in", values, "humangrade");
            return (Criteria) this;
        }

        public Criteria andHumangradeBetween(String value1, String value2) {
            addCriterion("humanGrade between", value1, value2, "humangrade");
            return (Criteria) this;
        }

        public Criteria andHumangradeNotBetween(String value1, String value2) {
            addCriterion("humanGrade not between", value1, value2, "humangrade");
            return (Criteria) this;
        }

        public Criteria andHumanIsNull() {
            addCriterion("human is null");
            return (Criteria) this;
        }

        public Criteria andHumanIsNotNull() {
            addCriterion("human is not null");
            return (Criteria) this;
        }

        public Criteria andHumanEqualTo(String value) {
            addCriterion("human =", value, "human");
            return (Criteria) this;
        }

        public Criteria andHumanNotEqualTo(String value) {
            addCriterion("human <>", value, "human");
            return (Criteria) this;
        }

        public Criteria andHumanGreaterThan(String value) {
            addCriterion("human >", value, "human");
            return (Criteria) this;
        }

        public Criteria andHumanGreaterThanOrEqualTo(String value) {
            addCriterion("human >=", value, "human");
            return (Criteria) this;
        }

        public Criteria andHumanLessThan(String value) {
            addCriterion("human <", value, "human");
            return (Criteria) this;
        }

        public Criteria andHumanLessThanOrEqualTo(String value) {
            addCriterion("human <=", value, "human");
            return (Criteria) this;
        }

        public Criteria andHumanLike(String value) {
            addCriterion("human like", value, "human");
            return (Criteria) this;
        }

        public Criteria andHumanNotLike(String value) {
            addCriterion("human not like", value, "human");
            return (Criteria) this;
        }

        public Criteria andHumanIn(List<String> values) {
            addCriterion("human in", values, "human");
            return (Criteria) this;
        }

        public Criteria andHumanNotIn(List<String> values) {
            addCriterion("human not in", values, "human");
            return (Criteria) this;
        }

        public Criteria andHumanBetween(String value1, String value2) {
            addCriterion("human between", value1, value2, "human");
            return (Criteria) this;
        }

        public Criteria andHumanNotBetween(String value1, String value2) {
            addCriterion("human not between", value1, value2, "human");
            return (Criteria) this;
        }

        public Criteria andCooperateIsNull() {
            addCriterion("cooperate is null");
            return (Criteria) this;
        }

        public Criteria andCooperateIsNotNull() {
            addCriterion("cooperate is not null");
            return (Criteria) this;
        }

        public Criteria andCooperateEqualTo(String value) {
            addCriterion("cooperate =", value, "cooperate");
            return (Criteria) this;
        }

        public Criteria andCooperateNotEqualTo(String value) {
            addCriterion("cooperate <>", value, "cooperate");
            return (Criteria) this;
        }

        public Criteria andCooperateGreaterThan(String value) {
            addCriterion("cooperate >", value, "cooperate");
            return (Criteria) this;
        }

        public Criteria andCooperateGreaterThanOrEqualTo(String value) {
            addCriterion("cooperate >=", value, "cooperate");
            return (Criteria) this;
        }

        public Criteria andCooperateLessThan(String value) {
            addCriterion("cooperate <", value, "cooperate");
            return (Criteria) this;
        }

        public Criteria andCooperateLessThanOrEqualTo(String value) {
            addCriterion("cooperate <=", value, "cooperate");
            return (Criteria) this;
        }

        public Criteria andCooperateLike(String value) {
            addCriterion("cooperate like", value, "cooperate");
            return (Criteria) this;
        }

        public Criteria andCooperateNotLike(String value) {
            addCriterion("cooperate not like", value, "cooperate");
            return (Criteria) this;
        }

        public Criteria andCooperateIn(List<String> values) {
            addCriterion("cooperate in", values, "cooperate");
            return (Criteria) this;
        }

        public Criteria andCooperateNotIn(List<String> values) {
            addCriterion("cooperate not in", values, "cooperate");
            return (Criteria) this;
        }

        public Criteria andCooperateBetween(String value1, String value2) {
            addCriterion("cooperate between", value1, value2, "cooperate");
            return (Criteria) this;
        }

        public Criteria andCooperateNotBetween(String value1, String value2) {
            addCriterion("cooperate not between", value1, value2, "cooperate");
            return (Criteria) this;
        }

        public Criteria andImportantIsNull() {
            addCriterion("important is null");
            return (Criteria) this;
        }

        public Criteria andImportantIsNotNull() {
            addCriterion("important is not null");
            return (Criteria) this;
        }

        public Criteria andImportantEqualTo(String value) {
            addCriterion("important =", value, "important");
            return (Criteria) this;
        }

        public Criteria andImportantNotEqualTo(String value) {
            addCriterion("important <>", value, "important");
            return (Criteria) this;
        }

        public Criteria andImportantGreaterThan(String value) {
            addCriterion("important >", value, "important");
            return (Criteria) this;
        }

        public Criteria andImportantGreaterThanOrEqualTo(String value) {
            addCriterion("important >=", value, "important");
            return (Criteria) this;
        }

        public Criteria andImportantLessThan(String value) {
            addCriterion("important <", value, "important");
            return (Criteria) this;
        }

        public Criteria andImportantLessThanOrEqualTo(String value) {
            addCriterion("important <=", value, "important");
            return (Criteria) this;
        }

        public Criteria andImportantLike(String value) {
            addCriterion("important like", value, "important");
            return (Criteria) this;
        }

        public Criteria andImportantNotLike(String value) {
            addCriterion("important not like", value, "important");
            return (Criteria) this;
        }

        public Criteria andImportantIn(List<String> values) {
            addCriterion("important in", values, "important");
            return (Criteria) this;
        }

        public Criteria andImportantNotIn(List<String> values) {
            addCriterion("important not in", values, "important");
            return (Criteria) this;
        }

        public Criteria andImportantBetween(String value1, String value2) {
            addCriterion("important between", value1, value2, "important");
            return (Criteria) this;
        }

        public Criteria andImportantNotBetween(String value1, String value2) {
            addCriterion("important not between", value1, value2, "important");
            return (Criteria) this;
        }

        public Criteria andDependIsNull() {
            addCriterion("depend is null");
            return (Criteria) this;
        }

        public Criteria andDependIsNotNull() {
            addCriterion("depend is not null");
            return (Criteria) this;
        }

        public Criteria andDependEqualTo(String value) {
            addCriterion("depend =", value, "depend");
            return (Criteria) this;
        }

        public Criteria andDependNotEqualTo(String value) {
            addCriterion("depend <>", value, "depend");
            return (Criteria) this;
        }

        public Criteria andDependGreaterThan(String value) {
            addCriterion("depend >", value, "depend");
            return (Criteria) this;
        }

        public Criteria andDependGreaterThanOrEqualTo(String value) {
            addCriterion("depend >=", value, "depend");
            return (Criteria) this;
        }

        public Criteria andDependLessThan(String value) {
            addCriterion("depend <", value, "depend");
            return (Criteria) this;
        }

        public Criteria andDependLessThanOrEqualTo(String value) {
            addCriterion("depend <=", value, "depend");
            return (Criteria) this;
        }

        public Criteria andDependLike(String value) {
            addCriterion("depend like", value, "depend");
            return (Criteria) this;
        }

        public Criteria andDependNotLike(String value) {
            addCriterion("depend not like", value, "depend");
            return (Criteria) this;
        }

        public Criteria andDependIn(List<String> values) {
            addCriterion("depend in", values, "depend");
            return (Criteria) this;
        }

        public Criteria andDependNotIn(List<String> values) {
            addCriterion("depend not in", values, "depend");
            return (Criteria) this;
        }

        public Criteria andDependBetween(String value1, String value2) {
            addCriterion("depend between", value1, value2, "depend");
            return (Criteria) this;
        }

        public Criteria andDependNotBetween(String value1, String value2) {
            addCriterion("depend not between", value1, value2, "depend");
            return (Criteria) this;
        }

        public Criteria andCreditIsNull() {
            addCriterion("credit is null");
            return (Criteria) this;
        }

        public Criteria andCreditIsNotNull() {
            addCriterion("credit is not null");
            return (Criteria) this;
        }

        public Criteria andCreditEqualTo(String value) {
            addCriterion("credit =", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotEqualTo(String value) {
            addCriterion("credit <>", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThan(String value) {
            addCriterion("credit >", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThanOrEqualTo(String value) {
            addCriterion("credit >=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThan(String value) {
            addCriterion("credit <", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThanOrEqualTo(String value) {
            addCriterion("credit <=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLike(String value) {
            addCriterion("credit like", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotLike(String value) {
            addCriterion("credit not like", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditIn(List<String> values) {
            addCriterion("credit in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotIn(List<String> values) {
            addCriterion("credit not in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditBetween(String value1, String value2) {
            addCriterion("credit between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotBetween(String value1, String value2) {
            addCriterion("credit not between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andContributionIsNull() {
            addCriterion("contribution is null");
            return (Criteria) this;
        }

        public Criteria andContributionIsNotNull() {
            addCriterion("contribution is not null");
            return (Criteria) this;
        }

        public Criteria andContributionEqualTo(String value) {
            addCriterion("contribution =", value, "contribution");
            return (Criteria) this;
        }

        public Criteria andContributionNotEqualTo(String value) {
            addCriterion("contribution <>", value, "contribution");
            return (Criteria) this;
        }

        public Criteria andContributionGreaterThan(String value) {
            addCriterion("contribution >", value, "contribution");
            return (Criteria) this;
        }

        public Criteria andContributionGreaterThanOrEqualTo(String value) {
            addCriterion("contribution >=", value, "contribution");
            return (Criteria) this;
        }

        public Criteria andContributionLessThan(String value) {
            addCriterion("contribution <", value, "contribution");
            return (Criteria) this;
        }

        public Criteria andContributionLessThanOrEqualTo(String value) {
            addCriterion("contribution <=", value, "contribution");
            return (Criteria) this;
        }

        public Criteria andContributionLike(String value) {
            addCriterion("contribution like", value, "contribution");
            return (Criteria) this;
        }

        public Criteria andContributionNotLike(String value) {
            addCriterion("contribution not like", value, "contribution");
            return (Criteria) this;
        }

        public Criteria andContributionIn(List<String> values) {
            addCriterion("contribution in", values, "contribution");
            return (Criteria) this;
        }

        public Criteria andContributionNotIn(List<String> values) {
            addCriterion("contribution not in", values, "contribution");
            return (Criteria) this;
        }

        public Criteria andContributionBetween(String value1, String value2) {
            addCriterion("contribution between", value1, value2, "contribution");
            return (Criteria) this;
        }

        public Criteria andContributionNotBetween(String value1, String value2) {
            addCriterion("contribution not between", value1, value2, "contribution");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}