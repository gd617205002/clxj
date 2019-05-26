package com.one.clxj.service.impl;

import com.one.clxj.pojo.Carcomment;
import com.one.clxj.service.CarcommentSer;
import org.springframework.stereotype.Service;import org.springframework.transaction.annotation.Transactional;@Service
@Transactional public  class CarcommentSerImpl extends SuperServiceImpl<Carcomment>implements CarcommentSer {}