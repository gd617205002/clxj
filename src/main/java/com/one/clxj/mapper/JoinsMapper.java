package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Joins;
import com.one.clxj.pojo.JoinsExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface JoinsMapper extends Mapper<Joins> {
    int countByExample(JoinsExample example);

    int deleteByExample(JoinsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Joins record);

    int insertSelective(Joins record);

    List<Joins> selectByExample(JoinsExample example);

    Joins selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Joins record, @Param("example") JoinsExample example);

    int updateByExample(@Param("record") Joins record, @Param("example") JoinsExample example);

    int updateByPrimaryKeySelective(Joins record);

    int updateByPrimaryKey(Joins record);
}