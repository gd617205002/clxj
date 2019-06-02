package com.one.clxj.service.impl;

import com.one.clxj.mapper.CitygroupMapper;
import com.one.clxj.pojo.Citygroup;
import com.one.clxj.pojo.CitygroupExample;
import com.one.clxj.service.CitygroupSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
@Transactional
public class CitygroupSerImpl implements CitygroupSer {
    @Autowired
    private CitygroupMapper citygroupMapper;


    @Override
    public int countByExample(CitygroupExample example) {
        return citygroupMapper.countByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return citygroupMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(Citygroup record) {
        return citygroupMapper.insertSelective(record);
    }

    @Override
    public List<Citygroup> selectByExample(CitygroupExample example) {
        return citygroupMapper.selectByExample(example);
    }

    @Override
    public Citygroup selectByPrimaryKey(Integer id) {
        return citygroupMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Citygroup record) {
        return citygroupMapper.updateByPrimaryKeySelective(record);
    }
}