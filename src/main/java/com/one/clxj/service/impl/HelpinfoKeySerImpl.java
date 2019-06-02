package com.one.clxj.service.impl;

import com.github.pagehelper.PageInfo;
import com.one.clxj.mapper.HelpinfoKeyMapper;
import com.one.clxj.pojo.HelpinfoKey;
import com.one.clxj.service.HelpinfoKeySer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

@Service
@Transactional
public class HelpinfoKeySerImpl implements HelpinfoKeySer {
    @Autowired
    private HelpinfoKeyMapper helpinfoKeyMapper;

    @Override
    public PageInfo<HelpinfoKey> paging(Integer page, Integer num) {
        return null;
    }

    @Override
    public PageInfo<HelpinfoKey> conditionPaging(Integer page, Integer num, Object o) {
        return null;
    }
}