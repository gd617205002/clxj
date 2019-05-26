package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Helpinfo;
import com.one.clxj.pojo.HelpinfoExample;
import com.one.clxj.pojo.HelpinfoKey;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface HelpinfoMapper extends Mapper<Helpinfo> {
    int countByExample(HelpinfoExample example);

    int deleteByExample(HelpinfoExample example);

    int deleteByPrimaryKey(HelpinfoKey key);

    int insert(Helpinfo record);

    int insertSelective(Helpinfo record);

    List<Helpinfo> selectByExample(HelpinfoExample example);

    Helpinfo selectByPrimaryKey(HelpinfoKey key);

    int updateByExampleSelective(@Param("record") Helpinfo record, @Param("example") HelpinfoExample example);

    int updateByExample(@Param("record") Helpinfo record, @Param("example") HelpinfoExample example);

    int updateByPrimaryKeySelective(Helpinfo record);

    int updateByPrimaryKey(Helpinfo record);
}