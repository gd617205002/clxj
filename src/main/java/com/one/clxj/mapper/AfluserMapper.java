package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Afluser;
import com.one.clxj.pojo.AfluserExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface AfluserMapper extends Mapper<Afluser> {
    int countByExample(AfluserExample example);

    int deleteByExample(AfluserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Afluser record);

    int insertSelective(Afluser record);

    List<Afluser> selectByExampleWithBLOBs(AfluserExample example);

    List<Afluser> selectByExample(AfluserExample example);

    Afluser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Afluser record, @Param("example") AfluserExample example);

    int updateByExampleWithBLOBs(@Param("record") Afluser record, @Param("example") AfluserExample example);

    int updateByExample(@Param("record") Afluser record, @Param("example") AfluserExample example);

    int updateByPrimaryKeySelective(Afluser record);

    int updateByPrimaryKeyWithBLOBs(Afluser record);

    int updateByPrimaryKey(Afluser record);
}