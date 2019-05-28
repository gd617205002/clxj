package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Helpcomment;
import com.one.clxj.pojo.HelpcommentExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface HelpcommentMapper extends Mapper<Helpcomment> {
    int countByExample(HelpcommentExample example);

    int deleteByExample2(HelpcommentExample example);

    int deleteByPrimaryKey2(Integer id);

    int insert(Helpcomment record);

    int insertSelective(Helpcomment record);

    List<Helpcomment> selectByExample2(HelpcommentExample example);

    Helpcomment selectByPrimaryKey2(Integer id);

    int updateByExampleSelective2(@Param("record") Helpcomment record, @Param("example") HelpcommentExample example);

    int updateByExample2(@Param("record") Helpcomment record, @Param("example") HelpcommentExample example);

    int updateByPrimaryKeySelective(Helpcomment record);

    int updateByPrimaryKey(Helpcomment record);
}