package com.one.clxj.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.one.clxj.pojo.Joincar;
import com.one.clxj.pojo.JoincarExample;
import com.one.clxj.pojo.Joinxj;
import com.one.clxj.pojo.JoinxjExample;
import com.one.clxj.service.JoincarSer;
import com.one.clxj.service.JoinxjSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping(value = "/Joinxj")
@Controller
public class JoinxjHandler {

    @Autowired
    private JoinxjSer joinxjSer;

    /**
     *    加盟查询
     */
    @RequestMapping("/userJPquery.do")
    @ResponseBody
    public Map<String,Object> userJPquery(int page, Joinxj joinxj){

        System.out.println("订单查询:"+page+" "+joinxj);
        int pageSize = 2; //显示记录数
        Map<String,Object> map = new HashMap<>();
        JoinxjExample joinxjExample = new JoinxjExample();
        joinxjExample.createCriteria().andUidEqualTo(joinxj.getReguser().getId());  //加入用户编号

        PageHelper.startPage(page,pageSize);
        List<Joinxj> list = joinxjSer.selectByExample(joinxjExample);
        PageInfo pageInfo = new PageInfo(list);

        map.put("data",pageInfo.getList());
        map.put("pages",pageInfo.getPages());
        System.out.println("map:"+map);
        return map;
    }
}