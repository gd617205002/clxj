package com.one.clxj.service.impl;

import com.one.clxj.mapper.ClxjorderMapper;
import com.one.clxj.pojo.Clxjorder;
import com.one.clxj.pojo.ClxjorderExample;
import com.one.clxj.service.ClxjorderSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

@Service
@Transactional
public class ClxjorderSerImpl extends SuperServiceImpl<Clxjorder, ClxjorderExample> implements ClxjorderSer {
    @Autowired
    private ClxjorderMapper clxjorderMapper;

    @PostConstruct
//    初始化
    public void init() {

        super.mapper = clxjorderMapper;
    }
}