package com.one.clxj.service.impl;

import com.one.clxj.mapper.ClxjmainWithBLOBsMapper;
import com.one.clxj.pojo.ClxjmainWithBLOBs;
import com.one.clxj.service.ClxjmainWithBLOBsSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

@Service
@Transactional
public class ClxjmainWithBLOBsSerImpl extends SuperServiceImpl<ClxjmainWithBLOBs, Object> implements ClxjmainWithBLOBsSer {
    @Autowired
    private ClxjmainWithBLOBsMapper clxjmainWithBLOBsMapper;

    @PostConstruct
//    初始化
    public void init() {

        super.mapper = clxjmainWithBLOBsMapper;
    }
}