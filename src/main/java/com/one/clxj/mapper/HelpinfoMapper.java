package com.one.clxj.mapper;

import com.one.clxj.pojo.Helpinfo;
import com.one.clxj.pojo.HelpinfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface HelpinfoMapper {
    int countByExample(HelpinfoExample example);;

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Helpinfo record);

    List<Helpinfo> selectByExample(HelpinfoExample example);

    Helpinfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Helpinfo record);

}