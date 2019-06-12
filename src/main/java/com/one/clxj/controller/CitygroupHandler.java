package com.one.clxj.controller;

import com.one.clxj.pojo.City;
import com.one.clxj.pojo.Citygroup;
import com.one.clxj.pojo.CitygroupExample;
import com.one.clxj.service.CitygroupSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping(value = "/Citygroup")
@Controller
public class CitygroupHandler {

    @Autowired
    private CitygroupSer citygroupSer;

    /**
     * 查询城市分组
     * @param citygroup
     * @return
     */
    @RequestMapping("/citygroupByGid.do")
    @ResponseBody
    public List<Citygroup> citygroupByGid (Citygroup citygroup){
        System.out.println(citygroup);
        CitygroupExample citygroupExample = new CitygroupExample();
        citygroupExample.createCriteria().andGidEqualTo(citygroup.getGrouping().getId()); //查询分组
        List<Citygroup> list = citygroupSer.selectByExample(citygroupExample);
        System.out.println("分组list:"+list.size());
        return list;
    }
}