package com.one.clxj.pojo;

import javax.persistence.Id;
import java.util.Date;

/**
 * 款物发放实体类
 */
public class Grant {
    @Id
    private Integer id; //编号

    private String donationname; //捐款人

    private String goods; //物品

    private Integer num; //数量

    private Double worthless; //价值

    private String useto; //使用捐向

    private String recipients; //受助人

    private Date donationTime; //捐赠时间

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