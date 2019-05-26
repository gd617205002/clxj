package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Donation;
import com.one.clxj.pojo.DonationExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface DonationMapper extends Mapper<Donation> {
    int countByExample(DonationExample example);

    int deleteByExample(DonationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Donation record);

    int insertSelective(Donation record);

    List<Donation> selectByExample(DonationExample example);

    Donation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Donation record, @Param("example") DonationExample example);

    int updateByExample(@Param("record") Donation record, @Param("example") DonationExample example);

    int updateByPrimaryKeySelective(Donation record);

    int updateByPrimaryKey(Donation record);
}