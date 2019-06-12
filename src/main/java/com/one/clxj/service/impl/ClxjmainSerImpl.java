package com.one.clxj.service.impl;

import com.one.clxj.mapper.ClxjmainMapper;
import com.one.clxj.pojo.Clxjmain;
import com.one.clxj.pojo.ClxjmainExample;
import com.one.clxj.service.ClxjmainSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
@Transactional
public class ClxjmainSerImpl implements ClxjmainSer {
    @Autowired
    private ClxjmainMapper clxjmainMapper;


    @Override
    public int countByExample(ClxjmainExample example) {
        return clxjmainMapper.countByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return clxjmainMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(Clxjmain record) {
        return clxjmainMapper.insertSelective(record);
    }

    @Override
    public List<Clxjmain> selectByExample(ClxjmainExample example) {
        return clxjmainMapper.selectByExample(example);
    }

    @Override
    public Clxjmain selectByPrimaryKey(Integer id) {
        return clxjmainMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Clxjmain record) {
        return clxjmainMapper.updateByPrimaryKeySelective(record);
    }
}