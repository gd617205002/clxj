package com.one.clxj.service.impl;

import com.one.clxj.mapper.ReguserMapper;
import com.one.clxj.pojo.Reguser;
import com.one.clxj.pojo.ReguserExample;
import com.one.clxj.service.ReguserSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

@Service
@Transactional
public class ReguserSerImpl extends SuperServiceImpl<Reguser, ReguserExample> implements ReguserSer {
    @Autowired
    private ReguserMapper reguserMapper;

    @PostConstruct
//    初始化
    public void init() {

        super.mapper = reguserMapper;
    }
}