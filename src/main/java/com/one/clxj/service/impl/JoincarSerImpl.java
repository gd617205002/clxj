package com.one.clxj.service.impl;

import com.one.clxj.mapper.JoincarMapper;
import com.one.clxj.pojo.Joincar;
import com.one.clxj.pojo.JoincarExample;
import com.one.clxj.service.JoincarSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

@Service
@Transactional
public class JoincarSerImpl extends SuperServiceImpl<Joincar, JoincarExample> implements JoincarSer {
    @Autowired
    private JoincarMapper joincarMapper;

    @PostConstruct
//    初始化
    public void init() {

        super.mapper = joincarMapper;
    }
}