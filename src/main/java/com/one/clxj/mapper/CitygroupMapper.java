package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Citygroup;
import com.one.clxj.pojo.CitygroupExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface CitygroupMapper {
    int countByExample(CitygroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Citygroup record);

    List<Citygroup> selectByExample(CitygroupExample example);

    Citygroup selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Citygroup record);

}