package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Joincar;
import com.one.clxj.pojo.JoincarExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface JoincarMapper {
    int countByExample(JoincarExample example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Joincar record);

    List<Joincar> selectByExample(JoincarExample example);

    Joincar selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Joincar record);

}