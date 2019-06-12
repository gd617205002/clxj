package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Clxjcomment;
import com.one.clxj.pojo.ClxjcommentExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface ClxjcommentMapper  {
    int countByExample(ClxjcommentExample example);

    int deleteByPrimaryKey(Integer id);


    int insertSelective(Clxjcomment record);

    List<Clxjcomment> selectByExample(ClxjcommentExample example);

    Clxjcomment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Clxjcomment record);

}