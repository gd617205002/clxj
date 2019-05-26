package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Joinxj;
import com.one.clxj.pojo.JoinxjExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface JoinxjMapper  extends Mapper<Joinxj> {
    int countByExample(JoinxjExample example);

    int deleteByExample(JoinxjExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Joinxj record);

    int insertSelective(Joinxj record);

    List<Joinxj> selectByExample(JoinxjExample example);

    Joinxj selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Joinxj record, @Param("example") JoinxjExample example);

    int updateByExample(@Param("record") Joinxj record, @Param("example") JoinxjExample example);

    int updateByPrimaryKeySelective(Joinxj record);

    int updateByPrimaryKey(Joinxj record);
}