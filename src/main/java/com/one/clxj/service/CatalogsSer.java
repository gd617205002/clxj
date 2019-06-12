package com.one.clxj.service;


import com.one.clxj.pojo.Catalogs;
import com.one.clxj.pojo.CatalogsExample;

import java.util.List;

public  interface CatalogsSer {

    int countByExample(CatalogsExample example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Catalogs record);

    List<Catalogs> selectByExample(CatalogsExample example);

    Catalogs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Catalogs record);
}