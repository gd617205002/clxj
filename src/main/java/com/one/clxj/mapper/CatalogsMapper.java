package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Catalogs;
import com.one.clxj.pojo.CatalogsExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface CatalogsMapper extends Mapper<Catalogs> {
    int countByExample(CatalogsExample example);

    int deleteByExample(CatalogsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Catalogs record);

    int insertSelective(Catalogs record);

    List<Catalogs> selectByExample(CatalogsExample example);

    Catalogs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Catalogs record, @Param("example") CatalogsExample example);

    int updateByExample(@Param("record") Catalogs record, @Param("example") CatalogsExample example);

    int updateByPrimaryKeySelective(Catalogs record);

    int updateByPrimaryKey(Catalogs record);
}