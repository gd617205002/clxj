package com.one.clxj.service.impl;

import com.one.clxj.pojo.Confession;
import com.one.clxj.service.ConfessionSer;
import org.springframework.stereotype.Service;import org.springframework.transaction.annotation.Transactional;@Service
@Transactional public  class ConfessionSerImpl extends SuperServiceImpl<Confession>implements ConfessionSer {}