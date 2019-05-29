package com.one.clxj.mapper;

import com.one.clxj.pojo.Clxjmain;
import com.one.clxj.pojo.ClxjmainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface ClxjmainMapper  extends Mapper<Clxjmain> {
    int countByExample(ClxjmainExample example);



    List<Clxjmain> selectByExample2(ClxjmainExample example);

    Clxjmain selectByPrimaryKey2(Integer id);


}