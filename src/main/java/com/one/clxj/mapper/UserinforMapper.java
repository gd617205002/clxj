package com.one.clxj.mapper;

import com.one.clxj.pojo.Userinfor;
import com.one.clxj.pojo.UserinforExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface UserinforMapper extends Mapper<Userinfor> {
    int countByExample(UserinforExample example);

    int deleteByExample2(UserinforExample example);

    int deleteByPrimaryKey2(Integer user_id);

    int insert(Userinfor record);

    int insertSelective(Userinfor record);

    List<Userinfor> selectByExample2(UserinforExample example);

    Userinfor selectByPrimaryKey2(Integer user_id);

    int updateByExampleSelective2(@Param("record") Userinfor record, @Param("example") UserinforExample example);

    int updateByExample2(@Param("record") Userinfor record, @Param("example") UserinforExample example);

    int updateByPrimaryKeySelective(Userinfor record);

    int updateByPrimaryKey(Userinfor record);
}