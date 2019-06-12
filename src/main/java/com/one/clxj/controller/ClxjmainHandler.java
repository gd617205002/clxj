package com.one.clxj.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.one.clxj.pojo.Clxjmain;
import com.one.clxj.pojo.ClxjmainExample;
import com.one.clxj.pojo.Joinxj;
import com.one.clxj.pojo.JoinxjExample;
import com.one.clxj.service.ClxjmainSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping(value = "/Clxjmain")
@Controller
public class ClxjmainHandler {

    @Autowired
    private ClxjmainSer clxjmainSer;

    /**
     * 前台头部丛林、闲居查询
     */
    @RequestMapping("/clxjmainList.do")
    @ResponseBody
    public Map<String,Object> clxjmainList(int page, Clxjmain clxjmain,String gjz){

        System.out.println("gjz:"+gjz+" 丛林闲居查询:"+page+" "+clxjmain);
        int pageSize = 3; //显示记录数
        Map<String,Object> map = new HashMap<>();
        ClxjmainExample clxjmainExample = new ClxjmainExample();
        ClxjmainExample.Criteria criteria = clxjmainExample.createCriteria();
        criteria.andType2EqualTo(clxjmain.getType2()); //查看丛林、闲居

        if(!"".equals(clxjmain.getBelong_city())){ //目的地查询
            System.out.println("!");
            criteria.andBelong_cityEqualTo(clxjmain.getBelong_city());
        }
        if ((!"".equals(gjz))&&gjz!=null){
            System.out.println("2");
            criteria.andIntroductionLike("%"+gjz+"%");
        }
        PageHelper.startPage(page,pageSize);
        List<Clxjmain> list = clxjmainSer.selectByExample(clxjmainExample);
        PageInfo pageInfo = new PageInfo(list);

        map.put("data",pageInfo.getList());
        map.put("pages",pageInfo.getPages());
        System.out.println("map:"+map);
        return map;
    }
}