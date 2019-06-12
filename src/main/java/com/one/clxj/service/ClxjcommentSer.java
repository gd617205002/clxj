package com.one.clxj.service;

import com.one.clxj.mapper.ClxjcommentMapper;
import com.one.clxj.pojo.Clxjcomment;
import com.one.clxj.pojo.ClxjcommentExample;

import java.util.List;

public  interface ClxjcommentSer {

    int countByExample(ClxjcommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Clxjcomment record);

    List<Clxjcomment> selectByExample(ClxjcommentExample example);

    Clxjcomment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Clxjcomment record);

}