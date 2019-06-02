package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Joins;
import com.one.clxj.pojo.JoinsExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface JoinsMapper{
    int countByExample(JoinsExample example);

    int deleteByPrimaryKey(Integer id);


    int insertSelective(Joins record);

    List<Joins> selectByExample(JoinsExample example);

    Joins selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(Joins record);

}