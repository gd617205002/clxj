package com.one.clxj.service.impl;

import com.one.clxj.mapper.ReguserMapper;
import com.one.clxj.pojo.Reguser;
import com.one.clxj.pojo.ReguserExample;
import com.one.clxj.service.ReguserSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public  class ReguserSerImpl extends SuperServiceImpl<Reguser>  implements ReguserSer {

    @Autowired
    ReguserMapper reguserMapper;

 /*   @PostConstruct
    public  void  init(){
        super.mapper = reguserMapper;
    }*/
    @Override
    public List<Reguser> reguserAll() {
        System.out.println("过来");
        return reguserMapper.selectByExample2(null);
    }

    @Override
    public Reguser reguserById(int id) {
        System.out.println(id);
        ReguserExample reguserExample = new ReguserExample();
        reguserExample.createCriteria().andIdEqualTo(id);
        return reguserMapper.selectById(id);
    }
}