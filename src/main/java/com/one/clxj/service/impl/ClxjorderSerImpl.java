package com.one.clxj.service.impl;

import com.one.clxj.pojo.Clxjorder;
import com.one.clxj.service.ClxjorderSer;
import org.springframework.stereotype.Service;import org.springframework.transaction.annotation.Transactional;@Service
@Transactional public  class ClxjorderSerImpl extends SuperServiceImpl<Clxjorder>implements ClxjorderSer {}