package com.one.clxj.pojo;

import javax.persistence.Id;

/**
 * 城市分组实体类
 */
public class Citygroup {
    @Id
    private Integer id; //编号

    private City city; //城市编号

    private Grouping grouping; //城市分组编号

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Grouping getGrouping() {
        return grouping;
    }

    public void setGrouping(Grouping grouping) {
        this.grouping = grouping;
    }

    @Override
    public String toString() {
        return "Citygroup{" +
                "id=" + id +
                ", city=" + city +
                ", grouping=" + grouping +
                '}';
    }
}