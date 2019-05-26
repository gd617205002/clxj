package com.one.clxj.service.impl;

import com.one.clxj.pojo.HelpinfoKey;
import com.one.clxj.service.HelpinfoKeySer;
import org.springframework.stereotype.Service;import org.springframework.transaction.annotation.Transactional;@Service
@Transactional public  class HelpinfoKeySerImpl extends SuperServiceImpl<HelpinfoKey>implements HelpinfoKeySer {}