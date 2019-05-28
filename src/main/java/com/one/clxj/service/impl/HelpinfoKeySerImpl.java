package com.one.clxj.service.impl;

import com.one.clxj.mapper.HelpinfoKeyMapper;
import com.one.clxj.pojo.HelpinfoKey;
import com.one.clxj.service.HelpinfoKeySer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

@Service
@Transactional
public class HelpinfoKeySerImpl extends SuperServiceImpl<HelpinfoKey, Object> implements HelpinfoKeySer {
    @Autowired
    private HelpinfoKeyMapper helpinfoKeyMapper;

    @PostConstruct
//    初始化
    public void init() {

        super.mapper = helpinfoKeyMapper;
    }
}