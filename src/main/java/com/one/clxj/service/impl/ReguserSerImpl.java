package com.one.clxj.service.impl;

import com.one.clxj.mapper.ReguserMapper;
import com.one.clxj.pojo.Reguser;
import com.one.clxj.pojo.ReguserExample;
import com.one.clxj.service.ReguserSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
@Transactional
public class ReguserSerImpl  implements ReguserSer   {
    @Autowired
    private ReguserMapper reguserMapper;


    @Override
    public int countByExample(ReguserExample example) {
        return reguserMapper.countByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return reguserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(Reguser record) {
        return reguserMapper.insertSelective(record);
    }

    @Override
    public List<Reguser> selectByExample(ReguserExample example) {
        return reguserMapper.selectByExample(example);
    }

    @Override
    public Reguser selectByPrimaryKey(Integer id) {
        return reguserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Reguser record) {
        return reguserMapper.updateByPrimaryKeySelective(record);
    }
}