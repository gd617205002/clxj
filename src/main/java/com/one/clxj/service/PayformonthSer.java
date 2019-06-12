package com.one.clxj.service;

import com.one.clxj.pojo.Payformonth;
import com.one.clxj.pojo.PayformonthExample;

import java.util.List;

public  interface PayformonthSer{

    int countByExample(PayformonthExample example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Payformonth record);

    List<Payformonth> selectByExample(PayformonthExample example);

    Payformonth selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Payformonth record);

}