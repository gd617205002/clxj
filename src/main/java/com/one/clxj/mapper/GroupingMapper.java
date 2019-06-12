package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Grouping;
import com.one.clxj.pojo.GroupingExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface GroupingMapper {
    int countByExample(GroupingExample example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Grouping record);

    List<Grouping> selectByExample(GroupingExample example);

    Grouping selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Grouping record);

}