package com.one.clxj.pojo;

import javax.persistence.Id;

/**
 * 城市信息实体类
 */
public class City {
    @Id
    private Integer id; //编号

    private String chinese; //城市名称

    private String pinyin; //拼音

    private String abbreviations; //缩写

    private Integer status; //状态

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getChinese() {
        return chinese;
    }

    public void setChinese(String chinese) {
        this.chinese = chinese == null ? null : chinese.trim();
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin == null ? null : pinyin.trim();
    }

    public String getAbbreviations() {
        return abbreviations;
    }

    public void setAbbreviations(String abbreviations) {
        this.abbreviations = abbreviations == null ? null : abbreviations.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", chinese='" + chinese + '\'' +
                ", pinyin='" + pinyin + '\'' +
                ", abbreviations='" + abbreviations + '\'' +
                ", status=" + status +
                '}';
    }
}