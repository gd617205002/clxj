package com.one.clxj.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UploadfilesExample {
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


    public UploadfilesExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andFileIdIsNull() {
            addCriterion("FileId is null");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNotNull() {
            addCriterion("FileId is not null");
            return (Criteria) this;
        }

        public Criteria andFileIdEqualTo(Integer value) {
            addCriterion("FileId =", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotEqualTo(Integer value) {
            addCriterion("FileId <>", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThan(Integer value) {
            addCriterion("FileId >", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("FileId >=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThan(Integer value) {
            addCriterion("FileId <", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThanOrEqualTo(Integer value) {
            addCriterion("FileId <=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdIn(List<Integer> values) {
            addCriterion("FileId in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotIn(List<Integer> values) {
            addCriterion("FileId not in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdBetween(Integer value1, Integer value2) {
            addCriterion("FileId between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotBetween(Integer value1, Integer value2) {
            addCriterion("FileId not between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNull() {
            addCriterion("FileName is null");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNotNull() {
            addCriterion("FileName is not null");
            return (Criteria) this;
        }

        public Criteria andFileNameEqualTo(String value) {
            addCriterion("FileName =", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotEqualTo(String value) {
            addCriterion("FileName <>", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThan(String value) {
            addCriterion("FileName >", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("FileName >=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThan(String value) {
            addCriterion("FileName <", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThanOrEqualTo(String value) {
            addCriterion("FileName <=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLike(String value) {
            addCriterion("FileName like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotLike(String value) {
            addCriterion("FileName not like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameIn(List<String> values) {
            addCriterion("FileName in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotIn(List<String> values) {
            addCriterion("FileName not in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameBetween(String value1, String value2) {
            addCriterion("FileName between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotBetween(String value1, String value2) {
            addCriterion("FileName not between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileDescriptionIsNull() {
            addCriterion("FileDescription is null");
            return (Criteria) this;
        }

        public Criteria andFileDescriptionIsNotNull() {
            addCriterion("FileDescription is not null");
            return (Criteria) this;
        }

        public Criteria andFileDescriptionEqualTo(String value) {
            addCriterion("FileDescription =", value, "fileDescription");
            return (Criteria) this;
        }

        public Criteria andFileDescriptionNotEqualTo(String value) {
            addCriterion("FileDescription <>", value, "fileDescription");
            return (Criteria) this;
        }

        public Criteria andFileDescriptionGreaterThan(String value) {
            addCriterion("FileDescription >", value, "fileDescription");
            return (Criteria) this;
        }

        public Criteria andFileDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("FileDescription >=", value, "fileDescription");
            return (Criteria) this;
        }

        public Criteria andFileDescriptionLessThan(String value) {
            addCriterion("FileDescription <", value, "fileDescription");
            return (Criteria) this;
        }

        public Criteria andFileDescriptionLessThanOrEqualTo(String value) {
            addCriterion("FileDescription <=", value, "fileDescription");
            return (Criteria) this;
        }

        public Criteria andFileDescriptionLike(String value) {
            addCriterion("FileDescription like", value, "fileDescription");
            return (Criteria) this;
        }

        public Criteria andFileDescriptionNotLike(String value) {
            addCriterion("FileDescription not like", value, "fileDescription");
            return (Criteria) this;
        }

        public Criteria andFileDescriptionIn(List<String> values) {
            addCriterion("FileDescription in", values, "fileDescription");
            return (Criteria) this;
        }

        public Criteria andFileDescriptionNotIn(List<String> values) {
            addCriterion("FileDescription not in", values, "fileDescription");
            return (Criteria) this;
        }

        public Criteria andFileDescriptionBetween(String value1, String value2) {
            addCriterion("FileDescription between", value1, value2, "fileDescription");
            return (Criteria) this;
        }

        public Criteria andFileDescriptionNotBetween(String value1, String value2) {
            addCriterion("FileDescription not between", value1, value2, "fileDescription");
            return (Criteria) this;
        }

        public Criteria andFileCreateDateIsNull() {
            addCriterion("FileCreateDate is null");
            return (Criteria) this;
        }

        public Criteria andFileCreateDateIsNotNull() {
            addCriterion("FileCreateDate is not null");
            return (Criteria) this;
        }

        public Criteria andFileCreateDateEqualTo(Date value) {
            addCriterionForJDBCDate("FileCreateDate =", value, "fileCreateDate");
            return (Criteria) this;
        }

        public Criteria andFileCreateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("FileCreateDate <>", value, "fileCreateDate");
            return (Criteria) this;
        }

        public Criteria andFileCreateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("FileCreateDate >", value, "fileCreateDate");
            return (Criteria) this;
        }

        public Criteria andFileCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FileCreateDate >=", value, "fileCreateDate");
            return (Criteria) this;
        }

        public Criteria andFileCreateDateLessThan(Date value) {
            addCriterionForJDBCDate("FileCreateDate <", value, "fileCreateDate");
            return (Criteria) this;
        }

        public Criteria andFileCreateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FileCreateDate <=", value, "fileCreateDate");
            return (Criteria) this;
        }

        public Criteria andFileCreateDateIn(List<Date> values) {
            addCriterionForJDBCDate("FileCreateDate in", values, "fileCreateDate");
            return (Criteria) this;
        }

        public Criteria andFileCreateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("FileCreateDate not in", values, "fileCreateDate");
            return (Criteria) this;
        }

        public Criteria andFileCreateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FileCreateDate between", value1, value2, "fileCreateDate");
            return (Criteria) this;
        }

        public Criteria andFileCreateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FileCreateDate not between", value1, value2, "fileCreateDate");
            return (Criteria) this;
        }

        public Criteria andFileKindIsNull() {
            addCriterion("FileKind is null");
            return (Criteria) this;
        }

        public Criteria andFileKindIsNotNull() {
            addCriterion("FileKind is not null");
            return (Criteria) this;
        }

        public Criteria andFileKindEqualTo(String value) {
            addCriterion("FileKind =", value, "fileKind");
            return (Criteria) this;
        }

        public Criteria andFileKindNotEqualTo(String value) {
            addCriterion("FileKind <>", value, "fileKind");
            return (Criteria) this;
        }

        public Criteria andFileKindGreaterThan(String value) {
            addCriterion("FileKind >", value, "fileKind");
            return (Criteria) this;
        }

        public Criteria andFileKindGreaterThanOrEqualTo(String value) {
            addCriterion("FileKind >=", value, "fileKind");
            return (Criteria) this;
        }

        public Criteria andFileKindLessThan(String value) {
            addCriterion("FileKind <", value, "fileKind");
            return (Criteria) this;
        }

        public Criteria andFileKindLessThanOrEqualTo(String value) {
            addCriterion("FileKind <=", value, "fileKind");
            return (Criteria) this;
        }

        public Criteria andFileKindLike(String value) {
            addCriterion("FileKind like", value, "fileKind");
            return (Criteria) this;
        }

        public Criteria andFileKindNotLike(String value) {
            addCriterion("FileKind not like", value, "fileKind");
            return (Criteria) this;
        }

        public Criteria andFileKindIn(List<String> values) {
            addCriterion("FileKind in", values, "fileKind");
            return (Criteria) this;
        }

        public Criteria andFileKindNotIn(List<String> values) {
            addCriterion("FileKind not in", values, "fileKind");
            return (Criteria) this;
        }

        public Criteria andFileKindBetween(String value1, String value2) {
            addCriterion("FileKind between", value1, value2, "fileKind");
            return (Criteria) this;
        }

        public Criteria andFileKindNotBetween(String value1, String value2) {
            addCriterion("FileKind not between", value1, value2, "fileKind");
            return (Criteria) this;
        }

        public Criteria andFileModuleIsNull() {
            addCriterion("FileModule is null");
            return (Criteria) this;
        }

        public Criteria andFileModuleIsNotNull() {
            addCriterion("FileModule is not null");
            return (Criteria) this;
        }

        public Criteria andFileModuleEqualTo(String value) {
            addCriterion("FileModule =", value, "fileModule");
            return (Criteria) this;
        }

        public Criteria andFileModuleNotEqualTo(String value) {
            addCriterion("FileModule <>", value, "fileModule");
            return (Criteria) this;
        }

        public Criteria andFileModuleGreaterThan(String value) {
            addCriterion("FileModule >", value, "fileModule");
            return (Criteria) this;
        }

        public Criteria andFileModuleGreaterThanOrEqualTo(String value) {
            addCriterion("FileModule >=", value, "fileModule");
            return (Criteria) this;
        }

        public Criteria andFileModuleLessThan(String value) {
            addCriterion("FileModule <", value, "fileModule");
            return (Criteria) this;
        }

        public Criteria andFileModuleLessThanOrEqualTo(String value) {
            addCriterion("FileModule <=", value, "fileModule");
            return (Criteria) this;
        }

        public Criteria andFileModuleLike(String value) {
            addCriterion("FileModule like", value, "fileModule");
            return (Criteria) this;
        }

        public Criteria andFileModuleNotLike(String value) {
            addCriterion("FileModule not like", value, "fileModule");
            return (Criteria) this;
        }

        public Criteria andFileModuleIn(List<String> values) {
            addCriterion("FileModule in", values, "fileModule");
            return (Criteria) this;
        }

        public Criteria andFileModuleNotIn(List<String> values) {
            addCriterion("FileModule not in", values, "fileModule");
            return (Criteria) this;
        }

        public Criteria andFileModuleBetween(String value1, String value2) {
            addCriterion("FileModule between", value1, value2, "fileModule");
            return (Criteria) this;
        }

        public Criteria andFileModuleNotBetween(String value1, String value2) {
            addCriterion("FileModule not between", value1, value2, "fileModule");
            return (Criteria) this;
        }

        public Criteria andTargetFileNameIsNull() {
            addCriterion("targetFileName is null");
            return (Criteria) this;
        }

        public Criteria andTargetFileNameIsNotNull() {
            addCriterion("targetFileName is not null");
            return (Criteria) this;
        }

        public Criteria andTargetFileNameEqualTo(String value) {
            addCriterion("targetFileName =", value, "targetFileName");
            return (Criteria) this;
        }

        public Criteria andTargetFileNameNotEqualTo(String value) {
            addCriterion("targetFileName <>", value, "targetFileName");
            return (Criteria) this;
        }

        public Criteria andTargetFileNameGreaterThan(String value) {
            addCriterion("targetFileName >", value, "targetFileName");
            return (Criteria) this;
        }

        public Criteria andTargetFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("targetFileName >=", value, "targetFileName");
            return (Criteria) this;
        }

        public Criteria andTargetFileNameLessThan(String value) {
            addCriterion("targetFileName <", value, "targetFileName");
            return (Criteria) this;
        }

        public Criteria andTargetFileNameLessThanOrEqualTo(String value) {
            addCriterion("targetFileName <=", value, "targetFileName");
            return (Criteria) this;
        }

        public Criteria andTargetFileNameLike(String value) {
            addCriterion("targetFileName like", value, "targetFileName");
            return (Criteria) this;
        }

        public Criteria andTargetFileNameNotLike(String value) {
            addCriterion("targetFileName not like", value, "targetFileName");
            return (Criteria) this;
        }

        public Criteria andTargetFileNameIn(List<String> values) {
            addCriterion("targetFileName in", values, "targetFileName");
            return (Criteria) this;
        }

        public Criteria andTargetFileNameNotIn(List<String> values) {
            addCriterion("targetFileName not in", values, "targetFileName");
            return (Criteria) this;
        }

        public Criteria andTargetFileNameBetween(String value1, String value2) {
            addCriterion("targetFileName between", value1, value2, "targetFileName");
            return (Criteria) this;
        }

        public Criteria andTargetFileNameNotBetween(String value1, String value2) {
            addCriterion("targetFileName not between", value1, value2, "targetFileName");
            return (Criteria) this;
        }

        public Criteria andFileTypeIsNull() {
            addCriterion("FileType is null");
            return (Criteria) this;
        }

        public Criteria andFileTypeIsNotNull() {
            addCriterion("FileType is not null");
            return (Criteria) this;
        }

        public Criteria andFileTypeEqualTo(String value) {
            addCriterion("FileType =", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotEqualTo(String value) {
            addCriterion("FileType <>", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeGreaterThan(String value) {
            addCriterion("FileType >", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeGreaterThanOrEqualTo(String value) {
            addCriterion("FileType >=", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLessThan(String value) {
            addCriterion("FileType <", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLessThanOrEqualTo(String value) {
            addCriterion("FileType <=", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLike(String value) {
            addCriterion("FileType like", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotLike(String value) {
            addCriterion("FileType not like", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeIn(List<String> values) {
            addCriterion("FileType in", values, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotIn(List<String> values) {
            addCriterion("FileType not in", values, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeBetween(String value1, String value2) {
            addCriterion("FileType between", value1, value2, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotBetween(String value1, String value2) {
            addCriterion("FileType not between", value1, value2, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileSizeIsNull() {
            addCriterion("FileSize is null");
            return (Criteria) this;
        }

        public Criteria andFileSizeIsNotNull() {
            addCriterion("FileSize is not null");
            return (Criteria) this;
        }

        public Criteria andFileSizeEqualTo(Integer value) {
            addCriterion("FileSize =", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotEqualTo(Integer value) {
            addCriterion("FileSize <>", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeGreaterThan(Integer value) {
            addCriterion("FileSize >", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("FileSize >=", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeLessThan(Integer value) {
            addCriterion("FileSize <", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeLessThanOrEqualTo(Integer value) {
            addCriterion("FileSize <=", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeIn(List<Integer> values) {
            addCriterion("FileSize in", values, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotIn(List<Integer> values) {
            addCriterion("FileSize not in", values, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeBetween(Integer value1, Integer value2) {
            addCriterion("FileSize between", value1, value2, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("FileSize not between", value1, value2, "fileSize");
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