package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Organization;
import com.one.clxj.pojo.OrganizationExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface OrganizationMapper {
    int countByExample(OrganizationExample example);

    int deleteByPrimaryKey(Integer org_id);

    int insertSelective(Organization record);

    List<Organization> selectByExample(OrganizationExample example);

    Organization selectByPrimaryKey(Integer org_id);

    int updateByPrimaryKeySelective(Organization record);

}