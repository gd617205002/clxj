package com.one.clxj.service;

import com.one.clxj.pojo.Adminuser;
import com.one.clxj.pojo.AdminuserExample;

import java.util.List;

public  interface AdminuserSer {

    int countByExample(AdminuserExample example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Adminuser record);

    List<Adminuser> selectByExample(AdminuserExample example);

    Adminuser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Adminuser record);

}