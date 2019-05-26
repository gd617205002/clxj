package com.one.clxj.service.impl;

import com.one.clxj.pojo.Donation;
import com.one.clxj.service.DonationSer;
import org.springframework.stereotype.Service;import org.springframework.transaction.annotation.Transactional;@Service
@Transactional public  class DonationSerImpl extends SuperServiceImpl<Donation>implements DonationSer {}