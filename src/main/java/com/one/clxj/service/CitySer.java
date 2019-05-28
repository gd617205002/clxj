package com.one.clxj.service;

import com.one.clxj.pojo.City;

public  interface CitySer extends SuperService<City>{
    public City cityById(int id);
}