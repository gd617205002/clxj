package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Grouping;
import com.one.clxj.pojo.GroupingExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface GroupingMapper extends Mapper<Grouping> {
    int countByExample(GroupingExample example);

    int deleteByExample2(GroupingExample example);

    int deleteByPrimaryKey2(Integer id);

    int insert(Grouping record);

    int insertSelective(Grouping record);

    List<Grouping> selectByExample2(GroupingExample example);

    Grouping selectByPrimaryKey2(Integer id);

    int updateByExampleSelective2(@Param("record") Grouping record, @Param("example") GroupingExample example);

    int updateByExample2(@Param("record") Grouping record, @Param("example") GroupingExample example);

    int updateByPrimaryKeySelective(Grouping record);

    int updateByPrimaryKey(Grouping record);
}