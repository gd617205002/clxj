package com.one.clxj.service;


import com.one.clxj.pojo.Joincar;
import com.one.clxj.pojo.JoincarExample;

import java.util.List;

public  interface JoincarSer {

    int countByExample(JoincarExample example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Joincar record);

    List<Joincar> selectByExample(JoincarExample example);

    Joincar selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Joincar record);

}