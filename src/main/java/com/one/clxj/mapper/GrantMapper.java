package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Grant;
import com.one.clxj.pojo.GrantExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface GrantMapper  extends Mapper<Grant>{
    int countByExample(GrantExample example);



    List<Grant> selectByExample2(GrantExample example);

    Grant selectByPrimaryKey2(Integer id);


}