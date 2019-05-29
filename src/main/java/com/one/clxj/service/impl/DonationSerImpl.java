package com.one.clxj.service.impl;

import com.one.clxj.mapper.DonationMapper;
import com.one.clxj.pojo.Donation;
import com.one.clxj.pojo.DonationExample;
import com.one.clxj.service.DonationSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

@Service
@Transactional
public class DonationSerImpl extends SuperServiceImpl<Donation, DonationExample> implements DonationSer {
    @Autowired
    private DonationMapper donationMapper;

    @PostConstruct
//    初始化
    public void init() {

        super.mapper = donationMapper;
    }
}