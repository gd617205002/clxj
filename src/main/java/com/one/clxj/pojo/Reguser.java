package com.one.clxj.pojo;

import javax.persistence.Id;
import java.util.Date;

/**
 * 前台注册表
 */
public class Reguser {
    @Id
    private Integer id; //编号

    private String username; //用户名称

    private String mobile; //手机号码

    private String email; //邮箱

    private String pwd; //密码

    private Integer sex; //性别

    private String realname; //真实姓名

    private String idcard; //身份证号

    private City citys; //所在城市编号

    private Date regtime; //注册时间

    private Integer enableflag; //用户状态

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }


    public Date getRegtime() {
        return regtime;
    }

    public void setRegtime(Date regtime) {
        this.regtime = regtime;
    }

    public Integer getEnableflag() {
        return enableflag;
    }

    public void setEnableflag(Integer enableflag) {
        this.enableflag = enableflag;
    }

    public City getCitys() {
        return citys;
    }

    public void setCitys(City citys) {
        this.citys = citys;
    }

    @Override
    public String toString() {
        return "Reguser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", pwd='" + pwd + '\'' +
                ", sex=" + sex +
                ", realname='" + realname + '\'' +
                ", idcard='" + idcard + '\'' +
                ", citys=" + citys +
                ", regtime=" + regtime +
                ", enableflag=" + enableflag +
                '}';
    }
}