package com.one.clxj.mapper;

import com.one.clxj.pojo.Payformonth;
import com.one.clxj.pojo.PayformonthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface PayformonthMapper extends Mapper<Payformonth> {
    int countByExample(PayformonthExample example);



    List<Payformonth> selectByExample2(PayformonthExample example);

    Payformonth selectByPrimaryKey2(Integer id);


}