package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Clxjcomment;
import com.one.clxj.pojo.ClxjcommentExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface ClxjcommentMapper extends Mapper<Clxjcomment> {
    int countByExample(ClxjcommentExample example);


    List<Clxjcomment> selectByExample2(ClxjcommentExample example);

    Clxjcomment selectByPrimaryKey2(Integer id);


}