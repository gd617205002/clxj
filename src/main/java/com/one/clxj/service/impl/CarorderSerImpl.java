package com.one.clxj.service.impl;

import com.one.clxj.pojo.Carorder;
import com.one.clxj.service.CarorderSer;
import org.springframework.stereotype.Service;import org.springframework.transaction.annotation.Transactional;@Service
@Transactional public  class CarorderSerImpl extends SuperServiceImpl<Carorder>implements CarorderSer {}