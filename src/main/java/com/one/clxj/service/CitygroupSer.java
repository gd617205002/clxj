package com.one.clxj.service;


import com.one.clxj.pojo.Citygroup;
import com.one.clxj.pojo.CitygroupExample;

import java.util.List;

public  interface CitygroupSer {

    int countByExample(CitygroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Citygroup record);

    List<Citygroup> selectByExample(CitygroupExample example);

    Citygroup selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Citygroup record);
}