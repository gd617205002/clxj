package com.one.clxj.service;

import java.util.List;

/**
 *  超级
 */
public interface SuperService <T>{

//
    public boolean add(T t);
//
    public boolean delByPrimaryKey(T p);
//
    public boolean chan(T t);
//
    public T findByPrimaryKey(T t);
//
    public List<T> fildAll(T t);
//
    public List<T> paging(Integer page, Integer num);
}
