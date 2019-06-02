package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Grant;
import com.one.clxj.pojo.GrantExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface GrantMapper {
    int countByExample(GrantExample example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Grant record);

    List<Grant> selectByExample(GrantExample example);

    Grant selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Grant record);

}