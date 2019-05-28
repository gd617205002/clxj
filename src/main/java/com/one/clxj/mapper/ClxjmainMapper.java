package com.one.clxj.mapper;

import com.one.clxj.pojo.Clxjmain;
import com.one.clxj.pojo.ClxjmainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface ClxjmainMapper  extends Mapper<Clxjmain> {
    int countByExample(ClxjmainExample example);

    int deleteByExample2(ClxjmainExample example);

    int deleteByPrimaryKey2(Integer id);

    int insert(Clxjmain record);

    int insertSelective(Clxjmain record);

    List<Clxjmain> selectByExample2(ClxjmainExample example);

    Clxjmain selectByPrimaryKey2(Integer id);

    int updateByExampleSelective2(@Param("record") Clxjmain record, @Param("example") ClxjmainExample example);

    int updateByExample2(@Param("record") Clxjmain record, @Param("example") ClxjmainExample example);

    int updateByPrimaryKeySelective(Clxjmain record);

    int updateByPrimaryKey(Clxjmain record);
}