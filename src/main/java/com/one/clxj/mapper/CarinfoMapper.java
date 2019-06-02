package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Carinfo;
import com.one.clxj.pojo.CarinfoExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface CarinfoMapper {
    int countByExample(CarinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Carinfo record);

    List<Carinfo> selectByExample(CarinfoExample example);

    Carinfo selectByPrimaryKey2(Integer id);

    int updateByPrimaryKeySelective(Carinfo record);

}