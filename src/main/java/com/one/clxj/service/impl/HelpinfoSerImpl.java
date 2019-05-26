package com.one.clxj.service.impl;

import com.one.clxj.pojo.Helpinfo;
import com.one.clxj.service.HelpinfoSer;
import org.springframework.stereotype.Service;import org.springframework.transaction.annotation.Transactional;@Service
@Transactional public  class HelpinfoSerImpl extends SuperServiceImpl<Helpinfo>implements HelpinfoSer {}