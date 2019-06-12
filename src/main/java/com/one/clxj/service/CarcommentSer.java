package com.one.clxj.service;


import com.one.clxj.pojo.Carcomment;
import com.one.clxj.pojo.CarcommentExample;

import java.util.List;

public  interface CarcommentSer{

    int countByExample(CarcommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Carcomment record);

    List<Carcomment> selectByExample(CarcommentExample example);

    Carcomment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Carcomment record);

}