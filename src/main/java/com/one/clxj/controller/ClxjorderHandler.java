package com.one.clxj.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.one.clxj.pojo.Clxjorder;
import com.one.clxj.pojo.ClxjorderExample;
import com.one.clxj.pojo.Reguser;
import com.one.clxj.service.ClxjorderSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping(value = "/Clxjorder")
@Controller
public class ClxjorderHandler {

    @Autowired
    ClxjorderSer clxjorderSer;

    /**
     *    订单查询
     */
    @RequestMapping("/userJAOrder.do")
    @ResponseBody
    public Map<String,Object> userJAOrder(int page, Clxjorder clxjorder){

        System.out.println("订单查询:"+page+" "+clxjorder);
        int pageSize = 2; //显示记录数
        Map<String,Object> map = new HashMap<>();
        ClxjorderExample clxjorderExample = new ClxjorderExample();
        ClxjorderExample.Criteria criteria = clxjorderExample.createCriteria();
        criteria.andUidEqualTo(clxjorder.getReguser().getId());  //加入用户编号
        if (clxjorder.getState()!=null){
            if (clxjorder.getState()==1){ //查询交易中
                criteria.andStateEqualTo(clxjorder.getState());
            }else if (clxjorder.getState()==2){ //查询交易完成
                criteria.andStateNotEqualTo(1);
            }
        }
        PageHelper.startPage(page,pageSize);
        List<Clxjorder> list = clxjorderSer.selectByExample(clxjorderExample);
        PageInfo pageInfo = new PageInfo(list);

        map.put("data",pageInfo.getList());
        map.put("pages",pageInfo.getPages());
        System.out.println("map:"+map);
        return map;
    }
    /**
     * 预定下单
     */
    @RequestMapping("/resFiorder.do")
    @ResponseBody
    public Boolean resFiorder(Clxjorder clxjorder){

        System.out.println("订单查询: "+clxjorder);
        clxjorder.setState(1); //设置订单状态
        clxjorder.setReservetime(new Date()); //交易时间
        int fail = clxjorderSer.insertSelective(clxjorder);
        return fail>0?true:false;
    }

}