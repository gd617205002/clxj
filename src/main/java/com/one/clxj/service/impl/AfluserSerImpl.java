package com.one.clxj.service.impl;

import com.one.clxj.pojo.Afluser;
import com.one.clxj.service.AfluserSer;
import org.springframework.stereotype.Service;import org.springframework.transaction.annotation.Transactional;@Service
@Transactional public  class AfluserSerImpl extends SuperServiceImpl<Afluser>implements AfluserSer {}