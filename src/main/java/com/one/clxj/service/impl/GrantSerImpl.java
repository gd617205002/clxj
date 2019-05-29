package com.one.clxj.service.impl;

import com.one.clxj.mapper.GrantMapper;
import com.one.clxj.pojo.Grant;
import com.one.clxj.pojo.GrantExample;
import com.one.clxj.service.GrantSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

@Service
@Transactional
public class GrantSerImpl extends SuperServiceImpl<Grant, GrantExample> implements GrantSer {
    @Autowired
    private GrantMapper grantMapper;

    @PostConstruct
//    初始化
    public void init() {

        super.mapper = grantMapper;
    }
}