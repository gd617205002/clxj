package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Carinfo;
import com.one.clxj.pojo.CarinfoExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface CarinfoMapper  extends Mapper<Carinfo> {
    int countByExample(CarinfoExample example);

    int deleteByExample2(CarinfoExample example);

    int deleteByPrimaryKey2(Integer id);

    int insert(Carinfo record);

    int insertSelective(Carinfo record);

    List<Carinfo> selectByExample2(CarinfoExample example);

    Carinfo selectByPrimaryKey2(Integer id);

    int updateByExampleSelective2(@Param("record") Carinfo record, @Param("example") CarinfoExample example);

    int updateByExample2(@Param("record") Carinfo record, @Param("example") CarinfoExample example);

    int updateByPrimaryKeySelective(Carinfo record);

    int updateByPrimaryKey(Carinfo record);
}