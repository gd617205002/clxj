package com.one.clxj.service.impl;

import com.one.clxj.mapper.AfluserMapper;
import com.one.clxj.pojo.Afluser;
import com.one.clxj.pojo.AfluserExample;
import com.one.clxj.service.AfluserSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
@Transactional public  class AfluserSerImpl implements AfluserSer {

    @Autowired
    private AfluserMapper afluserMapper;


    @Override
    public int countByExample(AfluserExample example) {
        return afluserMapper.countByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return afluserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(Afluser record) {
        return afluserMapper.insertSelective(record);
    }

    @Override
    public List<Afluser> selectByExample(AfluserExample example) {
        return afluserMapper.selectByExample(example);
    }

    @Override
    public Afluser selectByPrimaryKey(Integer id) {
        return afluserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Afluser record) {
        return afluserMapper.updateByPrimaryKeySelective(record);
    }
}