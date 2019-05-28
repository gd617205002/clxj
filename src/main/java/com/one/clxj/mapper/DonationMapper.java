package com.one.clxj.mapper;

import java.util.List;

import com.one.clxj.pojo.Donation;
import com.one.clxj.pojo.DonationExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface DonationMapper extends Mapper<Donation> {
    int countByExample(DonationExample example);

    int deleteByExample2(DonationExample example);

    int deleteByPrimaryKey2(Integer id);

    int insert(Donation record);

    int insertSelective(Donation record);

    List<Donation> selectByExample2(DonationExample example);

    Donation selectByPrimaryKey2(Integer id);

    int updateByExampleSelective2(@Param("record") Donation record, @Param("example") DonationExample example);

    int updateByExample2(@Param("record") Donation record, @Param("example") DonationExample example);

    int updateByPrimaryKeySelective(Donation record);

    int updateByPrimaryKey(Donation record);
}