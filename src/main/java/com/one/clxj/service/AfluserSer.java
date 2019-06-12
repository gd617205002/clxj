package com.one.clxj.service;


import com.one.clxj.pojo.Afluser;
import com.one.clxj.pojo.AfluserExample;

import java.util.List;

public  interface AfluserSer {

    int countByExample(AfluserExample example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Afluser record);

    List<Afluser> selectByExample(AfluserExample example);

    Afluser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Afluser record);

}