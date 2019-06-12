package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Donation;
import com.one.clxj.pojo.DonationExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface DonationMapper{
    int countByExample(DonationExample example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Donation record);

    List<Donation> selectByExample(DonationExample example);

    Donation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Donation record);

}