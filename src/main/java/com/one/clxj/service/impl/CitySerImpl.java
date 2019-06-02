package com.one.clxj.service.impl;

import com.one.clxj.mapper.CityMapper;
import com.one.clxj.pojo.City;
import com.one.clxj.pojo.CityExample;
import com.one.clxj.service.CitySer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
@Transactional
public class CitySerImpl implements CitySer {
    @Autowired
    private CityMapper cityMapper;


    @Override
    public int countByExample(CityExample example) {
        return cityMapper.countByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return cityMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(City record) {
        return cityMapper.insertSelective(record);
    }

    @Override
    public List<City> selectByExample(CityExample example) {
        return cityMapper.selectByExample(example);
    }

    @Override
    public City selectByPrimaryKey(Integer id) {
        return cityMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(City record) {
        return cityMapper.updateByPrimaryKeySelective(record);
    }
}