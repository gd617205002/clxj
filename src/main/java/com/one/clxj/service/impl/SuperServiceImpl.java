package com.one.clxj.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.one.clxj.service.SuperService;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public class SuperServiceImpl<T> implements SuperService<T> {

    Mapper mapper = null;

    @Override
    public boolean add(T t) {
        try {
            mapper.insert(t);
        }catch (Exception e){
            return false;
        }
        return true;
    }

    @Override
    public boolean delByPrimaryKey(T p) {
        mapper.deleteByPrimaryKey(p);
        return true;
    }

    @Override
    public boolean chan(T t) {
        try {
            mapper.updateByPrimaryKey(t);
        }catch (Exception e){
            return false;
        }
        return true;
    }

    @Override
    public T findByPrimaryKey(T t) {
        T o = null;
        o = (T)(mapper.selectByPrimaryKey(t));
        return o;
    }

    @Override
    public List<T> fildAll(T t) {
        List list = mapper.selectAll();
        return list;
    }

    @Override
    public List<T> paging(Integer page, Integer num) {
        PageHelper.startPage(page,num);
        List<T> res = mapper.selectAll();
        //用PageInfo对结果进行包装
        PageInfo pageInfo = new PageInfo(res);
        List<T> list = pageInfo.getList();
        return list;
    }

}
