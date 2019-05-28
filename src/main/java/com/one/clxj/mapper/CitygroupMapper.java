package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Citygroup;
import com.one.clxj.pojo.CitygroupExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface CitygroupMapper extends Mapper<Citygroup> {
    int countByExample(CitygroupExample example);

    int deleteByExample2(CitygroupExample example);

    int deleteByPrimaryKey2(Integer id);

    int insert(Citygroup record);

    int insertSelective(Citygroup record);

    List<Citygroup> selectByExample2(CitygroupExample example);

    Citygroup selectByPrimaryKey2(Integer id);

    int updateByExampleSelective2(@Param("record") Citygroup record, @Param("example") CitygroupExample example);

    int updateByExample2(@Param("record") Citygroup record, @Param("example") CitygroupExample example);

    int updateByPrimaryKeySelective(Citygroup record);

    int updateByPrimaryKey(Citygroup record);
}