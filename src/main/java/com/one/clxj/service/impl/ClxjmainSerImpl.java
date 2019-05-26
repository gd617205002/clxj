package com.one.clxj.service.impl;

import com.one.clxj.pojo.Clxjmain;
import com.one.clxj.service.ClxjmainSer;
import org.springframework.stereotype.Service;import org.springframework.transaction.annotation.Transactional;@Service
@Transactional public  class ClxjmainSerImpl extends SuperServiceImpl<Clxjmain>implements ClxjmainSer {}