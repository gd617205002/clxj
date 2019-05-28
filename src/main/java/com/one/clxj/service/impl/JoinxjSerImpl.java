package com.one.clxj.service.impl;

import com.one.clxj.mapper.JoinxjMapper;
import com.one.clxj.pojo.Joinxj;
import com.one.clxj.pojo.JoinxjExample;
import com.one.clxj.service.JoinxjSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

@Service
@Transactional
public class JoinxjSerImpl extends SuperServiceImpl<Joinxj, JoinxjExample> implements JoinxjSer {
    @Autowired
    private JoinxjMapper joinxjMapper;

    @PostConstruct
//    初始化
    public void init() {

        super.mapper = joinxjMapper;
    }
}