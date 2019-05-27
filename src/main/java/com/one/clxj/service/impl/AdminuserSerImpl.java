package com.one.clxj.service.impl;

import com.one.clxj.mapper.AdminuserMapper;
import com.one.clxj.pojo.Adminuser;
import com.one.clxj.service.AdminuserSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AdminuserSerImpl extends SuperServiceImpl<Adminuser> implements AdminuserSer {

   /* @Autowired
    private AdminuserMapper adminuserMapper;

    public void init(){
       super.mapper = adminuserMapper;
    }*/
}