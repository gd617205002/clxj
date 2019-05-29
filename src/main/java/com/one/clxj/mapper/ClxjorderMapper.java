package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Clxjorder;
import com.one.clxj.pojo.ClxjorderExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface ClxjorderMapper extends Mapper<Clxjorder> {
    int countByExample(ClxjorderExample example);

    List<Clxjorder> selectByExample2(ClxjorderExample example);

    Clxjorder selectByPrimaryKey2(String oid);

}