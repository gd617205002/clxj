package com.one.clxj.service.impl;

import com.one.clxj.mapper.AdminuserMapper;
import com.one.clxj.mapper.PayformonthMapper;
import com.one.clxj.pojo.Adminuser;
import com.one.clxj.pojo.Payformonth;
import com.one.clxj.service.AdminuserSer;
import com.one.clxj.service.PayformonthSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PayformonthSerImpl extends SuperServiceImpl<Payformonth> implements PayformonthSer {

    @Autowired
    private PayformonthMapper payformonthMapper;


   /* public void init(){
       super.mapper = adminuserMapper;
    }*/
}