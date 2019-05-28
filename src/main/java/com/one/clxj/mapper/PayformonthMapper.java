package com.one.clxj.mapper;

import com.one.clxj.pojo.Payformonth;
import com.one.clxj.pojo.PayformonthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface PayformonthMapper extends Mapper<Payformonth> {
    int countByExample(PayformonthExample example);

    int deleteByExample2(PayformonthExample example);

    int deleteByPrimaryKey2(Integer id);

    int insert(Payformonth record);

    int insertSelective(Payformonth record);

    List<Payformonth> selectByExample2(PayformonthExample example);

    Payformonth selectByPrimaryKey2(Integer id);

    int updateByExampleSelective2(@Param("record") Payformonth record, @Param("example") PayformonthExample example);

    int updateByExample2(@Param("record") Payformonth record, @Param("example") PayformonthExample example);

    int updateByPrimaryKeySelective(Payformonth record);

    int updateByPrimaryKey(Payformonth record);
}