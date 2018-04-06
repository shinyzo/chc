package com.lming.chc.personal.server.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DoctorInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public DoctorInfoExample() {
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

        public Criteria andDoctor_idIsNull() {
            addCriterion("doctor_id is null");
            return (Criteria) this;
        }

        public Criteria andDoctor_idIsNotNull() {
            addCriterion("doctor_id is not null");
            return (Criteria) this;
        }

        public Criteria andDoctor_idEqualTo(Integer value) {
            addCriterion("doctor_id =", value, "doctor_id");
            return (Criteria) this;
        }

        public Criteria andDoctor_idNotEqualTo(Integer value) {
            addCriterion("doctor_id <>", value, "doctor_id");
            return (Criteria) this;
        }

        public Criteria andDoctor_idGreaterThan(Integer value) {
            addCriterion("doctor_id >", value, "doctor_id");
            return (Criteria) this;
        }

        public Criteria andDoctor_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("doctor_id >=", value, "doctor_id");
            return (Criteria) this;
        }

        public Criteria andDoctor_idLessThan(Integer value) {
            addCriterion("doctor_id <", value, "doctor_id");
            return (Criteria) this;
        }

        public Criteria andDoctor_idLessThanOrEqualTo(Integer value) {
            addCriterion("doctor_id <=", value, "doctor_id");
            return (Criteria) this;
        }

        public Criteria andDoctor_idIn(List<Integer> values) {
            addCriterion("doctor_id in", values, "doctor_id");
            return (Criteria) this;
        }

        public Criteria andDoctor_idNotIn(List<Integer> values) {
            addCriterion("doctor_id not in", values, "doctor_id");
            return (Criteria) this;
        }

        public Criteria andDoctor_idBetween(Integer value1, Integer value2) {
            addCriterion("doctor_id between", value1, value2, "doctor_id");
            return (Criteria) this;
        }

        public Criteria andDoctor_idNotBetween(Integer value1, Integer value2) {
            addCriterion("doctor_id not between", value1, value2, "doctor_id");
            return (Criteria) this;
        }

        public Criteria andId_card_noIsNull() {
            addCriterion("id_card_no is null");
            return (Criteria) this;
        }

        public Criteria andId_card_noIsNotNull() {
            addCriterion("id_card_no is not null");
            return (Criteria) this;
        }

        public Criteria andId_card_noEqualTo(String value) {
            addCriterion("id_card_no =", value, "id_card_no");
            return (Criteria) this;
        }

        public Criteria andId_card_noNotEqualTo(String value) {
            addCriterion("id_card_no <>", value, "id_card_no");
            return (Criteria) this;
        }

        public Criteria andId_card_noGreaterThan(String value) {
            addCriterion("id_card_no >", value, "id_card_no");
            return (Criteria) this;
        }

        public Criteria andId_card_noGreaterThanOrEqualTo(String value) {
            addCriterion("id_card_no >=", value, "id_card_no");
            return (Criteria) this;
        }

        public Criteria andId_card_noLessThan(String value) {
            addCriterion("id_card_no <", value, "id_card_no");
            return (Criteria) this;
        }

        public Criteria andId_card_noLessThanOrEqualTo(String value) {
            addCriterion("id_card_no <=", value, "id_card_no");
            return (Criteria) this;
        }

        public Criteria andId_card_noLike(String value) {
            addCriterion("id_card_no like", value, "id_card_no");
            return (Criteria) this;
        }

        public Criteria andId_card_noNotLike(String value) {
            addCriterion("id_card_no not like", value, "id_card_no");
            return (Criteria) this;
        }

        public Criteria andId_card_noIn(List<String> values) {
            addCriterion("id_card_no in", values, "id_card_no");
            return (Criteria) this;
        }

        public Criteria andId_card_noNotIn(List<String> values) {
            addCriterion("id_card_no not in", values, "id_card_no");
            return (Criteria) this;
        }

        public Criteria andId_card_noBetween(String value1, String value2) {
            addCriterion("id_card_no between", value1, value2, "id_card_no");
            return (Criteria) this;
        }

        public Criteria andId_card_noNotBetween(String value1, String value2) {
            addCriterion("id_card_no not between", value1, value2, "id_card_no");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUser_idEqualTo(Integer value) {
            addCriterion("user_id =", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThan(Integer value) {
            addCriterion("user_id >", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThan(Integer value) {
            addCriterion("user_id <", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idIn(List<Integer> values) {
            addCriterion("user_id in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andDoctor_nameIsNull() {
            addCriterion("doctor_name is null");
            return (Criteria) this;
        }

        public Criteria andDoctor_nameIsNotNull() {
            addCriterion("doctor_name is not null");
            return (Criteria) this;
        }

        public Criteria andDoctor_nameEqualTo(String value) {
            addCriterion("doctor_name =", value, "doctor_name");
            return (Criteria) this;
        }

        public Criteria andDoctor_nameNotEqualTo(String value) {
            addCriterion("doctor_name <>", value, "doctor_name");
            return (Criteria) this;
        }

        public Criteria andDoctor_nameGreaterThan(String value) {
            addCriterion("doctor_name >", value, "doctor_name");
            return (Criteria) this;
        }

        public Criteria andDoctor_nameGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_name >=", value, "doctor_name");
            return (Criteria) this;
        }

        public Criteria andDoctor_nameLessThan(String value) {
            addCriterion("doctor_name <", value, "doctor_name");
            return (Criteria) this;
        }

        public Criteria andDoctor_nameLessThanOrEqualTo(String value) {
            addCriterion("doctor_name <=", value, "doctor_name");
            return (Criteria) this;
        }

        public Criteria andDoctor_nameLike(String value) {
            addCriterion("doctor_name like", value, "doctor_name");
            return (Criteria) this;
        }

        public Criteria andDoctor_nameNotLike(String value) {
            addCriterion("doctor_name not like", value, "doctor_name");
            return (Criteria) this;
        }

        public Criteria andDoctor_nameIn(List<String> values) {
            addCriterion("doctor_name in", values, "doctor_name");
            return (Criteria) this;
        }

        public Criteria andDoctor_nameNotIn(List<String> values) {
            addCriterion("doctor_name not in", values, "doctor_name");
            return (Criteria) this;
        }

        public Criteria andDoctor_nameBetween(String value1, String value2) {
            addCriterion("doctor_name between", value1, value2, "doctor_name");
            return (Criteria) this;
        }

        public Criteria andDoctor_nameNotBetween(String value1, String value2) {
            addCriterion("doctor_name not between", value1, value2, "doctor_name");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(String value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(String value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(String value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(String value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(String value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLike(String value) {
            addCriterion("birthday like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotLike(String value) {
            addCriterion("birthday not like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<String> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<String> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(String value1, String value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(String value1, String value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNull() {
            addCriterion("avatar is null");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNotNull() {
            addCriterion("avatar is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarEqualTo(String value) {
            addCriterion("avatar =", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotEqualTo(String value) {
            addCriterion("avatar <>", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThan(String value) {
            addCriterion("avatar >", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("avatar >=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThan(String value) {
            addCriterion("avatar <", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThanOrEqualTo(String value) {
            addCriterion("avatar <=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLike(String value) {
            addCriterion("avatar like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotLike(String value) {
            addCriterion("avatar not like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarIn(List<String> values) {
            addCriterion("avatar in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotIn(List<String> values) {
            addCriterion("avatar not in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarBetween(String value1, String value2) {
            addCriterion("avatar between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotBetween(String value1, String value2) {
            addCriterion("avatar not between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andQafca_cert_noIsNull() {
            addCriterion("qafca_cert_no is null");
            return (Criteria) this;
        }

        public Criteria andQafca_cert_noIsNotNull() {
            addCriterion("qafca_cert_no is not null");
            return (Criteria) this;
        }

        public Criteria andQafca_cert_noEqualTo(String value) {
            addCriterion("qafca_cert_no =", value, "qafca_cert_no");
            return (Criteria) this;
        }

        public Criteria andQafca_cert_noNotEqualTo(String value) {
            addCriterion("qafca_cert_no <>", value, "qafca_cert_no");
            return (Criteria) this;
        }

        public Criteria andQafca_cert_noGreaterThan(String value) {
            addCriterion("qafca_cert_no >", value, "qafca_cert_no");
            return (Criteria) this;
        }

        public Criteria andQafca_cert_noGreaterThanOrEqualTo(String value) {
            addCriterion("qafca_cert_no >=", value, "qafca_cert_no");
            return (Criteria) this;
        }

        public Criteria andQafca_cert_noLessThan(String value) {
            addCriterion("qafca_cert_no <", value, "qafca_cert_no");
            return (Criteria) this;
        }

        public Criteria andQafca_cert_noLessThanOrEqualTo(String value) {
            addCriterion("qafca_cert_no <=", value, "qafca_cert_no");
            return (Criteria) this;
        }

        public Criteria andQafca_cert_noLike(String value) {
            addCriterion("qafca_cert_no like", value, "qafca_cert_no");
            return (Criteria) this;
        }

        public Criteria andQafca_cert_noNotLike(String value) {
            addCriterion("qafca_cert_no not like", value, "qafca_cert_no");
            return (Criteria) this;
        }

        public Criteria andQafca_cert_noIn(List<String> values) {
            addCriterion("qafca_cert_no in", values, "qafca_cert_no");
            return (Criteria) this;
        }

        public Criteria andQafca_cert_noNotIn(List<String> values) {
            addCriterion("qafca_cert_no not in", values, "qafca_cert_no");
            return (Criteria) this;
        }

        public Criteria andQafca_cert_noBetween(String value1, String value2) {
            addCriterion("qafca_cert_no between", value1, value2, "qafca_cert_no");
            return (Criteria) this;
        }

        public Criteria andQafca_cert_noNotBetween(String value1, String value2) {
            addCriterion("qafca_cert_no not between", value1, value2, "qafca_cert_no");
            return (Criteria) this;
        }

        public Criteria andQafca_cert_imgIsNull() {
            addCriterion("qafca_cert_img is null");
            return (Criteria) this;
        }

        public Criteria andQafca_cert_imgIsNotNull() {
            addCriterion("qafca_cert_img is not null");
            return (Criteria) this;
        }

        public Criteria andQafca_cert_imgEqualTo(String value) {
            addCriterion("qafca_cert_img =", value, "qafca_cert_img");
            return (Criteria) this;
        }

        public Criteria andQafca_cert_imgNotEqualTo(String value) {
            addCriterion("qafca_cert_img <>", value, "qafca_cert_img");
            return (Criteria) this;
        }

        public Criteria andQafca_cert_imgGreaterThan(String value) {
            addCriterion("qafca_cert_img >", value, "qafca_cert_img");
            return (Criteria) this;
        }

        public Criteria andQafca_cert_imgGreaterThanOrEqualTo(String value) {
            addCriterion("qafca_cert_img >=", value, "qafca_cert_img");
            return (Criteria) this;
        }

        public Criteria andQafca_cert_imgLessThan(String value) {
            addCriterion("qafca_cert_img <", value, "qafca_cert_img");
            return (Criteria) this;
        }

        public Criteria andQafca_cert_imgLessThanOrEqualTo(String value) {
            addCriterion("qafca_cert_img <=", value, "qafca_cert_img");
            return (Criteria) this;
        }

        public Criteria andQafca_cert_imgLike(String value) {
            addCriterion("qafca_cert_img like", value, "qafca_cert_img");
            return (Criteria) this;
        }

        public Criteria andQafca_cert_imgNotLike(String value) {
            addCriterion("qafca_cert_img not like", value, "qafca_cert_img");
            return (Criteria) this;
        }

        public Criteria andQafca_cert_imgIn(List<String> values) {
            addCriterion("qafca_cert_img in", values, "qafca_cert_img");
            return (Criteria) this;
        }

        public Criteria andQafca_cert_imgNotIn(List<String> values) {
            addCriterion("qafca_cert_img not in", values, "qafca_cert_img");
            return (Criteria) this;
        }

        public Criteria andQafca_cert_imgBetween(String value1, String value2) {
            addCriterion("qafca_cert_img between", value1, value2, "qafca_cert_img");
            return (Criteria) this;
        }

        public Criteria andQafca_cert_imgNotBetween(String value1, String value2) {
            addCriterion("qafca_cert_img not between", value1, value2, "qafca_cert_img");
            return (Criteria) this;
        }

        public Criteria andQafca_cert_sign_dateIsNull() {
            addCriterion("qafca_cert_sign_date is null");
            return (Criteria) this;
        }

        public Criteria andQafca_cert_sign_dateIsNotNull() {
            addCriterion("qafca_cert_sign_date is not null");
            return (Criteria) this;
        }

        public Criteria andQafca_cert_sign_dateEqualTo(String value) {
            addCriterion("qafca_cert_sign_date =", value, "qafca_cert_sign_date");
            return (Criteria) this;
        }

        public Criteria andQafca_cert_sign_dateNotEqualTo(String value) {
            addCriterion("qafca_cert_sign_date <>", value, "qafca_cert_sign_date");
            return (Criteria) this;
        }

        public Criteria andQafca_cert_sign_dateGreaterThan(String value) {
            addCriterion("qafca_cert_sign_date >", value, "qafca_cert_sign_date");
            return (Criteria) this;
        }

        public Criteria andQafca_cert_sign_dateGreaterThanOrEqualTo(String value) {
            addCriterion("qafca_cert_sign_date >=", value, "qafca_cert_sign_date");
            return (Criteria) this;
        }

        public Criteria andQafca_cert_sign_dateLessThan(String value) {
            addCriterion("qafca_cert_sign_date <", value, "qafca_cert_sign_date");
            return (Criteria) this;
        }

        public Criteria andQafca_cert_sign_dateLessThanOrEqualTo(String value) {
            addCriterion("qafca_cert_sign_date <=", value, "qafca_cert_sign_date");
            return (Criteria) this;
        }

        public Criteria andQafca_cert_sign_dateLike(String value) {
            addCriterion("qafca_cert_sign_date like", value, "qafca_cert_sign_date");
            return (Criteria) this;
        }

        public Criteria andQafca_cert_sign_dateNotLike(String value) {
            addCriterion("qafca_cert_sign_date not like", value, "qafca_cert_sign_date");
            return (Criteria) this;
        }

        public Criteria andQafca_cert_sign_dateIn(List<String> values) {
            addCriterion("qafca_cert_sign_date in", values, "qafca_cert_sign_date");
            return (Criteria) this;
        }

        public Criteria andQafca_cert_sign_dateNotIn(List<String> values) {
            addCriterion("qafca_cert_sign_date not in", values, "qafca_cert_sign_date");
            return (Criteria) this;
        }

        public Criteria andQafca_cert_sign_dateBetween(String value1, String value2) {
            addCriterion("qafca_cert_sign_date between", value1, value2, "qafca_cert_sign_date");
            return (Criteria) this;
        }

        public Criteria andQafca_cert_sign_dateNotBetween(String value1, String value2) {
            addCriterion("qafca_cert_sign_date not between", value1, value2, "qafca_cert_sign_date");
            return (Criteria) this;
        }

        public Criteria andPract_cert_noIsNull() {
            addCriterion("pract_cert_no is null");
            return (Criteria) this;
        }

        public Criteria andPract_cert_noIsNotNull() {
            addCriterion("pract_cert_no is not null");
            return (Criteria) this;
        }

        public Criteria andPract_cert_noEqualTo(String value) {
            addCriterion("pract_cert_no =", value, "pract_cert_no");
            return (Criteria) this;
        }

        public Criteria andPract_cert_noNotEqualTo(String value) {
            addCriterion("pract_cert_no <>", value, "pract_cert_no");
            return (Criteria) this;
        }

        public Criteria andPract_cert_noGreaterThan(String value) {
            addCriterion("pract_cert_no >", value, "pract_cert_no");
            return (Criteria) this;
        }

        public Criteria andPract_cert_noGreaterThanOrEqualTo(String value) {
            addCriterion("pract_cert_no >=", value, "pract_cert_no");
            return (Criteria) this;
        }

        public Criteria andPract_cert_noLessThan(String value) {
            addCriterion("pract_cert_no <", value, "pract_cert_no");
            return (Criteria) this;
        }

        public Criteria andPract_cert_noLessThanOrEqualTo(String value) {
            addCriterion("pract_cert_no <=", value, "pract_cert_no");
            return (Criteria) this;
        }

        public Criteria andPract_cert_noLike(String value) {
            addCriterion("pract_cert_no like", value, "pract_cert_no");
            return (Criteria) this;
        }

        public Criteria andPract_cert_noNotLike(String value) {
            addCriterion("pract_cert_no not like", value, "pract_cert_no");
            return (Criteria) this;
        }

        public Criteria andPract_cert_noIn(List<String> values) {
            addCriterion("pract_cert_no in", values, "pract_cert_no");
            return (Criteria) this;
        }

        public Criteria andPract_cert_noNotIn(List<String> values) {
            addCriterion("pract_cert_no not in", values, "pract_cert_no");
            return (Criteria) this;
        }

        public Criteria andPract_cert_noBetween(String value1, String value2) {
            addCriterion("pract_cert_no between", value1, value2, "pract_cert_no");
            return (Criteria) this;
        }

        public Criteria andPract_cert_noNotBetween(String value1, String value2) {
            addCriterion("pract_cert_no not between", value1, value2, "pract_cert_no");
            return (Criteria) this;
        }

        public Criteria andPract_cert_imgIsNull() {
            addCriterion("pract_cert_img is null");
            return (Criteria) this;
        }

        public Criteria andPract_cert_imgIsNotNull() {
            addCriterion("pract_cert_img is not null");
            return (Criteria) this;
        }

        public Criteria andPract_cert_imgEqualTo(String value) {
            addCriterion("pract_cert_img =", value, "pract_cert_img");
            return (Criteria) this;
        }

        public Criteria andPract_cert_imgNotEqualTo(String value) {
            addCriterion("pract_cert_img <>", value, "pract_cert_img");
            return (Criteria) this;
        }

        public Criteria andPract_cert_imgGreaterThan(String value) {
            addCriterion("pract_cert_img >", value, "pract_cert_img");
            return (Criteria) this;
        }

        public Criteria andPract_cert_imgGreaterThanOrEqualTo(String value) {
            addCriterion("pract_cert_img >=", value, "pract_cert_img");
            return (Criteria) this;
        }

        public Criteria andPract_cert_imgLessThan(String value) {
            addCriterion("pract_cert_img <", value, "pract_cert_img");
            return (Criteria) this;
        }

        public Criteria andPract_cert_imgLessThanOrEqualTo(String value) {
            addCriterion("pract_cert_img <=", value, "pract_cert_img");
            return (Criteria) this;
        }

        public Criteria andPract_cert_imgLike(String value) {
            addCriterion("pract_cert_img like", value, "pract_cert_img");
            return (Criteria) this;
        }

        public Criteria andPract_cert_imgNotLike(String value) {
            addCriterion("pract_cert_img not like", value, "pract_cert_img");
            return (Criteria) this;
        }

        public Criteria andPract_cert_imgIn(List<String> values) {
            addCriterion("pract_cert_img in", values, "pract_cert_img");
            return (Criteria) this;
        }

        public Criteria andPract_cert_imgNotIn(List<String> values) {
            addCriterion("pract_cert_img not in", values, "pract_cert_img");
            return (Criteria) this;
        }

        public Criteria andPract_cert_imgBetween(String value1, String value2) {
            addCriterion("pract_cert_img between", value1, value2, "pract_cert_img");
            return (Criteria) this;
        }

        public Criteria andPract_cert_imgNotBetween(String value1, String value2) {
            addCriterion("pract_cert_img not between", value1, value2, "pract_cert_img");
            return (Criteria) this;
        }

        public Criteria andPract_cert_register_dateIsNull() {
            addCriterion("pract_cert_register_date is null");
            return (Criteria) this;
        }

        public Criteria andPract_cert_register_dateIsNotNull() {
            addCriterion("pract_cert_register_date is not null");
            return (Criteria) this;
        }

        public Criteria andPract_cert_register_dateEqualTo(String value) {
            addCriterion("pract_cert_register_date =", value, "pract_cert_register_date");
            return (Criteria) this;
        }

        public Criteria andPract_cert_register_dateNotEqualTo(String value) {
            addCriterion("pract_cert_register_date <>", value, "pract_cert_register_date");
            return (Criteria) this;
        }

        public Criteria andPract_cert_register_dateGreaterThan(String value) {
            addCriterion("pract_cert_register_date >", value, "pract_cert_register_date");
            return (Criteria) this;
        }

        public Criteria andPract_cert_register_dateGreaterThanOrEqualTo(String value) {
            addCriterion("pract_cert_register_date >=", value, "pract_cert_register_date");
            return (Criteria) this;
        }

        public Criteria andPract_cert_register_dateLessThan(String value) {
            addCriterion("pract_cert_register_date <", value, "pract_cert_register_date");
            return (Criteria) this;
        }

        public Criteria andPract_cert_register_dateLessThanOrEqualTo(String value) {
            addCriterion("pract_cert_register_date <=", value, "pract_cert_register_date");
            return (Criteria) this;
        }

        public Criteria andPract_cert_register_dateLike(String value) {
            addCriterion("pract_cert_register_date like", value, "pract_cert_register_date");
            return (Criteria) this;
        }

        public Criteria andPract_cert_register_dateNotLike(String value) {
            addCriterion("pract_cert_register_date not like", value, "pract_cert_register_date");
            return (Criteria) this;
        }

        public Criteria andPract_cert_register_dateIn(List<String> values) {
            addCriterion("pract_cert_register_date in", values, "pract_cert_register_date");
            return (Criteria) this;
        }

        public Criteria andPract_cert_register_dateNotIn(List<String> values) {
            addCriterion("pract_cert_register_date not in", values, "pract_cert_register_date");
            return (Criteria) this;
        }

        public Criteria andPract_cert_register_dateBetween(String value1, String value2) {
            addCriterion("pract_cert_register_date between", value1, value2, "pract_cert_register_date");
            return (Criteria) this;
        }

        public Criteria andPract_cert_register_dateNotBetween(String value1, String value2) {
            addCriterion("pract_cert_register_date not between", value1, value2, "pract_cert_register_date");
            return (Criteria) this;
        }

        public Criteria andHospital_idIsNull() {
            addCriterion("hospital_id is null");
            return (Criteria) this;
        }

        public Criteria andHospital_idIsNotNull() {
            addCriterion("hospital_id is not null");
            return (Criteria) this;
        }

        public Criteria andHospital_idEqualTo(Integer value) {
            addCriterion("hospital_id =", value, "hospital_id");
            return (Criteria) this;
        }

        public Criteria andHospital_idNotEqualTo(Integer value) {
            addCriterion("hospital_id <>", value, "hospital_id");
            return (Criteria) this;
        }

        public Criteria andHospital_idGreaterThan(Integer value) {
            addCriterion("hospital_id >", value, "hospital_id");
            return (Criteria) this;
        }

        public Criteria andHospital_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("hospital_id >=", value, "hospital_id");
            return (Criteria) this;
        }

        public Criteria andHospital_idLessThan(Integer value) {
            addCriterion("hospital_id <", value, "hospital_id");
            return (Criteria) this;
        }

        public Criteria andHospital_idLessThanOrEqualTo(Integer value) {
            addCriterion("hospital_id <=", value, "hospital_id");
            return (Criteria) this;
        }

        public Criteria andHospital_idIn(List<Integer> values) {
            addCriterion("hospital_id in", values, "hospital_id");
            return (Criteria) this;
        }

        public Criteria andHospital_idNotIn(List<Integer> values) {
            addCriterion("hospital_id not in", values, "hospital_id");
            return (Criteria) this;
        }

        public Criteria andHospital_idBetween(Integer value1, Integer value2) {
            addCriterion("hospital_id between", value1, value2, "hospital_id");
            return (Criteria) this;
        }

        public Criteria andHospital_idNotBetween(Integer value1, Integer value2) {
            addCriterion("hospital_id not between", value1, value2, "hospital_id");
            return (Criteria) this;
        }

        public Criteria andHospital_nameIsNull() {
            addCriterion("hospital_name is null");
            return (Criteria) this;
        }

        public Criteria andHospital_nameIsNotNull() {
            addCriterion("hospital_name is not null");
            return (Criteria) this;
        }

        public Criteria andHospital_nameEqualTo(String value) {
            addCriterion("hospital_name =", value, "hospital_name");
            return (Criteria) this;
        }

        public Criteria andHospital_nameNotEqualTo(String value) {
            addCriterion("hospital_name <>", value, "hospital_name");
            return (Criteria) this;
        }

        public Criteria andHospital_nameGreaterThan(String value) {
            addCriterion("hospital_name >", value, "hospital_name");
            return (Criteria) this;
        }

        public Criteria andHospital_nameGreaterThanOrEqualTo(String value) {
            addCriterion("hospital_name >=", value, "hospital_name");
            return (Criteria) this;
        }

        public Criteria andHospital_nameLessThan(String value) {
            addCriterion("hospital_name <", value, "hospital_name");
            return (Criteria) this;
        }

        public Criteria andHospital_nameLessThanOrEqualTo(String value) {
            addCriterion("hospital_name <=", value, "hospital_name");
            return (Criteria) this;
        }

        public Criteria andHospital_nameLike(String value) {
            addCriterion("hospital_name like", value, "hospital_name");
            return (Criteria) this;
        }

        public Criteria andHospital_nameNotLike(String value) {
            addCriterion("hospital_name not like", value, "hospital_name");
            return (Criteria) this;
        }

        public Criteria andHospital_nameIn(List<String> values) {
            addCriterion("hospital_name in", values, "hospital_name");
            return (Criteria) this;
        }

        public Criteria andHospital_nameNotIn(List<String> values) {
            addCriterion("hospital_name not in", values, "hospital_name");
            return (Criteria) this;
        }

        public Criteria andHospital_nameBetween(String value1, String value2) {
            addCriterion("hospital_name between", value1, value2, "hospital_name");
            return (Criteria) this;
        }

        public Criteria andHospital_nameNotBetween(String value1, String value2) {
            addCriterion("hospital_name not between", value1, value2, "hospital_name");
            return (Criteria) this;
        }

        public Criteria andSubject_idIsNull() {
            addCriterion("subject_id is null");
            return (Criteria) this;
        }

        public Criteria andSubject_idIsNotNull() {
            addCriterion("subject_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubject_idEqualTo(String value) {
            addCriterion("subject_id =", value, "subject_id");
            return (Criteria) this;
        }

        public Criteria andSubject_idNotEqualTo(String value) {
            addCriterion("subject_id <>", value, "subject_id");
            return (Criteria) this;
        }

        public Criteria andSubject_idGreaterThan(String value) {
            addCriterion("subject_id >", value, "subject_id");
            return (Criteria) this;
        }

        public Criteria andSubject_idGreaterThanOrEqualTo(String value) {
            addCriterion("subject_id >=", value, "subject_id");
            return (Criteria) this;
        }

        public Criteria andSubject_idLessThan(String value) {
            addCriterion("subject_id <", value, "subject_id");
            return (Criteria) this;
        }

        public Criteria andSubject_idLessThanOrEqualTo(String value) {
            addCriterion("subject_id <=", value, "subject_id");
            return (Criteria) this;
        }

        public Criteria andSubject_idLike(String value) {
            addCriterion("subject_id like", value, "subject_id");
            return (Criteria) this;
        }

        public Criteria andSubject_idNotLike(String value) {
            addCriterion("subject_id not like", value, "subject_id");
            return (Criteria) this;
        }

        public Criteria andSubject_idIn(List<String> values) {
            addCriterion("subject_id in", values, "subject_id");
            return (Criteria) this;
        }

        public Criteria andSubject_idNotIn(List<String> values) {
            addCriterion("subject_id not in", values, "subject_id");
            return (Criteria) this;
        }

        public Criteria andSubject_idBetween(String value1, String value2) {
            addCriterion("subject_id between", value1, value2, "subject_id");
            return (Criteria) this;
        }

        public Criteria andSubject_idNotBetween(String value1, String value2) {
            addCriterion("subject_id not between", value1, value2, "subject_id");
            return (Criteria) this;
        }

        public Criteria andSubject_nameIsNull() {
            addCriterion("subject_name is null");
            return (Criteria) this;
        }

        public Criteria andSubject_nameIsNotNull() {
            addCriterion("subject_name is not null");
            return (Criteria) this;
        }

        public Criteria andSubject_nameEqualTo(String value) {
            addCriterion("subject_name =", value, "subject_name");
            return (Criteria) this;
        }

        public Criteria andSubject_nameNotEqualTo(String value) {
            addCriterion("subject_name <>", value, "subject_name");
            return (Criteria) this;
        }

        public Criteria andSubject_nameGreaterThan(String value) {
            addCriterion("subject_name >", value, "subject_name");
            return (Criteria) this;
        }

        public Criteria andSubject_nameGreaterThanOrEqualTo(String value) {
            addCriterion("subject_name >=", value, "subject_name");
            return (Criteria) this;
        }

        public Criteria andSubject_nameLessThan(String value) {
            addCriterion("subject_name <", value, "subject_name");
            return (Criteria) this;
        }

        public Criteria andSubject_nameLessThanOrEqualTo(String value) {
            addCriterion("subject_name <=", value, "subject_name");
            return (Criteria) this;
        }

        public Criteria andSubject_nameLike(String value) {
            addCriterion("subject_name like", value, "subject_name");
            return (Criteria) this;
        }

        public Criteria andSubject_nameNotLike(String value) {
            addCriterion("subject_name not like", value, "subject_name");
            return (Criteria) this;
        }

        public Criteria andSubject_nameIn(List<String> values) {
            addCriterion("subject_name in", values, "subject_name");
            return (Criteria) this;
        }

        public Criteria andSubject_nameNotIn(List<String> values) {
            addCriterion("subject_name not in", values, "subject_name");
            return (Criteria) this;
        }

        public Criteria andSubject_nameBetween(String value1, String value2) {
            addCriterion("subject_name between", value1, value2, "subject_name");
            return (Criteria) this;
        }

        public Criteria andSubject_nameNotBetween(String value1, String value2) {
            addCriterion("subject_name not between", value1, value2, "subject_name");
            return (Criteria) this;
        }

        public Criteria andLevel_idIsNull() {
            addCriterion("level_id is null");
            return (Criteria) this;
        }

        public Criteria andLevel_idIsNotNull() {
            addCriterion("level_id is not null");
            return (Criteria) this;
        }

        public Criteria andLevel_idEqualTo(String value) {
            addCriterion("level_id =", value, "level_id");
            return (Criteria) this;
        }

        public Criteria andLevel_idNotEqualTo(String value) {
            addCriterion("level_id <>", value, "level_id");
            return (Criteria) this;
        }

        public Criteria andLevel_idGreaterThan(String value) {
            addCriterion("level_id >", value, "level_id");
            return (Criteria) this;
        }

        public Criteria andLevel_idGreaterThanOrEqualTo(String value) {
            addCriterion("level_id >=", value, "level_id");
            return (Criteria) this;
        }

        public Criteria andLevel_idLessThan(String value) {
            addCriterion("level_id <", value, "level_id");
            return (Criteria) this;
        }

        public Criteria andLevel_idLessThanOrEqualTo(String value) {
            addCriterion("level_id <=", value, "level_id");
            return (Criteria) this;
        }

        public Criteria andLevel_idLike(String value) {
            addCriterion("level_id like", value, "level_id");
            return (Criteria) this;
        }

        public Criteria andLevel_idNotLike(String value) {
            addCriterion("level_id not like", value, "level_id");
            return (Criteria) this;
        }

        public Criteria andLevel_idIn(List<String> values) {
            addCriterion("level_id in", values, "level_id");
            return (Criteria) this;
        }

        public Criteria andLevel_idNotIn(List<String> values) {
            addCriterion("level_id not in", values, "level_id");
            return (Criteria) this;
        }

        public Criteria andLevel_idBetween(String value1, String value2) {
            addCriterion("level_id between", value1, value2, "level_id");
            return (Criteria) this;
        }

        public Criteria andLevel_idNotBetween(String value1, String value2) {
            addCriterion("level_id not between", value1, value2, "level_id");
            return (Criteria) this;
        }

        public Criteria andLevel_nameIsNull() {
            addCriterion("level_name is null");
            return (Criteria) this;
        }

        public Criteria andLevel_nameIsNotNull() {
            addCriterion("level_name is not null");
            return (Criteria) this;
        }

        public Criteria andLevel_nameEqualTo(String value) {
            addCriterion("level_name =", value, "level_name");
            return (Criteria) this;
        }

        public Criteria andLevel_nameNotEqualTo(String value) {
            addCriterion("level_name <>", value, "level_name");
            return (Criteria) this;
        }

        public Criteria andLevel_nameGreaterThan(String value) {
            addCriterion("level_name >", value, "level_name");
            return (Criteria) this;
        }

        public Criteria andLevel_nameGreaterThanOrEqualTo(String value) {
            addCriterion("level_name >=", value, "level_name");
            return (Criteria) this;
        }

        public Criteria andLevel_nameLessThan(String value) {
            addCriterion("level_name <", value, "level_name");
            return (Criteria) this;
        }

        public Criteria andLevel_nameLessThanOrEqualTo(String value) {
            addCriterion("level_name <=", value, "level_name");
            return (Criteria) this;
        }

        public Criteria andLevel_nameLike(String value) {
            addCriterion("level_name like", value, "level_name");
            return (Criteria) this;
        }

        public Criteria andLevel_nameNotLike(String value) {
            addCriterion("level_name not like", value, "level_name");
            return (Criteria) this;
        }

        public Criteria andLevel_nameIn(List<String> values) {
            addCriterion("level_name in", values, "level_name");
            return (Criteria) this;
        }

        public Criteria andLevel_nameNotIn(List<String> values) {
            addCriterion("level_name not in", values, "level_name");
            return (Criteria) this;
        }

        public Criteria andLevel_nameBetween(String value1, String value2) {
            addCriterion("level_name between", value1, value2, "level_name");
            return (Criteria) this;
        }

        public Criteria andLevel_nameNotBetween(String value1, String value2) {
            addCriterion("level_name not between", value1, value2, "level_name");
            return (Criteria) this;
        }

        public Criteria andDoctor_noIsNull() {
            addCriterion("doctor_no is null");
            return (Criteria) this;
        }

        public Criteria andDoctor_noIsNotNull() {
            addCriterion("doctor_no is not null");
            return (Criteria) this;
        }

        public Criteria andDoctor_noEqualTo(String value) {
            addCriterion("doctor_no =", value, "doctor_no");
            return (Criteria) this;
        }

        public Criteria andDoctor_noNotEqualTo(String value) {
            addCriterion("doctor_no <>", value, "doctor_no");
            return (Criteria) this;
        }

        public Criteria andDoctor_noGreaterThan(String value) {
            addCriterion("doctor_no >", value, "doctor_no");
            return (Criteria) this;
        }

        public Criteria andDoctor_noGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_no >=", value, "doctor_no");
            return (Criteria) this;
        }

        public Criteria andDoctor_noLessThan(String value) {
            addCriterion("doctor_no <", value, "doctor_no");
            return (Criteria) this;
        }

        public Criteria andDoctor_noLessThanOrEqualTo(String value) {
            addCriterion("doctor_no <=", value, "doctor_no");
            return (Criteria) this;
        }

        public Criteria andDoctor_noLike(String value) {
            addCriterion("doctor_no like", value, "doctor_no");
            return (Criteria) this;
        }

        public Criteria andDoctor_noNotLike(String value) {
            addCriterion("doctor_no not like", value, "doctor_no");
            return (Criteria) this;
        }

        public Criteria andDoctor_noIn(List<String> values) {
            addCriterion("doctor_no in", values, "doctor_no");
            return (Criteria) this;
        }

        public Criteria andDoctor_noNotIn(List<String> values) {
            addCriterion("doctor_no not in", values, "doctor_no");
            return (Criteria) this;
        }

        public Criteria andDoctor_noBetween(String value1, String value2) {
            addCriterion("doctor_no between", value1, value2, "doctor_no");
            return (Criteria) this;
        }

        public Criteria andDoctor_noNotBetween(String value1, String value2) {
            addCriterion("doctor_no not between", value1, value2, "doctor_no");
            return (Criteria) this;
        }

        public Criteria andCollege_nameIsNull() {
            addCriterion("college_name is null");
            return (Criteria) this;
        }

        public Criteria andCollege_nameIsNotNull() {
            addCriterion("college_name is not null");
            return (Criteria) this;
        }

        public Criteria andCollege_nameEqualTo(String value) {
            addCriterion("college_name =", value, "college_name");
            return (Criteria) this;
        }

        public Criteria andCollege_nameNotEqualTo(String value) {
            addCriterion("college_name <>", value, "college_name");
            return (Criteria) this;
        }

        public Criteria andCollege_nameGreaterThan(String value) {
            addCriterion("college_name >", value, "college_name");
            return (Criteria) this;
        }

        public Criteria andCollege_nameGreaterThanOrEqualTo(String value) {
            addCriterion("college_name >=", value, "college_name");
            return (Criteria) this;
        }

        public Criteria andCollege_nameLessThan(String value) {
            addCriterion("college_name <", value, "college_name");
            return (Criteria) this;
        }

        public Criteria andCollege_nameLessThanOrEqualTo(String value) {
            addCriterion("college_name <=", value, "college_name");
            return (Criteria) this;
        }

        public Criteria andCollege_nameLike(String value) {
            addCriterion("college_name like", value, "college_name");
            return (Criteria) this;
        }

        public Criteria andCollege_nameNotLike(String value) {
            addCriterion("college_name not like", value, "college_name");
            return (Criteria) this;
        }

        public Criteria andCollege_nameIn(List<String> values) {
            addCriterion("college_name in", values, "college_name");
            return (Criteria) this;
        }

        public Criteria andCollege_nameNotIn(List<String> values) {
            addCriterion("college_name not in", values, "college_name");
            return (Criteria) this;
        }

        public Criteria andCollege_nameBetween(String value1, String value2) {
            addCriterion("college_name between", value1, value2, "college_name");
            return (Criteria) this;
        }

        public Criteria andCollege_nameNotBetween(String value1, String value2) {
            addCriterion("college_name not between", value1, value2, "college_name");
            return (Criteria) this;
        }

        public Criteria andWork_ageIsNull() {
            addCriterion("work_age is null");
            return (Criteria) this;
        }

        public Criteria andWork_ageIsNotNull() {
            addCriterion("work_age is not null");
            return (Criteria) this;
        }

        public Criteria andWork_ageEqualTo(String value) {
            addCriterion("work_age =", value, "work_age");
            return (Criteria) this;
        }

        public Criteria andWork_ageNotEqualTo(String value) {
            addCriterion("work_age <>", value, "work_age");
            return (Criteria) this;
        }

        public Criteria andWork_ageGreaterThan(String value) {
            addCriterion("work_age >", value, "work_age");
            return (Criteria) this;
        }

        public Criteria andWork_ageGreaterThanOrEqualTo(String value) {
            addCriterion("work_age >=", value, "work_age");
            return (Criteria) this;
        }

        public Criteria andWork_ageLessThan(String value) {
            addCriterion("work_age <", value, "work_age");
            return (Criteria) this;
        }

        public Criteria andWork_ageLessThanOrEqualTo(String value) {
            addCriterion("work_age <=", value, "work_age");
            return (Criteria) this;
        }

        public Criteria andWork_ageLike(String value) {
            addCriterion("work_age like", value, "work_age");
            return (Criteria) this;
        }

        public Criteria andWork_ageNotLike(String value) {
            addCriterion("work_age not like", value, "work_age");
            return (Criteria) this;
        }

        public Criteria andWork_ageIn(List<String> values) {
            addCriterion("work_age in", values, "work_age");
            return (Criteria) this;
        }

        public Criteria andWork_ageNotIn(List<String> values) {
            addCriterion("work_age not in", values, "work_age");
            return (Criteria) this;
        }

        public Criteria andWork_ageBetween(String value1, String value2) {
            addCriterion("work_age between", value1, value2, "work_age");
            return (Criteria) this;
        }

        public Criteria andWork_ageNotBetween(String value1, String value2) {
            addCriterion("work_age not between", value1, value2, "work_age");
            return (Criteria) this;
        }

        public Criteria andFav_subjectIsNull() {
            addCriterion("fav_subject is null");
            return (Criteria) this;
        }

        public Criteria andFav_subjectIsNotNull() {
            addCriterion("fav_subject is not null");
            return (Criteria) this;
        }

        public Criteria andFav_subjectEqualTo(String value) {
            addCriterion("fav_subject =", value, "fav_subject");
            return (Criteria) this;
        }

        public Criteria andFav_subjectNotEqualTo(String value) {
            addCriterion("fav_subject <>", value, "fav_subject");
            return (Criteria) this;
        }

        public Criteria andFav_subjectGreaterThan(String value) {
            addCriterion("fav_subject >", value, "fav_subject");
            return (Criteria) this;
        }

        public Criteria andFav_subjectGreaterThanOrEqualTo(String value) {
            addCriterion("fav_subject >=", value, "fav_subject");
            return (Criteria) this;
        }

        public Criteria andFav_subjectLessThan(String value) {
            addCriterion("fav_subject <", value, "fav_subject");
            return (Criteria) this;
        }

        public Criteria andFav_subjectLessThanOrEqualTo(String value) {
            addCriterion("fav_subject <=", value, "fav_subject");
            return (Criteria) this;
        }

        public Criteria andFav_subjectLike(String value) {
            addCriterion("fav_subject like", value, "fav_subject");
            return (Criteria) this;
        }

        public Criteria andFav_subjectNotLike(String value) {
            addCriterion("fav_subject not like", value, "fav_subject");
            return (Criteria) this;
        }

        public Criteria andFav_subjectIn(List<String> values) {
            addCriterion("fav_subject in", values, "fav_subject");
            return (Criteria) this;
        }

        public Criteria andFav_subjectNotIn(List<String> values) {
            addCriterion("fav_subject not in", values, "fav_subject");
            return (Criteria) this;
        }

        public Criteria andFav_subjectBetween(String value1, String value2) {
            addCriterion("fav_subject between", value1, value2, "fav_subject");
            return (Criteria) this;
        }

        public Criteria andFav_subjectNotBetween(String value1, String value2) {
            addCriterion("fav_subject not between", value1, value2, "fav_subject");
            return (Criteria) this;
        }

        public Criteria andOffice_phoneIsNull() {
            addCriterion("office_phone is null");
            return (Criteria) this;
        }

        public Criteria andOffice_phoneIsNotNull() {
            addCriterion("office_phone is not null");
            return (Criteria) this;
        }

        public Criteria andOffice_phoneEqualTo(String value) {
            addCriterion("office_phone =", value, "office_phone");
            return (Criteria) this;
        }

        public Criteria andOffice_phoneNotEqualTo(String value) {
            addCriterion("office_phone <>", value, "office_phone");
            return (Criteria) this;
        }

        public Criteria andOffice_phoneGreaterThan(String value) {
            addCriterion("office_phone >", value, "office_phone");
            return (Criteria) this;
        }

        public Criteria andOffice_phoneGreaterThanOrEqualTo(String value) {
            addCriterion("office_phone >=", value, "office_phone");
            return (Criteria) this;
        }

        public Criteria andOffice_phoneLessThan(String value) {
            addCriterion("office_phone <", value, "office_phone");
            return (Criteria) this;
        }

        public Criteria andOffice_phoneLessThanOrEqualTo(String value) {
            addCriterion("office_phone <=", value, "office_phone");
            return (Criteria) this;
        }

        public Criteria andOffice_phoneLike(String value) {
            addCriterion("office_phone like", value, "office_phone");
            return (Criteria) this;
        }

        public Criteria andOffice_phoneNotLike(String value) {
            addCriterion("office_phone not like", value, "office_phone");
            return (Criteria) this;
        }

        public Criteria andOffice_phoneIn(List<String> values) {
            addCriterion("office_phone in", values, "office_phone");
            return (Criteria) this;
        }

        public Criteria andOffice_phoneNotIn(List<String> values) {
            addCriterion("office_phone not in", values, "office_phone");
            return (Criteria) this;
        }

        public Criteria andOffice_phoneBetween(String value1, String value2) {
            addCriterion("office_phone between", value1, value2, "office_phone");
            return (Criteria) this;
        }

        public Criteria andOffice_phoneNotBetween(String value1, String value2) {
            addCriterion("office_phone not between", value1, value2, "office_phone");
            return (Criteria) this;
        }

        public Criteria andPersonal_phoneIsNull() {
            addCriterion("personal_phone is null");
            return (Criteria) this;
        }

        public Criteria andPersonal_phoneIsNotNull() {
            addCriterion("personal_phone is not null");
            return (Criteria) this;
        }

        public Criteria andPersonal_phoneEqualTo(String value) {
            addCriterion("personal_phone =", value, "personal_phone");
            return (Criteria) this;
        }

        public Criteria andPersonal_phoneNotEqualTo(String value) {
            addCriterion("personal_phone <>", value, "personal_phone");
            return (Criteria) this;
        }

        public Criteria andPersonal_phoneGreaterThan(String value) {
            addCriterion("personal_phone >", value, "personal_phone");
            return (Criteria) this;
        }

        public Criteria andPersonal_phoneGreaterThanOrEqualTo(String value) {
            addCriterion("personal_phone >=", value, "personal_phone");
            return (Criteria) this;
        }

        public Criteria andPersonal_phoneLessThan(String value) {
            addCriterion("personal_phone <", value, "personal_phone");
            return (Criteria) this;
        }

        public Criteria andPersonal_phoneLessThanOrEqualTo(String value) {
            addCriterion("personal_phone <=", value, "personal_phone");
            return (Criteria) this;
        }

        public Criteria andPersonal_phoneLike(String value) {
            addCriterion("personal_phone like", value, "personal_phone");
            return (Criteria) this;
        }

        public Criteria andPersonal_phoneNotLike(String value) {
            addCriterion("personal_phone not like", value, "personal_phone");
            return (Criteria) this;
        }

        public Criteria andPersonal_phoneIn(List<String> values) {
            addCriterion("personal_phone in", values, "personal_phone");
            return (Criteria) this;
        }

        public Criteria andPersonal_phoneNotIn(List<String> values) {
            addCriterion("personal_phone not in", values, "personal_phone");
            return (Criteria) this;
        }

        public Criteria andPersonal_phoneBetween(String value1, String value2) {
            addCriterion("personal_phone between", value1, value2, "personal_phone");
            return (Criteria) this;
        }

        public Criteria andPersonal_phoneNotBetween(String value1, String value2) {
            addCriterion("personal_phone not between", value1, value2, "personal_phone");
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

        public Criteria andInput_typeIsNull() {
            addCriterion("input_type is null");
            return (Criteria) this;
        }

        public Criteria andInput_typeIsNotNull() {
            addCriterion("input_type is not null");
            return (Criteria) this;
        }

        public Criteria andInput_typeEqualTo(String value) {
            addCriterion("input_type =", value, "input_type");
            return (Criteria) this;
        }

        public Criteria andInput_typeNotEqualTo(String value) {
            addCriterion("input_type <>", value, "input_type");
            return (Criteria) this;
        }

        public Criteria andInput_typeGreaterThan(String value) {
            addCriterion("input_type >", value, "input_type");
            return (Criteria) this;
        }

        public Criteria andInput_typeGreaterThanOrEqualTo(String value) {
            addCriterion("input_type >=", value, "input_type");
            return (Criteria) this;
        }

        public Criteria andInput_typeLessThan(String value) {
            addCriterion("input_type <", value, "input_type");
            return (Criteria) this;
        }

        public Criteria andInput_typeLessThanOrEqualTo(String value) {
            addCriterion("input_type <=", value, "input_type");
            return (Criteria) this;
        }

        public Criteria andInput_typeLike(String value) {
            addCriterion("input_type like", value, "input_type");
            return (Criteria) this;
        }

        public Criteria andInput_typeNotLike(String value) {
            addCriterion("input_type not like", value, "input_type");
            return (Criteria) this;
        }

        public Criteria andInput_typeIn(List<String> values) {
            addCriterion("input_type in", values, "input_type");
            return (Criteria) this;
        }

        public Criteria andInput_typeNotIn(List<String> values) {
            addCriterion("input_type not in", values, "input_type");
            return (Criteria) this;
        }

        public Criteria andInput_typeBetween(String value1, String value2) {
            addCriterion("input_type between", value1, value2, "input_type");
            return (Criteria) this;
        }

        public Criteria andInput_typeNotBetween(String value1, String value2) {
            addCriterion("input_type not between", value1, value2, "input_type");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Float value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Float value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Float value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Float value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Float value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Float value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Float> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Float> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Float value1, Float value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Float value1, Float value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeEqualTo(Date value) {
            addCriterion("create_time =", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThan(Date value) {
            addCriterion("create_time >", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThan(Date value) {
            addCriterion("create_time <", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIn(List<Date> values) {
            addCriterion("create_time in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeEqualTo(Date value) {
            addCriterion("update_time =", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeGreaterThan(Date value) {
            addCriterion("update_time >", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeLessThan(Date value) {
            addCriterion("update_time <", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeIn(List<Date> values) {
            addCriterion("update_time in", values, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "update_time");
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