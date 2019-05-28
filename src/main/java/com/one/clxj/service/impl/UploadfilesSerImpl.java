package com.one.clxj.service.impl;

import com.one.clxj.mapper.UploadfilesMapper;
import com.one.clxj.pojo.Uploadfiles;
import com.one.clxj.pojo.UploadfilesExample;
import com.one.clxj.service.UploadfilesSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

@Service
@Transactional
public class UploadfilesSerImpl extends SuperServiceImpl<Uploadfiles, UploadfilesExample> implements UploadfilesSer {

    @Autowired
    private UploadfilesMapper uploadfilesMapper;

    @PostConstruct
//    初始化
    public void init() {

        super.mapper = uploadfilesMapper;
    }
}