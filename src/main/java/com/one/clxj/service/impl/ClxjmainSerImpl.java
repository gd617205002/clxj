package com.one.clxj.service.impl;

import com.one.clxj.mapper.ClxjmainMapper;
import com.one.clxj.pojo.Clxjmain;
import com.one.clxj.pojo.ClxjmainExample;
import com.one.clxj.service.ClxjmainSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

@Service
@Transactional
public class ClxjmainSerImpl extends SuperServiceImpl<Clxjmain, ClxjmainExample> implements ClxjmainSer {
    @Autowired
    private ClxjmainMapper clxjmainMapper;

    @PostConstruct
//    初始化
    public void init() {

        super.mapper = clxjmainMapper;
    }
}