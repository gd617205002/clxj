package com.one.clxj.service.impl;

import com.one.clxj.mapper.JoinsMapper;
import com.one.clxj.pojo.Joins;
import com.one.clxj.pojo.JoinsExample;
import com.one.clxj.service.JoinsSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
@Transactional
public class JoinsSerImpl  implements JoinsSer {
    @Autowired
    private JoinsMapper joinsMapper;


    @Override
    public int countByExample(JoinsExample example) {
        return joinsMapper.countByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return joinsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(Joins record) {
        return joinsMapper.insertSelective(record);
    }

    @Override
    public List<Joins> selectByExample(JoinsExample example) {
        return joinsMapper.selectByExample(example);
    }

    @Override
    public Joins selectByPrimaryKey(Integer id) {
        return joinsMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Joins record) {
        return joinsMapper.updateByPrimaryKeySelective(record);
    }
}