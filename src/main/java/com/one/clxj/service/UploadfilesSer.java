package com.one.clxj.service;

import com.one.clxj.mapper.UploadfilesMapper;
import com.one.clxj.pojo.Uploadfiles;
import com.one.clxj.pojo.UploadfilesExample;

import java.util.List;

public  interface UploadfilesSer{

    int countByExample(UploadfilesExample example);

    int deleteByPrimaryKey(Integer fileId);

    int insertSelective(Uploadfiles record);

    List<Uploadfiles> selectByExample(UploadfilesExample example);

    Uploadfiles selectByPrimaryKey(Integer fileId);

    int updateByPrimaryKeySelective(Uploadfiles record);

}