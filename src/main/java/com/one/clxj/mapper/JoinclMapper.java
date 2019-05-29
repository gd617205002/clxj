package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Joincl;
import com.one.clxj.pojo.JoinclExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface JoinclMapper  extends Mapper<Joincl> {
    int countByExample(JoinclExample example);


    List<Joincl> selectByExample2(JoinclExample example);

    Joincl selectByPrimaryKey2(Integer id);


}