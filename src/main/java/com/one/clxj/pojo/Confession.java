package com.one.clxj.pojo;

import java.util.Date;

/**
 * 忏悔实体类
 */
public class Confession {
    private Integer id; //编号

    private Boolean type; //忏悔类型

    private String content; //内容

    private String pwd; //查看密码

    private Date ctime; //忏悔时间

    private Integer returnflag; //回复状态

    private Integer returnuid; //回复人

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public Integer getReturnflag() {
        return returnflag;
    }

    public void setReturnflag(Integer returnflag) {
        this.returnflag = returnflag;
    }

    public Integer getReturnuid() {
        return returnuid;
    }

    public void setReturnuid(Integer returnuid) {
        this.returnuid = returnuid;
    }
}