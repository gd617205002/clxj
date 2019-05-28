package com.one.clxj.pojo;

import javax.persistence.Id;

/**
 * 城市分组类型表
 */
public class Grouping {
    @Id
    private Integer id; //编号

    private String type; //分数类型

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}