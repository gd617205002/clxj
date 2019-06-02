package com.one.clxj.mapper;

import com.one.clxj.pojo.Userinfor;
import com.one.clxj.pojo.UserinforExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface UserinforMapper  {
    int countByExample(UserinforExample example);

    int deleteByPrimaryKey(Integer user_id);

    int insertSelective(Userinfor record);

    List<Userinfor> selectByExample(UserinforExample example);

    Userinfor selectByPrimaryKey(Integer user_id);

    int updateByPrimaryKeySelective(Userinfor record);

}