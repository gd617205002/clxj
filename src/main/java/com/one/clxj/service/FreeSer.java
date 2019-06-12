package com.one.clxj.service;

import com.one.clxj.pojo.Free;
import com.one.clxj.pojo.FreeExample;


import java.util.List;

public  interface FreeSer {

    int countByExample(FreeExample example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Free record);

    List<Free> selectByExample(FreeExample example);

    Free selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Free record);

}