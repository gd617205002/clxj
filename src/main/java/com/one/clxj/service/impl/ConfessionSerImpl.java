package com.one.clxj.service.impl;

import com.one.clxj.mapper.ConfessionMapper;
import com.one.clxj.pojo.Confession;
import com.one.clxj.pojo.ConfessionExample;
import com.one.clxj.service.ConfessionSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

@Service
@Transactional
public class ConfessionSerImpl extends SuperServiceImpl<Confession, ConfessionExample> implements ConfessionSer {
    @Autowired
    private ConfessionMapper confessionMapper;

    @PostConstruct
//    初始化
    public void init() {

        super.mapper = confessionMapper;
    }
}