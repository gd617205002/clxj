package com.one.clxj.pojo;

import javax.persistence.Id;

/**
 * 闲居加盟实体类
 */
public class Joinxj {
    @Id
    private Integer id; //编号

    private String xjname; //闲居户主名称

    private String houseno; //房屋产权证号

    private String address; //地址

    private String postcode; //邮编

    private String houseidcard; //户主身份证号

    private String housephone; //手机号

    private String housemobile; //固定电话

    private String houseperson; //房屋共有人名字

    private String idcard; //身份证号

    private String phone; //电话

    private String message; //介绍

    private Reguser reguser; //用户编号

    private String jointime; //加入时间

    private Integer joinstatus; //审核状态

    private String fileurl; //长传合同

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getXjname() {
        return xjname;
    }

    public void setXjname(String xjname) {
        this.xjname = xjname == null ? null : xjname.trim();
    }

    public String getHouseno() {
        return houseno;
    }

    public void setHouseno(String houseno) {
        this.houseno = houseno == null ? null : houseno.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }

    public String getHouseidcard() {
        return houseidcard;
    }

    public void setHouseidcard(String houseidcard) {
        this.houseidcard = houseidcard == null ? null : houseidcard.trim();
    }

    public String getHousephone() {
        return housephone;
    }

    public void setHousephone(String housephone) {
        this.housephone = housephone == null ? null : housephone.trim();
    }

    public String getHousemobile() {
        return housemobile;
    }

    public void setHousemobile(String housemobile) {
        this.housemobile = housemobile == null ? null : housemobile.trim();
    }

    public String getHouseperson() {
        return houseperson;
    }

    public void setHouseperson(String houseperson) {
        this.houseperson = houseperson == null ? null : houseperson.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }


    public String getJointime() {
        return jointime;
    }

    public void setJointime(String jointime) {
        this.jointime = jointime == null ? null : jointime.trim();
    }

    public Integer getJoinstatus() {
        return joinstatus;
    }

    public void setJoinstatus(Integer joinstatus) {
        this.joinstatus = joinstatus;
    }

    public String getFileurl() {
        return fileurl;
    }

    public void setFileurl(String fileurl) {
        this.fileurl = fileurl == null ? null : fileurl.trim();
    }

    public Reguser getReguser() {
        return reguser;
    }

    public void setReguser(Reguser reguser) {
        this.reguser = reguser;
    }

    @Override
    public String toString() {
        return "Joinxj{" +
                "id=" + id +
                ", xjname='" + xjname + '\'' +
                ", houseno='" + houseno + '\'' +
                ", address='" + address + '\'' +
                ", postcode='" + postcode + '\'' +
                ", houseidcard='" + houseidcard + '\'' +
                ", housephone='" + housephone + '\'' +
                ", housemobile='" + housemobile + '\'' +
                ", houseperson='" + houseperson + '\'' +
                ", idcard='" + idcard + '\'' +
                ", phone='" + phone + '\'' +
                ", message='" + message + '\'' +
                ", reguser=" + reguser +
                ", jointime='" + jointime + '\'' +
                ", joinstatus=" + joinstatus +
                ", fileurl='" + fileurl + '\'' +
                '}';
    }
}