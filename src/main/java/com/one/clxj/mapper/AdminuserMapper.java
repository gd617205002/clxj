package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Adminuser;
import com.one.clxj.pojo.AdminuserExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface AdminuserMapper extends Mapper<Adminuser> {
    int countByExample(AdminuserExample example);

    int deleteByExample2(AdminuserExample example);

    int deleteByPrimaryKey2(Integer id);

    int insert(Adminuser record);

    int insertSelective(Adminuser record);

    List<Adminuser> selectByExample2(AdminuserExample example);

    Adminuser selectByPrimaryKey2(Integer id);

    int updateByExampleSelective2(@Param("record") Adminuser record, @Param("example") AdminuserExample example);

    int updateByExample2(@Param("record") Adminuser record, @Param("example") AdminuserExample example);

    int updateByPrimaryKeySelective(Adminuser record);

    int updateByPrimaryKey(Adminuser record);
}