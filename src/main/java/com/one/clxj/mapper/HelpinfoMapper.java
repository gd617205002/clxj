package com.one.clxj.mapper;

import com.one.clxj.pojo.Helpinfo;
import com.one.clxj.pojo.HelpinfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface HelpinfoMapper extends Mapper<Helpinfo> {
    int countByExample(HelpinfoExample example);

    int deleteByExample2(HelpinfoExample example);

    int deleteByPrimaryKey2(Integer id);

    int insert(Helpinfo record);

    int insertSelective(Helpinfo record);

    List<Helpinfo> selectByExample2(HelpinfoExample example);

    Helpinfo selectByPrimaryKey2(Integer id);

    int updateByExampleSelective2(@Param("record") Helpinfo record, @Param("example") HelpinfoExample example);

    int updateByExample2(@Param("record") Helpinfo record, @Param("example") HelpinfoExample example);

    int updateByPrimaryKeySelective(Helpinfo record);

    int updateByPrimaryKey(Helpinfo record);
}