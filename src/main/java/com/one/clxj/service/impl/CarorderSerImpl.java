package com.one.clxj.service.impl;

import com.one.clxj.mapper.CarorderMapper;
import com.one.clxj.pojo.Carorder;
import com.one.clxj.pojo.CarorderExample;
import com.one.clxj.service.CarorderSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

@Service
@Transactional public  class CarorderSerImpl extends SuperServiceImpl<Carorder,CarorderExample>implements CarorderSer {

    @Autowired
    private CarorderMapper carorderMapper;

    @PostConstruct
//    初始化
    public void init(){

        super.mapper = carorderMapper;
    }


}