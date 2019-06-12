package com.one.clxj.service;

import com.one.clxj.mapper.DonationMapper;
import com.one.clxj.pojo.Donation;
import com.one.clxj.pojo.DonationExample;

import java.util.List;

public  interface DonationSer{

    int countByExample(DonationExample example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Donation record);

    List<Donation> selectByExample(DonationExample example);

    Donation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Donation record);
}