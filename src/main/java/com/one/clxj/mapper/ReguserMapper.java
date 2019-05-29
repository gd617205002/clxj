package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Reguser;
import com.one.clxj.pojo.ReguserExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface ReguserMapper  extends Mapper<Reguser>{
    int countByExample(ReguserExample example);


    List<Reguser> selectByExample2(ReguserExample example);

    Reguser selectByPrimaryKey2(Integer id);


}