package com.one.clxj.service.impl;



        import com.one.clxj.service.GroupingSer;
        import  com.one.clxj.pojo.Grouping;
        import org.springframework.stereotype.Service;
        import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional
public  class GroupingSerImpl extends SuperServiceImpl<Grouping> implements GroupingSer {

}