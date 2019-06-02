package com.one.clxj.service.impl;

import com.one.clxj.mapper.OrganizationMapper;
import com.one.clxj.pojo.Organization;
import com.one.clxj.pojo.OrganizationExample;
import com.one.clxj.service.OrganizationSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
@Transactional
public class OrganizationSerImpl  implements OrganizationSer {
    @Autowired
    private OrganizationMapper organizationMapper;

    @Override
    public int countByExample(OrganizationExample example) {
        return organizationMapper.countByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer org_id) {
        return organizationMapper.deleteByPrimaryKey(org_id);
    }

    @Override
    public int insertSelective(Organization record) {
        return organizationMapper.insertSelective(record);
    }

    @Override
    public List<Organization> selectByExample(OrganizationExample example) {
        return organizationMapper.selectByExample(example);
    }

    @Override
    public Organization selectByPrimaryKey(Integer org_id) {
        return organizationMapper.selectByPrimaryKey(org_id);
    }

    @Override
    public int updateByPrimaryKeySelective(Organization record) {
        return organizationMapper.updateByPrimaryKeySelective(record);
    }
}