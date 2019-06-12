package com.one.clxj.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.one.clxj.pojo.Payformonth;
import com.one.clxj.pojo.PayformonthExample;
import com.one.clxj.service.PayformonthSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping(value = "/Payformonth")
@Controller
public class PayformonthHandler {

    @Autowired
    private PayformonthSer payformonthSer;

    @GetMapping("/findAllPayformonth.do")
    public Map<String,Object> findAllPayformonth(Payformonth payformonth,Integer pageIndex,Integer pageSize){
        Map<String,Object> map = new HashMap<String, Object>();

        PayformonthExample payformonthExample = new PayformonthExample();
        PayformonthExample.Criteria criteria = payformonthExample.createCriteria();
        if (payformonth!=null){
            if (payformonth.getProjectname()!=null&&!"".equals(payformonth.getProjectname()))
                criteria.andProjectnameLike("%"+payformonth.getProjectname()+"%");
            if (payformonth.getMonthly()!=null&&!"".equals(payformonth.getMonthly()))
                criteria.andMonthlyEqualTo(payformonth.getMonthly());
        }
        PageHelper.startPage(pageIndex,pageSize);

        List<Payformonth> list = payformonthSer.selectByExample(payformonthExample);

        PageInfo<Payformonth> pageInfo = new PageInfo<Payformonth>(list);

        map.put("total",pageInfo.getTotal());

        map.put("rows",pageInfo.getList());

        return  map;
    }

    /**
     * 删除月底支出
     * @param payformonthid
     * @return
     */
    @DeleteMapping("/deletePayformonth/{payformonthid}")
    @ResponseBody
    public String deletePayformonth(@PathVariable("payformonthid") Integer[] payformonthid){
        int k = 0;
        if (payformonthid!=null) {
            for (Integer id : payformonthid)
                k= payformonthSer.deleteByPrimaryKey(id);
        }
        return k>0?"true":"false";
    }
}