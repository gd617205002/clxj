package com.one.clxj.service.impl;

import com.one.clxj.pojo.Joins;
import com.one.clxj.pojo.JoinsExample;
import com.one.clxj.service.JoinsSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;
@Service
public class SupperMapper implements JoinsSer {

    @Autowired
    JoinsSer joinsSer;



    @Override
    public int countByExample(JoinsExample example) {
        System.out.println(joinsSer.countByExample(null));

        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insertSelective(Joins record) {
        return 0;
    }

    @Override
    public List<Joins> selectByExample(JoinsExample example) {
        return null;
    }

    @Override
    public Joins selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Joins record) {
        return 0;
    }
}
