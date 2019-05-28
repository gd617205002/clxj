package com.one.clxj.service.impl;

import com.one.clxj.mapper.CatalogsMapper;
import com.one.clxj.pojo.Catalogs;
import com.one.clxj.pojo.CatalogsExample;
import com.one.clxj.service.CatalogsSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

@Service
@Transactional
public class CatalogsSerImpl extends SuperServiceImpl<Catalogs, CatalogsExample> implements CatalogsSer {

    @Autowired
    private CatalogsMapper catalogsMapper;

    @PostConstruct
//    初始化
    public void init() {

        super.mapper = catalogsMapper;
    }
}