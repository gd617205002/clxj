package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Clxjmain;
import com.one.clxj.pojo.ClxjmainExample;
import com.one.clxj.pojo.ClxjmainWithBLOBs;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface ClxjmainMapper extends Mapper<Clxjmain> {
    int countByExample(ClxjmainExample example);

    int deleteByExample(ClxjmainExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClxjmainWithBLOBs record);

    int insertSelective(ClxjmainWithBLOBs record);

    List<ClxjmainWithBLOBs> selectByExampleWithBLOBs(ClxjmainExample example);

    List<Clxjmain> selectByExample(ClxjmainExample example);

    ClxjmainWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ClxjmainWithBLOBs record, @Param("example") ClxjmainExample example);

    int updateByExampleWithBLOBs(@Param("record") ClxjmainWithBLOBs record, @Param("example") ClxjmainExample example);

    int updateByExample(@Param("record") Clxjmain record, @Param("example") ClxjmainExample example);

    int updateByPrimaryKeySelective(ClxjmainWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ClxjmainWithBLOBs record);

    int updateByPrimaryKey(Clxjmain record);
}