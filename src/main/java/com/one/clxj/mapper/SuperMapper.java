package com.one.clxj.mapper;

import io.lettuce.core.dynamic.annotation.Param;

import java.util.List;

public interface SuperMapper<T,V> {

    int countByExample(T example);

    int deleteByExample2(T example);

    int deleteByPrimaryKey2(Integer id);

    int insert(V record);

    int insertSelective(V record);

    List<V> selectByExample2(T example);

    V selectByPrimaryKey2(Integer id);

    int updateByExampleSelective2(@Param("record") V record, @Param("example") T example);

    int updateByExample2(@Param("record") V record, @Param("example") T example);

    int updateByPrimaryKeySelective(V record);

    int updateByPrimaryKey(V record);

}
