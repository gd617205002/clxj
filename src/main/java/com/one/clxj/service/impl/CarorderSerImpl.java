package com.one.clxj.service.impl;

import com.one.clxj.mapper.CarorderMapper;
import com.one.clxj.pojo.Carorder;
import com.one.clxj.pojo.CarorderExample;
import com.one.clxj.service.CarorderSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
@Transactional public  class CarorderSerImpl implements CarorderSer {

    @Autowired
    private CarorderMapper carorderMapper;


    @Override
    public int countByExample(CarorderExample example) {
        return carorderMapper.countByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String oid) {
        return carorderMapper.deleteByPrimaryKey(oid);
    }

    @Override
    public int insertSelective(Carorder record) {
        return carorderMapper.insertSelective(record);
    }

    @Override
    public List<Carorder> selectByExample(CarorderExample example) {
        return carorderMapper.selectByExample(example);
    }

    @Override
    public Carorder selectByPrimaryKey(String oid) {
        return carorderMapper.selectByPrimaryKey(oid);
    }

    @Override
    public int updateByPrimaryKeySelective(Carorder record) {
        return carorderMapper.updateByPrimaryKeySelective(record);
    }
}