package com.one.clxj.mapper;
import tk.mybatis.mapper.common.Mapper;
import com.one.clxj.pojo.Carorder;

public interface CarorderMapper extends Mapper<Carorder> {

   public Carorder selectByPrimaryKey2(String id);



}