package com.one.clxj.pojo;

import java.util.Date;

/**
 * 车辆评论实体类
 */
public class Carcomment {
    private Integer id; //编号

    private Carinfo cid; //车辆信息

    private Reguser uid; //用户信息

    private Integer cflag; //推荐状态

    private String content; //内容

    private Date commenttime; //留言时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Carinfo getCid() {
        return cid;
    }

    public void setCid(Carinfo cid) {
        this.cid = cid;
    }

    public Reguser getUid() {
        return uid;
    }

    public void setUid(Reguser uid) {
        this.uid = uid;
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
                ", cid=" + cid +
                ", uid=" + uid +
                ", cflag=" + cflag +
                ", content='" + content + '\'' +
                ", commenttime=" + commenttime +
                '}';
    }
}