package com.one.clxj.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.one.clxj.pojo.Clxjorder;
import com.one.clxj.pojo.ClxjorderExample;
import com.one.clxj.pojo.Helpinfo;
import com.one.clxj.pojo.HelpinfoExample;
import com.one.clxj.service.HelpinfoSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping(value = "/Helpinfo")
@Controller
public class HelpinfoHandler {

    @Autowired
    private HelpinfoSer helpinfoSer;

    /**
     *    订单查询
     */
    @RequestMapping("/userPquery.do")
    @ResponseBody
    public Map<String,Object> userPquery(int page, Helpinfo helpinfo){

        System.out.println("订单查询:"+page+" "+helpinfo);
        int pageSize = 2; //显示记录数
        Map<String,Object> map = new HashMap<>();
        HelpinfoExample helpinfoExample = new HelpinfoExample();
        HelpinfoExample.Criteria criteria = helpinfoExample.createCriteria();
        criteria.andUidEqualTo(helpinfo.getReguser().getId());  //加入用户编号
        if (helpinfo.getApplystatus()!=null){
            if (helpinfo.getApplystatus()==1||helpinfo.getApplystatus()==2||helpinfo.getApplystatus()==3){ //初审通过、终审通过、审核通过
                criteria.andApplystatusEqualTo(helpinfo.getApplystatus());
            }
        }
        PageHelper.startPage(page,pageSize);
        List<Helpinfo> list = helpinfoSer.selectByExample(helpinfoExample);
        PageInfo pageInfo = new PageInfo(list);

        map.put("data",pageInfo.getList());
        map.put("pages",pageInfo.getPages());
        System.out.println("map:"+map);
        return map;
    }
}