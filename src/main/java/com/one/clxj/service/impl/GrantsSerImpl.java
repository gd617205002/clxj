package com.one.clxj.service.impl;

import com.one.clxj.mapper.GrantsMapper;
import com.one.clxj.pojo.Grants;
import com.one.clxj.pojo.GrantsExample;
import com.one.clxj.service.GrantsSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
@Transactional
public class GrantsSerImpl  implements GrantsSer {
    @Autowired
    private GrantsMapper grantsMapper;


    @Override
    public int countByExample(GrantsExample example) {
        return grantsMapper.countByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return grantsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(Grants record) {
        return grantsMapper.insertSelective(record);
    }

    @Override
    public List<Grants> selectByExample(GrantsExample example) {
        return grantsMapper.selectByExample(example);
    }

    @Override
    public Grants selectByPrimaryKey(Integer id) {
        return grantsMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Grants record) {
        return grantsMapper.updateByPrimaryKeySelective(record);
    }
}