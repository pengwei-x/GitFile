package com.qhg.model;

import java.util.ArrayList;
import java.util.List;

public class ProblemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProblemExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPromulgatoridIsNull() {
            addCriterion("promulgatorId is null");
            return (Criteria) this;
        }

        public Criteria andPromulgatoridIsNotNull() {
            addCriterion("promulgatorId is not null");
            return (Criteria) this;
        }

        public Criteria andPromulgatoridEqualTo(String value) {
            addCriterion("promulgatorId =", value, "promulgatorid");
            return (Criteria) this;
        }

        public Criteria andPromulgatoridNotEqualTo(String value) {
            addCriterion("promulgatorId <>", value, "promulgatorid");
            return (Criteria) this;
        }

        public Criteria andPromulgatoridGreaterThan(String value) {
            addCriterion("promulgatorId >", value, "promulgatorid");
            return (Criteria) this;
        }

        public Criteria andPromulgatoridGreaterThanOrEqualTo(String value) {
            addCriterion("promulgatorId >=", value, "promulgatorid");
            return (Criteria) this;
        }

        public Criteria andPromulgatoridLessThan(String value) {
            addCriterion("promulgatorId <", value, "promulgatorid");
            return (Criteria) this;
        }

        public Criteria andPromulgatoridLessThanOrEqualTo(String value) {
            addCriterion("promulgatorId <=", value, "promulgatorid");
            return (Criteria) this;
        }

        public Criteria andPromulgatoridLike(String value) {
            addCriterion("promulgatorId like", value, "promulgatorid");
            return (Criteria) this;
        }

        public Criteria andPromulgatoridNotLike(String value) {
            addCriterion("promulgatorId not like", value, "promulgatorid");
            return (Criteria) this;
        }

        public Criteria andPromulgatoridIn(List<String> values) {
            addCriterion("promulgatorId in", values, "promulgatorid");
            return (Criteria) this;
        }

        public Criteria andPromulgatoridNotIn(List<String> values) {
            addCriterion("promulgatorId not in", values, "promulgatorid");
            return (Criteria) this;
        }

        public Criteria andPromulgatoridBetween(String value1, String value2) {
            addCriterion("promulgatorId between", value1, value2, "promulgatorid");
            return (Criteria) this;
        }

        public Criteria andPromulgatoridNotBetween(String value1, String value2) {
            addCriterion("promulgatorId not between", value1, value2, "promulgatorid");
            return (Criteria) this;
        }

        public Criteria andProblemContextIsNull() {
            addCriterion("problem_context is null");
            return (Criteria) this;
        }

        public Criteria andProblemContextIsNotNull() {
            addCriterion("problem_context is not null");
            return (Criteria) this;
        }

        public Criteria andProblemContextEqualTo(String value) {
            addCriterion("problem_context =", value, "problemContext");
            return (Criteria) this;
        }

        public Criteria andProblemContextNotEqualTo(String value) {
            addCriterion("problem_context <>", value, "problemContext");
            return (Criteria) this;
        }

        public Criteria andProblemContextGreaterThan(String value) {
            addCriterion("problem_context >", value, "problemContext");
            return (Criteria) this;
        }

        public Criteria andProblemContextGreaterThanOrEqualTo(String value) {
            addCriterion("problem_context >=", value, "problemContext");
            return (Criteria) this;
        }

        public Criteria andProblemContextLessThan(String value) {
            addCriterion("problem_context <", value, "problemContext");
            return (Criteria) this;
        }

        public Criteria andProblemContextLessThanOrEqualTo(String value) {
            addCriterion("problem_context <=", value, "problemContext");
            return (Criteria) this;
        }

        public Criteria andProblemContextLike(String value) {
            addCriterion("problem_context like", value, "problemContext");
            return (Criteria) this;
        }

        public Criteria andProblemContextNotLike(String value) {
            addCriterion("problem_context not like", value, "problemContext");
            return (Criteria) this;
        }

        public Criteria andProblemContextIn(List<String> values) {
            addCriterion("problem_context in", values, "problemContext");
            return (Criteria) this;
        }

        public Criteria andProblemContextNotIn(List<String> values) {
            addCriterion("problem_context not in", values, "problemContext");
            return (Criteria) this;
        }

        public Criteria andProblemContextBetween(String value1, String value2) {
            addCriterion("problem_context between", value1, value2, "problemContext");
            return (Criteria) this;
        }

        public Criteria andProblemContextNotBetween(String value1, String value2) {
            addCriterion("problem_context not between", value1, value2, "problemContext");
            return (Criteria) this;
        }

        public Criteria andLookNumIsNull() {
            addCriterion("look_num is null");
            return (Criteria) this;
        }

        public Criteria andLookNumIsNotNull() {
            addCriterion("look_num is not null");
            return (Criteria) this;
        }

        public Criteria andLookNumEqualTo(Integer value) {
            addCriterion("look_num =", value, "lookNum");
            return (Criteria) this;
        }

        public Criteria andLookNumNotEqualTo(Integer value) {
            addCriterion("look_num <>", value, "lookNum");
            return (Criteria) this;
        }

        public Criteria andLookNumGreaterThan(Integer value) {
            addCriterion("look_num >", value, "lookNum");
            return (Criteria) this;
        }

        public Criteria andLookNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("look_num >=", value, "lookNum");
            return (Criteria) this;
        }

        public Criteria andLookNumLessThan(Integer value) {
            addCriterion("look_num <", value, "lookNum");
            return (Criteria) this;
        }

        public Criteria andLookNumLessThanOrEqualTo(Integer value) {
            addCriterion("look_num <=", value, "lookNum");
            return (Criteria) this;
        }

        public Criteria andLookNumIn(List<Integer> values) {
            addCriterion("look_num in", values, "lookNum");
            return (Criteria) this;
        }

        public Criteria andLookNumNotIn(List<Integer> values) {
            addCriterion("look_num not in", values, "lookNum");
            return (Criteria) this;
        }

        public Criteria andLookNumBetween(Integer value1, Integer value2) {
            addCriterion("look_num between", value1, value2, "lookNum");
            return (Criteria) this;
        }

        public Criteria andLookNumNotBetween(Integer value1, Integer value2) {
            addCriterion("look_num not between", value1, value2, "lookNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumIsNull() {
            addCriterion("reply_num is null");
            return (Criteria) this;
        }

        public Criteria andReplyNumIsNotNull() {
            addCriterion("reply_num is not null");
            return (Criteria) this;
        }

        public Criteria andReplyNumEqualTo(Integer value) {
            addCriterion("reply_num =", value, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumNotEqualTo(Integer value) {
            addCriterion("reply_num <>", value, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumGreaterThan(Integer value) {
            addCriterion("reply_num >", value, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("reply_num >=", value, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumLessThan(Integer value) {
            addCriterion("reply_num <", value, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumLessThanOrEqualTo(Integer value) {
            addCriterion("reply_num <=", value, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumIn(List<Integer> values) {
            addCriterion("reply_num in", values, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumNotIn(List<Integer> values) {
            addCriterion("reply_num not in", values, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumBetween(Integer value1, Integer value2) {
            addCriterion("reply_num between", value1, value2, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumNotBetween(Integer value1, Integer value2) {
            addCriterion("reply_num not between", value1, value2, "replyNum");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIsNull() {
            addCriterion("creat_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIsNotNull() {
            addCriterion("creat_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatTimeEqualTo(String value) {
            addCriterion("creat_time =", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotEqualTo(String value) {
            addCriterion("creat_time <>", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThan(String value) {
            addCriterion("creat_time >", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThanOrEqualTo(String value) {
            addCriterion("creat_time >=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLessThan(String value) {
            addCriterion("creat_time <", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLessThanOrEqualTo(String value) {
            addCriterion("creat_time <=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLike(String value) {
            addCriterion("creat_time like", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotLike(String value) {
            addCriterion("creat_time not like", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIn(List<String> values) {
            addCriterion("creat_time in", values, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotIn(List<String> values) {
            addCriterion("creat_time not in", values, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeBetween(String value1, String value2) {
            addCriterion("creat_time between", value1, value2, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotBetween(String value1, String value2) {
            addCriterion("creat_time not between", value1, value2, "creatTime");
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