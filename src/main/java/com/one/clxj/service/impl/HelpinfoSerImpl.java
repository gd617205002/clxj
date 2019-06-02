package com.one.clxj.service.impl;

import com.one.clxj.mapper.HelpinfoMapper;
import com.one.clxj.pojo.Helpinfo;
import com.one.clxj.pojo.HelpinfoExample;
import com.one.clxj.service.HelpinfoSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
@Transactional
public class HelpinfoSerImpl implements HelpinfoSer {

    @Autowired
    private HelpinfoMapper helpinfoMapper;


    @Override
    public int countByExample(HelpinfoExample example) {
        return helpinfoMapper.countByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return helpinfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(Helpinfo record) {
        return helpinfoMapper.insertSelective(record);
    }

    @Override
    public List<Helpinfo> selectByExample(HelpinfoExample example) {
        return helpinfoMapper.selectByExample(example);
    }

    @Override
    public Helpinfo selectByPrimaryKey(Integer id) {
        return helpinfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Helpinfo record) {
        return helpinfoMapper.updateByPrimaryKeySelective(record);
    }
}
