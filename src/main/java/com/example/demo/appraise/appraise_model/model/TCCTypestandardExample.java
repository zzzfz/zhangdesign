package com.example.demo.appraise.appraise_model.model;

import java.util.ArrayList;
import java.util.List;

public class TCCTypestandardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public TCCTypestandardExample() {
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

        public Criteria andTypecodeIsNull() {
            addCriterion("TypeCode is null");
            return (Criteria) this;
        }

        public Criteria andTypecodeIsNotNull() {
            addCriterion("TypeCode is not null");
            return (Criteria) this;
        }

        public Criteria andTypecodeEqualTo(String value) {
            addCriterion("TypeCode =", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeNotEqualTo(String value) {
            addCriterion("TypeCode <>", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeGreaterThan(String value) {
            addCriterion("TypeCode >", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeGreaterThanOrEqualTo(String value) {
            addCriterion("TypeCode >=", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeLessThan(String value) {
            addCriterion("TypeCode <", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeLessThanOrEqualTo(String value) {
            addCriterion("TypeCode <=", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeLike(String value) {
            addCriterion("TypeCode like", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeNotLike(String value) {
            addCriterion("TypeCode not like", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeIn(List<String> values) {
            addCriterion("TypeCode in", values, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeNotIn(List<String> values) {
            addCriterion("TypeCode not in", values, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeBetween(String value1, String value2) {
            addCriterion("TypeCode between", value1, value2, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeNotBetween(String value1, String value2) {
            addCriterion("TypeCode not between", value1, value2, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypenameIsNull() {
            addCriterion("TypeName is null");
            return (Criteria) this;
        }

        public Criteria andTypenameIsNotNull() {
            addCriterion("TypeName is not null");
            return (Criteria) this;
        }

        public Criteria andTypenameEqualTo(String value) {
            addCriterion("TypeName =", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotEqualTo(String value) {
            addCriterion("TypeName <>", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameGreaterThan(String value) {
            addCriterion("TypeName >", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameGreaterThanOrEqualTo(String value) {
            addCriterion("TypeName >=", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLessThan(String value) {
            addCriterion("TypeName <", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLessThanOrEqualTo(String value) {
            addCriterion("TypeName <=", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLike(String value) {
            addCriterion("TypeName like", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotLike(String value) {
            addCriterion("TypeName not like", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameIn(List<String> values) {
            addCriterion("TypeName in", values, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotIn(List<String> values) {
            addCriterion("TypeName not in", values, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameBetween(String value1, String value2) {
            addCriterion("TypeName between", value1, value2, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotBetween(String value1, String value2) {
            addCriterion("TypeName not between", value1, value2, "typename");
            return (Criteria) this;
        }

        public Criteria andEmpcodeIsNull() {
            addCriterion("EmpCode is null");
            return (Criteria) this;
        }

        public Criteria andEmpcodeIsNotNull() {
            addCriterion("EmpCode is not null");
            return (Criteria) this;
        }

        public Criteria andEmpcodeEqualTo(String value) {
            addCriterion("EmpCode =", value, "empcode");
            return (Criteria) this;
        }

        public Criteria andEmpcodeNotEqualTo(String value) {
            addCriterion("EmpCode <>", value, "empcode");
            return (Criteria) this;
        }

        public Criteria andEmpcodeGreaterThan(String value) {
            addCriterion("EmpCode >", value, "empcode");
            return (Criteria) this;
        }

        public Criteria andEmpcodeGreaterThanOrEqualTo(String value) {
            addCriterion("EmpCode >=", value, "empcode");
            return (Criteria) this;
        }

        public Criteria andEmpcodeLessThan(String value) {
            addCriterion("EmpCode <", value, "empcode");
            return (Criteria) this;
        }

        public Criteria andEmpcodeLessThanOrEqualTo(String value) {
            addCriterion("EmpCode <=", value, "empcode");
            return (Criteria) this;
        }

        public Criteria andEmpcodeLike(String value) {
            addCriterion("EmpCode like", value, "empcode");
            return (Criteria) this;
        }

        public Criteria andEmpcodeNotLike(String value) {
            addCriterion("EmpCode not like", value, "empcode");
            return (Criteria) this;
        }

        public Criteria andEmpcodeIn(List<String> values) {
            addCriterion("EmpCode in", values, "empcode");
            return (Criteria) this;
        }

        public Criteria andEmpcodeNotIn(List<String> values) {
            addCriterion("EmpCode not in", values, "empcode");
            return (Criteria) this;
        }

        public Criteria andEmpcodeBetween(String value1, String value2) {
            addCriterion("EmpCode between", value1, value2, "empcode");
            return (Criteria) this;
        }

        public Criteria andEmpcodeNotBetween(String value1, String value2) {
            addCriterion("EmpCode not between", value1, value2, "empcode");
            return (Criteria) this;
        }

        public Criteria andMancountIsNull() {
            addCriterion("ManCount is null");
            return (Criteria) this;
        }

        public Criteria andMancountIsNotNull() {
            addCriterion("ManCount is not null");
            return (Criteria) this;
        }

        public Criteria andMancountEqualTo(String value) {
            addCriterion("ManCount =", value, "mancount");
            return (Criteria) this;
        }

        public Criteria andMancountNotEqualTo(String value) {
            addCriterion("ManCount <>", value, "mancount");
            return (Criteria) this;
        }

        public Criteria andMancountGreaterThan(String value) {
            addCriterion("ManCount >", value, "mancount");
            return (Criteria) this;
        }

        public Criteria andMancountGreaterThanOrEqualTo(String value) {
            addCriterion("ManCount >=", value, "mancount");
            return (Criteria) this;
        }

        public Criteria andMancountLessThan(String value) {
            addCriterion("ManCount <", value, "mancount");
            return (Criteria) this;
        }

        public Criteria andMancountLessThanOrEqualTo(String value) {
            addCriterion("ManCount <=", value, "mancount");
            return (Criteria) this;
        }

        public Criteria andMancountLike(String value) {
            addCriterion("ManCount like", value, "mancount");
            return (Criteria) this;
        }

        public Criteria andMancountNotLike(String value) {
            addCriterion("ManCount not like", value, "mancount");
            return (Criteria) this;
        }

        public Criteria andMancountIn(List<String> values) {
            addCriterion("ManCount in", values, "mancount");
            return (Criteria) this;
        }

        public Criteria andMancountNotIn(List<String> values) {
            addCriterion("ManCount not in", values, "mancount");
            return (Criteria) this;
        }

        public Criteria andMancountBetween(String value1, String value2) {
            addCriterion("ManCount between", value1, value2, "mancount");
            return (Criteria) this;
        }

        public Criteria andMancountNotBetween(String value1, String value2) {
            addCriterion("ManCount not between", value1, value2, "mancount");
            return (Criteria) this;
        }

        public Criteria andMancountperIsNull() {
            addCriterion("ManCountPer is null");
            return (Criteria) this;
        }

        public Criteria andMancountperIsNotNull() {
            addCriterion("ManCountPer is not null");
            return (Criteria) this;
        }

        public Criteria andMancountperEqualTo(String value) {
            addCriterion("ManCountPer =", value, "mancountper");
            return (Criteria) this;
        }

        public Criteria andMancountperNotEqualTo(String value) {
            addCriterion("ManCountPer <>", value, "mancountper");
            return (Criteria) this;
        }

        public Criteria andMancountperGreaterThan(String value) {
            addCriterion("ManCountPer >", value, "mancountper");
            return (Criteria) this;
        }

        public Criteria andMancountperGreaterThanOrEqualTo(String value) {
            addCriterion("ManCountPer >=", value, "mancountper");
            return (Criteria) this;
        }

        public Criteria andMancountperLessThan(String value) {
            addCriterion("ManCountPer <", value, "mancountper");
            return (Criteria) this;
        }

        public Criteria andMancountperLessThanOrEqualTo(String value) {
            addCriterion("ManCountPer <=", value, "mancountper");
            return (Criteria) this;
        }

        public Criteria andMancountperLike(String value) {
            addCriterion("ManCountPer like", value, "mancountper");
            return (Criteria) this;
        }

        public Criteria andMancountperNotLike(String value) {
            addCriterion("ManCountPer not like", value, "mancountper");
            return (Criteria) this;
        }

        public Criteria andMancountperIn(List<String> values) {
            addCriterion("ManCountPer in", values, "mancountper");
            return (Criteria) this;
        }

        public Criteria andMancountperNotIn(List<String> values) {
            addCriterion("ManCountPer not in", values, "mancountper");
            return (Criteria) this;
        }

        public Criteria andMancountperBetween(String value1, String value2) {
            addCriterion("ManCountPer between", value1, value2, "mancountper");
            return (Criteria) this;
        }

        public Criteria andMancountperNotBetween(String value1, String value2) {
            addCriterion("ManCountPer not between", value1, value2, "mancountper");
            return (Criteria) this;
        }

        public Criteria andUpperLimitIsNull() {
            addCriterion("Upper_limit is null");
            return (Criteria) this;
        }

        public Criteria andUpperLimitIsNotNull() {
            addCriterion("Upper_limit is not null");
            return (Criteria) this;
        }

        public Criteria andUpperLimitEqualTo(String value) {
            addCriterion("Upper_limit =", value, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitNotEqualTo(String value) {
            addCriterion("Upper_limit <>", value, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitGreaterThan(String value) {
            addCriterion("Upper_limit >", value, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitGreaterThanOrEqualTo(String value) {
            addCriterion("Upper_limit >=", value, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitLessThan(String value) {
            addCriterion("Upper_limit <", value, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitLessThanOrEqualTo(String value) {
            addCriterion("Upper_limit <=", value, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitLike(String value) {
            addCriterion("Upper_limit like", value, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitNotLike(String value) {
            addCriterion("Upper_limit not like", value, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitIn(List<String> values) {
            addCriterion("Upper_limit in", values, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitNotIn(List<String> values) {
            addCriterion("Upper_limit not in", values, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitBetween(String value1, String value2) {
            addCriterion("Upper_limit between", value1, value2, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andUpperLimitNotBetween(String value1, String value2) {
            addCriterion("Upper_limit not between", value1, value2, "upperLimit");
            return (Criteria) this;
        }

        public Criteria andDownLimitIsNull() {
            addCriterion("DOWN_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andDownLimitIsNotNull() {
            addCriterion("DOWN_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andDownLimitEqualTo(String value) {
            addCriterion("DOWN_LIMIT =", value, "downLimit");
            return (Criteria) this;
        }

        public Criteria andDownLimitNotEqualTo(String value) {
            addCriterion("DOWN_LIMIT <>", value, "downLimit");
            return (Criteria) this;
        }

        public Criteria andDownLimitGreaterThan(String value) {
            addCriterion("DOWN_LIMIT >", value, "downLimit");
            return (Criteria) this;
        }

        public Criteria andDownLimitGreaterThanOrEqualTo(String value) {
            addCriterion("DOWN_LIMIT >=", value, "downLimit");
            return (Criteria) this;
        }

        public Criteria andDownLimitLessThan(String value) {
            addCriterion("DOWN_LIMIT <", value, "downLimit");
            return (Criteria) this;
        }

        public Criteria andDownLimitLessThanOrEqualTo(String value) {
            addCriterion("DOWN_LIMIT <=", value, "downLimit");
            return (Criteria) this;
        }

        public Criteria andDownLimitLike(String value) {
            addCriterion("DOWN_LIMIT like", value, "downLimit");
            return (Criteria) this;
        }

        public Criteria andDownLimitNotLike(String value) {
            addCriterion("DOWN_LIMIT not like", value, "downLimit");
            return (Criteria) this;
        }

        public Criteria andDownLimitIn(List<String> values) {
            addCriterion("DOWN_LIMIT in", values, "downLimit");
            return (Criteria) this;
        }

        public Criteria andDownLimitNotIn(List<String> values) {
            addCriterion("DOWN_LIMIT not in", values, "downLimit");
            return (Criteria) this;
        }

        public Criteria andDownLimitBetween(String value1, String value2) {
            addCriterion("DOWN_LIMIT between", value1, value2, "downLimit");
            return (Criteria) this;
        }

        public Criteria andDownLimitNotBetween(String value1, String value2) {
            addCriterion("DOWN_LIMIT not between", value1, value2, "downLimit");
            return (Criteria) this;
        }

        public Criteria andPriIsNull() {
            addCriterion("PRI is null");
            return (Criteria) this;
        }

        public Criteria andPriIsNotNull() {
            addCriterion("PRI is not null");
            return (Criteria) this;
        }

        public Criteria andPriEqualTo(String value) {
            addCriterion("PRI =", value, "pri");
            return (Criteria) this;
        }

        public Criteria andPriNotEqualTo(String value) {
            addCriterion("PRI <>", value, "pri");
            return (Criteria) this;
        }

        public Criteria andPriGreaterThan(String value) {
            addCriterion("PRI >", value, "pri");
            return (Criteria) this;
        }

        public Criteria andPriGreaterThanOrEqualTo(String value) {
            addCriterion("PRI >=", value, "pri");
            return (Criteria) this;
        }

        public Criteria andPriLessThan(String value) {
            addCriterion("PRI <", value, "pri");
            return (Criteria) this;
        }

        public Criteria andPriLessThanOrEqualTo(String value) {
            addCriterion("PRI <=", value, "pri");
            return (Criteria) this;
        }

        public Criteria andPriLike(String value) {
            addCriterion("PRI like", value, "pri");
            return (Criteria) this;
        }

        public Criteria andPriNotLike(String value) {
            addCriterion("PRI not like", value, "pri");
            return (Criteria) this;
        }

        public Criteria andPriIn(List<String> values) {
            addCriterion("PRI in", values, "pri");
            return (Criteria) this;
        }

        public Criteria andPriNotIn(List<String> values) {
            addCriterion("PRI not in", values, "pri");
            return (Criteria) this;
        }

        public Criteria andPriBetween(String value1, String value2) {
            addCriterion("PRI between", value1, value2, "pri");
            return (Criteria) this;
        }

        public Criteria andPriNotBetween(String value1, String value2) {
            addCriterion("PRI not between", value1, value2, "pri");
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