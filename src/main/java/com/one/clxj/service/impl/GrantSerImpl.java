package com.one.clxj.service.impl;

import com.one.clxj.mapper.GrantMapper;
import com.one.clxj.pojo.Grant;
import com.one.clxj.pojo.GrantExample;
import com.one.clxj.service.GrantSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
@Transactional
public class GrantSerImpl  implements GrantSer {
    @Autowired
    private GrantMapper grantMapper;


    @Override
    public int countByExample(GrantExample example) {
        return grantMapper.countByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return grantMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(Grant record) {
        return grantMapper.insertSelective(record);
    }

    @Override
    public List<Grant> selectByExample(GrantExample example) {
        return grantMapper.selectByExample(example);
    }

    @Override
    public Grant selectByPrimaryKey(Integer id) {
        return grantMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Grant record) {
        return grantMapper.updateByPrimaryKeySelective(record);
    }
}