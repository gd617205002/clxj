package com.one.clxj.pojo;

import javax.persistence.Id;

public class HelpinfoKey {
    @Id
    private Integer id;

    private String idcard;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }
}