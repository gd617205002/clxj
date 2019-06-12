package com.one.clxj.service;

import com.one.clxj.mapper.CityMapper;
import com.one.clxj.pojo.City;
import com.one.clxj.pojo.CityExample;

import java.util.List;

public  interface CitySer{

    int countByExample(CityExample example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(City record);

    List<City> selectByExample(CityExample example);

    City selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(City record);

}