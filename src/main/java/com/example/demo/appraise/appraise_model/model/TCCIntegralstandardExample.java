package com.example.demo.appraise.appraise_model.model;

import java.util.ArrayList;
import java.util.List;

public class TCCIntegralstandardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public TCCIntegralstandardExample() {
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

        public Criteria andSerialnumIsNull() {
            addCriterion("SERIALNUM is null");
            return (Criteria) this;
        }

        public Criteria andSerialnumIsNotNull() {
            addCriterion("SERIALNUM is not null");
            return (Criteria) this;
        }

        public Criteria andSerialnumEqualTo(String value) {
            addCriterion("SERIALNUM =", value, "serialnum");
            return (Criteria) this;
        }

        public Criteria andSerialnumNotEqualTo(String value) {
            addCriterion("SERIALNUM <>", value, "serialnum");
            return (Criteria) this;
        }

        public Criteria andSerialnumGreaterThan(String value) {
            addCriterion("SERIALNUM >", value, "serialnum");
            return (Criteria) this;
        }

        public Criteria andSerialnumGreaterThanOrEqualTo(String value) {
            addCriterion("SERIALNUM >=", value, "serialnum");
            return (Criteria) this;
        }

        public Criteria andSerialnumLessThan(String value) {
            addCriterion("SERIALNUM <", value, "serialnum");
            return (Criteria) this;
        }

        public Criteria andSerialnumLessThanOrEqualTo(String value) {
            addCriterion("SERIALNUM <=", value, "serialnum");
            return (Criteria) this;
        }

        public Criteria andSerialnumLike(String value) {
            addCriterion("SERIALNUM like", value, "serialnum");
            return (Criteria) this;
        }

        public Criteria andSerialnumNotLike(String value) {
            addCriterion("SERIALNUM not like", value, "serialnum");
            return (Criteria) this;
        }

        public Criteria andSerialnumIn(List<String> values) {
            addCriterion("SERIALNUM in", values, "serialnum");
            return (Criteria) this;
        }

        public Criteria andSerialnumNotIn(List<String> values) {
            addCriterion("SERIALNUM not in", values, "serialnum");
            return (Criteria) this;
        }

        public Criteria andSerialnumBetween(String value1, String value2) {
            addCriterion("SERIALNUM between", value1, value2, "serialnum");
            return (Criteria) this;
        }

        public Criteria andSerialnumNotBetween(String value1, String value2) {
            addCriterion("SERIALNUM not between", value1, value2, "serialnum");
            return (Criteria) this;
        }

        public Criteria andIntNameIsNull() {
            addCriterion("INT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andIntNameIsNotNull() {
            addCriterion("INT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andIntNameEqualTo(String value) {
            addCriterion("INT_NAME =", value, "intName");
            return (Criteria) this;
        }

        public Criteria andIntNameNotEqualTo(String value) {
            addCriterion("INT_NAME <>", value, "intName");
            return (Criteria) this;
        }

        public Criteria andIntNameGreaterThan(String value) {
            addCriterion("INT_NAME >", value, "intName");
            return (Criteria) this;
        }

        public Criteria andIntNameGreaterThanOrEqualTo(String value) {
            addCriterion("INT_NAME >=", value, "intName");
            return (Criteria) this;
        }

        public Criteria andIntNameLessThan(String value) {
            addCriterion("INT_NAME <", value, "intName");
            return (Criteria) this;
        }

        public Criteria andIntNameLessThanOrEqualTo(String value) {
            addCriterion("INT_NAME <=", value, "intName");
            return (Criteria) this;
        }

        public Criteria andIntNameLike(String value) {
            addCriterion("INT_NAME like", value, "intName");
            return (Criteria) this;
        }

        public Criteria andIntNameNotLike(String value) {
            addCriterion("INT_NAME not like", value, "intName");
            return (Criteria) this;
        }

        public Criteria andIntNameIn(List<String> values) {
            addCriterion("INT_NAME in", values, "intName");
            return (Criteria) this;
        }

        public Criteria andIntNameNotIn(List<String> values) {
            addCriterion("INT_NAME not in", values, "intName");
            return (Criteria) this;
        }

        public Criteria andIntNameBetween(String value1, String value2) {
            addCriterion("INT_NAME between", value1, value2, "intName");
            return (Criteria) this;
        }

        public Criteria andIntNameNotBetween(String value1, String value2) {
            addCriterion("INT_NAME not between", value1, value2, "intName");
            return (Criteria) this;
        }

        public Criteria andUpperLimitIsNull() {
            addCriterion("UPPER_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andUpperLimitIsNotNull() {
            addCriterion("UPPER_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andUpperLimitEqualTo(String value) {
            addCriterion("UPPER_LIMIT =", value, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitNotEqualTo(String value) {
            addCriterion("UPPER_LIMIT <>", value, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitGreaterThan(String value) {
            addCriterion("UPPER_LIMIT >", value, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitGreaterThanOrEqualTo(String value) {
            addCriterion("UPPER_LIMIT >=", value, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitLessThan(String value) {
            addCriterion("UPPER_LIMIT <", value, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitLessThanOrEqualTo(String value) {
            addCriterion("UPPER_LIMIT <=", value, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitLike(String value) {
            addCriterion("UPPER_LIMIT like", value, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitNotLike(String value) {
            addCriterion("UPPER_LIMIT not like", value, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitIn(List<String> values) {
            addCriterion("UPPER_LIMIT in", values, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitNotIn(List<String> values) {
            addCriterion("UPPER_LIMIT not in", values, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitBetween(String value1, String value2) {
            addCriterion("UPPER_LIMIT between", value1, value2, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitNotBetween(String value1, String value2) {
            addCriterion("UPPER_LIMIT not between", value1, value2, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andBottomLimitIsNull() {
            addCriterion("BOTTOM_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andBottomLimitIsNotNull() {
            addCriterion("BOTTOM_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andBottomLimitEqualTo(String value) {
            addCriterion("BOTTOM_LIMIT =", value, "bottomLimit");
            return (Criteria) this;
        }

        public Criteria andBottomLimitNotEqualTo(String value) {
            addCriterion("BOTTOM_LIMIT <>", value, "bottomLimit");
            return (Criteria) this;
        }

        public Criteria andBottomLimitGreaterThan(String value) {
            addCriterion("BOTTOM_LIMIT >", value, "bottomLimit");
            return (Criteria) this;
        }

        public Criteria andBottomLimitGreaterThanOrEqualTo(String value) {
            addCriterion("BOTTOM_LIMIT >=", value, "bottomLimit");
            return (Criteria) this;
        }

        public Criteria andBottomLimitLessThan(String value) {
            addCriterion("BOTTOM_LIMIT <", value, "bottomLimit");
            return (Criteria) this;
        }

        public Criteria andBottomLimitLessThanOrEqualTo(String value) {
            addCriterion("BOTTOM_LIMIT <=", value, "bottomLimit");
            return (Criteria) this;
        }

        public Criteria andBottomLimitLike(String value) {
            addCriterion("BOTTOM_LIMIT like", value, "bottomLimit");
            return (Criteria) this;
        }

        public Criteria andBottomLimitNotLike(String value) {
            addCriterion("BOTTOM_LIMIT not like", value, "bottomLimit");
            return (Criteria) this;
        }

        public Criteria andBottomLimitIn(List<String> values) {
            addCriterion("BOTTOM_LIMIT in", values, "bottomLimit");
            return (Criteria) this;
        }

        public Criteria andBottomLimitNotIn(List<String> values) {
            addCriterion("BOTTOM_LIMIT not in", values, "bottomLimit");
            return (Criteria) this;
        }

        public Criteria andBottomLimitBetween(String value1, String value2) {
            addCriterion("BOTTOM_LIMIT between", value1, value2, "bottomLimit");
            return (Criteria) this;
        }

        public Criteria andBottomLimitNotBetween(String value1, String value2) {
            addCriterion("BOTTOM_LIMIT not between", value1, value2, "bottomLimit");
            return (Criteria) this;
        }

        public Criteria andIntegralIsNull() {
            addCriterion("INTEGRAL is null");
            return (Criteria) this;
        }

        public Criteria andIntegralIsNotNull() {
            addCriterion("INTEGRAL is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralEqualTo(String value) {
            addCriterion("INTEGRAL =", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotEqualTo(String value) {
            addCriterion("INTEGRAL <>", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralGreaterThan(String value) {
            addCriterion("INTEGRAL >", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralGreaterThanOrEqualTo(String value) {
            addCriterion("INTEGRAL >=", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralLessThan(String value) {
            addCriterion("INTEGRAL <", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralLessThanOrEqualTo(String value) {
            addCriterion("INTEGRAL <=", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralLike(String value) {
            addCriterion("INTEGRAL like", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotLike(String value) {
            addCriterion("INTEGRAL not like", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralIn(List<String> values) {
            addCriterion("INTEGRAL in", values, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotIn(List<String> values) {
            addCriterion("INTEGRAL not in", values, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralBetween(String value1, String value2) {
            addCriterion("INTEGRAL between", value1, value2, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotBetween(String value1, String value2) {
            addCriterion("INTEGRAL not between", value1, value2, "integral");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("NOTE is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("NOTE =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("NOTE <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("NOTE >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("NOTE >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("NOTE <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("NOTE <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("NOTE like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("NOTE not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("NOTE in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("NOTE not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("NOTE between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("NOTE not between", value1, value2, "note");
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