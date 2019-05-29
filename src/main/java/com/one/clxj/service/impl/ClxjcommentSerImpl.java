package com.one.clxj.service.impl;

import com.one.clxj.mapper.ClxjcommentMapper;
import com.one.clxj.pojo.Clxjcomment;
import com.one.clxj.pojo.ClxjcommentExample;
import com.one.clxj.service.ClxjcommentSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

@Service
@Transactional
public class ClxjcommentSerImpl extends SuperServiceImpl<Clxjcomment, ClxjcommentExample> implements ClxjcommentSer {
    @Autowired
    private ClxjcommentMapper clxjcommentMapper;

    @PostConstruct
//    初始化
    public void init() {

        super.mapper = clxjcommentMapper;
    }
}