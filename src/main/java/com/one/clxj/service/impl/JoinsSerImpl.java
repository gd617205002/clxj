package com.one.clxj.service.impl;

import com.one.clxj.mapper.JoinsMapper;
import com.one.clxj.pojo.Joins;
import com.one.clxj.pojo.JoinsExample;
import com.one.clxj.service.JoinsSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

@Service
@Transactional
public class JoinsSerImpl extends SuperServiceImpl<Joins, JoinsExample> implements JoinsSer {
    @Autowired
    private JoinsMapper joinsMapper;

    @PostConstruct
//    初始化
    public void init() {

        super.mapper = joinsMapper;
    }
}