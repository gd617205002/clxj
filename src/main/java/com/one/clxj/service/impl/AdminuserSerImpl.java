package com.one.clxj.service.impl;

import com.one.clxj.mapper.AdminuserMapper;
import com.one.clxj.pojo.Adminuser;
import com.one.clxj.pojo.AdminuserExample;
import com.one.clxj.service.AdminuserSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class AdminuserSerImpl  implements AdminuserSer {

    @Autowired
    private AdminuserMapper adminuserMapper;

    @Override
    public int countByExample(AdminuserExample example) {
        return adminuserMapper.countByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return adminuserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(Adminuser record) {
        return adminuserMapper.insertSelective(record);
    }

    @Override
    public List<Adminuser> selectByExample(AdminuserExample example) {
        return adminuserMapper.selectByExample(example);
    }

    @Override
    public Adminuser selectByPrimaryKey(Integer id) {
        return adminuserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Adminuser record) {
        return adminuserMapper.updateByPrimaryKeySelective(record);
    }
}