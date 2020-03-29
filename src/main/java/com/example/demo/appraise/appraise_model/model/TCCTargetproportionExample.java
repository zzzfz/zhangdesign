package com.example.demo.appraise.appraise_model.model;

import java.util.ArrayList;
import java.util.List;

public class TCCTargetproportionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public TCCTargetproportionExample() {
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

        public Criteria andTargetprocodeIsNull() {
            addCriterion("TargetProCode is null");
            return (Criteria) this;
        }

        public Criteria andTargetprocodeIsNotNull() {
            addCriterion("TargetProCode is not null");
            return (Criteria) this;
        }

        public Criteria andTargetprocodeEqualTo(String value) {
            addCriterion("TargetProCode =", value, "targetprocode");
            return (Criteria) this;
        }

        public Criteria andTargetprocodeNotEqualTo(String value) {
            addCriterion("TargetProCode <>", value, "targetprocode");
            return (Criteria) this;
        }

        public Criteria andTargetprocodeGreaterThan(String value) {
            addCriterion("TargetProCode >", value, "targetprocode");
            return (Criteria) this;
        }

        public Criteria andTargetprocodeGreaterThanOrEqualTo(String value) {
            addCriterion("TargetProCode >=", value, "targetprocode");
            return (Criteria) this;
        }

        public Criteria andTargetprocodeLessThan(String value) {
            addCriterion("TargetProCode <", value, "targetprocode");
            return (Criteria) this;
        }

        public Criteria andTargetprocodeLessThanOrEqualTo(String value) {
            addCriterion("TargetProCode <=", value, "targetprocode");
            return (Criteria) this;
        }

        public Criteria andTargetprocodeLike(String value) {
            addCriterion("TargetProCode like", value, "targetprocode");
            return (Criteria) this;
        }

        public Criteria andTargetprocodeNotLike(String value) {
            addCriterion("TargetProCode not like", value, "targetprocode");
            return (Criteria) this;
        }

        public Criteria andTargetprocodeIn(List<String> values) {
            addCriterion("TargetProCode in", values, "targetprocode");
            return (Criteria) this;
        }

        public Criteria andTargetprocodeNotIn(List<String> values) {
            addCriterion("TargetProCode not in", values, "targetprocode");
            return (Criteria) this;
        }

        public Criteria andTargetprocodeBetween(String value1, String value2) {
            addCriterion("TargetProCode between", value1, value2, "targetprocode");
            return (Criteria) this;
        }

        public Criteria andTargetprocodeNotBetween(String value1, String value2) {
            addCriterion("TargetProCode not between", value1, value2, "targetprocode");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNull() {
            addCriterion("ProjectName is null");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNotNull() {
            addCriterion("ProjectName is not null");
            return (Criteria) this;
        }

        public Criteria andProjectnameEqualTo(String value) {
            addCriterion("ProjectName =", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotEqualTo(String value) {
            addCriterion("ProjectName <>", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThan(String value) {
            addCriterion("ProjectName >", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThanOrEqualTo(String value) {
            addCriterion("ProjectName >=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThan(String value) {
            addCriterion("ProjectName <", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThanOrEqualTo(String value) {
            addCriterion("ProjectName <=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLike(String value) {
            addCriterion("ProjectName like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotLike(String value) {
            addCriterion("ProjectName not like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameIn(List<String> values) {
            addCriterion("ProjectName in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotIn(List<String> values) {
            addCriterion("ProjectName not in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameBetween(String value1, String value2) {
            addCriterion("ProjectName between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotBetween(String value1, String value2) {
            addCriterion("ProjectName not between", value1, value2, "projectname");
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

        public Criteria andTargetproportionIsNull() {
            addCriterion("TargetProportion is null");
            return (Criteria) this;
        }

        public Criteria andTargetproportionIsNotNull() {
            addCriterion("TargetProportion is not null");
            return (Criteria) this;
        }

        public Criteria andTargetproportionEqualTo(String value) {
            addCriterion("TargetProportion =", value, "targetproportion");
            return (Criteria) this;
        }

        public Criteria andTargetproportionNotEqualTo(String value) {
            addCriterion("TargetProportion <>", value, "targetproportion");
            return (Criteria) this;
        }

        public Criteria andTargetproportionGreaterThan(String value) {
            addCriterion("TargetProportion >", value, "targetproportion");
            return (Criteria) this;
        }

        public Criteria andTargetproportionGreaterThanOrEqualTo(String value) {
            addCriterion("TargetProportion >=", value, "targetproportion");
            return (Criteria) this;
        }

        public Criteria andTargetproportionLessThan(String value) {
            addCriterion("TargetProportion <", value, "targetproportion");
            return (Criteria) this;
        }

        public Criteria andTargetproportionLessThanOrEqualTo(String value) {
            addCriterion("TargetProportion <=", value, "targetproportion");
            return (Criteria) this;
        }

        public Criteria andTargetproportionLike(String value) {
            addCriterion("TargetProportion like", value, "targetproportion");
            return (Criteria) this;
        }

        public Criteria andTargetproportionNotLike(String value) {
            addCriterion("TargetProportion not like", value, "targetproportion");
            return (Criteria) this;
        }

        public Criteria andTargetproportionIn(List<String> values) {
            addCriterion("TargetProportion in", values, "targetproportion");
            return (Criteria) this;
        }

        public Criteria andTargetproportionNotIn(List<String> values) {
            addCriterion("TargetProportion not in", values, "targetproportion");
            return (Criteria) this;
        }

        public Criteria andTargetproportionBetween(String value1, String value2) {
            addCriterion("TargetProportion between", value1, value2, "targetproportion");
            return (Criteria) this;
        }

        public Criteria andTargetproportionNotBetween(String value1, String value2) {
            addCriterion("TargetProportion not between", value1, value2, "targetproportion");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
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