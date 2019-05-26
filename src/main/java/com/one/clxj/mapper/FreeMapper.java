package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Free;
import com.one.clxj.pojo.FreeExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface FreeMapper extends Mapper<Free> {
    int countByExample(FreeExample example);

    int deleteByExample(FreeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Free record);

    int insertSelective(Free record);

    List<Free> selectByExample(FreeExample example);

    Free selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Free record, @Param("example") FreeExample example);

    int updateByExample(@Param("record") Free record, @Param("example") FreeExample example);

    int updateByPrimaryKeySelective(Free record);

    int updateByPrimaryKey(Free record);
}