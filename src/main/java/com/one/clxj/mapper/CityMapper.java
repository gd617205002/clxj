package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.City;
import com.one.clxj.pojo.CityExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface CityMapper extends Mapper<City> {
    int countByExample(CityExample example);

    int deleteByExample2(CityExample example);

    int deleteByPrimaryKey2(Integer id);

    int insert(City record);

    int insertSelective(City record);

    List<City> selectByExample2(CityExample example);

    City selectByPrimaryKey2(Integer id);

    int updateByExampleSelective2(@Param("record") City record, @Param("example") CityExample example);

    int updateByExample2(@Param("record") City record, @Param("example") CityExample example);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);
}