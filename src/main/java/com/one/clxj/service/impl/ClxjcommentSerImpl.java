package com.one.clxj.service.impl;

import com.one.clxj.pojo.Clxjcomment;
import com.one.clxj.service.ClxjcommentSer;
import org.springframework.stereotype.Service;import org.springframework.transaction.annotation.Transactional;@Service
@Transactional public  class ClxjcommentSerImpl extends SuperServiceImpl<Clxjcomment>implements ClxjcommentSer {}