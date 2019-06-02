package com.one.clxj.service.impl;

import com.one.clxj.mapper.UploadfilesMapper;
import com.one.clxj.pojo.Uploadfiles;
import com.one.clxj.pojo.UploadfilesExample;
import com.one.clxj.service.UploadfilesSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
@Transactional
public class UploadfilesSerImpl implements UploadfilesSer {

    @Autowired
    private UploadfilesMapper uploadfilesMapper;

    @Override
    public int countByExample(UploadfilesExample example) {
        return uploadfilesMapper.countByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer fileId) {
        return uploadfilesMapper.deleteByPrimaryKey(fileId);
    }

    @Override
    public int insertSelective(Uploadfiles record) {
        return uploadfilesMapper.insertSelective(record);
    }

    @Override
    public List<Uploadfiles> selectByExample(UploadfilesExample example) {
        return uploadfilesMapper.selectByExample(example);
    }

    @Override
    public Uploadfiles selectByPrimaryKey(Integer fileId) {
        return uploadfilesMapper.selectByPrimaryKey(fileId);
    }

    @Override
    public int updateByPrimaryKeySelective(Uploadfiles record) {
        return uploadfilesMapper.updateByPrimaryKeySelective(record);
    }
}