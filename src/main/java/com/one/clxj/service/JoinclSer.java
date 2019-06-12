package com.one.clxj.service;


import com.one.clxj.pojo.Joincl;
import com.one.clxj.pojo.JoinclExample;

import java.util.List;

public  interface JoinclSer {

    int countByExample(JoinclExample example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Joincl record);

    List<Joincl> selectByExample(JoinclExample example);

    Joincl selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Joincl record);
}