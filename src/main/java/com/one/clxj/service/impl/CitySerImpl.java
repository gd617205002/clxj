package com.one.clxj.service.impl;

import com.one.clxj.mapper.CityMapper;
import com.one.clxj.pojo.City;
import com.one.clxj.service.CitySer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CitySerImpl extends SuperServiceImpl<City>  implements CitySer {
    @Autowired
    private CityMapper cityMapper;
    @Override
    public City cityById(int id) {
        System.out.println("id:"+id);
        return cityMapper.selectByPrimaryKey(id);
    }
}