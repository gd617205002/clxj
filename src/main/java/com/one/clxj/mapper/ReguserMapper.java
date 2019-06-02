package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Reguser;
import com.one.clxj.pojo.ReguserExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface ReguserMapper {
    int countByExample(ReguserExample example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Reguser record);

    List<Reguser> selectByExample(ReguserExample example);

    Reguser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Reguser record);

}