package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Helpcomment;
import com.one.clxj.pojo.HelpcommentExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface HelpcommentMapper extends Mapper<Helpcomment> {
    int countByExample(HelpcommentExample example);

    int deleteByExample(HelpcommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Helpcomment record);

    int insertSelective(Helpcomment record);

    List<Helpcomment> selectByExample(HelpcommentExample example);

    Helpcomment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Helpcomment record, @Param("example") HelpcommentExample example);

    int updateByExample(@Param("record") Helpcomment record, @Param("example") HelpcommentExample example);

    int updateByPrimaryKeySelective(Helpcomment record);

    int updateByPrimaryKey(Helpcomment record);
}