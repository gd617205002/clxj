package com.one.clxj.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrganizationExample {
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


    public OrganizationExample() {
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

        public Criteria andOrg_idIsNull() {
            addCriterion("org_id is null");
            return (Criteria) this;
        }

        public Criteria andOrg_idIsNotNull() {
            addCriterion("org_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrg_idEqualTo(Integer value) {
            addCriterion("org_id =", value, "org_id");
            return (Criteria) this;
        }

        public Criteria andOrg_idNotEqualTo(Integer value) {
            addCriterion("org_id <>", value, "org_id");
            return (Criteria) this;
        }

        public Criteria andOrg_idGreaterThan(Integer value) {
            addCriterion("org_id >", value, "org_id");
            return (Criteria) this;
        }

        public Criteria andOrg_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_id >=", value, "org_id");
            return (Criteria) this;
        }

        public Criteria andOrg_idLessThan(Integer value) {
            addCriterion("org_id <", value, "org_id");
            return (Criteria) this;
        }

        public Criteria andOrg_idLessThanOrEqualTo(Integer value) {
            addCriterion("org_id <=", value, "org_id");
            return (Criteria) this;
        }

        public Criteria andOrg_idIn(List<Integer> values) {
            addCriterion("org_id in", values, "org_id");
            return (Criteria) this;
        }

        public Criteria andOrg_idNotIn(List<Integer> values) {
            addCriterion("org_id not in", values, "org_id");
            return (Criteria) this;
        }

        public Criteria andOrg_idBetween(Integer value1, Integer value2) {
            addCriterion("org_id between", value1, value2, "org_id");
            return (Criteria) this;
        }

        public Criteria andOrg_idNotBetween(Integer value1, Integer value2) {
            addCriterion("org_id not between", value1, value2, "org_id");
            return (Criteria) this;
        }

        public Criteria andOrg_nameIsNull() {
            addCriterion("org_name is null");
            return (Criteria) this;
        }

        public Criteria andOrg_nameIsNotNull() {
            addCriterion("org_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrg_nameEqualTo(String value) {
            addCriterion("org_name =", value, "org_name");
            return (Criteria) this;
        }

        public Criteria andOrg_nameNotEqualTo(String value) {
            addCriterion("org_name <>", value, "org_name");
            return (Criteria) this;
        }

        public Criteria andOrg_nameGreaterThan(String value) {
            addCriterion("org_name >", value, "org_name");
            return (Criteria) this;
        }

        public Criteria andOrg_nameGreaterThanOrEqualTo(String value) {
            addCriterion("org_name >=", value, "org_name");
            return (Criteria) this;
        }

        public Criteria andOrg_nameLessThan(String value) {
            addCriterion("org_name <", value, "org_name");
            return (Criteria) this;
        }

        public Criteria andOrg_nameLessThanOrEqualTo(String value) {
            addCriterion("org_name <=", value, "org_name");
            return (Criteria) this;
        }

        public Criteria andOrg_nameLike(String value) {
            addCriterion("org_name like", value, "org_name");
            return (Criteria) this;
        }

        public Criteria andOrg_nameNotLike(String value) {
            addCriterion("org_name not like", value, "org_name");
            return (Criteria) this;
        }

        public Criteria andOrg_nameIn(List<String> values) {
            addCriterion("org_name in", values, "org_name");
            return (Criteria) this;
        }

        public Criteria andOrg_nameNotIn(List<String> values) {
            addCriterion("org_name not in", values, "org_name");
            return (Criteria) this;
        }

        public Criteria andOrg_nameBetween(String value1, String value2) {
            addCriterion("org_name between", value1, value2, "org_name");
            return (Criteria) this;
        }

        public Criteria andOrg_nameNotBetween(String value1, String value2) {
            addCriterion("org_name not between", value1, value2, "org_name");
            return (Criteria) this;
        }

        public Criteria andOrg_descriptionIsNull() {
            addCriterion("org_description is null");
            return (Criteria) this;
        }

        public Criteria andOrg_descriptionIsNotNull() {
            addCriterion("org_description is not null");
            return (Criteria) this;
        }

        public Criteria andOrg_descriptionEqualTo(String value) {
            addCriterion("org_description =", value, "org_description");
            return (Criteria) this;
        }

        public Criteria andOrg_descriptionNotEqualTo(String value) {
            addCriterion("org_description <>", value, "org_description");
            return (Criteria) this;
        }

        public Criteria andOrg_descriptionGreaterThan(String value) {
            addCriterion("org_description >", value, "org_description");
            return (Criteria) this;
        }

        public Criteria andOrg_descriptionGreaterThanOrEqualTo(String value) {
            addCriterion("org_description >=", value, "org_description");
            return (Criteria) this;
        }

        public Criteria andOrg_descriptionLessThan(String value) {
            addCriterion("org_description <", value, "org_description");
            return (Criteria) this;
        }

        public Criteria andOrg_descriptionLessThanOrEqualTo(String value) {
            addCriterion("org_description <=", value, "org_description");
            return (Criteria) this;
        }

        public Criteria andOrg_descriptionLike(String value) {
            addCriterion("org_description like", value, "org_description");
            return (Criteria) this;
        }

        public Criteria andOrg_descriptionNotLike(String value) {
            addCriterion("org_description not like", value, "org_description");
            return (Criteria) this;
        }

        public Criteria andOrg_descriptionIn(List<String> values) {
            addCriterion("org_description in", values, "org_description");
            return (Criteria) this;
        }

        public Criteria andOrg_descriptionNotIn(List<String> values) {
            addCriterion("org_description not in", values, "org_description");
            return (Criteria) this;
        }

        public Criteria andOrg_descriptionBetween(String value1, String value2) {
            addCriterion("org_description between", value1, value2, "org_description");
            return (Criteria) this;
        }

        public Criteria andOrg_descriptionNotBetween(String value1, String value2) {
            addCriterion("org_description not between", value1, value2, "org_description");
            return (Criteria) this;
        }

        public Criteria andOrg_managerIsNull() {
            addCriterion("org_manager is null");
            return (Criteria) this;
        }

        public Criteria andOrg_managerIsNotNull() {
            addCriterion("org_manager is not null");
            return (Criteria) this;
        }

        public Criteria andOrg_managerEqualTo(String value) {
            addCriterion("org_manager =", value, "org_manager");
            return (Criteria) this;
        }

        public Criteria andOrg_managerNotEqualTo(String value) {
            addCriterion("org_manager <>", value, "org_manager");
            return (Criteria) this;
        }

        public Criteria andOrg_managerGreaterThan(String value) {
            addCriterion("org_manager >", value, "org_manager");
            return (Criteria) this;
        }

        public Criteria andOrg_managerGreaterThanOrEqualTo(String value) {
            addCriterion("org_manager >=", value, "org_manager");
            return (Criteria) this;
        }

        public Criteria andOrg_managerLessThan(String value) {
            addCriterion("org_manager <", value, "org_manager");
            return (Criteria) this;
        }

        public Criteria andOrg_managerLessThanOrEqualTo(String value) {
            addCriterion("org_manager <=", value, "org_manager");
            return (Criteria) this;
        }

        public Criteria andOrg_managerLike(String value) {
            addCriterion("org_manager like", value, "org_manager");
            return (Criteria) this;
        }

        public Criteria andOrg_managerNotLike(String value) {
            addCriterion("org_manager not like", value, "org_manager");
            return (Criteria) this;
        }

        public Criteria andOrg_managerIn(List<String> values) {
            addCriterion("org_manager in", values, "org_manager");
            return (Criteria) this;
        }

        public Criteria andOrg_managerNotIn(List<String> values) {
            addCriterion("org_manager not in", values, "org_manager");
            return (Criteria) this;
        }

        public Criteria andOrg_managerBetween(String value1, String value2) {
            addCriterion("org_manager between", value1, value2, "org_manager");
            return (Criteria) this;
        }

        public Criteria andOrg_managerNotBetween(String value1, String value2) {
            addCriterion("org_manager not between", value1, value2, "org_manager");
            return (Criteria) this;
        }

        public Criteria andOrg_phoneIsNull() {
            addCriterion("org_phone is null");
            return (Criteria) this;
        }

        public Criteria andOrg_phoneIsNotNull() {
            addCriterion("org_phone is not null");
            return (Criteria) this;
        }

        public Criteria andOrg_phoneEqualTo(String value) {
            addCriterion("org_phone =", value, "org_phone");
            return (Criteria) this;
        }

        public Criteria andOrg_phoneNotEqualTo(String value) {
            addCriterion("org_phone <>", value, "org_phone");
            return (Criteria) this;
        }

        public Criteria andOrg_phoneGreaterThan(String value) {
            addCriterion("org_phone >", value, "org_phone");
            return (Criteria) this;
        }

        public Criteria andOrg_phoneGreaterThanOrEqualTo(String value) {
            addCriterion("org_phone >=", value, "org_phone");
            return (Criteria) this;
        }

        public Criteria andOrg_phoneLessThan(String value) {
            addCriterion("org_phone <", value, "org_phone");
            return (Criteria) this;
        }

        public Criteria andOrg_phoneLessThanOrEqualTo(String value) {
            addCriterion("org_phone <=", value, "org_phone");
            return (Criteria) this;
        }

        public Criteria andOrg_phoneLike(String value) {
            addCriterion("org_phone like", value, "org_phone");
            return (Criteria) this;
        }

        public Criteria andOrg_phoneNotLike(String value) {
            addCriterion("org_phone not like", value, "org_phone");
            return (Criteria) this;
        }

        public Criteria andOrg_phoneIn(List<String> values) {
            addCriterion("org_phone in", values, "org_phone");
            return (Criteria) this;
        }

        public Criteria andOrg_phoneNotIn(List<String> values) {
            addCriterion("org_phone not in", values, "org_phone");
            return (Criteria) this;
        }

        public Criteria andOrg_phoneBetween(String value1, String value2) {
            addCriterion("org_phone between", value1, value2, "org_phone");
            return (Criteria) this;
        }

        public Criteria andOrg_phoneNotBetween(String value1, String value2) {
            addCriterion("org_phone not between", value1, value2, "org_phone");
            return (Criteria) this;
        }

        public Criteria andOrg_parentidIsNull() {
            addCriterion("org_parentid is null");
            return (Criteria) this;
        }

        public Criteria andOrg_parentidIsNotNull() {
            addCriterion("org_parentid is not null");
            return (Criteria) this;
        }

        public Criteria andOrg_parentidEqualTo(Integer value) {
            addCriterion("org_parentid =", value, "org_parentid");
            return (Criteria) this;
        }

        public Criteria andOrg_parentidNotEqualTo(Integer value) {
            addCriterion("org_parentid <>", value, "org_parentid");
            return (Criteria) this;
        }

        public Criteria andOrg_parentidGreaterThan(Integer value) {
            addCriterion("org_parentid >", value, "org_parentid");
            return (Criteria) this;
        }

        public Criteria andOrg_parentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_parentid >=", value, "org_parentid");
            return (Criteria) this;
        }

        public Criteria andOrg_parentidLessThan(Integer value) {
            addCriterion("org_parentid <", value, "org_parentid");
            return (Criteria) this;
        }

        public Criteria andOrg_parentidLessThanOrEqualTo(Integer value) {
            addCriterion("org_parentid <=", value, "org_parentid");
            return (Criteria) this;
        }

        public Criteria andOrg_parentidIn(List<Integer> values) {
            addCriterion("org_parentid in", values, "org_parentid");
            return (Criteria) this;
        }

        public Criteria andOrg_parentidNotIn(List<Integer> values) {
            addCriterion("org_parentid not in", values, "org_parentid");
            return (Criteria) this;
        }

        public Criteria andOrg_parentidBetween(Integer value1, Integer value2) {
            addCriterion("org_parentid between", value1, value2, "org_parentid");
            return (Criteria) this;
        }

        public Criteria andOrg_parentidNotBetween(Integer value1, Integer value2) {
            addCriterion("org_parentid not between", value1, value2, "org_parentid");
            return (Criteria) this;
        }

        public Criteria andOrg_establishTimeIsNull() {
            addCriterion("org_establishTime is null");
            return (Criteria) this;
        }

        public Criteria andOrg_establishTimeIsNotNull() {
            addCriterion("org_establishTime is not null");
            return (Criteria) this;
        }

        public Criteria andOrg_establishTimeEqualTo(Date value) {
            addCriterion("org_establishTime =", value, "org_establishTime");
            return (Criteria) this;
        }

        public Criteria andOrg_establishTimeNotEqualTo(Date value) {
            addCriterion("org_establishTime <>", value, "org_establishTime");
            return (Criteria) this;
        }

        public Criteria andOrg_establishTimeGreaterThan(Date value) {
            addCriterion("org_establishTime >", value, "org_establishTime");
            return (Criteria) this;
        }

        public Criteria andOrg_establishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("org_establishTime >=", value, "org_establishTime");
            return (Criteria) this;
        }

        public Criteria andOrg_establishTimeLessThan(Date value) {
            addCriterion("org_establishTime <", value, "org_establishTime");
            return (Criteria) this;
        }

        public Criteria andOrg_establishTimeLessThanOrEqualTo(Date value) {
            addCriterion("org_establishTime <=", value, "org_establishTime");
            return (Criteria) this;
        }

        public Criteria andOrg_establishTimeIn(List<Date> values) {
            addCriterion("org_establishTime in", values, "org_establishTime");
            return (Criteria) this;
        }

        public Criteria andOrg_establishTimeNotIn(List<Date> values) {
            addCriterion("org_establishTime not in", values, "org_establishTime");
            return (Criteria) this;
        }

        public Criteria andOrg_establishTimeBetween(Date value1, Date value2) {
            addCriterion("org_establishTime between", value1, value2, "org_establishTime");
            return (Criteria) this;
        }

        public Criteria andOrg_establishTimeNotBetween(Date value1, Date value2) {
            addCriterion("org_establishTime not between", value1, value2, "org_establishTime");
            return (Criteria) this;
        }

        public Criteria andOrg_pathIsNull() {
            addCriterion("org_path is null");
            return (Criteria) this;
        }

        public Criteria andOrg_pathIsNotNull() {
            addCriterion("org_path is not null");
            return (Criteria) this;
        }

        public Criteria andOrg_pathEqualTo(String value) {
            addCriterion("org_path =", value, "org_path");
            return (Criteria) this;
        }

        public Criteria andOrg_pathNotEqualTo(String value) {
            addCriterion("org_path <>", value, "org_path");
            return (Criteria) this;
        }

        public Criteria andOrg_pathGreaterThan(String value) {
            addCriterion("org_path >", value, "org_path");
            return (Criteria) this;
        }

        public Criteria andOrg_pathGreaterThanOrEqualTo(String value) {
            addCriterion("org_path >=", value, "org_path");
            return (Criteria) this;
        }

        public Criteria andOrg_pathLessThan(String value) {
            addCriterion("org_path <", value, "org_path");
            return (Criteria) this;
        }

        public Criteria andOrg_pathLessThanOrEqualTo(String value) {
            addCriterion("org_path <=", value, "org_path");
            return (Criteria) this;
        }

        public Criteria andOrg_pathLike(String value) {
            addCriterion("org_path like", value, "org_path");
            return (Criteria) this;
        }

        public Criteria andOrg_pathNotLike(String value) {
            addCriterion("org_path not like", value, "org_path");
            return (Criteria) this;
        }

        public Criteria andOrg_pathIn(List<String> values) {
            addCriterion("org_path in", values, "org_path");
            return (Criteria) this;
        }

        public Criteria andOrg_pathNotIn(List<String> values) {
            addCriterion("org_path not in", values, "org_path");
            return (Criteria) this;
        }

        public Criteria andOrg_pathBetween(String value1, String value2) {
            addCriterion("org_path between", value1, value2, "org_path");
            return (Criteria) this;
        }

        public Criteria andOrg_pathNotBetween(String value1, String value2) {
            addCriterion("org_path not between", value1, value2, "org_path");
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