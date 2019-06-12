package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Joincl;
import com.one.clxj.pojo.JoinclExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface JoinclMapper  {
    int countByExample(JoinclExample example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Joincl record);

    List<Joincl> selectByExample(JoinclExample example);

    Joincl selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Joincl record);

}