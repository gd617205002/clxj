package com.one.clxj.pojo;

/**
 * 求助评论实体类
 */
public class Helpcomment {
    private Integer id; //编号

    private Helpinfo helpinfo; //求助编号

    private Reguser reguser; //救助评论人

    private String content; //内容

    private String time; //时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public Helpinfo getHelpinfo() {
        return helpinfo;
    }

    public void setHelpinfo(Helpinfo helpinfo) {
        this.helpinfo = helpinfo;
    }

    public Reguser getReguser() {
        return reguser;
    }

    public void setReguser(Reguser reguser) {
        this.reguser = reguser;
    }

    @Override
    public String toString() {
        return "Helpcomment{" +
                "id=" + id +
                ", helpinfo=" + helpinfo +
                ", reguser=" + reguser +
                ", content='" + content + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}