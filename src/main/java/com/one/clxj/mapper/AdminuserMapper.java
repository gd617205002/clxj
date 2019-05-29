package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Adminuser;
import com.one.clxj.pojo.AdminuserExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface AdminuserMapper extends Mapper<Adminuser> {
    int countByExample(AdminuserExample example);

    List<Adminuser> selectByExample2(AdminuserExample example);

    Adminuser selectByPrimaryKey2(Integer id);

}