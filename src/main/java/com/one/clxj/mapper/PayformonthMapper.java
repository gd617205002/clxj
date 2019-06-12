package com.one.clxj.mapper;

import com.one.clxj.pojo.Payformonth;
import com.one.clxj.pojo.PayformonthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface PayformonthMapper{
    int countByExample(PayformonthExample example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Payformonth record);

    List<Payformonth> selectByExample(PayformonthExample example);

    Payformonth selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Payformonth record);

}