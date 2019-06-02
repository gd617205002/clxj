package com.one.clxj.service.impl;


import com.one.clxj.mapper.GroupingMapper;
import com.one.clxj.pojo.GroupingExample;
import com.one.clxj.service.GroupingSer;
import com.one.clxj.pojo.Grouping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
@Transactional
public class GroupingSerImpl implements GroupingSer {
    @Autowired
    private GroupingMapper groupingMapper;

    @Override
    public int countByExample(GroupingExample example) {
        return groupingMapper.countByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return groupingMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(Grouping record) {
        return groupingMapper.insertSelective(record);
    }

    @Override
    public List<Grouping> selectByExample(GroupingExample example) {
        return groupingMapper.selectByExample(example);
    }

    @Override
    public Grouping selectByPrimaryKey(Integer id) {
        return groupingMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Grouping record) {
        return groupingMapper.updateByPrimaryKeySelective(record);
    }
}