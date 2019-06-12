package com.one.clxj.service.impl;

import com.one.clxj.mapper.PayformonthMapper;

import com.one.clxj.pojo.Payformonth;

import com.one.clxj.pojo.PayformonthExample;

import com.one.clxj.service.PayformonthSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PayformonthSerImpl  implements PayformonthSer {

    @Autowired
    private PayformonthMapper payformonthMapper;


    @Override
    public int countByExample(PayformonthExample example) {
        return payformonthMapper.countByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return payformonthMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(Payformonth record) {
        return payformonthMapper.insertSelective(record);
    }

    @Override
    public List<Payformonth> selectByExample(PayformonthExample example) {
        return payformonthMapper.selectByExample(example);
    }

    @Override
    public Payformonth selectByPrimaryKey(Integer id) {
        return payformonthMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Payformonth record) {
        return payformonthMapper.updateByPrimaryKeySelective(record);
    }
}