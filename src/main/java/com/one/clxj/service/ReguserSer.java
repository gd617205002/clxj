package com.one.clxj.service;

import com.one.clxj.pojo.Reguser;

import java.util.List;

public  interface ReguserSer extends SuperService<Reguser>{

    public List<Reguser>  reguserAll();
    public Reguser reguserById (int id);
}