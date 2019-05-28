package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Joincl;
import com.one.clxj.pojo.JoinclExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface JoinclMapper  extends Mapper<Joincl> {
    int countByExample(JoinclExample example);

    int deleteByExample2(JoinclExample example);

    int deleteByPrimaryKey2(Integer id);

    int insert(Joincl record);

    int insertSelective(Joincl record);

    List<Joincl> selectByExample2(JoinclExample example);

    Joincl selectByPrimaryKey2(Integer id);

    int updateByExampleSelective2(@Param("record") Joincl record, @Param("example") JoinclExample example);

    int updateByExample2(@Param("record") Joincl record, @Param("example") JoinclExample example);

    int updateByPrimaryKeySelective(Joincl record);

    int updateByPrimaryKey(Joincl record);
}