package com.one.clxj.pojo;

import javax.persistence.Id;
import java.util.Date;

/**
 * 丛林闲居订单实体类
 */
public class Clxjorder {
    @Id
    private String oid; //订单号

    private Clxjmain clxjmain; //丛林闲居编号

    private Reguser reguser; //用户编号

    private Date checkstartdate; //入住开始时间

    private Date checkenddate; //入住结束时间

    private Double total; //总价

    private String checkperson; //入住人

    private String relperson; //联系人

    private String relphone; //联系电话

    private String relemail; //邮箱

    private Integer state; //交易状态

    private Date reservetime; //交易时间

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid == null ? null : oid.trim();
    }

    public Date getCheckstartdate() {
        return checkstartdate;
    }

    public void setCheckstartdate(Date checkstartdate) {
        this.checkstartdate = checkstartdate;
    }

    public Date getCheckenddate() {
        return checkenddate;
    }

    public void setCheckenddate(Date checkenddate) {
        this.checkenddate = checkenddate;
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

    public String getRelperson() {
        return relperson;
    }

    public void setRelperson(String relperson) {
        this.relperson = relperson == null ? null : relperson.trim();
    }

    public String getRelphone() {
        return relphone;
    }

    public void setRelphone(String relphone) {
        this.relphone = relphone == null ? null : relphone.trim();
    }

    public String getRelemail() {
        return relemail;
    }

    public void setRelemail(String relemail) {
        this.relemail = relemail == null ? null : relemail.trim();
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

    public Clxjmain getClxjmain() {
        return clxjmain;
    }

    public void setClxjmain(Clxjmain clxjmain) {
        this.clxjmain = clxjmain;
    }

    public Reguser getReguser() {
        return reguser;
    }

    public void setReguser(Reguser reguser) {
        this.reguser = reguser;
    }

    @Override
    public String toString() {
        return "Clxjorder{" +
                "oid='" + oid + '\'' +
                ", clxjmain=" + clxjmain +
                ", reguser=" + reguser +
                ", checkstartdate=" + checkstartdate +
                ", checkenddate=" + checkenddate +
                ", total=" + total +
                ", checkperson='" + checkperson + '\'' +
                ", relperson='" + relperson + '\'' +
                ", relphone='" + relphone + '\'' +
                ", relemail='" + relemail + '\'' +
                ", state=" + state +
                ", reservetime=" + reservetime +
                '}';
    }
}