package com.one.clxj.service;


import com.one.clxj.pojo.Confession;
import com.one.clxj.pojo.ConfessionExample;

import java.util.List;

public  interface ConfessionSer{

    int countByExample(ConfessionExample example);

    int deleteByPrimaryKey(Integer id);


    int insertSelective(Confession record);

    List<Confession> selectByExample(ConfessionExample example);

    Confession selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Confession record);
}