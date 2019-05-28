package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Organization;
import com.one.clxj.pojo.OrganizationExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface OrganizationMapper extends Mapper<Organization> {
    int countByExample(OrganizationExample example);

    int deleteByExample2(OrganizationExample example);

    int deleteByPrimaryKey2(Integer org_id);

    int insert(Organization record);

    int insertSelective(Organization record);

    List<Organization> selectByExample2(OrganizationExample example);

    Organization selectByPrimaryKey2(Integer org_id);

    int updateByExampleSelective2(@Param("record") Organization record, @Param("example") OrganizationExample example);

    int updateByExample2(@Param("record") Organization record, @Param("example") OrganizationExample example);

    int updateByPrimaryKeySelective(Organization record);

    int updateByPrimaryKey(Organization record);
}