package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Afluser;
import com.one.clxj.pojo.Carcomment;
import com.one.clxj.pojo.CarcommentExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface CarcommentMapper extends Mapper<Carcomment> {
    int countByExample(CarcommentExample example);


    List<Carcomment> selectByExample2(CarcommentExample example);

    Carcomment selectByPrimaryKey2(Integer id);

}