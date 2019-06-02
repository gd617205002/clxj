package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Clxjorder;
import com.one.clxj.pojo.ClxjorderExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface ClxjorderMapper{
    int countByExample(ClxjorderExample example);

    int deleteByPrimaryKey(String oid);

    int insertSelective(Clxjorder record);

    List<Clxjorder> selectByExample(ClxjorderExample example);

    Clxjorder selectByPrimaryKey(String oid);

    int updateByPrimaryKeySelective(Clxjorder record);

}