package com.example.demo.appraise.appraise_model.model;

import java.util.ArrayList;
import java.util.List;

public class TCCTargetstandExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public TCCTargetstandExample() {
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

        public Criteria andTargetcodeIsNull() {
            addCriterion("TargetCode is null");
            return (Criteria) this;
        }

        public Criteria andTargetcodeIsNotNull() {
            addCriterion("TargetCode is not null");
            return (Criteria) this;
        }

        public Criteria andTargetcodeEqualTo(String value) {
            addCriterion("TargetCode =", value, "targetcode");
            return (Criteria) this;
        }

        public Criteria andTargetcodeNotEqualTo(String value) {
            addCriterion("TargetCode <>", value, "targetcode");
            return (Criteria) this;
        }

        public Criteria andTargetcodeGreaterThan(String value) {
            addCriterion("TargetCode >", value, "targetcode");
            return (Criteria) this;
        }

        public Criteria andTargetcodeGreaterThanOrEqualTo(String value) {
            addCriterion("TargetCode >=", value, "targetcode");
            return (Criteria) this;
        }

        public Criteria andTargetcodeLessThan(String value) {
            addCriterion("TargetCode <", value, "targetcode");
            return (Criteria) this;
        }

        public Criteria andTargetcodeLessThanOrEqualTo(String value) {
            addCriterion("TargetCode <=", value, "targetcode");
            return (Criteria) this;
        }

        public Criteria andTargetcodeLike(String value) {
            addCriterion("TargetCode like", value, "targetcode");
            return (Criteria) this;
        }

        public Criteria andTargetcodeNotLike(String value) {
            addCriterion("TargetCode not like", value, "targetcode");
            return (Criteria) this;
        }

        public Criteria andTargetcodeIn(List<String> values) {
            addCriterion("TargetCode in", values, "targetcode");
            return (Criteria) this;
        }

        public Criteria andTargetcodeNotIn(List<String> values) {
            addCriterion("TargetCode not in", values, "targetcode");
            return (Criteria) this;
        }

        public Criteria andTargetcodeBetween(String value1, String value2) {
            addCriterion("TargetCode between", value1, value2, "targetcode");
            return (Criteria) this;
        }

        public Criteria andTargetcodeNotBetween(String value1, String value2) {
            addCriterion("TargetCode not between", value1, value2, "targetcode");
            return (Criteria) this;
        }

        public Criteria andDatetypeIsNull() {
            addCriterion("DateType is null");
            return (Criteria) this;
        }

        public Criteria andDatetypeIsNotNull() {
            addCriterion("DateType is not null");
            return (Criteria) this;
        }

        public Criteria andDatetypeEqualTo(String value) {
            addCriterion("DateType =", value, "datetype");
            return (Criteria) this;
        }

        public Criteria andDatetypeNotEqualTo(String value) {
            addCriterion("DateType <>", value, "datetype");
            return (Criteria) this;
        }

        public Criteria andDatetypeGreaterThan(String value) {
            addCriterion("DateType >", value, "datetype");
            return (Criteria) this;
        }

        public Criteria andDatetypeGreaterThanOrEqualTo(String value) {
            addCriterion("DateType >=", value, "datetype");
            return (Criteria) this;
        }

        public Criteria andDatetypeLessThan(String value) {
            addCriterion("DateType <", value, "datetype");
            return (Criteria) this;
        }

        public Criteria andDatetypeLessThanOrEqualTo(String value) {
            addCriterion("DateType <=", value, "datetype");
            return (Criteria) this;
        }

        public Criteria andDatetypeLike(String value) {
            addCriterion("DateType like", value, "datetype");
            return (Criteria) this;
        }

        public Criteria andDatetypeNotLike(String value) {
            addCriterion("DateType not like", value, "datetype");
            return (Criteria) this;
        }

        public Criteria andDatetypeIn(List<String> values) {
            addCriterion("DateType in", values, "datetype");
            return (Criteria) this;
        }

        public Criteria andDatetypeNotIn(List<String> values) {
            addCriterion("DateType not in", values, "datetype");
            return (Criteria) this;
        }

        public Criteria andDatetypeBetween(String value1, String value2) {
            addCriterion("DateType between", value1, value2, "datetype");
            return (Criteria) this;
        }

        public Criteria andDatetypeNotBetween(String value1, String value2) {
            addCriterion("DateType not between", value1, value2, "datetype");
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

        public Criteria andGetvaluestyleIsNull() {
            addCriterion("GetValueStyle is null");
            return (Criteria) this;
        }

        public Criteria andGetvaluestyleIsNotNull() {
            addCriterion("GetValueStyle is not null");
            return (Criteria) this;
        }

        public Criteria andGetvaluestyleEqualTo(String value) {
            addCriterion("GetValueStyle =", value, "getvaluestyle");
            return (Criteria) this;
        }

        public Criteria andGetvaluestyleNotEqualTo(String value) {
            addCriterion("GetValueStyle <>", value, "getvaluestyle");
            return (Criteria) this;
        }

        public Criteria andGetvaluestyleGreaterThan(String value) {
            addCriterion("GetValueStyle >", value, "getvaluestyle");
            return (Criteria) this;
        }

        public Criteria andGetvaluestyleGreaterThanOrEqualTo(String value) {
            addCriterion("GetValueStyle >=", value, "getvaluestyle");
            return (Criteria) this;
        }

        public Criteria andGetvaluestyleLessThan(String value) {
            addCriterion("GetValueStyle <", value, "getvaluestyle");
            return (Criteria) this;
        }

        public Criteria andGetvaluestyleLessThanOrEqualTo(String value) {
            addCriterion("GetValueStyle <=", value, "getvaluestyle");
            return (Criteria) this;
        }

        public Criteria andGetvaluestyleLike(String value) {
            addCriterion("GetValueStyle like", value, "getvaluestyle");
            return (Criteria) this;
        }

        public Criteria andGetvaluestyleNotLike(String value) {
            addCriterion("GetValueStyle not like", value, "getvaluestyle");
            return (Criteria) this;
        }

        public Criteria andGetvaluestyleIn(List<String> values) {
            addCriterion("GetValueStyle in", values, "getvaluestyle");
            return (Criteria) this;
        }

        public Criteria andGetvaluestyleNotIn(List<String> values) {
            addCriterion("GetValueStyle not in", values, "getvaluestyle");
            return (Criteria) this;
        }

        public Criteria andGetvaluestyleBetween(String value1, String value2) {
            addCriterion("GetValueStyle between", value1, value2, "getvaluestyle");
            return (Criteria) this;
        }

        public Criteria andGetvaluestyleNotBetween(String value1, String value2) {
            addCriterion("GetValueStyle not between", value1, value2, "getvaluestyle");
            return (Criteria) this;
        }

        public Criteria andCountstyleIsNull() {
            addCriterion("CountStyle is null");
            return (Criteria) this;
        }

        public Criteria andCountstyleIsNotNull() {
            addCriterion("CountStyle is not null");
            return (Criteria) this;
        }

        public Criteria andCountstyleEqualTo(String value) {
            addCriterion("CountStyle =", value, "countstyle");
            return (Criteria) this;
        }

        public Criteria andCountstyleNotEqualTo(String value) {
            addCriterion("CountStyle <>", value, "countstyle");
            return (Criteria) this;
        }

        public Criteria andCountstyleGreaterThan(String value) {
            addCriterion("CountStyle >", value, "countstyle");
            return (Criteria) this;
        }

        public Criteria andCountstyleGreaterThanOrEqualTo(String value) {
            addCriterion("CountStyle >=", value, "countstyle");
            return (Criteria) this;
        }

        public Criteria andCountstyleLessThan(String value) {
            addCriterion("CountStyle <", value, "countstyle");
            return (Criteria) this;
        }

        public Criteria andCountstyleLessThanOrEqualTo(String value) {
            addCriterion("CountStyle <=", value, "countstyle");
            return (Criteria) this;
        }

        public Criteria andCountstyleLike(String value) {
            addCriterion("CountStyle like", value, "countstyle");
            return (Criteria) this;
        }

        public Criteria andCountstyleNotLike(String value) {
            addCriterion("CountStyle not like", value, "countstyle");
            return (Criteria) this;
        }

        public Criteria andCountstyleIn(List<String> values) {
            addCriterion("CountStyle in", values, "countstyle");
            return (Criteria) this;
        }

        public Criteria andCountstyleNotIn(List<String> values) {
            addCriterion("CountStyle not in", values, "countstyle");
            return (Criteria) this;
        }

        public Criteria andCountstyleBetween(String value1, String value2) {
            addCriterion("CountStyle between", value1, value2, "countstyle");
            return (Criteria) this;
        }

        public Criteria andCountstyleNotBetween(String value1, String value2) {
            addCriterion("CountStyle not between", value1, value2, "countstyle");
            return (Criteria) this;
        }

        public Criteria andValuestandIsNull() {
            addCriterion("ValueStand is null");
            return (Criteria) this;
        }

        public Criteria andValuestandIsNotNull() {
            addCriterion("ValueStand is not null");
            return (Criteria) this;
        }

        public Criteria andValuestandEqualTo(String value) {
            addCriterion("ValueStand =", value, "valuestand");
            return (Criteria) this;
        }

        public Criteria andValuestandNotEqualTo(String value) {
            addCriterion("ValueStand <>", value, "valuestand");
            return (Criteria) this;
        }

        public Criteria andValuestandGreaterThan(String value) {
            addCriterion("ValueStand >", value, "valuestand");
            return (Criteria) this;
        }

        public Criteria andValuestandGreaterThanOrEqualTo(String value) {
            addCriterion("ValueStand >=", value, "valuestand");
            return (Criteria) this;
        }

        public Criteria andValuestandLessThan(String value) {
            addCriterion("ValueStand <", value, "valuestand");
            return (Criteria) this;
        }

        public Criteria andValuestandLessThanOrEqualTo(String value) {
            addCriterion("ValueStand <=", value, "valuestand");
            return (Criteria) this;
        }

        public Criteria andValuestandLike(String value) {
            addCriterion("ValueStand like", value, "valuestand");
            return (Criteria) this;
        }

        public Criteria andValuestandNotLike(String value) {
            addCriterion("ValueStand not like", value, "valuestand");
            return (Criteria) this;
        }

        public Criteria andValuestandIn(List<String> values) {
            addCriterion("ValueStand in", values, "valuestand");
            return (Criteria) this;
        }

        public Criteria andValuestandNotIn(List<String> values) {
            addCriterion("ValueStand not in", values, "valuestand");
            return (Criteria) this;
        }

        public Criteria andValuestandBetween(String value1, String value2) {
            addCriterion("ValueStand between", value1, value2, "valuestand");
            return (Criteria) this;
        }

        public Criteria andValuestandNotBetween(String value1, String value2) {
            addCriterion("ValueStand not between", value1, value2, "valuestand");
            return (Criteria) this;
        }

        public Criteria andPutvaluesqlIsNull() {
            addCriterion("PutValueSql is null");
            return (Criteria) this;
        }

        public Criteria andPutvaluesqlIsNotNull() {
            addCriterion("PutValueSql is not null");
            return (Criteria) this;
        }

        public Criteria andPutvaluesqlEqualTo(String value) {
            addCriterion("PutValueSql =", value, "putvaluesql");
            return (Criteria) this;
        }

        public Criteria andPutvaluesqlNotEqualTo(String value) {
            addCriterion("PutValueSql <>", value, "putvaluesql");
            return (Criteria) this;
        }

        public Criteria andPutvaluesqlGreaterThan(String value) {
            addCriterion("PutValueSql >", value, "putvaluesql");
            return (Criteria) this;
        }

        public Criteria andPutvaluesqlGreaterThanOrEqualTo(String value) {
            addCriterion("PutValueSql >=", value, "putvaluesql");
            return (Criteria) this;
        }

        public Criteria andPutvaluesqlLessThan(String value) {
            addCriterion("PutValueSql <", value, "putvaluesql");
            return (Criteria) this;
        }

        public Criteria andPutvaluesqlLessThanOrEqualTo(String value) {
            addCriterion("PutValueSql <=", value, "putvaluesql");
            return (Criteria) this;
        }

        public Criteria andPutvaluesqlLike(String value) {
            addCriterion("PutValueSql like", value, "putvaluesql");
            return (Criteria) this;
        }

        public Criteria andPutvaluesqlNotLike(String value) {
            addCriterion("PutValueSql not like", value, "putvaluesql");
            return (Criteria) this;
        }

        public Criteria andPutvaluesqlIn(List<String> values) {
            addCriterion("PutValueSql in", values, "putvaluesql");
            return (Criteria) this;
        }

        public Criteria andPutvaluesqlNotIn(List<String> values) {
            addCriterion("PutValueSql not in", values, "putvaluesql");
            return (Criteria) this;
        }

        public Criteria andPutvaluesqlBetween(String value1, String value2) {
            addCriterion("PutValueSql between", value1, value2, "putvaluesql");
            return (Criteria) this;
        }

        public Criteria andPutvaluesqlNotBetween(String value1, String value2) {
            addCriterion("PutValueSql not between", value1, value2, "putvaluesql");
            return (Criteria) this;
        }

        public Criteria andGetvaluefieldIsNull() {
            addCriterion("GetValueField is null");
            return (Criteria) this;
        }

        public Criteria andGetvaluefieldIsNotNull() {
            addCriterion("GetValueField is not null");
            return (Criteria) this;
        }

        public Criteria andGetvaluefieldEqualTo(String value) {
            addCriterion("GetValueField =", value, "getvaluefield");
            return (Criteria) this;
        }

        public Criteria andGetvaluefieldNotEqualTo(String value) {
            addCriterion("GetValueField <>", value, "getvaluefield");
            return (Criteria) this;
        }

        public Criteria andGetvaluefieldGreaterThan(String value) {
            addCriterion("GetValueField >", value, "getvaluefield");
            return (Criteria) this;
        }

        public Criteria andGetvaluefieldGreaterThanOrEqualTo(String value) {
            addCriterion("GetValueField >=", value, "getvaluefield");
            return (Criteria) this;
        }

        public Criteria andGetvaluefieldLessThan(String value) {
            addCriterion("GetValueField <", value, "getvaluefield");
            return (Criteria) this;
        }

        public Criteria andGetvaluefieldLessThanOrEqualTo(String value) {
            addCriterion("GetValueField <=", value, "getvaluefield");
            return (Criteria) this;
        }

        public Criteria andGetvaluefieldLike(String value) {
            addCriterion("GetValueField like", value, "getvaluefield");
            return (Criteria) this;
        }

        public Criteria andGetvaluefieldNotLike(String value) {
            addCriterion("GetValueField not like", value, "getvaluefield");
            return (Criteria) this;
        }

        public Criteria andGetvaluefieldIn(List<String> values) {
            addCriterion("GetValueField in", values, "getvaluefield");
            return (Criteria) this;
        }

        public Criteria andGetvaluefieldNotIn(List<String> values) {
            addCriterion("GetValueField not in", values, "getvaluefield");
            return (Criteria) this;
        }

        public Criteria andGetvaluefieldBetween(String value1, String value2) {
            addCriterion("GetValueField between", value1, value2, "getvaluefield");
            return (Criteria) this;
        }

        public Criteria andGetvaluefieldNotBetween(String value1, String value2) {
            addCriterion("GetValueField not between", value1, value2, "getvaluefield");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("Note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("Note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("Note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("Note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("Note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("Note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("Note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("Note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("Note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("Note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("Note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("Note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("Note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("Note not between", value1, value2, "note");
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