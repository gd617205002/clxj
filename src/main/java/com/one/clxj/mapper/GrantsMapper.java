package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Grants;
import com.one.clxj.pojo.GrantsExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface GrantsMapper {
    int countByExample(GrantsExample example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Grants record);

    List<Grants> selectByExample(GrantsExample example);

    Grants selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Grants record);

}