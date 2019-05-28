package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Reguser;
import com.one.clxj.pojo.ReguserExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface ReguserMapper  extends Mapper<Reguser>{
    int countByExample(ReguserExample example);

    int deleteByExample2(ReguserExample example);

    int deleteByPrimaryKey2(Integer id);

    int insert(Reguser record);

    int insertSelective(Reguser record);

    List<Reguser> selectByExample2(ReguserExample example);

    Reguser selectByPrimaryKey2(Integer id);

    Reguser selectById(Integer id);

    int updateByExampleSelective2(@Param("record") Reguser record, @Param("example") ReguserExample example);

    int updateByExample2(@Param("record") Reguser record, @Param("example") ReguserExample example);

    int updateByPrimaryKeySelective(Reguser record);

    int updateByPrimaryKey(Reguser record);
}