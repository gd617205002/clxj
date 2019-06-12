package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Joinxj;
import com.one.clxj.pojo.JoinxjExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface JoinxjMapper{
    int countByExample(JoinxjExample example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Joinxj record);

    List<Joinxj> selectByExample(JoinxjExample example);

    Joinxj selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Joinxj record);

}