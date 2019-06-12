package com.one.clxj.service;


import com.one.clxj.pojo.Clxjorder;
import com.one.clxj.pojo.ClxjorderExample;

import java.util.List;

public  interface ClxjorderSer {

    int countByExample(ClxjorderExample example);

    int deleteByPrimaryKey(String oid);

    int insertSelective(Clxjorder record);

    List<Clxjorder> selectByExample(ClxjorderExample example);

    Clxjorder selectByPrimaryKey(String oid);

    int updateByPrimaryKeySelective(Clxjorder record);
}