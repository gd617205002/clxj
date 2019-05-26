package com.one.clxj.service.impl;

import com.one.clxj.pojo.Uploadfiles;
import com.one.clxj.service.UploadfilesSer;
import org.springframework.stereotype.Service;import org.springframework.transaction.annotation.Transactional;@Service
@Transactional public  class UploadfilesSerImpl extends SuperServiceImpl<Uploadfiles>implements UploadfilesSer {}