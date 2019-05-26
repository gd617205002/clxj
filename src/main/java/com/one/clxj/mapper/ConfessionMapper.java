package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Confession;
import com.one.clxj.pojo.ConfessionExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface ConfessionMapper  extends Mapper<Confession> {
    int countByExample(ConfessionExample example);

    int deleteByExample(ConfessionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Confession record);

    int insertSelective(Confession record);

    List<Confession> selectByExample(ConfessionExample example);

    Confession selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Confession record, @Param("example") ConfessionExample example);

    int updateByExample(@Param("record") Confession record, @Param("example") ConfessionExample example);

    int updateByPrimaryKeySelective(Confession record);

    int updateByPrimaryKey(Confession record);
}