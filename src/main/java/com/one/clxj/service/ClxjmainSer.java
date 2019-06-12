package com.one.clxj.service;

import com.one.clxj.mapper.ClxjmainMapper;
import com.one.clxj.pojo.Clxjmain;
import com.one.clxj.pojo.ClxjmainExample;

import java.util.List;

public  interface ClxjmainSer{

    int countByExample(ClxjmainExample example);

    int deleteByPrimaryKey(Integer id);


    int insertSelective(Clxjmain record);

    List<Clxjmain> selectByExample(ClxjmainExample example);

    Clxjmain selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Clxjmain record);
}