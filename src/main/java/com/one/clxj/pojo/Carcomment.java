package com.one.clxj.pojo;

import java.util.Date;

/**
 * 车辆评论实体类
 */
public class Carcomment {
    private Integer id; //编号

    private Carinfo carinfo; //车辆信息

    private Reguser reguser; //用户信息

    private Integer cflag; //推荐状态

    private String content; //内容

    private Date commenttime; //留言时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getCflag() {
        return cflag;
    }

    public void setCflag(Integer cflag) {
        this.cflag = cflag;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getCommenttime() {
        return commenttime;
    }

    public void setCommenttime(Date commenttime) {
        this.commenttime = commenttime;
    }

    @Override
    public String toString() {
        return "Carcomment{" +
                "id=" + id +
                ", carinfo=" + carinfo +
                ", reguser=" + reguser +
                ", cflag=" + cflag +
                ", content='" + content + '\'' +
                ", commenttime=" + commenttime +
                '}';
    }
}