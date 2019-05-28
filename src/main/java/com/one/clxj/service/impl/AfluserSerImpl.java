package com.one.clxj.service.impl;

import com.one.clxj.mapper.AfluserMapper;
import com.one.clxj.pojo.Afluser;
import com.one.clxj.pojo.AfluserExample;
import com.one.clxj.service.AfluserSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

@Service
@Transactional public  class AfluserSerImpl extends SuperServiceImpl<Afluser,AfluserExample>implements AfluserSer {

    @Autowired
    private AfluserMapper afluserMapper;

    @PostConstruct
//    初始化
    public void init(){
        super.mapper = afluserMapper;
    }

}