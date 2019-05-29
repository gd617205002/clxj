package com.one.clxj.service.impl;


import com.one.clxj.mapper.GroupingMapper;
import com.one.clxj.pojo.GroupingExample;
import com.one.clxj.service.GroupingSer;
import com.one.clxj.pojo.Grouping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

@Service
@Transactional
public class GroupingSerImpl extends SuperServiceImpl<Grouping, GroupingExample> implements GroupingSer {
    @Autowired
    private GroupingMapper groupingMapper;

    @PostConstruct
//    初始化
    public void init() {

        super.mapper = groupingMapper;
    }
}