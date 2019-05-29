package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Joins;
import com.one.clxj.pojo.JoinsExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface JoinsMapper extends Mapper<Joins> {
    int countByExample(JoinsExample example);

    List<Joins> selectByExample2(JoinsExample example);

    Joins selectByPrimaryKey2(Integer id);

}