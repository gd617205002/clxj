package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Organization;
import com.one.clxj.pojo.OrganizationExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface OrganizationMapper extends Mapper<Organization> {
    int countByExample(OrganizationExample example);


    List<Organization> selectByExample2(OrganizationExample example);

    Organization selectByPrimaryKey2(Integer org_id);


}