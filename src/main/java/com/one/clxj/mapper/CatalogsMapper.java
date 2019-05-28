package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Catalogs;
import com.one.clxj.pojo.CatalogsExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface CatalogsMapper extends Mapper<Catalogs> {

    int countByExample(CatalogsExample example);

    int deleteByExample2(CatalogsExample example);

    int deleteByPrimaryKey2(Integer id);

    int insert(Catalogs record);

    int insertSelective(Catalogs record);

    List<Catalogs> selectByExample2(CatalogsExample example);

    Catalogs selectByPrimaryKey2(Integer id);

    int updateByExampleSelective2(@Param("record") Catalogs record, @Param("example") CatalogsExample example);

    int updateByExample2(@Param("record") Catalogs record, @Param("example") CatalogsExample example);

    int updateByPrimaryKeySelective(Catalogs record);

    int updateByPrimaryKey(Catalogs record);
}