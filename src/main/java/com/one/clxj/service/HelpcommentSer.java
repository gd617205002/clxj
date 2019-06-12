package com.one.clxj.service;


import com.one.clxj.pojo.Helpcomment;
import com.one.clxj.pojo.HelpcommentExample;

import java.util.List;

public  interface HelpcommentSer {

    int countByExample(HelpcommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Helpcomment record);

    List<Helpcomment> selectByExample(HelpcommentExample example);

    Helpcomment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Helpcomment record);
}