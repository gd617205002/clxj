package com.one.clxj.pojo;

import java.util.Date;

/**
 * 忏悔解脱实体类
 */
public class Free {
    private Integer id; //编号

    private Confession confession; //忏悔编号

    private Integer type; //解脱类型

    private String content; //内容

    private Date ftime; // 时间

    private Integer readnum; //阅读数量

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getFtime() {
        return ftime;
    }

    public void setFtime(Date ftime) {
        this.ftime = ftime;
    }

    public Integer getReadnum() {
        return readnum;
    }

    public void setReadnum(Integer readnum) {
        this.readnum = readnum;
    }

    public Confession getConfession() {
        return confession;
    }

    public void setConfession(Confession confession) {
        this.confession = confession;
    }

    @Override
    public String toString() {
        return "Free{" +
                "id=" + id +
                ", confession=" + confession +
                ", type=" + type +
                ", content='" + content + '\'' +
                ", ftime=" + ftime +
                ", readnum=" + readnum +
                '}';
    }
}