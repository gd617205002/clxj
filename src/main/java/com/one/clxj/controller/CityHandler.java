package com.one.clxj.controller;

import com.one.clxj.pojo.City;
import com.one.clxj.service.CitySer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping(value = "/City")
@Controller
public class CityHandler {

    @Autowired
    private CitySer citySer;
    /**
     * 查询所有城市
     * @return
     */
    @RequestMapping("/cityAll.do")
    @ResponseBody
    public List<City> cityAll (){
        List<City> list = citySer.selectByExample(null);
        System.out.println("城市所有："+list.size());
        return list;
    }
}