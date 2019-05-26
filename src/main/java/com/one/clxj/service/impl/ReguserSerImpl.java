package com.one.clxj.service.impl;

import com.one.clxj.pojo.Reguser;
import com.one.clxj.service.ReguserSer;
import org.springframework.stereotype.Service;import org.springframework.transaction.annotation.Transactional;@Service
@Transactional public  class ReguserSerImpl extends SuperServiceImpl<Reguser>implements ReguserSer {}