package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Free;
import com.one.clxj.pojo.FreeExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface FreeMapper extends Mapper<Free> {
    int countByExample(FreeExample example);

    int deleteByExample2(FreeExample example);

    int deleteByPrimaryKey2(Integer id);

    int insert(Free record);

    int insertSelective(Free record);

    List<Free> selectByExample2(FreeExample example);

    Free selectByPrimaryKey2(Integer id);

    int updateByExampleSelective2(@Param("record") Free record, @Param("example") FreeExample example);

    int updateByExample2(@Param("record") Free record, @Param("example") FreeExample example);

    int updateByPrimaryKeySelective(Free record);

    int updateByPrimaryKey(Free record);
}