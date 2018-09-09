package com.tz.springbootdemo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RizhiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RizhiExample() {
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

        public Criteria andRizhiidIsNull() {
            addCriterion("rizhiId is null");
            return (Criteria) this;
        }

        public Criteria andRizhiidIsNotNull() {
            addCriterion("rizhiId is not null");
            return (Criteria) this;
        }

        public Criteria andRizhiidEqualTo(Integer value) {
            addCriterion("rizhiId =", value, "rizhiid");
            return (Criteria) this;
        }

        public Criteria andRizhiidNotEqualTo(Integer value) {
            addCriterion("rizhiId <>", value, "rizhiid");
            return (Criteria) this;
        }

        public Criteria andRizhiidGreaterThan(Integer value) {
            addCriterion("rizhiId >", value, "rizhiid");
            return (Criteria) this;
        }

        public Criteria andRizhiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rizhiId >=", value, "rizhiid");
            return (Criteria) this;
        }

        public Criteria andRizhiidLessThan(Integer value) {
            addCriterion("rizhiId <", value, "rizhiid");
            return (Criteria) this;
        }

        public Criteria andRizhiidLessThanOrEqualTo(Integer value) {
            addCriterion("rizhiId <=", value, "rizhiid");
            return (Criteria) this;
        }

        public Criteria andRizhiidIn(List<Integer> values) {
            addCriterion("rizhiId in", values, "rizhiid");
            return (Criteria) this;
        }

        public Criteria andRizhiidNotIn(List<Integer> values) {
            addCriterion("rizhiId not in", values, "rizhiid");
            return (Criteria) this;
        }

        public Criteria andRizhiidBetween(Integer value1, Integer value2) {
            addCriterion("rizhiId between", value1, value2, "rizhiid");
            return (Criteria) this;
        }

        public Criteria andRizhiidNotBetween(Integer value1, Integer value2) {
            addCriterion("rizhiId not between", value1, value2, "rizhiid");
            return (Criteria) this;
        }

        public Criteria andRizhitextheadIsNull() {
            addCriterion("rizhiTextHead is null");
            return (Criteria) this;
        }

        public Criteria andRizhitextheadIsNotNull() {
            addCriterion("rizhiTextHead is not null");
            return (Criteria) this;
        }

        public Criteria andRizhitextheadEqualTo(String value) {
            addCriterion("rizhiTextHead =", value, "rizhitexthead");
            return (Criteria) this;
        }

        public Criteria andRizhitextheadNotEqualTo(String value) {
            addCriterion("rizhiTextHead <>", value, "rizhitexthead");
            return (Criteria) this;
        }

        public Criteria andRizhitextheadGreaterThan(String value) {
            addCriterion("rizhiTextHead >", value, "rizhitexthead");
            return (Criteria) this;
        }

        public Criteria andRizhitextheadGreaterThanOrEqualTo(String value) {
            addCriterion("rizhiTextHead >=", value, "rizhitexthead");
            return (Criteria) this;
        }

        public Criteria andRizhitextheadLessThan(String value) {
            addCriterion("rizhiTextHead <", value, "rizhitexthead");
            return (Criteria) this;
        }

        public Criteria andRizhitextheadLessThanOrEqualTo(String value) {
            addCriterion("rizhiTextHead <=", value, "rizhitexthead");
            return (Criteria) this;
        }

        public Criteria andRizhitextheadLike(String value) {
            addCriterion("rizhiTextHead like", value, "rizhitexthead");
            return (Criteria) this;
        }

        public Criteria andRizhitextheadNotLike(String value) {
            addCriterion("rizhiTextHead not like", value, "rizhitexthead");
            return (Criteria) this;
        }

        public Criteria andRizhitextheadIn(List<String> values) {
            addCriterion("rizhiTextHead in", values, "rizhitexthead");
            return (Criteria) this;
        }

        public Criteria andRizhitextheadNotIn(List<String> values) {
            addCriterion("rizhiTextHead not in", values, "rizhitexthead");
            return (Criteria) this;
        }

        public Criteria andRizhitextheadBetween(String value1, String value2) {
            addCriterion("rizhiTextHead between", value1, value2, "rizhitexthead");
            return (Criteria) this;
        }

        public Criteria andRizhitextheadNotBetween(String value1, String value2) {
            addCriterion("rizhiTextHead not between", value1, value2, "rizhitexthead");
            return (Criteria) this;
        }

        public Criteria andRizhiauthorIsNull() {
            addCriterion("rizhiAuthor is null");
            return (Criteria) this;
        }

        public Criteria andRizhiauthorIsNotNull() {
            addCriterion("rizhiAuthor is not null");
            return (Criteria) this;
        }

        public Criteria andRizhiauthorEqualTo(String value) {
            addCriterion("rizhiAuthor =", value, "rizhiauthor");
            return (Criteria) this;
        }

        public Criteria andRizhiauthorNotEqualTo(String value) {
            addCriterion("rizhiAuthor <>", value, "rizhiauthor");
            return (Criteria) this;
        }

        public Criteria andRizhiauthorGreaterThan(String value) {
            addCriterion("rizhiAuthor >", value, "rizhiauthor");
            return (Criteria) this;
        }

        public Criteria andRizhiauthorGreaterThanOrEqualTo(String value) {
            addCriterion("rizhiAuthor >=", value, "rizhiauthor");
            return (Criteria) this;
        }

        public Criteria andRizhiauthorLessThan(String value) {
            addCriterion("rizhiAuthor <", value, "rizhiauthor");
            return (Criteria) this;
        }

        public Criteria andRizhiauthorLessThanOrEqualTo(String value) {
            addCriterion("rizhiAuthor <=", value, "rizhiauthor");
            return (Criteria) this;
        }

        public Criteria andRizhiauthorLike(String value) {
            addCriterion("rizhiAuthor like", value, "rizhiauthor");
            return (Criteria) this;
        }

        public Criteria andRizhiauthorNotLike(String value) {
            addCriterion("rizhiAuthor not like", value, "rizhiauthor");
            return (Criteria) this;
        }

        public Criteria andRizhiauthorIn(List<String> values) {
            addCriterion("rizhiAuthor in", values, "rizhiauthor");
            return (Criteria) this;
        }

        public Criteria andRizhiauthorNotIn(List<String> values) {
            addCriterion("rizhiAuthor not in", values, "rizhiauthor");
            return (Criteria) this;
        }

        public Criteria andRizhiauthorBetween(String value1, String value2) {
            addCriterion("rizhiAuthor between", value1, value2, "rizhiauthor");
            return (Criteria) this;
        }

        public Criteria andRizhiauthorNotBetween(String value1, String value2) {
            addCriterion("rizhiAuthor not between", value1, value2, "rizhiauthor");
            return (Criteria) this;
        }

        public Criteria andRizhizangIsNull() {
            addCriterion("rizhiZang is null");
            return (Criteria) this;
        }

        public Criteria andRizhizangIsNotNull() {
            addCriterion("rizhiZang is not null");
            return (Criteria) this;
        }

        public Criteria andRizhizangEqualTo(String value) {
            addCriterion("rizhiZang =", value, "rizhizang");
            return (Criteria) this;
        }

        public Criteria andRizhizangNotEqualTo(String value) {
            addCriterion("rizhiZang <>", value, "rizhizang");
            return (Criteria) this;
        }

        public Criteria andRizhizangGreaterThan(String value) {
            addCriterion("rizhiZang >", value, "rizhizang");
            return (Criteria) this;
        }

        public Criteria andRizhizangGreaterThanOrEqualTo(String value) {
            addCriterion("rizhiZang >=", value, "rizhizang");
            return (Criteria) this;
        }

        public Criteria andRizhizangLessThan(String value) {
            addCriterion("rizhiZang <", value, "rizhizang");
            return (Criteria) this;
        }

        public Criteria andRizhizangLessThanOrEqualTo(String value) {
            addCriterion("rizhiZang <=", value, "rizhizang");
            return (Criteria) this;
        }

        public Criteria andRizhizangLike(String value) {
            addCriterion("rizhiZang like", value, "rizhizang");
            return (Criteria) this;
        }

        public Criteria andRizhizangNotLike(String value) {
            addCriterion("rizhiZang not like", value, "rizhizang");
            return (Criteria) this;
        }

        public Criteria andRizhizangIn(List<String> values) {
            addCriterion("rizhiZang in", values, "rizhizang");
            return (Criteria) this;
        }

        public Criteria andRizhizangNotIn(List<String> values) {
            addCriterion("rizhiZang not in", values, "rizhizang");
            return (Criteria) this;
        }

        public Criteria andRizhizangBetween(String value1, String value2) {
            addCriterion("rizhiZang between", value1, value2, "rizhizang");
            return (Criteria) this;
        }

        public Criteria andRizhizangNotBetween(String value1, String value2) {
            addCriterion("rizhiZang not between", value1, value2, "rizhizang");
            return (Criteria) this;
        }

        public Criteria andRizhitimeIsNull() {
            addCriterion("rizhiTime is null");
            return (Criteria) this;
        }

        public Criteria andRizhitimeIsNotNull() {
            addCriterion("rizhiTime is not null");
            return (Criteria) this;
        }

        public Criteria andRizhitimeEqualTo(Date value) {
            addCriterion("rizhiTime =", value, "rizhitime");
            return (Criteria) this;
        }

        public Criteria andRizhitimeNotEqualTo(Date value) {
            addCriterion("rizhiTime <>", value, "rizhitime");
            return (Criteria) this;
        }

        public Criteria andRizhitimeGreaterThan(Date value) {
            addCriterion("rizhiTime >", value, "rizhitime");
            return (Criteria) this;
        }

        public Criteria andRizhitimeGreaterThanOrEqualTo(Date value) {
            addCriterion("rizhiTime >=", value, "rizhitime");
            return (Criteria) this;
        }

        public Criteria andRizhitimeLessThan(Date value) {
            addCriterion("rizhiTime <", value, "rizhitime");
            return (Criteria) this;
        }

        public Criteria andRizhitimeLessThanOrEqualTo(Date value) {
            addCriterion("rizhiTime <=", value, "rizhitime");
            return (Criteria) this;
        }

        public Criteria andRizhitimeIn(List<Date> values) {
            addCriterion("rizhiTime in", values, "rizhitime");
            return (Criteria) this;
        }

        public Criteria andRizhitimeNotIn(List<Date> values) {
            addCriterion("rizhiTime not in", values, "rizhitime");
            return (Criteria) this;
        }

        public Criteria andRizhitimeBetween(Date value1, Date value2) {
            addCriterion("rizhiTime between", value1, value2, "rizhitime");
            return (Criteria) this;
        }

        public Criteria andRizhitimeNotBetween(Date value1, Date value2) {
            addCriterion("rizhiTime not between", value1, value2, "rizhitime");
            return (Criteria) this;
        }
    }

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