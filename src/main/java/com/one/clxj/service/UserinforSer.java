package com.one.clxj.service;


import com.one.clxj.pojo.Userinfor;
import com.one.clxj.pojo.UserinforExample;

import java.util.List;

public  interface UserinforSer {

    int countByExample(UserinforExample example);

    int deleteByPrimaryKey(Integer user_id);

    int insertSelective(Userinfor record);

    List<Userinfor> selectByExample(UserinforExample example);

    Userinfor selectByPrimaryKey(Integer user_id);

    int updateByPrimaryKeySelective(Userinfor record);

}