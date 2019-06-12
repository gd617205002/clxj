package com.one.clxj.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.one.clxj.pojo.Donation;
import com.one.clxj.pojo.DonationExample;
import com.one.clxj.service.DonationSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping(value = "/Donation")
@Controller
public class DonationHandler {

    @Autowired
    private DonationSer donationSer;

    /**
     * 查询爱心捐赠
     * @param pageIndex
     * @param pageSize
     * @param donationname
     * @return
     */
    @GetMapping("/findAllDonation.do")
    @ResponseBody
    public Map<String,Object> findAllDonationAndSelect(Integer pageIndex,Integer pageSize,String donationname){
        Map<String,Object> map = new HashMap<String, Object>();

        DonationExample donationExample = new DonationExample();

        DonationExample.Criteria criteria = donationExample.createCriteria();
        if (donationname!=null&&!"".equals(donationname)){
            criteria.andDonationnameLike("%"+donationname+"%");
        }
        PageHelper.startPage(pageIndex,pageSize);

        List<Donation> list = donationSer.selectByExample(donationExample);

        PageInfo<Donation> pageInfo = new PageInfo<Donation>(list);//分页

        map.put("total",pageInfo.getTotal());

        map.put("rows",pageInfo.getList());

        return map;
    }

    /**
     * 删除爱心捐赠信息
     * @param id
     * @return
     */
    @DeleteMapping("/deleteDonation.do/{id}")
    @ResponseBody
    public String deleteDonation(@PathVariable("id") Integer id){

        int k = donationSer.deleteByPrimaryKey(id);

        return k>0?"true":"false";
    }
}