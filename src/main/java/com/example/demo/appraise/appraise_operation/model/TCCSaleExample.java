package com.example.demo.appraise.appraise_operation.model;

import java.util.ArrayList;
import java.util.List;

public class TCCSaleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public TCCSaleExample() {
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

        public Criteria andSalecodeIsNull() {
            addCriterion("saleCode is null");
            return (Criteria) this;
        }

        public Criteria andSalecodeIsNotNull() {
            addCriterion("saleCode is not null");
            return (Criteria) this;
        }

        public Criteria andSalecodeEqualTo(String value) {
            addCriterion("saleCode =", value, "salecode");
            return (Criteria) this;
        }

        public Criteria andSalecodeNotEqualTo(String value) {
            addCriterion("saleCode <>", value, "salecode");
            return (Criteria) this;
        }

        public Criteria andSalecodeGreaterThan(String value) {
            addCriterion("saleCode >", value, "salecode");
            return (Criteria) this;
        }

        public Criteria andSalecodeGreaterThanOrEqualTo(String value) {
            addCriterion("saleCode >=", value, "salecode");
            return (Criteria) this;
        }

        public Criteria andSalecodeLessThan(String value) {
            addCriterion("saleCode <", value, "salecode");
            return (Criteria) this;
        }

        public Criteria andSalecodeLessThanOrEqualTo(String value) {
            addCriterion("saleCode <=", value, "salecode");
            return (Criteria) this;
        }

        public Criteria andSalecodeLike(String value) {
            addCriterion("saleCode like", value, "salecode");
            return (Criteria) this;
        }

        public Criteria andSalecodeNotLike(String value) {
            addCriterion("saleCode not like", value, "salecode");
            return (Criteria) this;
        }

        public Criteria andSalecodeIn(List<String> values) {
            addCriterion("saleCode in", values, "salecode");
            return (Criteria) this;
        }

        public Criteria andSalecodeNotIn(List<String> values) {
            addCriterion("saleCode not in", values, "salecode");
            return (Criteria) this;
        }

        public Criteria andSalecodeBetween(String value1, String value2) {
            addCriterion("saleCode between", value1, value2, "salecode");
            return (Criteria) this;
        }

        public Criteria andSalecodeNotBetween(String value1, String value2) {
            addCriterion("saleCode not between", value1, value2, "salecode");
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

        public Criteria andSalevolumeIsNull() {
            addCriterion("saleVolume is null");
            return (Criteria) this;
        }

        public Criteria andSalevolumeIsNotNull() {
            addCriterion("saleVolume is not null");
            return (Criteria) this;
        }

        public Criteria andSalevolumeEqualTo(String value) {
            addCriterion("saleVolume =", value, "salevolume");
            return (Criteria) this;
        }

        public Criteria andSalevolumeNotEqualTo(String value) {
            addCriterion("saleVolume <>", value, "salevolume");
            return (Criteria) this;
        }

        public Criteria andSalevolumeGreaterThan(String value) {
            addCriterion("saleVolume >", value, "salevolume");
            return (Criteria) this;
        }

        public Criteria andSalevolumeGreaterThanOrEqualTo(String value) {
            addCriterion("saleVolume >=", value, "salevolume");
            return (Criteria) this;
        }

        public Criteria andSalevolumeLessThan(String value) {
            addCriterion("saleVolume <", value, "salevolume");
            return (Criteria) this;
        }

        public Criteria andSalevolumeLessThanOrEqualTo(String value) {
            addCriterion("saleVolume <=", value, "salevolume");
            return (Criteria) this;
        }

        public Criteria andSalevolumeLike(String value) {
            addCriterion("saleVolume like", value, "salevolume");
            return (Criteria) this;
        }

        public Criteria andSalevolumeNotLike(String value) {
            addCriterion("saleVolume not like", value, "salevolume");
            return (Criteria) this;
        }

        public Criteria andSalevolumeIn(List<String> values) {
            addCriterion("saleVolume in", values, "salevolume");
            return (Criteria) this;
        }

        public Criteria andSalevolumeNotIn(List<String> values) {
            addCriterion("saleVolume not in", values, "salevolume");
            return (Criteria) this;
        }

        public Criteria andSalevolumeBetween(String value1, String value2) {
            addCriterion("saleVolume between", value1, value2, "salevolume");
            return (Criteria) this;
        }

        public Criteria andSalevolumeNotBetween(String value1, String value2) {
            addCriterion("saleVolume not between", value1, value2, "salevolume");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(String value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(String value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(String value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(String value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(String value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLike(String value) {
            addCriterion("money like", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotLike(String value) {
            addCriterion("money not like", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<String> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<String> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(String value1, String value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(String value1, String value2) {
            addCriterion("money not between", value1, value2, "money");
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