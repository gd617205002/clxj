package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Adminuser;
import com.one.clxj.pojo.AdminuserExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface AdminuserMapper {
    int countByExample(AdminuserExample example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Adminuser record);

    List<Adminuser> selectByExample(AdminuserExample example);

    Adminuser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Adminuser record);

}