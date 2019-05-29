package com.one.clxj.service.impl;

import com.one.clxj.mapper.CarcommentMapper;
import com.one.clxj.pojo.Carcomment;
import com.one.clxj.pojo.CarcommentExample;
import com.one.clxj.service.CarcommentSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

@Service
@Transactional public  class CarcommentSerImpl extends SuperServiceImpl<Carcomment,CarcommentExample>implements CarcommentSer {
    @Autowired
    private CarcommentMapper carcommentMapper;

    @PostConstruct
//    初始化
    public void init(){
        super.mapper = carcommentMapper;
    }


}