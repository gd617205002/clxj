package com.one.clxj.service.impl;

import com.one.clxj.mapper.OrganizationMapper;
import com.one.clxj.pojo.Organization;
import com.one.clxj.pojo.OrganizationExample;
import com.one.clxj.service.OrganizationSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

@Service
@Transactional
public class OrganizationSerImpl extends SuperServiceImpl<Organization, OrganizationExample> implements OrganizationSer {
    @Autowired
    private OrganizationMapper organizationMapper;

    @PostConstruct
//    初始化
    public void init() {

        super.mapper = organizationMapper;
    }
}