package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Carorder;
import com.one.clxj.pojo.CarorderExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface CarorderMapper extends Mapper<Carorder> {
    int countByExample(CarorderExample example);

    int deleteByExample2(CarorderExample example);

    int deleteByPrimaryKey2(String oid);

    int insert(Carorder record);

    int insertSelective(Carorder record);

    List<Carorder> selectByExample2(CarorderExample example);

    Carorder selectByPrimaryKey2(String oid);

    int updateByExampleSelective2(@Param("record") Carorder record, @Param("example") CarorderExample example);

    int updateByExample2(@Param("record") Carorder record, @Param("example") CarorderExample example);

    int updateByPrimaryKeySelective(Carorder record);

    int updateByPrimaryKey(Carorder record);
}