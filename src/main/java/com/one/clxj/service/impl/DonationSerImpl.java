package com.one.clxj.service.impl;

import com.one.clxj.mapper.DonationMapper;
import com.one.clxj.pojo.Donation;
import com.one.clxj.pojo.DonationExample;
import com.one.clxj.service.DonationSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
@Transactional
public class DonationSerImpl  implements DonationSer {
    @Autowired
    private DonationMapper donationMapper;

    @Override
    public int countByExample(DonationExample example) {
        return donationMapper.countByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return donationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(Donation record) {
        return donationMapper.insertSelective(record);
    }

    @Override
    public List<Donation> selectByExample(DonationExample example) {
        return donationMapper.selectByExample(example);
    }

    @Override
    public Donation selectByPrimaryKey(Integer id) {
        return donationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Donation record) {
        return donationMapper.updateByPrimaryKeySelective(record);
    }
}