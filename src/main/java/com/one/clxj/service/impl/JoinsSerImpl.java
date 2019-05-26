package com.one.clxj.service.impl;

import com.one.clxj.pojo.Joins;
import com.one.clxj.service.JoinsSer;
import org.springframework.stereotype.Service;import org.springframework.transaction.annotation.Transactional;@Service
@Transactional public  class JoinsSerImpl extends SuperServiceImpl<Joins>implements JoinsSer {}