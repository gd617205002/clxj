package com.one.clxj.service;

import com.one.clxj.mapper.CarorderMapper;
import com.one.clxj.pojo.Carorder;
import com.one.clxj.pojo.CarorderExample;

import java.util.List;

public  interface CarorderSer {

    int countByExample(CarorderExample example);

    int deleteByPrimaryKey(String oid);

    int insertSelective(Carorder record);

    List<Carorder> selectByExample(CarorderExample example);

    Carorder selectByPrimaryKey(String oid);

    int updateByPrimaryKeySelective(Carorder record);
}