package com.one.clxj.service;

import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * 超级
 */
public interface SuperService<T, V> {

    //  添加
    //public boolean add(T t);

    //  删除
    //public boolean delByPrimaryKey(Object p);

    //  修改
    //public boolean chan(T t);

    //  主键查询
    //public T findByPrimaryKey(Object p);

    //  查询全部
    //public List<T> findAll();

    //  全部分页
    public PageInfo<T> paging(Integer page, Integer num);

    //  全部分页
    public PageInfo<T>  conditionPaging(Integer page, Integer num, V v);

    //  条件查询
    //public List<T> conditionFind(V v);
}
