package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Reguser;
import com.one.clxj.pojo.ReguserExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface ReguserMapper extends Mapper<Reguser> {
    int countByExample(ReguserExample example);

    int deleteByExample(ReguserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Reguser record);

    int insertSelective(Reguser record);

    List<Reguser> selectByExample(ReguserExample example);

    Reguser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Reguser record, @Param("example") ReguserExample example);

    int updateByExample(@Param("record") Reguser record, @Param("example") ReguserExample example);

    int updateByPrimaryKeySelective(Reguser record);

    int updateByPrimaryKey(Reguser record);
}