package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Confession;
import com.one.clxj.pojo.ConfessionExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface ConfessionMapper {
    int countByExample(ConfessionExample example);

    int deleteByPrimaryKey(Integer id);


    int insertSelective(Confession record);

    List<Confession> selectByExample(ConfessionExample example);

    Confession selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Confession record);

}