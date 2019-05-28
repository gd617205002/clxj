package com.one.clxj.service.impl;

import com.one.clxj.mapper.CarinfoMapper;
import com.one.clxj.pojo.Carinfo;
import com.one.clxj.pojo.CarinfoExample;
import com.one.clxj.service.CarinfoSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

@Service
@Transactional
public class CarinfoSerImpl extends SuperServiceImpl<Carinfo,CarinfoExample> implements CarinfoSer {

    @Autowired
    private CarinfoMapper carinfoMapper;

    @PostConstruct
//    初始化
    public void init(){

        super.mapper = carinfoMapper;
    }

}
