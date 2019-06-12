package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Afluser;
import com.one.clxj.pojo.AfluserExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface AfluserMapper{
    int countByExample(AfluserExample example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Afluser record);

    List<Afluser> selectByExample(AfluserExample example);

    Afluser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Afluser record);

}