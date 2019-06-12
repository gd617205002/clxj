package com.one.clxj.service.impl;

import com.one.clxj.mapper.CarcommentMapper;
import com.one.clxj.pojo.Carcomment;
import com.one.clxj.pojo.CarcommentExample;
import com.one.clxj.service.CarcommentSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
@Transactional public  class CarcommentSerImpl implements CarcommentSer {
    @Autowired
    private CarcommentMapper carcommentMapper;


    @Override
    public int countByExample(CarcommentExample example) {
        return carcommentMapper.countByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return carcommentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(Carcomment record) {
        return carcommentMapper.insertSelective(record);
    }

    @Override
    public List<Carcomment> selectByExample(CarcommentExample example) {
        return carcommentMapper.selectByExample(example);
    }

    @Override
    public Carcomment selectByPrimaryKey(Integer id) {
        return carcommentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Carcomment record) {
        return carcommentMapper.updateByPrimaryKeySelective(record);
    }
}