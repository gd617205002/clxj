package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Carinfo;
import com.one.clxj.pojo.CarinfoExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface CarinfoMapper  extends Mapper<Carinfo> {
    int countByExample(CarinfoExample example);


    List<Carinfo> selectByExample2(CarinfoExample example);

    Carinfo selectByPrimaryKey2(Integer id);

}