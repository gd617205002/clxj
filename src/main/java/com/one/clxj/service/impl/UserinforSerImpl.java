package com.one.clxj.service.impl;

import com.one.clxj.pojo.Uploadfiles;
import com.one.clxj.pojo.Userinfor;
import com.one.clxj.pojo.UserinforExample;
import com.one.clxj.service.UploadfilesSer;
import com.one.clxj.service.UserinforSer;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional public  class UserinforSerImpl extends SuperServiceImpl<Userinfor,UserinforExample> implements UserinforSer {}