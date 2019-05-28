package com.one.clxj.pojo;

import javax.persistence.Id;
import java.util.Date;

/**
 * 丛林闲居留言实体类
 */
public class Clxjcomment {
    @Id
    private Integer id; //编号

    private Clxjmain clxjmain; //丛林闲居编号

    private Reguser reguser; //用户编号

    private Integer cflag; //是否推荐

    private String content; //内容

    private String photo;

    private Date commenttime; //留言时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public Date getCommenttime() {
        return commenttime;
    }

    public void setCommenttime(Date commenttime) {
        this.commenttime = commenttime;
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
        return "Clxjcomment{" +
                "id=" + id +
                ", clxjmain=" + clxjmain +
                ", reguser=" + reguser +
                ", cflag=" + cflag +
                ", content='" + content + '\'' +
                ", photo='" + photo + '\'' +
                ", commenttime=" + commenttime +
                '}';
    }
}