package com.one.clxj.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.one.clxj.pojo.Joincl;
import com.one.clxj.pojo.JoinclExample;
import com.one.clxj.pojo.Payformonth;
import com.one.clxj.pojo.PayformonthExample;
import com.one.clxj.service.JoinclSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping(value = "/Joincl")
@Controller
public class JoinclHandler {
    @Autowired
    private JoinclSer joinclSer;

    @GetMapping("/findAllJoincl.do")
    public Map<String,Object> findAllJoincl(Joincl joincl, Integer pageIndex, Integer pageSize){
        Map<String,Object> map = new HashMap<String, Object>();

        JoinclExample joinclExample = new JoinclExample();
        JoinclExample.Criteria criteria = joinclExample.createCriteria();
        if (joincl!=null){
            if (joincl.getClname()!=null&&!"".equals(joincl.getClname()))
                criteria.andClnameLike(joincl.getClname());
            if (joincl.getJoinstatus()!=null&&!"".equals(joincl.getJoinstatus()))
                criteria.andJoinstatusEqualTo(joincl.getJoinstatus());
        }
        PageHelper.startPage(pageIndex,pageSize);

        List<Joincl> list = joinclSer.selectByExample(joinclExample);

        PageInfo<Joincl> pageInfo = new PageInfo<Joincl>(list);

        map.put("total",pageInfo.getTotal());

        map.put("rows",pageInfo.getList());

        return  map;
    }

    /**
     *    加盟查询
     */
    @RequestMapping("/userJPquery.do")
    @ResponseBody
    public Map<String,Object> userJPquery(int page, Joincl joincl){

        System.out.println("订单查询:"+page+" "+joincl);
        int pageSize = 2; //显示记录数
        Map<String,Object> map = new HashMap<>();
        JoinclExample joinclExample = new JoinclExample();
        joinclExample.createCriteria().andUidEqualTo(joincl.getReguser().getId());  //加入用户编号

        PageHelper.startPage(page,pageSize);
        List<Joincl> list = joinclSer.selectByExample(joinclExample);
        PageInfo pageInfo = new PageInfo(list);

        map.put("data",pageInfo.getList());
        map.put("pages",pageInfo.getPages());
        System.out.println("map:"+map);
        return map;
    }

}