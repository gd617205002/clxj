package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Donation;
import com.one.clxj.pojo.DonationExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface DonationMapper extends Mapper<Donation> {
    int countByExample(DonationExample example);



    List<Donation> selectByExample2(DonationExample example);

    Donation selectByPrimaryKey2(Integer id);


}