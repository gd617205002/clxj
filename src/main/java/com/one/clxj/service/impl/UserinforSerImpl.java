package com.one.clxj.service.impl;

import com.one.clxj.mapper.UserinforMapper;
import com.one.clxj.pojo.Uploadfiles;
import com.one.clxj.pojo.Userinfor;
import com.one.clxj.pojo.UserinforExample;
import com.one.clxj.service.UploadfilesSer;
import com.one.clxj.service.UserinforSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional public  class UserinforSerImpl  implements UserinforSer {

    @Autowired
    private UserinforMapper userinforMapper;

    @Override
    public int countByExample(UserinforExample example) {
        return userinforMapper.countByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer user_id) {
        return userinforMapper.deleteByPrimaryKey(user_id);
    }

    @Override
    public int insertSelective(Userinfor record) {
        return userinforMapper.insertSelective(record);
    }

    @Override
    public List<Userinfor> selectByExample(UserinforExample example) {
        return userinforMapper.selectByExample(example);
    }

    @Override
    public Userinfor selectByPrimaryKey(Integer user_id) {
        return userinforMapper.selectByPrimaryKey(user_id);
    }

    @Override
    public int updateByPrimaryKeySelective(Userinfor record) {
        return userinforMapper.updateByPrimaryKeySelective(record);
    }
}