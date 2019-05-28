package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Clxjcomment;
import com.one.clxj.pojo.ClxjcommentExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface ClxjcommentMapper extends Mapper<Clxjcomment> {
    int countByExample(ClxjcommentExample example);

    int deleteByExample2(ClxjcommentExample example);

    int deleteByPrimaryKey2(Integer id);

    int insert(Clxjcomment record);

    int insertSelective(Clxjcomment record);

    List<Clxjcomment> selectByExample2(ClxjcommentExample example);

    Clxjcomment selectByPrimaryKey2(Integer id);

    int updateByExampleSelective2(@Param("record") Clxjcomment record, @Param("example") ClxjcommentExample example);

    int updateByExample2(@Param("record") Clxjcomment record, @Param("example") ClxjcommentExample example);

    int updateByPrimaryKeySelective(Clxjcomment record);

    int updateByPrimaryKey(Clxjcomment record);
}