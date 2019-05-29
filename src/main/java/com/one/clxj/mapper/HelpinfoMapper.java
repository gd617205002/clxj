package com.one.clxj.mapper;

import com.one.clxj.pojo.Helpinfo;
import com.one.clxj.pojo.HelpinfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface HelpinfoMapper extends Mapper<Helpinfo> {
    int countByExample(HelpinfoExample example);



    List<Helpinfo> selectByExample2(HelpinfoExample example);

    Helpinfo selectByPrimaryKey2(Integer id);

}