package com.one.clxj.pojo;

import java.util.Date;

public class Clxjmain {
    private Integer id;

    private String name;

    private Integer type1;

    private Integer type2;

    private String belong_city;

    private String first_img_big;

    private String first_img_min;

    private String carousel_img;

    private Double price;

    private String address;

    private String longitude;

    private String latitude;

    private Integer reserve_num;

    private Integer recommend;

    private Integer joinid;

    private Integer checkStatus;

    private String abbot;

    private Date opentime;

    private Date createtime;

    private String mobile;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getType1() {
        return type1;
    }

    public void setType1(Integer type1) {
        this.type1 = type1;
    }

    public Integer getType2() {
        return type2;
    }

    public void setType2(Integer type2) {
        this.type2 = type2;
    }

    public String getBelong_city() {
        return belong_city;
    }

    public void setBelong_city(String belong_city) {
        this.belong_city = belong_city == null ? null : belong_city.trim();
    }

    public String getFirst_img_big() {
        return first_img_big;
    }

    public void setFirst_img_big(String first_img_big) {
        this.first_img_big = first_img_big == null ? null : first_img_big.trim();
    }

    public String getFirst_img_min() {
        return first_img_min;
    }

    public void setFirst_img_min(String first_img_min) {
        this.first_img_min = first_img_min == null ? null : first_img_min.trim();
    }

    public String getCarousel_img() {
        return carousel_img;
    }

    public void setCarousel_img(String carousel_img) {
        this.carousel_img = carousel_img == null ? null : carousel_img.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }

    public Integer getReserve_num() {
        return reserve_num;
    }

    public void setReserve_num(Integer reserve_num) {
        this.reserve_num = reserve_num;
    }

    public Integer getRecommend() {
        return recommend;
    }

    public void setRecommend(Integer recommend) {
        this.recommend = recommend;
    }

    public Integer getJoinid() {
        return joinid;
    }

    public void setJoinid(Integer joinid) {
        this.joinid = joinid;
    }

    public Integer getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }

    public String getAbbot() {
        return abbot;
    }

    public void setAbbot(String abbot) {
        this.abbot = abbot == null ? null : abbot.trim();
    }

    public Date getOpentime() {
        return opentime;
    }

    public void setOpentime(Date opentime) {
        this.opentime = opentime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }
}