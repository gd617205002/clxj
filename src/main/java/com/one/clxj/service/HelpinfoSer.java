package com.one.clxj.service;


import com.one.clxj.pojo.Helpinfo;
import com.one.clxj.pojo.HelpinfoExample;

import java.util.List;

public  interface HelpinfoSer{

    int countByExample(HelpinfoExample example);;

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Helpinfo record);

    List<Helpinfo> selectByExample(HelpinfoExample example);

    Helpinfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Helpinfo record);
}