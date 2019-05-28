package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Joincar;
import com.one.clxj.pojo.JoincarExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface JoincarMapper extends Mapper<Joincar> {
    int countByExample(JoincarExample example);

    int deleteByExample2(JoincarExample example);

    int deleteByPrimaryKey2(Integer id);

    int insert(Joincar record);

    int insertSelective(Joincar record);

    List<Joincar> selectByExample2(JoincarExample example);

    Joincar selectByPrimaryKey2(Integer id);

    int updateByExampleSelective2(@Param("record") Joincar record, @Param("example") JoincarExample example);

    int updateByExample2(@Param("record") Joincar record, @Param("example") JoincarExample example);

    int updateByPrimaryKeySelective(Joincar record);

    int updateByPrimaryKey(Joincar record);
}