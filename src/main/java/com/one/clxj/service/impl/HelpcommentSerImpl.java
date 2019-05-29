package com.one.clxj.service.impl;

import com.one.clxj.mapper.HelpcommentMapper;
import com.one.clxj.pojo.Helpcomment;
import com.one.clxj.pojo.HelpcommentExample;
import com.one.clxj.service.HelpcommentSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

@Service
@Transactional
public class HelpcommentSerImpl extends SuperServiceImpl<Helpcomment, HelpcommentExample> implements HelpcommentSer {
    @Autowired
    private HelpcommentMapper helpcommentMapper;

    @PostConstruct
//    初始化
    public void init() {

        super.mapper = helpcommentMapper;
    }

}