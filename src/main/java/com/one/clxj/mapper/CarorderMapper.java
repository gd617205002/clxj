package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Carorder;
import com.one.clxj.pojo.CarorderExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface CarorderMapper {
    int countByExample(CarorderExample example);

    int deleteByPrimaryKey(String oid);

    int insertSelective(Carorder record);

    List<Carorder> selectByExample(CarorderExample example);

    Carorder selectByPrimaryKey(String oid);

    int updateByPrimaryKeySelective(Carorder record);

}