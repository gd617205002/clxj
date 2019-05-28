package com.one.clxj.pojo;

import javax.persistence.Id;

/**
 * 加盟车辆信息实体类
 */
public class Joincar {
    @Id
    private Integer id; //编号

    private String theowner; //车主姓名

    private String idcard; //身份证号

    private String address; //地址

    private String carname; //车牌名称/型号

    private String travelnumber; //行驶证号

    private String travelrun; //已行驶里程

    private String drivername; //指定驾驶员姓名

    private String drivernumber; //驾驶证号

    private String driverphone; //指定驾驶员电话

    private String insurancename; //车辆保险公司

    private String insurancenumber; //保险证号

    private String insurancephone; //车辆保险公司电话

    private String message; //简介

    private Reguser reguser; //用户编号

    private String jointime; //加入时间

    private Integer joinstatus; //审核状态

    private String fileurl; //长传合同路径

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTheowner() {
        return theowner;
    }

    public void setTheowner(String theowner) {
        this.theowner = theowner == null ? null : theowner.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getCarname() {
        return carname;
    }

    public void setCarname(String carname) {
        this.carname = carname == null ? null : carname.trim();
    }

    public String getTravelnumber() {
        return travelnumber;
    }

    public void setTravelnumber(String travelnumber) {
        this.travelnumber = travelnumber == null ? null : travelnumber.trim();
    }

    public String getTravelrun() {
        return travelrun;
    }

    public void setTravelrun(String travelrun) {
        this.travelrun = travelrun == null ? null : travelrun.trim();
    }

    public String getDrivername() {
        return drivername;
    }

    public void setDrivername(String drivername) {
        this.drivername = drivername == null ? null : drivername.trim();
    }

    public String getDrivernumber() {
        return drivernumber;
    }

    public void setDrivernumber(String drivernumber) {
        this.drivernumber = drivernumber == null ? null : drivernumber.trim();
    }

    public String getDriverphone() {
        return driverphone;
    }

    public void setDriverphone(String driverphone) {
        this.driverphone = driverphone == null ? null : driverphone.trim();
    }

    public String getInsurancename() {
        return insurancename;
    }

    public void setInsurancename(String insurancename) {
        this.insurancename = insurancename == null ? null : insurancename.trim();
    }

    public String getInsurancenumber() {
        return insurancenumber;
    }

    public void setInsurancenumber(String insurancenumber) {
        this.insurancenumber = insurancenumber == null ? null : insurancenumber.trim();
    }

    public String getInsurancephone() {
        return insurancephone;
    }

    public void setInsurancephone(String insurancephone) {
        this.insurancephone = insurancephone == null ? null : insurancephone.trim();
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
        return "Joincar{" +
                "id=" + id +
                ", theowner='" + theowner + '\'' +
                ", idcard='" + idcard + '\'' +
                ", address='" + address + '\'' +
                ", carname='" + carname + '\'' +
                ", travelnumber='" + travelnumber + '\'' +
                ", travelrun='" + travelrun + '\'' +
                ", drivername='" + drivername + '\'' +
                ", drivernumber='" + drivernumber + '\'' +
                ", driverphone='" + driverphone + '\'' +
                ", insurancename='" + insurancename + '\'' +
                ", insurancenumber='" + insurancenumber + '\'' +
                ", insurancephone='" + insurancephone + '\'' +
                ", message='" + message + '\'' +
                ", reguser=" + reguser +
                ", jointime='" + jointime + '\'' +
                ", joinstatus=" + joinstatus +
                ", fileurl='" + fileurl + '\'' +
                '}';
    }
}