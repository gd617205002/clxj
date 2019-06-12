package com.one.clxj.service;


import com.one.clxj.pojo.Grouping;
import com.one.clxj.pojo.GroupingExample;

import java.util.List;

public  interface GroupingSer{

    int countByExample(GroupingExample example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Grouping record);

    List<Grouping> selectByExample(GroupingExample example);

    Grouping selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Grouping record);

}