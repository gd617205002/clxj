package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Joins;
import com.one.clxj.pojo.JoinsExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface JoinsMapper extends Mapper<Joins> {
    int countByExample(JoinsExample example);

    int deleteByExample2(JoinsExample example);

    int deleteByPrimaryKey2(Integer id);

    int insert(Joins record);

    int insertSelective(Joins record);

    List<Joins> selectByExample2(JoinsExample example);

    Joins selectByPrimaryKey2(Integer id);

    int updateByExampleSelective2(@Param("record") Joins record, @Param("example") JoinsExample example);

    int updateByExample2(@Param("record") Joins record, @Param("example") JoinsExample example);

    int updateByPrimaryKeySelective(Joins record);

    int updateByPrimaryKey(Joins record);
}