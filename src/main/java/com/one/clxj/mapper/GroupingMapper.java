package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Grouping;
import com.one.clxj.pojo.GroupingExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface GroupingMapper extends Mapper<Grouping> {
    int countByExample(GroupingExample example);

    int deleteByExample(GroupingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Grouping record);

    int insertSelective(Grouping record);

    List<Grouping> selectByExample(GroupingExample example);

    Grouping selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Grouping record, @Param("example") GroupingExample example);

    int updateByExample(@Param("record") Grouping record, @Param("example") GroupingExample example);

    int updateByPrimaryKeySelective(Grouping record);

    int updateByPrimaryKey(Grouping record);
}