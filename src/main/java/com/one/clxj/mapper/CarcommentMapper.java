package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Afluser;
import com.one.clxj.pojo.Carcomment;
import com.one.clxj.pojo.CarcommentExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface CarcommentMapper {
    int countByExample(CarcommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Carcomment record);

    List<Carcomment> selectByExample(CarcommentExample example);

    Carcomment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Carcomment record);

}