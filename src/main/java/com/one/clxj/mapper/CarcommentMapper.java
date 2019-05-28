package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Afluser;
import com.one.clxj.pojo.Carcomment;
import com.one.clxj.pojo.CarcommentExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface CarcommentMapper extends Mapper<Carcomment> {
    int countByExample(CarcommentExample example);

    int deleteByExample2(CarcommentExample example);

    int deleteByPrimaryKey2(Integer id);

    int insert(Carcomment record);

    int insertSelective(Carcomment record);

    List<Carcomment> selectByExample2(CarcommentExample example);

    Carcomment selectByPrimaryKey2(Integer id);

    int updateByExampleSelective2(@Param("record") Carcomment record, @Param("example") CarcommentExample example);

    int updateByExample2(@Param("record") Carcomment record, @Param("example") CarcommentExample example);

    int updateByPrimaryKeySelective(Carcomment record);

    int updateByPrimaryKey(Carcomment record);
}