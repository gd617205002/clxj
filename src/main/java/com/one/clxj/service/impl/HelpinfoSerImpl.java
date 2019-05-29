package com.one.clxj.service.impl;

import com.one.clxj.mapper.HelpinfoMapper;
import com.one.clxj.pojo.Helpinfo;
import com.one.clxj.pojo.HelpinfoExample;
import com.one.clxj.service.HelpinfoSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

@Service
@Transactional
public class HelpinfoSerImpl extends SuperServiceImpl<Helpinfo, HelpinfoExample> implements HelpinfoSer {

    @Autowired
    private HelpinfoMapper helpinfoMapper;

    @PostConstruct
//    初始化
    public void init() {

        super.mapper = helpinfoMapper;
    }

}
