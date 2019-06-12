package com.one.clxj.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.one.clxj.pojo.Carorder;
import com.one.clxj.pojo.CarorderExample;
import com.one.clxj.service.CarorderSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping(value = "/Carorder")
@Controller
public class CarorderHandler{

    @Autowired
    private CarorderSer carorderSer;

    /**
     *    订单查询
     */
    @RequestMapping("/userCarOrder.do")
    @ResponseBody
    public Map<String,Object> userCarOrder(int page, Carorder carorder){

        System.out.println("订单查询:"+page+" "+carorder);
        int pageSize = 2; //显示记录数
        Map<String,Object> map = new HashMap<>();
        CarorderExample carorderExample = new CarorderExample();
        CarorderExample.Criteria criteria = carorderExample.createCriteria();
        criteria.andUidEqualTo(carorder.getReguser().getId());  //加入用户编号
        if (carorder.getState()!=null){
            if (carorder.getState()==1){ //查询交易中
                criteria.andStateEqualTo(carorder.getState());
            }else if (carorder.getState()==2){ //查询交易完成
                criteria.andStateNotEqualTo(1);
            }
        }
        PageHelper.startPage(page,pageSize);
        List<Carorder> list = carorderSer.selectByExample(carorderExample);
        PageInfo pageInfo = new PageInfo(list);

        map.put("data",pageInfo.getList());
        map.put("pages",pageInfo.getPages());
        System.out.println("map:"+map);
        return map;
    }

}
