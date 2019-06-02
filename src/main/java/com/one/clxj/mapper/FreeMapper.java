package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Free;
import com.one.clxj.pojo.FreeExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface FreeMapper  {
    int countByExample(FreeExample example);

    int deleteByPrimaryKey(Integer id);


    int insertSelective(Free record);

    List<Free> selectByExample(FreeExample example);

    Free selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Free record);
}
