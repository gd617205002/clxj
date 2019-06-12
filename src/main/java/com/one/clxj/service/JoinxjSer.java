package com.one.clxj.service;

import com.one.clxj.mapper.JoinxjMapper;
import com.one.clxj.pojo.Joinxj;
import com.one.clxj.pojo.JoinxjExample;

import java.util.List;

public  interface JoinxjSer {

    int countByExample(JoinxjExample example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Joinxj record);

    List<Joinxj> selectByExample(JoinxjExample example);

    Joinxj selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Joinxj record);

}