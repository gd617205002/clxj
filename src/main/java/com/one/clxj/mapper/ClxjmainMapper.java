package com.one.clxj.mapper;

import com.one.clxj.pojo.Clxjmain;
import com.one.clxj.pojo.ClxjmainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface ClxjmainMapper   {
    int countByExample(ClxjmainExample example);

    int deleteByPrimaryKey(Integer id);


    int insertSelective(Clxjmain record);

    List<Clxjmain> selectByExample(ClxjmainExample example);

    Clxjmain selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Clxjmain record);

}