package com.one.clxj.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.one.clxj.service.SuperService;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public class SuperServiceImpl<T,V> implements SuperService<T,V> {

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
    public boolean delByPrimaryKey(Object p) {
        try {
            mapper.deleteByPrimaryKey(p);
        }catch (Exception e){
            return false;
        }
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
    public T findByPrimaryKey(Object p) {
        T o = null;
        o = (T)(mapper.selectByPrimaryKey(p));
        return o;
    }

    @Override
    public List<T> findAll() {
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

    @Override
    public List<T> conditionPaging(Integer page, Integer num, V v) {
        PageHelper.startPage(page,num);
        List<T> res = mapper.selectByExample(v);
        //用PageInfo对结果进行包装
        PageInfo pageInfo = new PageInfo(res);
        List<T> list = pageInfo.getList();
        return list;
    }

    @Override
    public List<T> conditionFind(V v) {
        List<T> list = mapper.selectByExample(v);
        return list;
    }

}
