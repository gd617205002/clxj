package com.one.clxj.service;


import com.one.clxj.pojo.Grants;
import com.one.clxj.pojo.GrantsExample;

import java.util.List;

public  interface GrantsSer{

    int countByExample(GrantsExample example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Grants record);

    List<Grants> selectByExample(GrantsExample example);

    Grants selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Grants record);

}