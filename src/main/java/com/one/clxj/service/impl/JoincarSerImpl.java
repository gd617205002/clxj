package com.one.clxj.service.impl;

import com.one.clxj.mapper.JoincarMapper;
import com.one.clxj.pojo.Joincar;
import com.one.clxj.pojo.JoincarExample;
import com.one.clxj.service.JoincarSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
@Transactional
public class JoincarSerImpl  implements JoincarSer {
    @Autowired
    private JoincarMapper joincarMapper;

    @Override
    public int countByExample(JoincarExample example) {
        return joincarMapper.countByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return joincarMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(Joincar record) {
        return joincarMapper.insertSelective(record);
    }

    @Override
    public List<Joincar> selectByExample(JoincarExample example) {
        return joincarMapper.selectByExample(example);
    }

    @Override
    public Joincar selectByPrimaryKey(Integer id) {
        return joincarMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Joincar record) {
        return joincarMapper.updateByPrimaryKeySelective(record);
    }
}