package com.one.clxj.service.impl;

import com.one.clxj.mapper.CarinfoMapper;
import com.one.clxj.pojo.Carinfo;
import com.one.clxj.pojo.CarinfoExample;
import com.one.clxj.service.CarinfoSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
@Transactional
public class CarinfoSerImpl  implements CarinfoSer {

    @Autowired
    private CarinfoMapper carinfoMapper;


    @Override
    public int countByExample(CarinfoExample example) {
        return carinfoMapper.countByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return carinfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(Carinfo record) {
        return carinfoMapper.insertSelective(record);
    }

    @Override
    public List<Carinfo> selectByExample(CarinfoExample example) {
        return carinfoMapper.selectByExample(example);
    }

    @Override
    public Carinfo selectByPrimaryKey2(Integer id) {
        return carinfoMapper.selectByPrimaryKey2(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Carinfo record) {
        return carinfoMapper.updateByPrimaryKeySelective(record);
    }
}
