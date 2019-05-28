package com.one.clxj.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClxjmainExample {
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


    public ClxjmainExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andType1IsNull() {
            addCriterion("type1 is null");
            return (Criteria) this;
        }

        public Criteria andType1IsNotNull() {
            addCriterion("type1 is not null");
            return (Criteria) this;
        }

        public Criteria andType1EqualTo(Integer value) {
            addCriterion("type1 =", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1NotEqualTo(Integer value) {
            addCriterion("type1 <>", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1GreaterThan(Integer value) {
            addCriterion("type1 >", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1GreaterThanOrEqualTo(Integer value) {
            addCriterion("type1 >=", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1LessThan(Integer value) {
            addCriterion("type1 <", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1LessThanOrEqualTo(Integer value) {
            addCriterion("type1 <=", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1In(List<Integer> values) {
            addCriterion("type1 in", values, "type1");
            return (Criteria) this;
        }

        public Criteria andType1NotIn(List<Integer> values) {
            addCriterion("type1 not in", values, "type1");
            return (Criteria) this;
        }

        public Criteria andType1Between(Integer value1, Integer value2) {
            addCriterion("type1 between", value1, value2, "type1");
            return (Criteria) this;
        }

        public Criteria andType1NotBetween(Integer value1, Integer value2) {
            addCriterion("type1 not between", value1, value2, "type1");
            return (Criteria) this;
        }

        public Criteria andType2IsNull() {
            addCriterion("type2 is null");
            return (Criteria) this;
        }

        public Criteria andType2IsNotNull() {
            addCriterion("type2 is not null");
            return (Criteria) this;
        }

        public Criteria andType2EqualTo(Integer value) {
            addCriterion("type2 =", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2NotEqualTo(Integer value) {
            addCriterion("type2 <>", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2GreaterThan(Integer value) {
            addCriterion("type2 >", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2GreaterThanOrEqualTo(Integer value) {
            addCriterion("type2 >=", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2LessThan(Integer value) {
            addCriterion("type2 <", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2LessThanOrEqualTo(Integer value) {
            addCriterion("type2 <=", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2In(List<Integer> values) {
            addCriterion("type2 in", values, "type2");
            return (Criteria) this;
        }

        public Criteria andType2NotIn(List<Integer> values) {
            addCriterion("type2 not in", values, "type2");
            return (Criteria) this;
        }

        public Criteria andType2Between(Integer value1, Integer value2) {
            addCriterion("type2 between", value1, value2, "type2");
            return (Criteria) this;
        }

        public Criteria andType2NotBetween(Integer value1, Integer value2) {
            addCriterion("type2 not between", value1, value2, "type2");
            return (Criteria) this;
        }

        public Criteria andBelong_cityIsNull() {
            addCriterion("belong_city is null");
            return (Criteria) this;
        }

        public Criteria andBelong_cityIsNotNull() {
            addCriterion("belong_city is not null");
            return (Criteria) this;
        }

        public Criteria andBelong_cityEqualTo(String value) {
            addCriterion("belong_city =", value, "belong_city");
            return (Criteria) this;
        }

        public Criteria andBelong_cityNotEqualTo(String value) {
            addCriterion("belong_city <>", value, "belong_city");
            return (Criteria) this;
        }

        public Criteria andBelong_cityGreaterThan(String value) {
            addCriterion("belong_city >", value, "belong_city");
            return (Criteria) this;
        }

        public Criteria andBelong_cityGreaterThanOrEqualTo(String value) {
            addCriterion("belong_city >=", value, "belong_city");
            return (Criteria) this;
        }

        public Criteria andBelong_cityLessThan(String value) {
            addCriterion("belong_city <", value, "belong_city");
            return (Criteria) this;
        }

        public Criteria andBelong_cityLessThanOrEqualTo(String value) {
            addCriterion("belong_city <=", value, "belong_city");
            return (Criteria) this;
        }

        public Criteria andBelong_cityLike(String value) {
            addCriterion("belong_city like", value, "belong_city");
            return (Criteria) this;
        }

        public Criteria andBelong_cityNotLike(String value) {
            addCriterion("belong_city not like", value, "belong_city");
            return (Criteria) this;
        }

        public Criteria andBelong_cityIn(List<String> values) {
            addCriterion("belong_city in", values, "belong_city");
            return (Criteria) this;
        }

        public Criteria andBelong_cityNotIn(List<String> values) {
            addCriterion("belong_city not in", values, "belong_city");
            return (Criteria) this;
        }

        public Criteria andBelong_cityBetween(String value1, String value2) {
            addCriterion("belong_city between", value1, value2, "belong_city");
            return (Criteria) this;
        }

        public Criteria andBelong_cityNotBetween(String value1, String value2) {
            addCriterion("belong_city not between", value1, value2, "belong_city");
            return (Criteria) this;
        }

        public Criteria andFirst_img_bigIsNull() {
            addCriterion("first_img_big is null");
            return (Criteria) this;
        }

        public Criteria andFirst_img_bigIsNotNull() {
            addCriterion("first_img_big is not null");
            return (Criteria) this;
        }

        public Criteria andFirst_img_bigEqualTo(String value) {
            addCriterion("first_img_big =", value, "first_img_big");
            return (Criteria) this;
        }

        public Criteria andFirst_img_bigNotEqualTo(String value) {
            addCriterion("first_img_big <>", value, "first_img_big");
            return (Criteria) this;
        }

        public Criteria andFirst_img_bigGreaterThan(String value) {
            addCriterion("first_img_big >", value, "first_img_big");
            return (Criteria) this;
        }

        public Criteria andFirst_img_bigGreaterThanOrEqualTo(String value) {
            addCriterion("first_img_big >=", value, "first_img_big");
            return (Criteria) this;
        }

        public Criteria andFirst_img_bigLessThan(String value) {
            addCriterion("first_img_big <", value, "first_img_big");
            return (Criteria) this;
        }

        public Criteria andFirst_img_bigLessThanOrEqualTo(String value) {
            addCriterion("first_img_big <=", value, "first_img_big");
            return (Criteria) this;
        }

        public Criteria andFirst_img_bigLike(String value) {
            addCriterion("first_img_big like", value, "first_img_big");
            return (Criteria) this;
        }

        public Criteria andFirst_img_bigNotLike(String value) {
            addCriterion("first_img_big not like", value, "first_img_big");
            return (Criteria) this;
        }

        public Criteria andFirst_img_bigIn(List<String> values) {
            addCriterion("first_img_big in", values, "first_img_big");
            return (Criteria) this;
        }

        public Criteria andFirst_img_bigNotIn(List<String> values) {
            addCriterion("first_img_big not in", values, "first_img_big");
            return (Criteria) this;
        }

        public Criteria andFirst_img_bigBetween(String value1, String value2) {
            addCriterion("first_img_big between", value1, value2, "first_img_big");
            return (Criteria) this;
        }

        public Criteria andFirst_img_bigNotBetween(String value1, String value2) {
            addCriterion("first_img_big not between", value1, value2, "first_img_big");
            return (Criteria) this;
        }

        public Criteria andFirst_img_minIsNull() {
            addCriterion("first_img_min is null");
            return (Criteria) this;
        }

        public Criteria andFirst_img_minIsNotNull() {
            addCriterion("first_img_min is not null");
            return (Criteria) this;
        }

        public Criteria andFirst_img_minEqualTo(String value) {
            addCriterion("first_img_min =", value, "first_img_min");
            return (Criteria) this;
        }

        public Criteria andFirst_img_minNotEqualTo(String value) {
            addCriterion("first_img_min <>", value, "first_img_min");
            return (Criteria) this;
        }

        public Criteria andFirst_img_minGreaterThan(String value) {
            addCriterion("first_img_min >", value, "first_img_min");
            return (Criteria) this;
        }

        public Criteria andFirst_img_minGreaterThanOrEqualTo(String value) {
            addCriterion("first_img_min >=", value, "first_img_min");
            return (Criteria) this;
        }

        public Criteria andFirst_img_minLessThan(String value) {
            addCriterion("first_img_min <", value, "first_img_min");
            return (Criteria) this;
        }

        public Criteria andFirst_img_minLessThanOrEqualTo(String value) {
            addCriterion("first_img_min <=", value, "first_img_min");
            return (Criteria) this;
        }

        public Criteria andFirst_img_minLike(String value) {
            addCriterion("first_img_min like", value, "first_img_min");
            return (Criteria) this;
        }

        public Criteria andFirst_img_minNotLike(String value) {
            addCriterion("first_img_min not like", value, "first_img_min");
            return (Criteria) this;
        }

        public Criteria andFirst_img_minIn(List<String> values) {
            addCriterion("first_img_min in", values, "first_img_min");
            return (Criteria) this;
        }

        public Criteria andFirst_img_minNotIn(List<String> values) {
            addCriterion("first_img_min not in", values, "first_img_min");
            return (Criteria) this;
        }

        public Criteria andFirst_img_minBetween(String value1, String value2) {
            addCriterion("first_img_min between", value1, value2, "first_img_min");
            return (Criteria) this;
        }

        public Criteria andFirst_img_minNotBetween(String value1, String value2) {
            addCriterion("first_img_min not between", value1, value2, "first_img_min");
            return (Criteria) this;
        }

        public Criteria andCarousel_imgIsNull() {
            addCriterion("carousel_img is null");
            return (Criteria) this;
        }

        public Criteria andCarousel_imgIsNotNull() {
            addCriterion("carousel_img is not null");
            return (Criteria) this;
        }

        public Criteria andCarousel_imgEqualTo(String value) {
            addCriterion("carousel_img =", value, "carousel_img");
            return (Criteria) this;
        }

        public Criteria andCarousel_imgNotEqualTo(String value) {
            addCriterion("carousel_img <>", value, "carousel_img");
            return (Criteria) this;
        }

        public Criteria andCarousel_imgGreaterThan(String value) {
            addCriterion("carousel_img >", value, "carousel_img");
            return (Criteria) this;
        }

        public Criteria andCarousel_imgGreaterThanOrEqualTo(String value) {
            addCriterion("carousel_img >=", value, "carousel_img");
            return (Criteria) this;
        }

        public Criteria andCarousel_imgLessThan(String value) {
            addCriterion("carousel_img <", value, "carousel_img");
            return (Criteria) this;
        }

        public Criteria andCarousel_imgLessThanOrEqualTo(String value) {
            addCriterion("carousel_img <=", value, "carousel_img");
            return (Criteria) this;
        }

        public Criteria andCarousel_imgLike(String value) {
            addCriterion("carousel_img like", value, "carousel_img");
            return (Criteria) this;
        }

        public Criteria andCarousel_imgNotLike(String value) {
            addCriterion("carousel_img not like", value, "carousel_img");
            return (Criteria) this;
        }

        public Criteria andCarousel_imgIn(List<String> values) {
            addCriterion("carousel_img in", values, "carousel_img");
            return (Criteria) this;
        }

        public Criteria andCarousel_imgNotIn(List<String> values) {
            addCriterion("carousel_img not in", values, "carousel_img");
            return (Criteria) this;
        }

        public Criteria andCarousel_imgBetween(String value1, String value2) {
            addCriterion("carousel_img between", value1, value2, "carousel_img");
            return (Criteria) this;
        }

        public Criteria andCarousel_imgNotBetween(String value1, String value2) {
            addCriterion("carousel_img not between", value1, value2, "carousel_img");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNull() {
            addCriterion("introduction is null");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNotNull() {
            addCriterion("introduction is not null");
            return (Criteria) this;
        }

        public Criteria andIntroductionEqualTo(String value) {
            addCriterion("introduction =", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotEqualTo(String value) {
            addCriterion("introduction <>", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThan(String value) {
            addCriterion("introduction >", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("introduction >=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThan(String value) {
            addCriterion("introduction <", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThanOrEqualTo(String value) {
            addCriterion("introduction <=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLike(String value) {
            addCriterion("introduction like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotLike(String value) {
            addCriterion("introduction not like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionIn(List<String> values) {
            addCriterion("introduction in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotIn(List<String> values) {
            addCriterion("introduction not in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionBetween(String value1, String value2) {
            addCriterion("introduction between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotBetween(String value1, String value2) {
            addCriterion("introduction not between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(String value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(String value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(String value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(String value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(String value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLike(String value) {
            addCriterion("longitude like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotLike(String value) {
            addCriterion("longitude not like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<String> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<String> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(String value1, String value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(String value1, String value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(String value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(String value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(String value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(String value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(String value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLike(String value) {
            addCriterion("latitude like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotLike(String value) {
            addCriterion("latitude not like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<String> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<String> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(String value1, String value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(String value1, String value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andReserve_numIsNull() {
            addCriterion("reserve_num is null");
            return (Criteria) this;
        }

        public Criteria andReserve_numIsNotNull() {
            addCriterion("reserve_num is not null");
            return (Criteria) this;
        }

        public Criteria andReserve_numEqualTo(Integer value) {
            addCriterion("reserve_num =", value, "reserve_num");
            return (Criteria) this;
        }

        public Criteria andReserve_numNotEqualTo(Integer value) {
            addCriterion("reserve_num <>", value, "reserve_num");
            return (Criteria) this;
        }

        public Criteria andReserve_numGreaterThan(Integer value) {
            addCriterion("reserve_num >", value, "reserve_num");
            return (Criteria) this;
        }

        public Criteria andReserve_numGreaterThanOrEqualTo(Integer value) {
            addCriterion("reserve_num >=", value, "reserve_num");
            return (Criteria) this;
        }

        public Criteria andReserve_numLessThan(Integer value) {
            addCriterion("reserve_num <", value, "reserve_num");
            return (Criteria) this;
        }

        public Criteria andReserve_numLessThanOrEqualTo(Integer value) {
            addCriterion("reserve_num <=", value, "reserve_num");
            return (Criteria) this;
        }

        public Criteria andReserve_numIn(List<Integer> values) {
            addCriterion("reserve_num in", values, "reserve_num");
            return (Criteria) this;
        }

        public Criteria andReserve_numNotIn(List<Integer> values) {
            addCriterion("reserve_num not in", values, "reserve_num");
            return (Criteria) this;
        }

        public Criteria andReserve_numBetween(Integer value1, Integer value2) {
            addCriterion("reserve_num between", value1, value2, "reserve_num");
            return (Criteria) this;
        }

        public Criteria andReserve_numNotBetween(Integer value1, Integer value2) {
            addCriterion("reserve_num not between", value1, value2, "reserve_num");
            return (Criteria) this;
        }

        public Criteria andRecommendIsNull() {
            addCriterion("recommend is null");
            return (Criteria) this;
        }

        public Criteria andRecommendIsNotNull() {
            addCriterion("recommend is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendEqualTo(Integer value) {
            addCriterion("recommend =", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotEqualTo(Integer value) {
            addCriterion("recommend <>", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendGreaterThan(Integer value) {
            addCriterion("recommend >", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendGreaterThanOrEqualTo(Integer value) {
            addCriterion("recommend >=", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendLessThan(Integer value) {
            addCriterion("recommend <", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendLessThanOrEqualTo(Integer value) {
            addCriterion("recommend <=", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendIn(List<Integer> values) {
            addCriterion("recommend in", values, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotIn(List<Integer> values) {
            addCriterion("recommend not in", values, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendBetween(Integer value1, Integer value2) {
            addCriterion("recommend between", value1, value2, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotBetween(Integer value1, Integer value2) {
            addCriterion("recommend not between", value1, value2, "recommend");
            return (Criteria) this;
        }

        public Criteria andJoinidIsNull() {
            addCriterion("joinid is null");
            return (Criteria) this;
        }

        public Criteria andJoinidIsNotNull() {
            addCriterion("joinid is not null");
            return (Criteria) this;
        }

        public Criteria andJoinidEqualTo(Integer value) {
            addCriterion("joinid =", value, "adminuser.id");
            return (Criteria) this;
        }

        public Criteria andJoinidNotEqualTo(Integer value) {
            addCriterion("joinid <>", value, "adminuser.id");
            return (Criteria) this;
        }

        public Criteria andJoinidGreaterThan(Integer value) {
            addCriterion("joinid >", value, "adminuser.id");
            return (Criteria) this;
        }

        public Criteria andJoinidGreaterThanOrEqualTo(Integer value) {
            addCriterion("joinid >=", value, "adminuser.id");
            return (Criteria) this;
        }

        public Criteria andJoinidLessThan(Integer value) {
            addCriterion("joinid <", value, "adminuser.id");
            return (Criteria) this;
        }

        public Criteria andJoinidLessThanOrEqualTo(Integer value) {
            addCriterion("joinid <=", value, "adminuser.id");
            return (Criteria) this;
        }

        public Criteria andJoinidIn(List<Integer> values) {
            addCriterion("joinid in", values, "adminuser.id");
            return (Criteria) this;
        }

        public Criteria andJoinidNotIn(List<Integer> values) {
            addCriterion("joinid not in", values, "adminuser.id");
            return (Criteria) this;
        }

        public Criteria andJoinidBetween(Integer value1, Integer value2) {
            addCriterion("joinid between", value1, value2, "adminuser.id");
            return (Criteria) this;
        }

        public Criteria andJoinidNotBetween(Integer value1, Integer value2) {
            addCriterion("joinid not between", value1, value2, "adminuser.id");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNull() {
            addCriterion("checkStatus is null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNotNull() {
            addCriterion("checkStatus is not null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusEqualTo(Integer value) {
            addCriterion("checkStatus =", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotEqualTo(Integer value) {
            addCriterion("checkStatus <>", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThan(Integer value) {
            addCriterion("checkStatus >", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("checkStatus >=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThan(Integer value) {
            addCriterion("checkStatus <", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThanOrEqualTo(Integer value) {
            addCriterion("checkStatus <=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIn(List<Integer> values) {
            addCriterion("checkStatus in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotIn(List<Integer> values) {
            addCriterion("checkStatus not in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusBetween(Integer value1, Integer value2) {
            addCriterion("checkStatus between", value1, value2, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("checkStatus not between", value1, value2, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andAbbotIsNull() {
            addCriterion("abbot is null");
            return (Criteria) this;
        }

        public Criteria andAbbotIsNotNull() {
            addCriterion("abbot is not null");
            return (Criteria) this;
        }

        public Criteria andAbbotEqualTo(String value) {
            addCriterion("abbot =", value, "abbot");
            return (Criteria) this;
        }

        public Criteria andAbbotNotEqualTo(String value) {
            addCriterion("abbot <>", value, "abbot");
            return (Criteria) this;
        }

        public Criteria andAbbotGreaterThan(String value) {
            addCriterion("abbot >", value, "abbot");
            return (Criteria) this;
        }

        public Criteria andAbbotGreaterThanOrEqualTo(String value) {
            addCriterion("abbot >=", value, "abbot");
            return (Criteria) this;
        }

        public Criteria andAbbotLessThan(String value) {
            addCriterion("abbot <", value, "abbot");
            return (Criteria) this;
        }

        public Criteria andAbbotLessThanOrEqualTo(String value) {
            addCriterion("abbot <=", value, "abbot");
            return (Criteria) this;
        }

        public Criteria andAbbotLike(String value) {
            addCriterion("abbot like", value, "abbot");
            return (Criteria) this;
        }

        public Criteria andAbbotNotLike(String value) {
            addCriterion("abbot not like", value, "abbot");
            return (Criteria) this;
        }

        public Criteria andAbbotIn(List<String> values) {
            addCriterion("abbot in", values, "abbot");
            return (Criteria) this;
        }

        public Criteria andAbbotNotIn(List<String> values) {
            addCriterion("abbot not in", values, "abbot");
            return (Criteria) this;
        }

        public Criteria andAbbotBetween(String value1, String value2) {
            addCriterion("abbot between", value1, value2, "abbot");
            return (Criteria) this;
        }

        public Criteria andAbbotNotBetween(String value1, String value2) {
            addCriterion("abbot not between", value1, value2, "abbot");
            return (Criteria) this;
        }

        public Criteria andAbbotresumeIsNull() {
            addCriterion("abbotresume is null");
            return (Criteria) this;
        }

        public Criteria andAbbotresumeIsNotNull() {
            addCriterion("abbotresume is not null");
            return (Criteria) this;
        }

        public Criteria andAbbotresumeEqualTo(String value) {
            addCriterion("abbotresume =", value, "abbotresume");
            return (Criteria) this;
        }

        public Criteria andAbbotresumeNotEqualTo(String value) {
            addCriterion("abbotresume <>", value, "abbotresume");
            return (Criteria) this;
        }

        public Criteria andAbbotresumeGreaterThan(String value) {
            addCriterion("abbotresume >", value, "abbotresume");
            return (Criteria) this;
        }

        public Criteria andAbbotresumeGreaterThanOrEqualTo(String value) {
            addCriterion("abbotresume >=", value, "abbotresume");
            return (Criteria) this;
        }

        public Criteria andAbbotresumeLessThan(String value) {
            addCriterion("abbotresume <", value, "abbotresume");
            return (Criteria) this;
        }

        public Criteria andAbbotresumeLessThanOrEqualTo(String value) {
            addCriterion("abbotresume <=", value, "abbotresume");
            return (Criteria) this;
        }

        public Criteria andAbbotresumeLike(String value) {
            addCriterion("abbotresume like", value, "abbotresume");
            return (Criteria) this;
        }

        public Criteria andAbbotresumeNotLike(String value) {
            addCriterion("abbotresume not like", value, "abbotresume");
            return (Criteria) this;
        }

        public Criteria andAbbotresumeIn(List<String> values) {
            addCriterion("abbotresume in", values, "abbotresume");
            return (Criteria) this;
        }

        public Criteria andAbbotresumeNotIn(List<String> values) {
            addCriterion("abbotresume not in", values, "abbotresume");
            return (Criteria) this;
        }

        public Criteria andAbbotresumeBetween(String value1, String value2) {
            addCriterion("abbotresume between", value1, value2, "abbotresume");
            return (Criteria) this;
        }

        public Criteria andAbbotresumeNotBetween(String value1, String value2) {
            addCriterion("abbotresume not between", value1, value2, "abbotresume");
            return (Criteria) this;
        }

        public Criteria andOpentimeIsNull() {
            addCriterion("opentime is null");
            return (Criteria) this;
        }

        public Criteria andOpentimeIsNotNull() {
            addCriterion("opentime is not null");
            return (Criteria) this;
        }

        public Criteria andOpentimeEqualTo(Date value) {
            addCriterion("opentime =", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeNotEqualTo(Date value) {
            addCriterion("opentime <>", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeGreaterThan(Date value) {
            addCriterion("opentime >", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeGreaterThanOrEqualTo(Date value) {
            addCriterion("opentime >=", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeLessThan(Date value) {
            addCriterion("opentime <", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeLessThanOrEqualTo(Date value) {
            addCriterion("opentime <=", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeIn(List<Date> values) {
            addCriterion("opentime in", values, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeNotIn(List<Date> values) {
            addCriterion("opentime not in", values, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeBetween(Date value1, Date value2) {
            addCriterion("opentime between", value1, value2, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeNotBetween(Date value1, Date value2) {
            addCriterion("opentime not between", value1, value2, "opentime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
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