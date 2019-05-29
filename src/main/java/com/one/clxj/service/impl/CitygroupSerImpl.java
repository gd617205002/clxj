package com.one.clxj.service.impl;

import com.one.clxj.mapper.CitygroupMapper;
import com.one.clxj.pojo.Citygroup;
import com.one.clxj.pojo.CitygroupExample;
import com.one.clxj.service.CitygroupSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

@Service
@Transactional
public class CitygroupSerImpl extends SuperServiceImpl<Citygroup, CitygroupExample> implements CitygroupSer {
    @Autowired
    private CitygroupMapper citygroupMapper;

    @PostConstruct
//    初始化
    public void init() {

        super.mapper = citygroupMapper;
    }
}