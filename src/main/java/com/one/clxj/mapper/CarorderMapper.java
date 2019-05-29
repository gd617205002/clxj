package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Carorder;
import com.one.clxj.pojo.CarorderExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface CarorderMapper extends Mapper<Carorder> {
    int countByExample(CarorderExample example);


    List<Carorder> selectByExample2(CarorderExample example);

    Carorder selectByPrimaryKey2(String oid);


}