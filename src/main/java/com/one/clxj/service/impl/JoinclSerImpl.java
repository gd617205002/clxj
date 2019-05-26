package com.one.clxj.service.impl;

import com.one.clxj.pojo.Joincl;
import com.one.clxj.service.JoinclSer;
import org.springframework.stereotype.Service;import org.springframework.transaction.annotation.Transactional;@Service
@Transactional public  class JoinclSerImpl extends SuperServiceImpl<Joincl>implements JoinclSer {}