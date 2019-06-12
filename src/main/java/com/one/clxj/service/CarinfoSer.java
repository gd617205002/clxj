package com.one.clxj.service;

import com.one.clxj.mapper.CarinfoMapper;
import com.one.clxj.pojo.Carinfo;
import com.one.clxj.pojo.CarinfoExample;

import java.util.List;

public  interface CarinfoSer{

    int countByExample(CarinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Carinfo record);

    List<Carinfo> selectByExample(CarinfoExample example);

    Carinfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Carinfo record);
}