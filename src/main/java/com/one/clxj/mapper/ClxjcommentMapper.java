package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Clxjcomment;
import com.one.clxj.pojo.ClxjcommentExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface ClxjcommentMapper extends Mapper<Clxjcomment> {
    int countByExample(ClxjcommentExample example);

    int deleteByExample(ClxjcommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Clxjcomment record);

    int insertSelective(Clxjcomment record);

    List<Clxjcomment> selectByExample(ClxjcommentExample example);

    Clxjcomment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Clxjcomment record, @Param("example") ClxjcommentExample example);

    int updateByExample(@Param("record") Clxjcomment record, @Param("example") ClxjcommentExample example);

    int updateByPrimaryKeySelective(Clxjcomment record);

    int updateByPrimaryKey(Clxjcomment record);
}