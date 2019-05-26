package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Citygroup;
import com.one.clxj.pojo.CitygroupExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface CitygroupMapper extends Mapper<Citygroup> {
    int countByExample(CitygroupExample example);

    int deleteByExample(CitygroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Citygroup record);

    int insertSelective(Citygroup record);

    List<Citygroup> selectByExample(CitygroupExample example);

    Citygroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Citygroup record, @Param("example") CitygroupExample example);

    int updateByExample(@Param("record") Citygroup record, @Param("example") CitygroupExample example);

    int updateByPrimaryKeySelective(Citygroup record);

    int updateByPrimaryKey(Citygroup record);
}