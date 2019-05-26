package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Afluser;
import com.one.clxj.pojo.Carcomment;
import com.one.clxj.pojo.CarcommentExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface CarcommentMapper extends Mapper<Carcomment> {
    int countByExample(CarcommentExample example);

    int deleteByExample(CarcommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Carcomment record);

    int insertSelective(Carcomment record);

    List<Carcomment> selectByExample(CarcommentExample example);

    Carcomment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Carcomment record, @Param("example") CarcommentExample example);

    int updateByExample(@Param("record") Carcomment record, @Param("example") CarcommentExample example);

    int updateByPrimaryKeySelective(Carcomment record);

    int updateByPrimaryKey(Carcomment record);
}