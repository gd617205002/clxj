package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Helpcomment;
import com.one.clxj.pojo.HelpcommentExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface HelpcommentMapper{
    int countByExample(HelpcommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Helpcomment record);

    List<Helpcomment> selectByExample(HelpcommentExample example);

    Helpcomment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Helpcomment record);

}