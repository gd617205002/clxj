package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Citygroup;
import com.one.clxj.pojo.CitygroupExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface CitygroupMapper extends Mapper<Citygroup> {
    int countByExample(CitygroupExample example);

    List<Citygroup> selectByExample2(CitygroupExample example);

    Citygroup selectByPrimaryKey2(Integer id);


}