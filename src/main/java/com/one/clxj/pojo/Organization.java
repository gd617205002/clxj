package com.one.clxj.pojo;

import java.util.Date;

public class Organization {
    private Integer org_id;

    private String org_name;

    private String org_description;

    private String org_manager;

    private String org_phone;

    private Integer org_parentid;

    private Date org_establishTime;

    private String org_path;

    public Integer getOrg_id() {
        return org_id;
    }

    public void setOrg_id(Integer org_id) {
        this.org_id = org_id;
    }

    public String getOrg_name() {
        return org_name;
    }

    public void setOrg_name(String org_name) {
        this.org_name = org_name == null ? null : org_name.trim();
    }

    public String getOrg_description() {
        return org_description;
    }

    public void setOrg_description(String org_description) {
        this.org_description = org_description == null ? null : org_description.trim();
    }

    public String getOrg_manager() {
        return org_manager;
    }

    public void setOrg_manager(String org_manager) {
        this.org_manager = org_manager == null ? null : org_manager.trim();
    }

    public String getOrg_phone() {
        return org_phone;
    }

    public void setOrg_phone(String org_phone) {
        this.org_phone = org_phone == null ? null : org_phone.trim();
    }

    public Integer getOrg_parentid() {
        return org_parentid;
    }

    public void setOrg_parentid(Integer org_parentid) {
        this.org_parentid = org_parentid;
    }

    public Date getOrg_establishTime() {
        return org_establishTime;
    }

    public void setOrg_establishTime(Date org_establishTime) {
        this.org_establishTime = org_establishTime;
    }

    public String getOrg_path() {
        return org_path;
    }

    public void setOrg_path(String org_path) {
        this.org_path = org_path == null ? null : org_path.trim();
    }
}