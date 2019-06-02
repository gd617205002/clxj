package com.one.clxj.service.impl;

import com.one.clxj.mapper.CatalogsMapper;
import com.one.clxj.pojo.Catalogs;
import com.one.clxj.pojo.CatalogsExample;
import com.one.clxj.service.CatalogsSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
@Transactional
public class CatalogsSerImpl implements CatalogsSer {

    @Autowired
    private CatalogsMapper catalogsMapper;

    @Override
    public int countByExample(CatalogsExample example) {
        return catalogsMapper.countByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return catalogsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(Catalogs record) {
        return catalogsMapper.insertSelective(record);
    }

    @Override
    public List<Catalogs> selectByExample(CatalogsExample example) {
        return catalogsMapper.selectByExample(example);
    }

    @Override
    public Catalogs selectByPrimaryKey(Integer id) {
        return catalogsMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Catalogs record) {
        return catalogsMapper.updateByPrimaryKeySelective(record);
    }
}