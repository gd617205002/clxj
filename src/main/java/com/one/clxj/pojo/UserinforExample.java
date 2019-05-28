package com.one.clxj.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserinforExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer currPage; //当前页位置

    protected Integer limit; //记录数

    public Integer getCurrPage() {
        return currPage;
    }

    public void setCurrPage(Integer currPage) {
        this.currPage = currPage;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }


    public UserinforExample() {
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

        public Criteria andUser_nameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUser_nameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUser_nameEqualTo(String value) {
            addCriterion("user_name =", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameGreaterThan(String value) {
            addCriterion("user_name >", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameLessThan(String value) {
            addCriterion("user_name <", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameLike(String value) {
            addCriterion("user_name like", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameNotLike(String value) {
            addCriterion("user_name not like", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameIn(List<String> values) {
            addCriterion("user_name in", values, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_sexIsNull() {
            addCriterion("user_sex is null");
            return (Criteria) this;
        }

        public Criteria andUser_sexIsNotNull() {
            addCriterion("user_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUser_sexEqualTo(Boolean value) {
            addCriterion("user_sex =", value, "user_sex");
            return (Criteria) this;
        }

        public Criteria andUser_sexNotEqualTo(Boolean value) {
            addCriterion("user_sex <>", value, "user_sex");
            return (Criteria) this;
        }

        public Criteria andUser_sexGreaterThan(Boolean value) {
            addCriterion("user_sex >", value, "user_sex");
            return (Criteria) this;
        }

        public Criteria andUser_sexGreaterThanOrEqualTo(Boolean value) {
            addCriterion("user_sex >=", value, "user_sex");
            return (Criteria) this;
        }

        public Criteria andUser_sexLessThan(Boolean value) {
            addCriterion("user_sex <", value, "user_sex");
            return (Criteria) this;
        }

        public Criteria andUser_sexLessThanOrEqualTo(Boolean value) {
            addCriterion("user_sex <=", value, "user_sex");
            return (Criteria) this;
        }

        public Criteria andUser_sexIn(List<Boolean> values) {
            addCriterion("user_sex in", values, "user_sex");
            return (Criteria) this;
        }

        public Criteria andUser_sexNotIn(List<Boolean> values) {
            addCriterion("user_sex not in", values, "user_sex");
            return (Criteria) this;
        }

        public Criteria andUser_sexBetween(Boolean value1, Boolean value2) {
            addCriterion("user_sex between", value1, value2, "user_sex");
            return (Criteria) this;
        }

        public Criteria andUser_sexNotBetween(Boolean value1, Boolean value2) {
            addCriterion("user_sex not between", value1, value2, "user_sex");
            return (Criteria) this;
        }

        public Criteria andUser_workIsNull() {
            addCriterion("user_work is null");
            return (Criteria) this;
        }

        public Criteria andUser_workIsNotNull() {
            addCriterion("user_work is not null");
            return (Criteria) this;
        }

        public Criteria andUser_workEqualTo(String value) {
            addCriterion("user_work =", value, "user_work");
            return (Criteria) this;
        }

        public Criteria andUser_workNotEqualTo(String value) {
            addCriterion("user_work <>", value, "user_work");
            return (Criteria) this;
        }

        public Criteria andUser_workGreaterThan(String value) {
            addCriterion("user_work >", value, "user_work");
            return (Criteria) this;
        }

        public Criteria andUser_workGreaterThanOrEqualTo(String value) {
            addCriterion("user_work >=", value, "user_work");
            return (Criteria) this;
        }

        public Criteria andUser_workLessThan(String value) {
            addCriterion("user_work <", value, "user_work");
            return (Criteria) this;
        }

        public Criteria andUser_workLessThanOrEqualTo(String value) {
            addCriterion("user_work <=", value, "user_work");
            return (Criteria) this;
        }

        public Criteria andUser_workLike(String value) {
            addCriterion("user_work like", value, "user_work");
            return (Criteria) this;
        }

        public Criteria andUser_workNotLike(String value) {
            addCriterion("user_work not like", value, "user_work");
            return (Criteria) this;
        }

        public Criteria andUser_workIn(List<String> values) {
            addCriterion("user_work in", values, "user_work");
            return (Criteria) this;
        }

        public Criteria andUser_workNotIn(List<String> values) {
            addCriterion("user_work not in", values, "user_work");
            return (Criteria) this;
        }

        public Criteria andUser_workBetween(String value1, String value2) {
            addCriterion("user_work between", value1, value2, "user_work");
            return (Criteria) this;
        }

        public Criteria andUser_workNotBetween(String value1, String value2) {
            addCriterion("user_work not between", value1, value2, "user_work");
            return (Criteria) this;
        }

        public Criteria andUser_contactIsNull() {
            addCriterion("user_contact is null");
            return (Criteria) this;
        }

        public Criteria andUser_contactIsNotNull() {
            addCriterion("user_contact is not null");
            return (Criteria) this;
        }

        public Criteria andUser_contactEqualTo(String value) {
            addCriterion("user_contact =", value, "user_contact");
            return (Criteria) this;
        }

        public Criteria andUser_contactNotEqualTo(String value) {
            addCriterion("user_contact <>", value, "user_contact");
            return (Criteria) this;
        }

        public Criteria andUser_contactGreaterThan(String value) {
            addCriterion("user_contact >", value, "user_contact");
            return (Criteria) this;
        }

        public Criteria andUser_contactGreaterThanOrEqualTo(String value) {
            addCriterion("user_contact >=", value, "user_contact");
            return (Criteria) this;
        }

        public Criteria andUser_contactLessThan(String value) {
            addCriterion("user_contact <", value, "user_contact");
            return (Criteria) this;
        }

        public Criteria andUser_contactLessThanOrEqualTo(String value) {
            addCriterion("user_contact <=", value, "user_contact");
            return (Criteria) this;
        }

        public Criteria andUser_contactLike(String value) {
            addCriterion("user_contact like", value, "user_contact");
            return (Criteria) this;
        }

        public Criteria andUser_contactNotLike(String value) {
            addCriterion("user_contact not like", value, "user_contact");
            return (Criteria) this;
        }

        public Criteria andUser_contactIn(List<String> values) {
            addCriterion("user_contact in", values, "user_contact");
            return (Criteria) this;
        }

        public Criteria andUser_contactNotIn(List<String> values) {
            addCriterion("user_contact not in", values, "user_contact");
            return (Criteria) this;
        }

        public Criteria andUser_contactBetween(String value1, String value2) {
            addCriterion("user_contact between", value1, value2, "user_contact");
            return (Criteria) this;
        }

        public Criteria andUser_contactNotBetween(String value1, String value2) {
            addCriterion("user_contact not between", value1, value2, "user_contact");
            return (Criteria) this;
        }

        public Criteria andUser_addressIsNull() {
            addCriterion("user_address is null");
            return (Criteria) this;
        }

        public Criteria andUser_addressIsNotNull() {
            addCriterion("user_address is not null");
            return (Criteria) this;
        }

        public Criteria andUser_addressEqualTo(String value) {
            addCriterion("user_address =", value, "user_address");
            return (Criteria) this;
        }

        public Criteria andUser_addressNotEqualTo(String value) {
            addCriterion("user_address <>", value, "user_address");
            return (Criteria) this;
        }

        public Criteria andUser_addressGreaterThan(String value) {
            addCriterion("user_address >", value, "user_address");
            return (Criteria) this;
        }

        public Criteria andUser_addressGreaterThanOrEqualTo(String value) {
            addCriterion("user_address >=", value, "user_address");
            return (Criteria) this;
        }

        public Criteria andUser_addressLessThan(String value) {
            addCriterion("user_address <", value, "user_address");
            return (Criteria) this;
        }

        public Criteria andUser_addressLessThanOrEqualTo(String value) {
            addCriterion("user_address <=", value, "user_address");
            return (Criteria) this;
        }

        public Criteria andUser_addressLike(String value) {
            addCriterion("user_address like", value, "user_address");
            return (Criteria) this;
        }

        public Criteria andUser_addressNotLike(String value) {
            addCriterion("user_address not like", value, "user_address");
            return (Criteria) this;
        }

        public Criteria andUser_addressIn(List<String> values) {
            addCriterion("user_address in", values, "user_address");
            return (Criteria) this;
        }

        public Criteria andUser_addressNotIn(List<String> values) {
            addCriterion("user_address not in", values, "user_address");
            return (Criteria) this;
        }

        public Criteria andUser_addressBetween(String value1, String value2) {
            addCriterion("user_address between", value1, value2, "user_address");
            return (Criteria) this;
        }

        public Criteria andUser_addressNotBetween(String value1, String value2) {
            addCriterion("user_address not between", value1, value2, "user_address");
            return (Criteria) this;
        }

        public Criteria andUser_marriageIsNull() {
            addCriterion("user_marriage is null");
            return (Criteria) this;
        }

        public Criteria andUser_marriageIsNotNull() {
            addCriterion("user_marriage is not null");
            return (Criteria) this;
        }

        public Criteria andUser_marriageEqualTo(Boolean value) {
            addCriterion("user_marriage =", value, "user_marriage");
            return (Criteria) this;
        }

        public Criteria andUser_marriageNotEqualTo(Boolean value) {
            addCriterion("user_marriage <>", value, "user_marriage");
            return (Criteria) this;
        }

        public Criteria andUser_marriageGreaterThan(Boolean value) {
            addCriterion("user_marriage >", value, "user_marriage");
            return (Criteria) this;
        }

        public Criteria andUser_marriageGreaterThanOrEqualTo(Boolean value) {
            addCriterion("user_marriage >=", value, "user_marriage");
            return (Criteria) this;
        }

        public Criteria andUser_marriageLessThan(Boolean value) {
            addCriterion("user_marriage <", value, "user_marriage");
            return (Criteria) this;
        }

        public Criteria andUser_marriageLessThanOrEqualTo(Boolean value) {
            addCriterion("user_marriage <=", value, "user_marriage");
            return (Criteria) this;
        }

        public Criteria andUser_marriageIn(List<Boolean> values) {
            addCriterion("user_marriage in", values, "user_marriage");
            return (Criteria) this;
        }

        public Criteria andUser_marriageNotIn(List<Boolean> values) {
            addCriterion("user_marriage not in", values, "user_marriage");
            return (Criteria) this;
        }

        public Criteria andUser_marriageBetween(Boolean value1, Boolean value2) {
            addCriterion("user_marriage between", value1, value2, "user_marriage");
            return (Criteria) this;
        }

        public Criteria andUser_marriageNotBetween(Boolean value1, Boolean value2) {
            addCriterion("user_marriage not between", value1, value2, "user_marriage");
            return (Criteria) this;
        }

        public Criteria andUser_departmentIsNull() {
            addCriterion("user_department is null");
            return (Criteria) this;
        }

        public Criteria andUser_departmentIsNotNull() {
            addCriterion("user_department is not null");
            return (Criteria) this;
        }

        public Criteria andUser_departmentEqualTo(Integer value) {
            addCriterion("user_department =", value, "user_department");
            return (Criteria) this;
        }

        public Criteria andUser_departmentNotEqualTo(Integer value) {
            addCriterion("user_department <>", value, "user_department");
            return (Criteria) this;
        }

        public Criteria andUser_departmentGreaterThan(Integer value) {
            addCriterion("user_department >", value, "user_department");
            return (Criteria) this;
        }

        public Criteria andUser_departmentGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_department >=", value, "user_department");
            return (Criteria) this;
        }

        public Criteria andUser_departmentLessThan(Integer value) {
            addCriterion("user_department <", value, "user_department");
            return (Criteria) this;
        }

        public Criteria andUser_departmentLessThanOrEqualTo(Integer value) {
            addCriterion("user_department <=", value, "user_department");
            return (Criteria) this;
        }

        public Criteria andUser_departmentIn(List<Integer> values) {
            addCriterion("user_department in", values, "user_department");
            return (Criteria) this;
        }

        public Criteria andUser_departmentNotIn(List<Integer> values) {
            addCriterion("user_department not in", values, "user_department");
            return (Criteria) this;
        }

        public Criteria andUser_departmentBetween(Integer value1, Integer value2) {
            addCriterion("user_department between", value1, value2, "user_department");
            return (Criteria) this;
        }

        public Criteria andUser_departmentNotBetween(Integer value1, Integer value2) {
            addCriterion("user_department not between", value1, value2, "user_department");
            return (Criteria) this;
        }

        public Criteria andUser_employTimeIsNull() {
            addCriterion("user_employTime is null");
            return (Criteria) this;
        }

        public Criteria andUser_employTimeIsNotNull() {
            addCriterion("user_employTime is not null");
            return (Criteria) this;
        }

        public Criteria andUser_employTimeEqualTo(Date value) {
            addCriterion("user_employTime =", value, "user_employTime");
            return (Criteria) this;
        }

        public Criteria andUser_employTimeNotEqualTo(Date value) {
            addCriterion("user_employTime <>", value, "user_employTime");
            return (Criteria) this;
        }

        public Criteria andUser_employTimeGreaterThan(Date value) {
            addCriterion("user_employTime >", value, "user_employTime");
            return (Criteria) this;
        }

        public Criteria andUser_employTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_employTime >=", value, "user_employTime");
            return (Criteria) this;
        }

        public Criteria andUser_employTimeLessThan(Date value) {
            addCriterion("user_employTime <", value, "user_employTime");
            return (Criteria) this;
        }

        public Criteria andUser_employTimeLessThanOrEqualTo(Date value) {
            addCriterion("user_employTime <=", value, "user_employTime");
            return (Criteria) this;
        }

        public Criteria andUser_employTimeIn(List<Date> values) {
            addCriterion("user_employTime in", values, "user_employTime");
            return (Criteria) this;
        }

        public Criteria andUser_employTimeNotIn(List<Date> values) {
            addCriterion("user_employTime not in", values, "user_employTime");
            return (Criteria) this;
        }

        public Criteria andUser_employTimeBetween(Date value1, Date value2) {
            addCriterion("user_employTime between", value1, value2, "user_employTime");
            return (Criteria) this;
        }

        public Criteria andUser_employTimeNotBetween(Date value1, Date value2) {
            addCriterion("user_employTime not between", value1, value2, "user_employTime");
            return (Criteria) this;
        }

        public Criteria andUser_passwordIsNull() {
            addCriterion("user_password is null");
            return (Criteria) this;
        }

        public Criteria andUser_passwordIsNotNull() {
            addCriterion("user_password is not null");
            return (Criteria) this;
        }

        public Criteria andUser_passwordEqualTo(String value) {
            addCriterion("user_password =", value, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordNotEqualTo(String value) {
            addCriterion("user_password <>", value, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordGreaterThan(String value) {
            addCriterion("user_password >", value, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordGreaterThanOrEqualTo(String value) {
            addCriterion("user_password >=", value, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordLessThan(String value) {
            addCriterion("user_password <", value, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordLessThanOrEqualTo(String value) {
            addCriterion("user_password <=", value, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordLike(String value) {
            addCriterion("user_password like", value, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordNotLike(String value) {
            addCriterion("user_password not like", value, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordIn(List<String> values) {
            addCriterion("user_password in", values, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordNotIn(List<String> values) {
            addCriterion("user_password not in", values, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordBetween(String value1, String value2) {
            addCriterion("user_password between", value1, value2, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordNotBetween(String value1, String value2) {
            addCriterion("user_password not between", value1, value2, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_educationIsNull() {
            addCriterion("user_education is null");
            return (Criteria) this;
        }

        public Criteria andUser_educationIsNotNull() {
            addCriterion("user_education is not null");
            return (Criteria) this;
        }

        public Criteria andUser_educationEqualTo(String value) {
            addCriterion("user_education =", value, "user_education");
            return (Criteria) this;
        }

        public Criteria andUser_educationNotEqualTo(String value) {
            addCriterion("user_education <>", value, "user_education");
            return (Criteria) this;
        }

        public Criteria andUser_educationGreaterThan(String value) {
            addCriterion("user_education >", value, "user_education");
            return (Criteria) this;
        }

        public Criteria andUser_educationGreaterThanOrEqualTo(String value) {
            addCriterion("user_education >=", value, "user_education");
            return (Criteria) this;
        }

        public Criteria andUser_educationLessThan(String value) {
            addCriterion("user_education <", value, "user_education");
            return (Criteria) this;
        }

        public Criteria andUser_educationLessThanOrEqualTo(String value) {
            addCriterion("user_education <=", value, "user_education");
            return (Criteria) this;
        }

        public Criteria andUser_educationLike(String value) {
            addCriterion("user_education like", value, "user_education");
            return (Criteria) this;
        }

        public Criteria andUser_educationNotLike(String value) {
            addCriterion("user_education not like", value, "user_education");
            return (Criteria) this;
        }

        public Criteria andUser_educationIn(List<String> values) {
            addCriterion("user_education in", values, "user_education");
            return (Criteria) this;
        }

        public Criteria andUser_educationNotIn(List<String> values) {
            addCriterion("user_education not in", values, "user_education");
            return (Criteria) this;
        }

        public Criteria andUser_educationBetween(String value1, String value2) {
            addCriterion("user_education between", value1, value2, "user_education");
            return (Criteria) this;
        }

        public Criteria andUser_educationNotBetween(String value1, String value2) {
            addCriterion("user_education not between", value1, value2, "user_education");
            return (Criteria) this;
        }

        public Criteria andUser_loginNameIsNull() {
            addCriterion("user_loginName is null");
            return (Criteria) this;
        }

        public Criteria andUser_loginNameIsNotNull() {
            addCriterion("user_loginName is not null");
            return (Criteria) this;
        }

        public Criteria andUser_loginNameEqualTo(String value) {
            addCriterion("user_loginName =", value, "user_loginName");
            return (Criteria) this;
        }

        public Criteria andUser_loginNameNotEqualTo(String value) {
            addCriterion("user_loginName <>", value, "user_loginName");
            return (Criteria) this;
        }

        public Criteria andUser_loginNameGreaterThan(String value) {
            addCriterion("user_loginName >", value, "user_loginName");
            return (Criteria) this;
        }

        public Criteria andUser_loginNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_loginName >=", value, "user_loginName");
            return (Criteria) this;
        }

        public Criteria andUser_loginNameLessThan(String value) {
            addCriterion("user_loginName <", value, "user_loginName");
            return (Criteria) this;
        }

        public Criteria andUser_loginNameLessThanOrEqualTo(String value) {
            addCriterion("user_loginName <=", value, "user_loginName");
            return (Criteria) this;
        }

        public Criteria andUser_loginNameLike(String value) {
            addCriterion("user_loginName like", value, "user_loginName");
            return (Criteria) this;
        }

        public Criteria andUser_loginNameNotLike(String value) {
            addCriterion("user_loginName not like", value, "user_loginName");
            return (Criteria) this;
        }

        public Criteria andUser_loginNameIn(List<String> values) {
            addCriterion("user_loginName in", values, "user_loginName");
            return (Criteria) this;
        }

        public Criteria andUser_loginNameNotIn(List<String> values) {
            addCriterion("user_loginName not in", values, "user_loginName");
            return (Criteria) this;
        }

        public Criteria andUser_loginNameBetween(String value1, String value2) {
            addCriterion("user_loginName between", value1, value2, "user_loginName");
            return (Criteria) this;
        }

        public Criteria andUser_loginNameNotBetween(String value1, String value2) {
            addCriterion("user_loginName not between", value1, value2, "user_loginName");
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