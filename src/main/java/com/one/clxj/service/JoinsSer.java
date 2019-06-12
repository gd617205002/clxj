package com.one.clxj.service;


import com.one.clxj.pojo.Joins;
import com.one.clxj.pojo.JoinsExample;

import java.util.List;

public  interface JoinsSer {

    int countByExample(JoinsExample example);

    int deleteByPrimaryKey(Integer id);


    int insertSelective(Joins record);

    List<Joins> selectByExample(JoinsExample example);

    Joins selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(Joins record);
}