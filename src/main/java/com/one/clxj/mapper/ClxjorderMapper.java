package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Clxjorder;
import com.one.clxj.pojo.ClxjorderExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface ClxjorderMapper extends Mapper<Clxjorder> {
    int countByExample(ClxjorderExample example);

    int deleteByExample(ClxjorderExample example);

    int deleteByPrimaryKey(String oid);

    int insert(Clxjorder record);

    int insertSelective(Clxjorder record);

    List<Clxjorder> selectByExample(ClxjorderExample example);

    Clxjorder selectByPrimaryKey(String oid);

    int updateByExampleSelective(@Param("record") Clxjorder record, @Param("example") ClxjorderExample example);

    int updateByExample(@Param("record") Clxjorder record, @Param("example") ClxjorderExample example);

    int updateByPrimaryKeySelective(Clxjorder record);

    int updateByPrimaryKey(Clxjorder record);
}