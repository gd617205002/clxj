package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Catalogs;
import com.one.clxj.pojo.CatalogsExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface CatalogsMapper  {

    int countByExample(CatalogsExample example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Catalogs record);

    List<Catalogs> selectByExample(CatalogsExample example);

    Catalogs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Catalogs record);

}