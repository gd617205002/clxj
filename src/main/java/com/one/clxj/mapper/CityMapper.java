package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.City;
import com.one.clxj.pojo.CityExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface CityMapper extends Mapper<City> {
    int countByExample(CityExample example);


    List<City> selectByExample2(CityExample example);

    City selectByPrimaryKey2(Integer id);


}