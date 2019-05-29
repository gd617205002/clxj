package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Joinxj;
import com.one.clxj.pojo.JoinxjExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface JoinxjMapper  extends Mapper<Joinxj> {
    int countByExample(JoinxjExample example);


    List<Joinxj> selectByExample2(JoinxjExample example);

    Joinxj selectByPrimaryKey2(Integer id);


}