package com.one.clxj.pojo;

import java.util.Date;

/**
 * 用车订单实体类
 */
public class Carorder {
    private String oid; //订单编号

    private Carinfo carinfo; //车辆编号

    private String startplace; //出发地点

    private String endplace; //目的地点

    private Double total; //总价

    private String checkperson; //用车人员姓名

    private String checkphone; //联系人电话

    private Date usetime; //使用时间

    private Integer useroption; //

    private String message; //留言

    private Reguser reguser; //下单用户

    private Integer state; //状态

    private Date reservetime; //下单时间

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid == null ? null : oid.trim();
    }



    public String getStartplace() {
        return startplace;
    }

    public void setStartplace(String startplace) {
        this.startplace = startplace == null ? null : startplace.trim();
    }

    public String getEndplace() {
        return endplace;
    }

    public void setEndplace(String endplace) {
        this.endplace = endplace == null ? null : endplace.trim();
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getCheckperson() {
        return checkperson;
    }

    public void setCheckperson(String checkperson) {
        this.checkperson = checkperson == null ? null : checkperson.trim();
    }

    public String getCheckphone() {
        return checkphone;
    }

    public void setCheckphone(String checkphone) {
        this.checkphone = checkphone == null ? null : checkphone.trim();
    }

    public Date getUsetime() {
        return usetime;
    }

    public void setUsetime(Date usetime) {
        this.usetime = usetime;
    }

    public Integer getUseroption() {
        return useroption;
    }

    public void setUseroption(Integer useroption) {
        this.useroption = useroption;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }



    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getReservetime() {
        return reservetime;
    }

    public void setReservetime(Date reservetime) {
        this.reservetime = reservetime;
    }

    public Carinfo getCarinfo() {
        return carinfo;
    }

    public void setCarinfo(Carinfo carinfo) {
        this.carinfo = carinfo;
    }

    public Reguser getReguser() {
        return reguser;
    }

    public void setReguser(Reguser reguser) {
        this.reguser = reguser;
    }

    @Override
    public String toString() {
        return "Carorder{" +
                "oid='" + oid + '\'' +
                ", carinfo=" + carinfo +
                ", startplace='" + startplace + '\'' +
                ", endplace='" + endplace + '\'' +
                ", total=" + total +
                ", checkperson='" + checkperson + '\'' +
                ", checkphone='" + checkphone + '\'' +
                ", usetime=" + usetime +
                ", useroption=" + useroption +
                ", message='" + message + '\'' +
                ", reguser=" + reguser +
                ", state=" + state +
                ", reservetime=" + reservetime +
                '}';
    }
}