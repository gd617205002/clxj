package com.one.clxj.service.impl;

import com.one.clxj.mapper.HelpcommentMapper;
import com.one.clxj.pojo.Helpcomment;
import com.one.clxj.pojo.HelpcommentExample;
import com.one.clxj.service.HelpcommentSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
@Transactional
public class HelpcommentSerImpl  implements HelpcommentSer {
    @Autowired
    private HelpcommentMapper helpcommentMapper;


    @Override
    public int countByExample(HelpcommentExample example) {
        return helpcommentMapper.countByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return helpcommentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(Helpcomment record) {
        return helpcommentMapper.insertSelective(record);
    }

    @Override
    public List<Helpcomment> selectByExample(HelpcommentExample example) {
        return helpcommentMapper.selectByExample(example);
    }

    @Override
    public Helpcomment selectByPrimaryKey(Integer id) {
        return helpcommentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Helpcomment record) {
        return helpcommentMapper.updateByPrimaryKeySelective(record);
    }
}