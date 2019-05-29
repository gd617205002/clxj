package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Confession;
import com.one.clxj.pojo.ConfessionExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface ConfessionMapper  extends Mapper<Confession> {
    int countByExample(ConfessionExample example);


    List<Confession> selectByExample2(ConfessionExample example);

    Confession selectByPrimaryKey2(Integer id);

}