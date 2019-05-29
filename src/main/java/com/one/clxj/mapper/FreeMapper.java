package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Free;
import com.one.clxj.pojo.FreeExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface FreeMapper extends Mapper<Free> {
    int countByExample(FreeExample example);


    List<Free> selectByExample2(FreeExample example);

    Free selectByPrimaryKey2(Integer id);


}