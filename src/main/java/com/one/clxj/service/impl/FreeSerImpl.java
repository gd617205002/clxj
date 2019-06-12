package com.one.clxj.service.impl;


import com.one.clxj.mapper.FreeMapper;

import com.one.clxj.pojo.Free;
import com.one.clxj.pojo.FreeExample;
import com.one.clxj.service.FreeSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class FreeSerImpl implements FreeSer {

    @Autowired
    private FreeMapper freeMapper;

    @Override
    public int countByExample(FreeExample example) {
        return freeMapper.countByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return freeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(Free record) {
        return freeMapper.insertSelective(record);
    }

    @Override
    public List<Free> selectByExample(FreeExample example) {
        return freeMapper.selectByExample(example);
    }

    @Override
    public Free selectByPrimaryKey(Integer id) {
        return freeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Free record) {
        return freeMapper.updateByPrimaryKeySelective(record);
    }
}