package com.one.clxj.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * 管理员实体类
 */
public class Adminuser implements Serializable {
    private Integer id;  //编号

    private String username; //用户名

    private String pwd; //密码

    private String name; //真实姓名

    private String mobile; //号码

    private Integer usertype; //管理类型

    private Integer userflag; //用户状态

    private Date regtime; //添加时间

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

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Integer getUsertype() {
        return usertype;
    }

    public void setUsertype(Integer usertype) {
        this.usertype = usertype;
    }

    public Integer getUserflag() {
        return userflag;
    }

    public void setUserflag(Integer userflag) {
        this.userflag = userflag;
    }

    public Date getRegtime() {
        return regtime;
    }

    public void setRegtime(Date regtime) {
        this.regtime = regtime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adminuser adminuser = (Adminuser) o;
        return Objects.equals(id, adminuser.id) &&
                Objects.equals(username, adminuser.username) &&
                Objects.equals(pwd, adminuser.pwd) &&
                Objects.equals(name, adminuser.name) &&
                Objects.equals(mobile, adminuser.mobile) &&
                Objects.equals(usertype, adminuser.usertype) &&
                Objects.equals(userflag, adminuser.userflag) &&
                Objects.equals(regtime, adminuser.regtime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, pwd, name, mobile, usertype, userflag, regtime);
    }

    @Override
    public String toString() {
        return "Adminuser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", usertype=" + usertype +
                ", userflag=" + userflag +
                ", regtime=" + regtime +
                '}';
    }
}