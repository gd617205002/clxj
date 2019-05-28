package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Afluser;
import com.one.clxj.pojo.AfluserExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface AfluserMapper extends Mapper<Afluser> {
    int countByExample(AfluserExample example);

    int deleteByExample2(AfluserExample example);

    int deleteByPrimaryKey2(Integer id);

    int insert(Afluser record);

    int insertSelective(Afluser record);


    List<Afluser> selectByExample2(AfluserExample example);

    Afluser selectByPrimaryKey2(Integer id);

    int updateByExampleSelective2(@Param("record") Afluser record, @Param("example") AfluserExample example);


    int updateByExample2(@Param("record") Afluser record, @Param("example") AfluserExample example);

    int updateByPrimaryKeySelective(Afluser record);


    int updateByPrimaryKey(Afluser record);
}