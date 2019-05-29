package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Afluser;
import com.one.clxj.pojo.AfluserExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface AfluserMapper extends Mapper<Afluser> {
    int countByExample(AfluserExample example);


    List<Afluser> selectByExample2(AfluserExample example);

    Afluser selectByPrimaryKey2(Integer id);

}