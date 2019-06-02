package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.City;
import com.one.clxj.pojo.CityExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface CityMapper {
    int countByExample(CityExample example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(City record);

    List<City> selectByExample(CityExample example);

    City selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(City record);

}