package com.one.clxj.service;


import com.one.clxj.pojo.Organization;
import com.one.clxj.pojo.OrganizationExample;

import java.util.List;

public  interface OrganizationSer {

    int countByExample(OrganizationExample example);

    int deleteByPrimaryKey(Integer org_id);

    int insertSelective(Organization record);

    List<Organization> selectByExample(OrganizationExample example);

    Organization selectByPrimaryKey(Integer org_id);

    int updateByPrimaryKeySelective(Organization record);
}