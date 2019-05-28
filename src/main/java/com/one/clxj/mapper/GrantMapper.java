package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Grant;
import com.one.clxj.pojo.GrantExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface GrantMapper  extends Mapper<Grant>{
    int countByExample(GrantExample example);

    int deleteByExample2(GrantExample example);

    int deleteByPrimaryKey2(Integer id);

    int insert(Grant record);

    int insertSelective(Grant record);

    List<Grant> selectByExample2(GrantExample example);

    Grant selectByPrimaryKey2(Integer id);

    int updateByExampleSelective2(@Param("record") Grant record, @Param("example") GrantExample example);

    int updateByExample2(@Param("record") Grant record, @Param("example") GrantExample example);

    int updateByPrimaryKeySelective(Grant record);

    int updateByPrimaryKey(Grant record);
}