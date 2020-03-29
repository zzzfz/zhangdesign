package com.example.demo.admin.mode.model;

import java.util.ArrayList;
import java.util.List;

public class TCAModeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public TCAModeExample() {
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

        public Criteria andModeidIsNull() {
            addCriterion("modeId is null");
            return (Criteria) this;
        }

        public Criteria andModeidIsNotNull() {
            addCriterion("modeId is not null");
            return (Criteria) this;
        }

        public Criteria andModeidEqualTo(String value) {
            addCriterion("modeId =", value, "modeid");
            return (Criteria) this;
        }

        public Criteria andModeidNotEqualTo(String value) {
            addCriterion("modeId <>", value, "modeid");
            return (Criteria) this;
        }

        public Criteria andModeidGreaterThan(String value) {
            addCriterion("modeId >", value, "modeid");
            return (Criteria) this;
        }

        public Criteria andModeidGreaterThanOrEqualTo(String value) {
            addCriterion("modeId >=", value, "modeid");
            return (Criteria) this;
        }

        public Criteria andModeidLessThan(String value) {
            addCriterion("modeId <", value, "modeid");
            return (Criteria) this;
        }

        public Criteria andModeidLessThanOrEqualTo(String value) {
            addCriterion("modeId <=", value, "modeid");
            return (Criteria) this;
        }

        public Criteria andModeidLike(String value) {
            addCriterion("modeId like", value, "modeid");
            return (Criteria) this;
        }

        public Criteria andModeidNotLike(String value) {
            addCriterion("modeId not like", value, "modeid");
            return (Criteria) this;
        }

        public Criteria andModeidIn(List<String> values) {
            addCriterion("modeId in", values, "modeid");
            return (Criteria) this;
        }

        public Criteria andModeidNotIn(List<String> values) {
            addCriterion("modeId not in", values, "modeid");
            return (Criteria) this;
        }

        public Criteria andModeidBetween(String value1, String value2) {
            addCriterion("modeId between", value1, value2, "modeid");
            return (Criteria) this;
        }

        public Criteria andModeidNotBetween(String value1, String value2) {
            addCriterion("modeId not between", value1, value2, "modeid");
            return (Criteria) this;
        }

        public Criteria andModenameIsNull() {
            addCriterion("modeName is null");
            return (Criteria) this;
        }

        public Criteria andModenameIsNotNull() {
            addCriterion("modeName is not null");
            return (Criteria) this;
        }

        public Criteria andModenameEqualTo(String value) {
            addCriterion("modeName =", value, "modename");
            return (Criteria) this;
        }

        public Criteria andModenameNotEqualTo(String value) {
            addCriterion("modeName <>", value, "modename");
            return (Criteria) this;
        }

        public Criteria andModenameGreaterThan(String value) {
            addCriterion("modeName >", value, "modename");
            return (Criteria) this;
        }

        public Criteria andModenameGreaterThanOrEqualTo(String value) {
            addCriterion("modeName >=", value, "modename");
            return (Criteria) this;
        }

        public Criteria andModenameLessThan(String value) {
            addCriterion("modeName <", value, "modename");
            return (Criteria) this;
        }

        public Criteria andModenameLessThanOrEqualTo(String value) {
            addCriterion("modeName <=", value, "modename");
            return (Criteria) this;
        }

        public Criteria andModenameLike(String value) {
            addCriterion("modeName like", value, "modename");
            return (Criteria) this;
        }

        public Criteria andModenameNotLike(String value) {
            addCriterion("modeName not like", value, "modename");
            return (Criteria) this;
        }

        public Criteria andModenameIn(List<String> values) {
            addCriterion("modeName in", values, "modename");
            return (Criteria) this;
        }

        public Criteria andModenameNotIn(List<String> values) {
            addCriterion("modeName not in", values, "modename");
            return (Criteria) this;
        }

        public Criteria andModenameBetween(String value1, String value2) {
            addCriterion("modeName between", value1, value2, "modename");
            return (Criteria) this;
        }

        public Criteria andModenameNotBetween(String value1, String value2) {
            addCriterion("modeName not between", value1, value2, "modename");
            return (Criteria) this;
        }

        public Criteria andModecodeIsNull() {
            addCriterion("modeCode is null");
            return (Criteria) this;
        }

        public Criteria andModecodeIsNotNull() {
            addCriterion("modeCode is not null");
            return (Criteria) this;
        }

        public Criteria andModecodeEqualTo(String value) {
            addCriterion("modeCode =", value, "modecode");
            return (Criteria) this;
        }

        public Criteria andModecodeNotEqualTo(String value) {
            addCriterion("modeCode <>", value, "modecode");
            return (Criteria) this;
        }

        public Criteria andModecodeGreaterThan(String value) {
            addCriterion("modeCode >", value, "modecode");
            return (Criteria) this;
        }

        public Criteria andModecodeGreaterThanOrEqualTo(String value) {
            addCriterion("modeCode >=", value, "modecode");
            return (Criteria) this;
        }

        public Criteria andModecodeLessThan(String value) {
            addCriterion("modeCode <", value, "modecode");
            return (Criteria) this;
        }

        public Criteria andModecodeLessThanOrEqualTo(String value) {
            addCriterion("modeCode <=", value, "modecode");
            return (Criteria) this;
        }

        public Criteria andModecodeLike(String value) {
            addCriterion("modeCode like", value, "modecode");
            return (Criteria) this;
        }

        public Criteria andModecodeNotLike(String value) {
            addCriterion("modeCode not like", value, "modecode");
            return (Criteria) this;
        }

        public Criteria andModecodeIn(List<String> values) {
            addCriterion("modeCode in", values, "modecode");
            return (Criteria) this;
        }

        public Criteria andModecodeNotIn(List<String> values) {
            addCriterion("modeCode not in", values, "modecode");
            return (Criteria) this;
        }

        public Criteria andModecodeBetween(String value1, String value2) {
            addCriterion("modeCode between", value1, value2, "modecode");
            return (Criteria) this;
        }

        public Criteria andModecodeNotBetween(String value1, String value2) {
            addCriterion("modeCode not between", value1, value2, "modecode");
            return (Criteria) this;
        }

        public Criteria andModeurlIsNull() {
            addCriterion("modeUrl is null");
            return (Criteria) this;
        }

        public Criteria andModeurlIsNotNull() {
            addCriterion("modeUrl is not null");
            return (Criteria) this;
        }

        public Criteria andModeurlEqualTo(String value) {
            addCriterion("modeUrl =", value, "modeurl");
            return (Criteria) this;
        }

        public Criteria andModeurlNotEqualTo(String value) {
            addCriterion("modeUrl <>", value, "modeurl");
            return (Criteria) this;
        }

        public Criteria andModeurlGreaterThan(String value) {
            addCriterion("modeUrl >", value, "modeurl");
            return (Criteria) this;
        }

        public Criteria andModeurlGreaterThanOrEqualTo(String value) {
            addCriterion("modeUrl >=", value, "modeurl");
            return (Criteria) this;
        }

        public Criteria andModeurlLessThan(String value) {
            addCriterion("modeUrl <", value, "modeurl");
            return (Criteria) this;
        }

        public Criteria andModeurlLessThanOrEqualTo(String value) {
            addCriterion("modeUrl <=", value, "modeurl");
            return (Criteria) this;
        }

        public Criteria andModeurlLike(String value) {
            addCriterion("modeUrl like", value, "modeurl");
            return (Criteria) this;
        }

        public Criteria andModeurlNotLike(String value) {
            addCriterion("modeUrl not like", value, "modeurl");
            return (Criteria) this;
        }

        public Criteria andModeurlIn(List<String> values) {
            addCriterion("modeUrl in", values, "modeurl");
            return (Criteria) this;
        }

        public Criteria andModeurlNotIn(List<String> values) {
            addCriterion("modeUrl not in", values, "modeurl");
            return (Criteria) this;
        }

        public Criteria andModeurlBetween(String value1, String value2) {
            addCriterion("modeUrl between", value1, value2, "modeurl");
            return (Criteria) this;
        }

        public Criteria andModeurlNotBetween(String value1, String value2) {
            addCriterion("modeUrl not between", value1, value2, "modeurl");
            return (Criteria) this;
        }

        public Criteria andTheappnameIsNull() {
            addCriterion("theAppName is null");
            return (Criteria) this;
        }

        public Criteria andTheappnameIsNotNull() {
            addCriterion("theAppName is not null");
            return (Criteria) this;
        }

        public Criteria andTheappnameEqualTo(String value) {
            addCriterion("theAppName =", value, "theappname");
            return (Criteria) this;
        }

        public Criteria andTheappnameNotEqualTo(String value) {
            addCriterion("theAppName <>", value, "theappname");
            return (Criteria) this;
        }

        public Criteria andTheappnameGreaterThan(String value) {
            addCriterion("theAppName >", value, "theappname");
            return (Criteria) this;
        }

        public Criteria andTheappnameGreaterThanOrEqualTo(String value) {
            addCriterion("theAppName >=", value, "theappname");
            return (Criteria) this;
        }

        public Criteria andTheappnameLessThan(String value) {
            addCriterion("theAppName <", value, "theappname");
            return (Criteria) this;
        }

        public Criteria andTheappnameLessThanOrEqualTo(String value) {
            addCriterion("theAppName <=", value, "theappname");
            return (Criteria) this;
        }

        public Criteria andTheappnameLike(String value) {
            addCriterion("theAppName like", value, "theappname");
            return (Criteria) this;
        }

        public Criteria andTheappnameNotLike(String value) {
            addCriterion("theAppName not like", value, "theappname");
            return (Criteria) this;
        }

        public Criteria andTheappnameIn(List<String> values) {
            addCriterion("theAppName in", values, "theappname");
            return (Criteria) this;
        }

        public Criteria andTheappnameNotIn(List<String> values) {
            addCriterion("theAppName not in", values, "theappname");
            return (Criteria) this;
        }

        public Criteria andTheappnameBetween(String value1, String value2) {
            addCriterion("theAppName between", value1, value2, "theappname");
            return (Criteria) this;
        }

        public Criteria andTheappnameNotBetween(String value1, String value2) {
            addCriterion("theAppName not between", value1, value2, "theappname");
            return (Criteria) this;
        }

        public Criteria andModenoteIsNull() {
            addCriterion("modeNote is null");
            return (Criteria) this;
        }

        public Criteria andModenoteIsNotNull() {
            addCriterion("modeNote is not null");
            return (Criteria) this;
        }

        public Criteria andModenoteEqualTo(String value) {
            addCriterion("modeNote =", value, "modenote");
            return (Criteria) this;
        }

        public Criteria andModenoteNotEqualTo(String value) {
            addCriterion("modeNote <>", value, "modenote");
            return (Criteria) this;
        }

        public Criteria andModenoteGreaterThan(String value) {
            addCriterion("modeNote >", value, "modenote");
            return (Criteria) this;
        }

        public Criteria andModenoteGreaterThanOrEqualTo(String value) {
            addCriterion("modeNote >=", value, "modenote");
            return (Criteria) this;
        }

        public Criteria andModenoteLessThan(String value) {
            addCriterion("modeNote <", value, "modenote");
            return (Criteria) this;
        }

        public Criteria andModenoteLessThanOrEqualTo(String value) {
            addCriterion("modeNote <=", value, "modenote");
            return (Criteria) this;
        }

        public Criteria andModenoteLike(String value) {
            addCriterion("modeNote like", value, "modenote");
            return (Criteria) this;
        }

        public Criteria andModenoteNotLike(String value) {
            addCriterion("modeNote not like", value, "modenote");
            return (Criteria) this;
        }

        public Criteria andModenoteIn(List<String> values) {
            addCriterion("modeNote in", values, "modenote");
            return (Criteria) this;
        }

        public Criteria andModenoteNotIn(List<String> values) {
            addCriterion("modeNote not in", values, "modenote");
            return (Criteria) this;
        }

        public Criteria andModenoteBetween(String value1, String value2) {
            addCriterion("modeNote between", value1, value2, "modenote");
            return (Criteria) this;
        }

        public Criteria andModenoteNotBetween(String value1, String value2) {
            addCriterion("modeNote not between", value1, value2, "modenote");
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