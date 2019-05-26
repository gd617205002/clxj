package com.one.clxj.service.impl;

import com.one.clxj.pojo.ClxjmainWithBLOBs;
import com.one.clxj.service.ClxjmainWithBLOBsSer;
import org.springframework.stereotype.Service;import org.springframework.transaction.annotation.Transactional;@Service
@Transactional public  class ClxjmainWithBLOBsSerImpl extends SuperServiceImpl<ClxjmainWithBLOBs>implements ClxjmainWithBLOBsSer {}