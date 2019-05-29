package com.one.clxj.mapper;

import com.one.clxj.pojo.Userinfor;
import com.one.clxj.pojo.UserinforExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface UserinforMapper extends Mapper<Userinfor> {
    int countByExample(UserinforExample example);



    List<Userinfor> selectByExample2(UserinforExample example);

    Userinfor selectByPrimaryKey2(Integer user_id);


}