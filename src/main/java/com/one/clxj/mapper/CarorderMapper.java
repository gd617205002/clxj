package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Carorder;
import com.one.clxj.pojo.CarorderExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface CarorderMapper extends Mapper<Carorder> {
    int countByExample(CarorderExample example);

    int deleteByExample(CarorderExample example);

    int deleteByPrimaryKey(String oid);

    int insert(Carorder record);

    int insertSelective(Carorder record);

    List<Carorder> selectByExample(CarorderExample example);

    Carorder selectByPrimaryKey(String oid);

    int updateByExampleSelective(@Param("record") Carorder record, @Param("example") CarorderExample example);

    int updateByExample(@Param("record") Carorder record, @Param("example") CarorderExample example);

    int updateByPrimaryKeySelective(Carorder record);

    int updateByPrimaryKey(Carorder record);
}