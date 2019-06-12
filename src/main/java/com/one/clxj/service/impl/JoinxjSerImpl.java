package com.one.clxj.service.impl;

import com.one.clxj.mapper.JoinxjMapper;
import com.one.clxj.pojo.Joinxj;
import com.one.clxj.pojo.JoinxjExample;
import com.one.clxj.service.JoinxjSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
@Transactional
public class JoinxjSerImpl  implements JoinxjSer {
    @Autowired
    private JoinxjMapper joinxjMapper;

    @Override
    public int countByExample(JoinxjExample example) {
        return joinxjMapper.countByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return joinxjMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(Joinxj record) {
        return joinxjMapper.insertSelective(record);
    }

    @Override
    public List<Joinxj> selectByExample(JoinxjExample example) {
        return joinxjMapper.selectByExample(example);
    }

    @Override
    public Joinxj selectByPrimaryKey(Integer id) {
        return joinxjMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Joinxj record) {
        return joinxjMapper.updateByPrimaryKeySelective(record);
    }
}