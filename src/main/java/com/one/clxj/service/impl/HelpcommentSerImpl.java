package com.one.clxj.service.impl;

import com.one.clxj.pojo.Helpcomment;
import com.one.clxj.service.HelpcommentSer;
import org.springframework.stereotype.Service;import org.springframework.transaction.annotation.Transactional;@Service
@Transactional
public  class HelpcommentSerImpl extends SuperServiceImpl<Helpcomment>implements HelpcommentSer {}