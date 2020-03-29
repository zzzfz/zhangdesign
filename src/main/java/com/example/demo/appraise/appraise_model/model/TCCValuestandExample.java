package com.example.demo.appraise.appraise_model.model;

import java.util.ArrayList;
import java.util.List;

public class TCCValuestandExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public TCCValuestandExample() {
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

        public Criteria andValuecodeIsNull() {
            addCriterion("ValueCode is null");
            return (Criteria) this;
        }

        public Criteria andValuecodeIsNotNull() {
            addCriterion("ValueCode is not null");
            return (Criteria) this;
        }

        public Criteria andValuecodeEqualTo(String value) {
            addCriterion("ValueCode =", value, "valuecode");
            return (Criteria) this;
        }

        public Criteria andValuecodeNotEqualTo(String value) {
            addCriterion("ValueCode <>", value, "valuecode");
            return (Criteria) this;
        }

        public Criteria andValuecodeGreaterThan(String value) {
            addCriterion("ValueCode >", value, "valuecode");
            return (Criteria) this;
        }

        public Criteria andValuecodeGreaterThanOrEqualTo(String value) {
            addCriterion("ValueCode >=", value, "valuecode");
            return (Criteria) this;
        }

        public Criteria andValuecodeLessThan(String value) {
            addCriterion("ValueCode <", value, "valuecode");
            return (Criteria) this;
        }

        public Criteria andValuecodeLessThanOrEqualTo(String value) {
            addCriterion("ValueCode <=", value, "valuecode");
            return (Criteria) this;
        }

        public Criteria andValuecodeLike(String value) {
            addCriterion("ValueCode like", value, "valuecode");
            return (Criteria) this;
        }

        public Criteria andValuecodeNotLike(String value) {
            addCriterion("ValueCode not like", value, "valuecode");
            return (Criteria) this;
        }

        public Criteria andValuecodeIn(List<String> values) {
            addCriterion("ValueCode in", values, "valuecode");
            return (Criteria) this;
        }

        public Criteria andValuecodeNotIn(List<String> values) {
            addCriterion("ValueCode not in", values, "valuecode");
            return (Criteria) this;
        }

        public Criteria andValuecodeBetween(String value1, String value2) {
            addCriterion("ValueCode between", value1, value2, "valuecode");
            return (Criteria) this;
        }

        public Criteria andValuecodeNotBetween(String value1, String value2) {
            addCriterion("ValueCode not between", value1, value2, "valuecode");
            return (Criteria) this;
        }

        public Criteria andTargetnameIsNull() {
            addCriterion("TargetName is null");
            return (Criteria) this;
        }

        public Criteria andTargetnameIsNotNull() {
            addCriterion("TargetName is not null");
            return (Criteria) this;
        }

        public Criteria andTargetnameEqualTo(String value) {
            addCriterion("TargetName =", value, "targetname");
            return (Criteria) this;
        }

        public Criteria andTargetnameNotEqualTo(String value) {
            addCriterion("TargetName <>", value, "targetname");
            return (Criteria) this;
        }

        public Criteria andTargetnameGreaterThan(String value) {
            addCriterion("TargetName >", value, "targetname");
            return (Criteria) this;
        }

        public Criteria andTargetnameGreaterThanOrEqualTo(String value) {
            addCriterion("TargetName >=", value, "targetname");
            return (Criteria) this;
        }

        public Criteria andTargetnameLessThan(String value) {
            addCriterion("TargetName <", value, "targetname");
            return (Criteria) this;
        }

        public Criteria andTargetnameLessThanOrEqualTo(String value) {
            addCriterion("TargetName <=", value, "targetname");
            return (Criteria) this;
        }

        public Criteria andTargetnameLike(String value) {
            addCriterion("TargetName like", value, "targetname");
            return (Criteria) this;
        }

        public Criteria andTargetnameNotLike(String value) {
            addCriterion("TargetName not like", value, "targetname");
            return (Criteria) this;
        }

        public Criteria andTargetnameIn(List<String> values) {
            addCriterion("TargetName in", values, "targetname");
            return (Criteria) this;
        }

        public Criteria andTargetnameNotIn(List<String> values) {
            addCriterion("TargetName not in", values, "targetname");
            return (Criteria) this;
        }

        public Criteria andTargetnameBetween(String value1, String value2) {
            addCriterion("TargetName between", value1, value2, "targetname");
            return (Criteria) this;
        }

        public Criteria andTargetnameNotBetween(String value1, String value2) {
            addCriterion("TargetName not between", value1, value2, "targetname");
            return (Criteria) this;
        }

        public Criteria andValuenameIsNull() {
            addCriterion("ValueName is null");
            return (Criteria) this;
        }

        public Criteria andValuenameIsNotNull() {
            addCriterion("ValueName is not null");
            return (Criteria) this;
        }

        public Criteria andValuenameEqualTo(String value) {
            addCriterion("ValueName =", value, "valuename");
            return (Criteria) this;
        }

        public Criteria andValuenameNotEqualTo(String value) {
            addCriterion("ValueName <>", value, "valuename");
            return (Criteria) this;
        }

        public Criteria andValuenameGreaterThan(String value) {
            addCriterion("ValueName >", value, "valuename");
            return (Criteria) this;
        }

        public Criteria andValuenameGreaterThanOrEqualTo(String value) {
            addCriterion("ValueName >=", value, "valuename");
            return (Criteria) this;
        }

        public Criteria andValuenameLessThan(String value) {
            addCriterion("ValueName <", value, "valuename");
            return (Criteria) this;
        }

        public Criteria andValuenameLessThanOrEqualTo(String value) {
            addCriterion("ValueName <=", value, "valuename");
            return (Criteria) this;
        }

        public Criteria andValuenameLike(String value) {
            addCriterion("ValueName like", value, "valuename");
            return (Criteria) this;
        }

        public Criteria andValuenameNotLike(String value) {
            addCriterion("ValueName not like", value, "valuename");
            return (Criteria) this;
        }

        public Criteria andValuenameIn(List<String> values) {
            addCriterion("ValueName in", values, "valuename");
            return (Criteria) this;
        }

        public Criteria andValuenameNotIn(List<String> values) {
            addCriterion("ValueName not in", values, "valuename");
            return (Criteria) this;
        }

        public Criteria andValuenameBetween(String value1, String value2) {
            addCriterion("ValueName between", value1, value2, "valuename");
            return (Criteria) this;
        }

        public Criteria andValuenameNotBetween(String value1, String value2) {
            addCriterion("ValueName not between", value1, value2, "valuename");
            return (Criteria) this;
        }

        public Criteria andUpperLimitIsNull() {
            addCriterion("Upper_Limit is null");
            return (Criteria) this;
        }

        public Criteria andUpperLimitIsNotNull() {
            addCriterion("Upper_Limit is not null");
            return (Criteria) this;
        }

        public Criteria andUpperLimitEqualTo(String value) {
            addCriterion("Upper_Limit =", value, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitNotEqualTo(String value) {
            addCriterion("Upper_Limit <>", value, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitGreaterThan(String value) {
            addCriterion("Upper_Limit >", value, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitGreaterThanOrEqualTo(String value) {
            addCriterion("Upper_Limit >=", value, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitLessThan(String value) {
            addCriterion("Upper_Limit <", value, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitLessThanOrEqualTo(String value) {
            addCriterion("Upper_Limit <=", value, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitLike(String value) {
            addCriterion("Upper_Limit like", value, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitNotLike(String value) {
            addCriterion("Upper_Limit not like", value, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitIn(List<String> values) {
            addCriterion("Upper_Limit in", values, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitNotIn(List<String> values) {
            addCriterion("Upper_Limit not in", values, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitBetween(String value1, String value2) {
            addCriterion("Upper_Limit between", value1, value2, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitNotBetween(String value1, String value2) {
            addCriterion("Upper_Limit not between", value1, value2, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andLowLimitIsNull() {
            addCriterion("Low_Limit is null");
            return (Criteria) this;
        }

        public Criteria andLowLimitIsNotNull() {
            addCriterion("Low_Limit is not null");
            return (Criteria) this;
        }

        public Criteria andLowLimitEqualTo(String value) {
            addCriterion("Low_Limit =", value, "lowLimit");
            return (Criteria) this;
        }

        public Criteria andLowLimitNotEqualTo(String value) {
            addCriterion("Low_Limit <>", value, "lowLimit");
            return (Criteria) this;
        }

        public Criteria andLowLimitGreaterThan(String value) {
            addCriterion("Low_Limit >", value, "lowLimit");
            return (Criteria) this;
        }

        public Criteria andLowLimitGreaterThanOrEqualTo(String value) {
            addCriterion("Low_Limit >=", value, "lowLimit");
            return (Criteria) this;
        }

        public Criteria andLowLimitLessThan(String value) {
            addCriterion("Low_Limit <", value, "lowLimit");
            return (Criteria) this;
        }

        public Criteria andLowLimitLessThanOrEqualTo(String value) {
            addCriterion("Low_Limit <=", value, "lowLimit");
            return (Criteria) this;
        }

        public Criteria andLowLimitLike(String value) {
            addCriterion("Low_Limit like", value, "lowLimit");
            return (Criteria) this;
        }

        public Criteria andLowLimitNotLike(String value) {
            addCriterion("Low_Limit not like", value, "lowLimit");
            return (Criteria) this;
        }

        public Criteria andLowLimitIn(List<String> values) {
            addCriterion("Low_Limit in", values, "lowLimit");
            return (Criteria) this;
        }

        public Criteria andLowLimitNotIn(List<String> values) {
            addCriterion("Low_Limit not in", values, "lowLimit");
            return (Criteria) this;
        }

        public Criteria andLowLimitBetween(String value1, String value2) {
            addCriterion("Low_Limit between", value1, value2, "lowLimit");
            return (Criteria) this;
        }

        public Criteria andLowLimitNotBetween(String value1, String value2) {
            addCriterion("Low_Limit not between", value1, value2, "lowLimit");
            return (Criteria) this;
        }

        public Criteria andScorevalueIsNull() {
            addCriterion("ScoreValue is null");
            return (Criteria) this;
        }

        public Criteria andScorevalueIsNotNull() {
            addCriterion("ScoreValue is not null");
            return (Criteria) this;
        }

        public Criteria andScorevalueEqualTo(String value) {
            addCriterion("ScoreValue =", value, "scorevalue");
            return (Criteria) this;
        }

        public Criteria andScorevalueNotEqualTo(String value) {
            addCriterion("ScoreValue <>", value, "scorevalue");
            return (Criteria) this;
        }

        public Criteria andScorevalueGreaterThan(String value) {
            addCriterion("ScoreValue >", value, "scorevalue");
            return (Criteria) this;
        }

        public Criteria andScorevalueGreaterThanOrEqualTo(String value) {
            addCriterion("ScoreValue >=", value, "scorevalue");
            return (Criteria) this;
        }

        public Criteria andScorevalueLessThan(String value) {
            addCriterion("ScoreValue <", value, "scorevalue");
            return (Criteria) this;
        }

        public Criteria andScorevalueLessThanOrEqualTo(String value) {
            addCriterion("ScoreValue <=", value, "scorevalue");
            return (Criteria) this;
        }

        public Criteria andScorevalueLike(String value) {
            addCriterion("ScoreValue like", value, "scorevalue");
            return (Criteria) this;
        }

        public Criteria andScorevalueNotLike(String value) {
            addCriterion("ScoreValue not like", value, "scorevalue");
            return (Criteria) this;
        }

        public Criteria andScorevalueIn(List<String> values) {
            addCriterion("ScoreValue in", values, "scorevalue");
            return (Criteria) this;
        }

        public Criteria andScorevalueNotIn(List<String> values) {
            addCriterion("ScoreValue not in", values, "scorevalue");
            return (Criteria) this;
        }

        public Criteria andScorevalueBetween(String value1, String value2) {
            addCriterion("ScoreValue between", value1, value2, "scorevalue");
            return (Criteria) this;
        }

        public Criteria andScorevalueNotBetween(String value1, String value2) {
            addCriterion("ScoreValue not between", value1, value2, "scorevalue");
            return (Criteria) this;
        }

        public Criteria andBickidIsNull() {
            addCriterion("BICKID is null");
            return (Criteria) this;
        }

        public Criteria andBickidIsNotNull() {
            addCriterion("BICKID is not null");
            return (Criteria) this;
        }

        public Criteria andBickidEqualTo(String value) {
            addCriterion("BICKID =", value, "bickid");
            return (Criteria) this;
        }

        public Criteria andBickidNotEqualTo(String value) {
            addCriterion("BICKID <>", value, "bickid");
            return (Criteria) this;
        }

        public Criteria andBickidGreaterThan(String value) {
            addCriterion("BICKID >", value, "bickid");
            return (Criteria) this;
        }

        public Criteria andBickidGreaterThanOrEqualTo(String value) {
            addCriterion("BICKID >=", value, "bickid");
            return (Criteria) this;
        }

        public Criteria andBickidLessThan(String value) {
            addCriterion("BICKID <", value, "bickid");
            return (Criteria) this;
        }

        public Criteria andBickidLessThanOrEqualTo(String value) {
            addCriterion("BICKID <=", value, "bickid");
            return (Criteria) this;
        }

        public Criteria andBickidLike(String value) {
            addCriterion("BICKID like", value, "bickid");
            return (Criteria) this;
        }

        public Criteria andBickidNotLike(String value) {
            addCriterion("BICKID not like", value, "bickid");
            return (Criteria) this;
        }

        public Criteria andBickidIn(List<String> values) {
            addCriterion("BICKID in", values, "bickid");
            return (Criteria) this;
        }

        public Criteria andBickidNotIn(List<String> values) {
            addCriterion("BICKID not in", values, "bickid");
            return (Criteria) this;
        }

        public Criteria andBickidBetween(String value1, String value2) {
            addCriterion("BICKID between", value1, value2, "bickid");
            return (Criteria) this;
        }

        public Criteria andBickidNotBetween(String value1, String value2) {
            addCriterion("BICKID not between", value1, value2, "bickid");
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