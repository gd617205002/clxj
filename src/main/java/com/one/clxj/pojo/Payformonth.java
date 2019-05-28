package com.one.clxj.pojo;

import javax.persistence.Id;

/**
 * 月底支出实体类
 */
public class Payformonth {
    @Id
    private Integer id; //编号

    private String monthly; //月度

    private String projectname; //项目名称

    private Double paymoney; //指出金额

    private String remarks; //备注

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMonthly() {
        return monthly;
    }

    public void setMonthly(String monthly) {
        this.monthly = monthly == null ? null : monthly.trim();
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname == null ? null : projectname.trim();
    }

    public Double getPaymoney() {
        return paymoney;
    }

    public void setPaymoney(Double paymoney) {
        this.paymoney = paymoney;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}