package com.one.clxj.service.impl;

import com.one.clxj.mapper.ClxjcommentMapper;
import com.one.clxj.pojo.Clxjcomment;
import com.one.clxj.pojo.ClxjcommentExample;
import com.one.clxj.service.ClxjcommentSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
@Transactional
public class ClxjcommentSerImpl  implements ClxjcommentSer {
    @Autowired
    private ClxjcommentMapper clxjcommentMapper;


    @Override
    public int countByExample(ClxjcommentExample example) {
        return clxjcommentMapper.countByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return clxjcommentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(Clxjcomment record) {
        return clxjcommentMapper.insertSelective(record);
    }

    @Override
    public List<Clxjcomment> selectByExample(ClxjcommentExample example) {
        return clxjcommentMapper.selectByExample(example);
    }

    @Override
    public Clxjcomment selectByPrimaryKey(Integer id) {
        return clxjcommentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Clxjcomment record) {
        return clxjcommentMapper.updateByPrimaryKeySelective(record);
    }
}