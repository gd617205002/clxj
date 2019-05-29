package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Joincar;
import com.one.clxj.pojo.JoincarExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface JoincarMapper extends Mapper<Joincar> {
    int countByExample(JoincarExample example);

    List<Joincar> selectByExample2(JoincarExample example);

    Joincar selectByPrimaryKey2(Integer id);


}