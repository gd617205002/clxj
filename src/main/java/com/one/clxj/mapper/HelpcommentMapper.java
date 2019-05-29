package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Helpcomment;
import com.one.clxj.pojo.HelpcommentExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface HelpcommentMapper extends Mapper<Helpcomment> {
    int countByExample(HelpcommentExample example);

    List<Helpcomment> selectByExample2(HelpcommentExample example);

    Helpcomment selectByPrimaryKey2(Integer id);


}