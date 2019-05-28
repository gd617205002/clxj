package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Clxjorder;
import com.one.clxj.pojo.ClxjorderExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface ClxjorderMapper extends Mapper<Clxjorder> {
    int countByExample(ClxjorderExample example);

    int deleteByExample2(ClxjorderExample example);

    int deleteByPrimaryKey2(String oid);

    int insert(Clxjorder record);

    int insertSelective(Clxjorder record);

    List<Clxjorder> selectByExample2(ClxjorderExample example);

    Clxjorder selectByPrimaryKey2(String oid);

    int updateByExampleSelective2(@Param("record") Clxjorder record, @Param("example") ClxjorderExample example);

    int updateByExample2(@Param("record") Clxjorder record, @Param("example") ClxjorderExample example);

    int updateByPrimaryKeySelective(Clxjorder record);

    int updateByPrimaryKey(Clxjorder record);
}