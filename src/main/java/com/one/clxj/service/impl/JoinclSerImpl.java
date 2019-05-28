package com.one.clxj.service.impl;

import com.one.clxj.mapper.JoinclMapper;
import com.one.clxj.pojo.Joincl;
import com.one.clxj.pojo.JoinclExample;
import com.one.clxj.service.JoinclSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

@Service
@Transactional
public class JoinclSerImpl extends SuperServiceImpl<Joincl, JoinclExample> implements JoinclSer {
    @Autowired
    private JoinclMapper joinclMapper;

    @PostConstruct
//    初始化
    public void init() {

        super.mapper = joinclMapper;
    }
}