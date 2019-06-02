package com.one.clxj.service.impl;

import com.one.clxj.mapper.JoinclMapper;
import com.one.clxj.pojo.Joincl;
import com.one.clxj.pojo.JoinclExample;
import com.one.clxj.service.JoinclSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
@Transactional
public class JoinclSerImpl  implements JoinclSer {
    @Autowired
    private JoinclMapper joinclMapper;


    @Override
    public int countByExample(JoinclExample example) {
        return joinclMapper.countByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return joinclMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(Joincl record) {
        return joinclMapper.insertSelective(record);
    }

    @Override
    public List<Joincl> selectByExample(JoinclExample example) {
        return joinclMapper.selectByExample(example);
    }

    @Override
    public Joincl selectByPrimaryKey(Integer id) {
        return joinclMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Joincl record) {
        return joinclMapper.updateByPrimaryKeySelective(record);
    }
}