package com.one.clxj.pojo;

import java.util.Date;

public class Userinfor {
    private Integer user_id;

    private String user_name;

    private Boolean user_sex;

    private String user_work;

    private String user_contact;

    private String user_address;

    private Boolean user_marriage;

    private Integer user_department;

    private Date user_employTime;

    private String user_password;

    private String user_education;

    private String user_loginName;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name == null ? null : user_name.trim();
    }

    public Boolean getUser_sex() {
        return user_sex;
    }

    public void setUser_sex(Boolean user_sex) {
        this.user_sex = user_sex;
    }

    public String getUser_work() {
        return user_work;
    }

    public void setUser_work(String user_work) {
        this.user_work = user_work == null ? null : user_work.trim();
    }

    public String getUser_contact() {
        return user_contact;
    }

    public void setUser_contact(String user_contact) {
        this.user_contact = user_contact == null ? null : user_contact.trim();
    }

    public String getUser_address() {
        return user_address;
    }

    public void setUser_address(String user_address) {
        this.user_address = user_address == null ? null : user_address.trim();
    }

    public Boolean getUser_marriage() {
        return user_marriage;
    }

    public void setUser_marriage(Boolean user_marriage) {
        this.user_marriage = user_marriage;
    }

    public Integer getUser_department() {
        return user_department;
    }

    public void setUser_department(Integer user_department) {
        this.user_department = user_department;
    }

    public Date getUser_employTime() {
        return user_employTime;
    }

    public void setUser_employTime(Date user_employTime) {
        this.user_employTime = user_employTime;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password == null ? null : user_password.trim();
    }

    public String getUser_education() {
        return user_education;
    }

    public void setUser_education(String user_education) {
        this.user_education = user_education == null ? null : user_education.trim();
    }

    public String getUser_loginName() {
        return user_loginName;
    }

    public void setUser_loginName(String user_loginName) {
        this.user_loginName = user_loginName == null ? null : user_loginName.trim();
    }
}