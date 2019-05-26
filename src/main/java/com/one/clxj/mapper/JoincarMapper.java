package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Joincar;
import com.one.clxj.pojo.JoincarExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface JoincarMapper extends Mapper<Joincar> {
    int countByExample(JoincarExample example);

    int deleteByExample(JoincarExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Joincar record);

    int insertSelective(Joincar record);

    List<Joincar> selectByExample(JoincarExample example);

    Joincar selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Joincar record, @Param("example") JoincarExample example);

    int updateByExample(@Param("record") Joincar record, @Param("example") JoincarExample example);

    int updateByPrimaryKeySelective(Joincar record);

    int updateByPrimaryKey(Joincar record);
}