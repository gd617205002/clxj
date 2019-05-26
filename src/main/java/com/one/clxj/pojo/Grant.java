package com.one.clxj.pojo;

import java.util.Date;

public class Grant {
    private Integer id;

    private String donationname;

    private String goods;

    private Integer num;

    private Double worthless;

    private String useto;

    private String recipients;

    private Date donationTime;

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

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods == null ? null : goods.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Double getWorthless() {
        return worthless;
    }

    public void setWorthless(Double worthless) {
        this.worthless = worthless;
    }

    public String getUseto() {
        return useto;
    }

    public void setUseto(String useto) {
        this.useto = useto == null ? null : useto.trim();
    }

    public String getRecipients() {
        return recipients;
    }

    public void setRecipients(String recipients) {
        this.recipients = recipients == null ? null : recipients.trim();
    }

    public Date getDonationTime() {
        return donationTime;
    }

    public void setDonationTime(Date donationTime) {
        this.donationTime = donationTime;
    }
}