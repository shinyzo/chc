package com.lming.chc.personal.server.entity;

import java.util.ArrayList;
import java.util.List;

public class AclRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public AclRoleExample() {
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

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
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

        public Criteria andRoleIdIsNull() {
            addCriterion("role_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(Integer value) {
            addCriterion("role_id =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(Integer value) {
            addCriterion("role_id <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(Integer value) {
            addCriterion("role_id >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_id >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(Integer value) {
            addCriterion("role_id <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("role_id <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<Integer> values) {
            addCriterion("role_id in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<Integer> values) {
            addCriterion("role_id not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("role_id between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("role_id not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNull() {
            addCriterion("role_name is null");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNotNull() {
            addCriterion("role_name is not null");
            return (Criteria) this;
        }

        public Criteria andRoleNameEqualTo(String value) {
            addCriterion("role_name =", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotEqualTo(String value) {
            addCriterion("role_name <>", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThan(String value) {
            addCriterion("role_name >", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("role_name >=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThan(String value) {
            addCriterion("role_name <", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThanOrEqualTo(String value) {
            addCriterion("role_name <=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLike(String value) {
            addCriterion("role_name like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotLike(String value) {
            addCriterion("role_name not like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameIn(List<String> values) {
            addCriterion("role_name in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotIn(List<String> values) {
            addCriterion("role_name not in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameBetween(String value1, String value2) {
            addCriterion("role_name between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotBetween(String value1, String value2) {
            addCriterion("role_name not between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andIfmodifyIsNull() {
            addCriterion("ifmodify is null");
            return (Criteria) this;
        }

        public Criteria andIfmodifyIsNotNull() {
            addCriterion("ifmodify is not null");
            return (Criteria) this;
        }

        public Criteria andIfmodifyEqualTo(String value) {
            addCriterion("ifmodify =", value, "ifmodify");
            return (Criteria) this;
        }

        public Criteria andIfmodifyNotEqualTo(String value) {
            addCriterion("ifmodify <>", value, "ifmodify");
            return (Criteria) this;
        }

        public Criteria andIfmodifyGreaterThan(String value) {
            addCriterion("ifmodify >", value, "ifmodify");
            return (Criteria) this;
        }

        public Criteria andIfmodifyGreaterThanOrEqualTo(String value) {
            addCriterion("ifmodify >=", value, "ifmodify");
            return (Criteria) this;
        }

        public Criteria andIfmodifyLessThan(String value) {
            addCriterion("ifmodify <", value, "ifmodify");
            return (Criteria) this;
        }

        public Criteria andIfmodifyLessThanOrEqualTo(String value) {
            addCriterion("ifmodify <=", value, "ifmodify");
            return (Criteria) this;
        }

        public Criteria andIfmodifyLike(String value) {
            addCriterion("ifmodify like", value, "ifmodify");
            return (Criteria) this;
        }

        public Criteria andIfmodifyNotLike(String value) {
            addCriterion("ifmodify not like", value, "ifmodify");
            return (Criteria) this;
        }

        public Criteria andIfmodifyIn(List<String> values) {
            addCriterion("ifmodify in", values, "ifmodify");
            return (Criteria) this;
        }

        public Criteria andIfmodifyNotIn(List<String> values) {
            addCriterion("ifmodify not in", values, "ifmodify");
            return (Criteria) this;
        }

        public Criteria andIfmodifyBetween(String value1, String value2) {
            addCriterion("ifmodify between", value1, value2, "ifmodify");
            return (Criteria) this;
        }

        public Criteria andIfmodifyNotBetween(String value1, String value2) {
            addCriterion("ifmodify not between", value1, value2, "ifmodify");
            return (Criteria) this;
        }

        public Criteria andIfdeleteIsNull() {
            addCriterion("ifdelete is null");
            return (Criteria) this;
        }

        public Criteria andIfdeleteIsNotNull() {
            addCriterion("ifdelete is not null");
            return (Criteria) this;
        }

        public Criteria andIfdeleteEqualTo(String value) {
            addCriterion("ifdelete =", value, "ifdelete");
            return (Criteria) this;
        }

        public Criteria andIfdeleteNotEqualTo(String value) {
            addCriterion("ifdelete <>", value, "ifdelete");
            return (Criteria) this;
        }

        public Criteria andIfdeleteGreaterThan(String value) {
            addCriterion("ifdelete >", value, "ifdelete");
            return (Criteria) this;
        }

        public Criteria andIfdeleteGreaterThanOrEqualTo(String value) {
            addCriterion("ifdelete >=", value, "ifdelete");
            return (Criteria) this;
        }

        public Criteria andIfdeleteLessThan(String value) {
            addCriterion("ifdelete <", value, "ifdelete");
            return (Criteria) this;
        }

        public Criteria andIfdeleteLessThanOrEqualTo(String value) {
            addCriterion("ifdelete <=", value, "ifdelete");
            return (Criteria) this;
        }

        public Criteria andIfdeleteLike(String value) {
            addCriterion("ifdelete like", value, "ifdelete");
            return (Criteria) this;
        }

        public Criteria andIfdeleteNotLike(String value) {
            addCriterion("ifdelete not like", value, "ifdelete");
            return (Criteria) this;
        }

        public Criteria andIfdeleteIn(List<String> values) {
            addCriterion("ifdelete in", values, "ifdelete");
            return (Criteria) this;
        }

        public Criteria andIfdeleteNotIn(List<String> values) {
            addCriterion("ifdelete not in", values, "ifdelete");
            return (Criteria) this;
        }

        public Criteria andIfdeleteBetween(String value1, String value2) {
            addCriterion("ifdelete between", value1, value2, "ifdelete");
            return (Criteria) this;
        }

        public Criteria andIfdeleteNotBetween(String value1, String value2) {
            addCriterion("ifdelete not between", value1, value2, "ifdelete");
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