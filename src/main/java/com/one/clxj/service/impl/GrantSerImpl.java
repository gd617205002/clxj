package com.one.clxj.service.impl;

import com.one.clxj.pojo.Grant;
import com.one.clxj.service.GrantSer;
import org.springframework.stereotype.Service;import org.springframework.transaction.annotation.Transactional;@Service
@Transactional public  class GrantSerImpl extends SuperServiceImpl<Grant>implements GrantSer {}