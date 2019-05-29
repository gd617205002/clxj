package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Grouping;
import com.one.clxj.pojo.GroupingExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface GroupingMapper extends Mapper<Grouping> {
    int countByExample(GroupingExample example);

    List<Grouping> selectByExample2(GroupingExample example);

    Grouping selectByPrimaryKey2(Integer id);


}