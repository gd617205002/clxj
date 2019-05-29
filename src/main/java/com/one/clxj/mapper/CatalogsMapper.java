package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Catalogs;
import com.one.clxj.pojo.CatalogsExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface CatalogsMapper extends Mapper<Catalogs> {

    int countByExample(CatalogsExample example);

    List<Catalogs> selectByExample2(CatalogsExample example);

    Catalogs selectByPrimaryKey2(Integer id);


}