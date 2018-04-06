package com.lming.chc.personal.server.entity;

import java.util.ArrayList;
import java.util.List;

public class AclRightsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public AclRightsExample() {
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

        public Criteria andRightIdIsNull() {
            addCriterion("right_id is null");
            return (Criteria) this;
        }

        public Criteria andRightIdIsNotNull() {
            addCriterion("right_id is not null");
            return (Criteria) this;
        }

        public Criteria andRightIdEqualTo(String value) {
            addCriterion("right_id =", value, "rightId");
            return (Criteria) this;
        }

        public Criteria andRightIdNotEqualTo(String value) {
            addCriterion("right_id <>", value, "rightId");
            return (Criteria) this;
        }

        public Criteria andRightIdGreaterThan(String value) {
            addCriterion("right_id >", value, "rightId");
            return (Criteria) this;
        }

        public Criteria andRightIdGreaterThanOrEqualTo(String value) {
            addCriterion("right_id >=", value, "rightId");
            return (Criteria) this;
        }

        public Criteria andRightIdLessThan(String value) {
            addCriterion("right_id <", value, "rightId");
            return (Criteria) this;
        }

        public Criteria andRightIdLessThanOrEqualTo(String value) {
            addCriterion("right_id <=", value, "rightId");
            return (Criteria) this;
        }

        public Criteria andRightIdLike(String value) {
            addCriterion("right_id like", value, "rightId");
            return (Criteria) this;
        }

        public Criteria andRightIdNotLike(String value) {
            addCriterion("right_id not like", value, "rightId");
            return (Criteria) this;
        }

        public Criteria andRightIdIn(List<String> values) {
            addCriterion("right_id in", values, "rightId");
            return (Criteria) this;
        }

        public Criteria andRightIdNotIn(List<String> values) {
            addCriterion("right_id not in", values, "rightId");
            return (Criteria) this;
        }

        public Criteria andRightIdBetween(String value1, String value2) {
            addCriterion("right_id between", value1, value2, "rightId");
            return (Criteria) this;
        }

        public Criteria andRightIdNotBetween(String value1, String value2) {
            addCriterion("right_id not between", value1, value2, "rightId");
            return (Criteria) this;
        }

        public Criteria andRightNameIsNull() {
            addCriterion("right_name is null");
            return (Criteria) this;
        }

        public Criteria andRightNameIsNotNull() {
            addCriterion("right_name is not null");
            return (Criteria) this;
        }

        public Criteria andRightNameEqualTo(String value) {
            addCriterion("right_name =", value, "rightName");
            return (Criteria) this;
        }

        public Criteria andRightNameNotEqualTo(String value) {
            addCriterion("right_name <>", value, "rightName");
            return (Criteria) this;
        }

        public Criteria andRightNameGreaterThan(String value) {
            addCriterion("right_name >", value, "rightName");
            return (Criteria) this;
        }

        public Criteria andRightNameGreaterThanOrEqualTo(String value) {
            addCriterion("right_name >=", value, "rightName");
            return (Criteria) this;
        }

        public Criteria andRightNameLessThan(String value) {
            addCriterion("right_name <", value, "rightName");
            return (Criteria) this;
        }

        public Criteria andRightNameLessThanOrEqualTo(String value) {
            addCriterion("right_name <=", value, "rightName");
            return (Criteria) this;
        }

        public Criteria andRightNameLike(String value) {
            addCriterion("right_name like", value, "rightName");
            return (Criteria) this;
        }

        public Criteria andRightNameNotLike(String value) {
            addCriterion("right_name not like", value, "rightName");
            return (Criteria) this;
        }

        public Criteria andRightNameIn(List<String> values) {
            addCriterion("right_name in", values, "rightName");
            return (Criteria) this;
        }

        public Criteria andRightNameNotIn(List<String> values) {
            addCriterion("right_name not in", values, "rightName");
            return (Criteria) this;
        }

        public Criteria andRightNameBetween(String value1, String value2) {
            addCriterion("right_name between", value1, value2, "rightName");
            return (Criteria) this;
        }

        public Criteria andRightNameNotBetween(String value1, String value2) {
            addCriterion("right_name not between", value1, value2, "rightName");
            return (Criteria) this;
        }

        public Criteria andRightIconIsNull() {
            addCriterion("right_icon is null");
            return (Criteria) this;
        }

        public Criteria andRightIconIsNotNull() {
            addCriterion("right_icon is not null");
            return (Criteria) this;
        }

        public Criteria andRightIconEqualTo(String value) {
            addCriterion("right_icon =", value, "rightIcon");
            return (Criteria) this;
        }

        public Criteria andRightIconNotEqualTo(String value) {
            addCriterion("right_icon <>", value, "rightIcon");
            return (Criteria) this;
        }

        public Criteria andRightIconGreaterThan(String value) {
            addCriterion("right_icon >", value, "rightIcon");
            return (Criteria) this;
        }

        public Criteria andRightIconGreaterThanOrEqualTo(String value) {
            addCriterion("right_icon >=", value, "rightIcon");
            return (Criteria) this;
        }

        public Criteria andRightIconLessThan(String value) {
            addCriterion("right_icon <", value, "rightIcon");
            return (Criteria) this;
        }

        public Criteria andRightIconLessThanOrEqualTo(String value) {
            addCriterion("right_icon <=", value, "rightIcon");
            return (Criteria) this;
        }

        public Criteria andRightIconLike(String value) {
            addCriterion("right_icon like", value, "rightIcon");
            return (Criteria) this;
        }

        public Criteria andRightIconNotLike(String value) {
            addCriterion("right_icon not like", value, "rightIcon");
            return (Criteria) this;
        }

        public Criteria andRightIconIn(List<String> values) {
            addCriterion("right_icon in", values, "rightIcon");
            return (Criteria) this;
        }

        public Criteria andRightIconNotIn(List<String> values) {
            addCriterion("right_icon not in", values, "rightIcon");
            return (Criteria) this;
        }

        public Criteria andRightIconBetween(String value1, String value2) {
            addCriterion("right_icon between", value1, value2, "rightIcon");
            return (Criteria) this;
        }

        public Criteria andRightIconNotBetween(String value1, String value2) {
            addCriterion("right_icon not between", value1, value2, "rightIcon");
            return (Criteria) this;
        }

        public Criteria andLinkUrlIsNull() {
            addCriterion("link_url is null");
            return (Criteria) this;
        }

        public Criteria andLinkUrlIsNotNull() {
            addCriterion("link_url is not null");
            return (Criteria) this;
        }

        public Criteria andLinkUrlEqualTo(String value) {
            addCriterion("link_url =", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotEqualTo(String value) {
            addCriterion("link_url <>", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlGreaterThan(String value) {
            addCriterion("link_url >", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlGreaterThanOrEqualTo(String value) {
            addCriterion("link_url >=", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlLessThan(String value) {
            addCriterion("link_url <", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlLessThanOrEqualTo(String value) {
            addCriterion("link_url <=", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlLike(String value) {
            addCriterion("link_url like", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotLike(String value) {
            addCriterion("link_url not like", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlIn(List<String> values) {
            addCriterion("link_url in", values, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotIn(List<String> values) {
            addCriterion("link_url not in", values, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlBetween(String value1, String value2) {
            addCriterion("link_url between", value1, value2, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotBetween(String value1, String value2) {
            addCriterion("link_url not between", value1, value2, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIsNull() {
            addCriterion("menu_type is null");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIsNotNull() {
            addCriterion("menu_type is not null");
            return (Criteria) this;
        }

        public Criteria andMenuTypeEqualTo(String value) {
            addCriterion("menu_type =", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotEqualTo(String value) {
            addCriterion("menu_type <>", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeGreaterThan(String value) {
            addCriterion("menu_type >", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeGreaterThanOrEqualTo(String value) {
            addCriterion("menu_type >=", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeLessThan(String value) {
            addCriterion("menu_type <", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeLessThanOrEqualTo(String value) {
            addCriterion("menu_type <=", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeLike(String value) {
            addCriterion("menu_type like", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotLike(String value) {
            addCriterion("menu_type not like", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIn(List<String> values) {
            addCriterion("menu_type in", values, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotIn(List<String> values) {
            addCriterion("menu_type not in", values, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeBetween(String value1, String value2) {
            addCriterion("menu_type between", value1, value2, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotBetween(String value1, String value2) {
            addCriterion("menu_type not between", value1, value2, "menuType");
            return (Criteria) this;
        }

        public Criteria andOperTypeIsNull() {
            addCriterion("oper_type is null");
            return (Criteria) this;
        }

        public Criteria andOperTypeIsNotNull() {
            addCriterion("oper_type is not null");
            return (Criteria) this;
        }

        public Criteria andOperTypeEqualTo(String value) {
            addCriterion("oper_type =", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeNotEqualTo(String value) {
            addCriterion("oper_type <>", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeGreaterThan(String value) {
            addCriterion("oper_type >", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeGreaterThanOrEqualTo(String value) {
            addCriterion("oper_type >=", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeLessThan(String value) {
            addCriterion("oper_type <", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeLessThanOrEqualTo(String value) {
            addCriterion("oper_type <=", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeLike(String value) {
            addCriterion("oper_type like", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeNotLike(String value) {
            addCriterion("oper_type not like", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeIn(List<String> values) {
            addCriterion("oper_type in", values, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeNotIn(List<String> values) {
            addCriterion("oper_type not in", values, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeBetween(String value1, String value2) {
            addCriterion("oper_type between", value1, value2, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeNotBetween(String value1, String value2) {
            addCriterion("oper_type not between", value1, value2, "operType");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(String value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(String value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(String value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(String value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(String value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLike(String value) {
            addCriterion("parent_id like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotLike(String value) {
            addCriterion("parent_id not like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<String> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<String> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(String value1, String value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(String value1, String value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andRequestUrlIsNull() {
            addCriterion("request_url is null");
            return (Criteria) this;
        }

        public Criteria andRequestUrlIsNotNull() {
            addCriterion("request_url is not null");
            return (Criteria) this;
        }

        public Criteria andRequestUrlEqualTo(String value) {
            addCriterion("request_url =", value, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlNotEqualTo(String value) {
            addCriterion("request_url <>", value, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlGreaterThan(String value) {
            addCriterion("request_url >", value, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlGreaterThanOrEqualTo(String value) {
            addCriterion("request_url >=", value, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlLessThan(String value) {
            addCriterion("request_url <", value, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlLessThanOrEqualTo(String value) {
            addCriterion("request_url <=", value, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlLike(String value) {
            addCriterion("request_url like", value, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlNotLike(String value) {
            addCriterion("request_url not like", value, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlIn(List<String> values) {
            addCriterion("request_url in", values, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlNotIn(List<String> values) {
            addCriterion("request_url not in", values, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlBetween(String value1, String value2) {
            addCriterion("request_url between", value1, value2, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlNotBetween(String value1, String value2) {
            addCriterion("request_url not between", value1, value2, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
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