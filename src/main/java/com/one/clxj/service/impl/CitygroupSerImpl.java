package com.one.clxj.service.impl;

import com.one.clxj.pojo.Citygroup;
import com.one.clxj.service.CitygroupSer;
import org.springframework.stereotype.Service;import org.springframework.transaction.annotation.Transactional;@Service
@Transactional public  class CitygroupSerImpl extends SuperServiceImpl<Citygroup>implements CitygroupSer {}