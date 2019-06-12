package com.one.clxj.service.impl;

import com.one.clxj.mapper.ClxjorderMapper;
import com.one.clxj.pojo.Clxjorder;
import com.one.clxj.pojo.ClxjorderExample;
import com.one.clxj.service.ClxjorderSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
@Transactional
public class ClxjorderSerImpl  implements ClxjorderSer {
    @Autowired
    private ClxjorderMapper clxjorderMapper;


    @Override
    public int countByExample(ClxjorderExample example) {
        return clxjorderMapper.countByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String oid) {
        return clxjorderMapper.deleteByPrimaryKey(oid);
    }

    @Override
    public int insertSelective(Clxjorder record) {
        return clxjorderMapper.insertSelective(record);
    }

    @Override
    public List<Clxjorder> selectByExample(ClxjorderExample example) {
        return clxjorderMapper.selectByExample(example);
    }

    @Override
    public Clxjorder selectByPrimaryKey(String oid) {
        return clxjorderMapper.selectByPrimaryKey(oid);
    }

    @Override
    public int updateByPrimaryKeySelective(Clxjorder record) {
        return clxjorderMapper.updateByPrimaryKeySelective(record);
    }
}