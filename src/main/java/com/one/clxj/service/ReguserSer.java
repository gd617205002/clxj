package com.one.clxj.service;

import com.one.clxj.mapper.ReguserMapper;
import com.one.clxj.pojo.Reguser;
import com.one.clxj.pojo.ReguserExample;

import java.util.List;

public  interface ReguserSer {

    int countByExample(ReguserExample example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Reguser record);

    List<Reguser> selectByExample(ReguserExample example);

    Reguser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Reguser record);

}