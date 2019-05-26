package com.one.clxj.service.impl;

import com.one.clxj.pojo.Joincar;
import com.one.clxj.service.JoincarSer;
import org.springframework.stereotype.Service;import org.springframework.transaction.annotation.Transactional;@Service
@Transactional public  class JoincarSerImpl extends SuperServiceImpl<Joincar>implements JoincarSer {}