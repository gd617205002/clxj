package com.one.clxj.service.impl;

import com.one.clxj.mapper.CityMapper;
import com.one.clxj.pojo.City;
import com.one.clxj.pojo.CityExample;
import com.one.clxj.service.CitySer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

@Service
@Transactional
public class CitySerImpl extends SuperServiceImpl<City,CityExample> implements CitySer {
    @Autowired
    private CityMapper cityMapper;

    @PostConstruct
//    初始化
    public void init() {

        super.mapper = cityMapper;
    }
}