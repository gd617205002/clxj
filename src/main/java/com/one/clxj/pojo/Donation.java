package com.one.clxj.pojo;

import java.util.Date;

/**
 * 爱心捐赠实体类
 */
public class Donation {
    private Integer id; //编号

    private String donationname; //捐款人

    private String type; //

    private double money; //金额

    private Date donationtime; //捐款时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDonationname() {
        return donationname;
    }

    public void setDonationname(String donationname) {
        this.donationname = donationname == null ? null : donationname.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Date getDonationtime() {
        return donationtime;
    }

    public void setDonationtime(Date donationtime) {
        this.donationtime = donationtime;
    }
}