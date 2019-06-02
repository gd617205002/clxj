package com.one.clxj.service.impl;

import com.one.clxj.mapper.ConfessionMapper;
import com.one.clxj.pojo.Confession;
import com.one.clxj.pojo.ConfessionExample;
import com.one.clxj.service.ConfessionSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
@Transactional
public class ConfessionSerImpl implements ConfessionSer {
    @Autowired
    private ConfessionMapper confessionMapper;

    @Override
    public int countByExample(ConfessionExample example) {
        return confessionMapper.countByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return confessionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(Confession record) {
        return confessionMapper.insertSelective(record);
    }

    @Override
    public List<Confession> selectByExample(ConfessionExample example) {
        return confessionMapper.selectByExample(example);
    }

    @Override
    public Confession selectByPrimaryKey(Integer id) {
        return confessionMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Confession record) {
        return confessionMapper.updateByPrimaryKeySelective(record);
    }
}