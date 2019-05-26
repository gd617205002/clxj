package com.one.clxj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * 初始化控制器
 * 作者:高鼎
 */
@Controller
public class InitController {


    /**
     * 通往前台
     * @return
     */
    @RequestMapping("/desk.do")
    public String deskIndex(){

        return "front_desk/index";
    }

    /**
     * 通往后台
     * @return
     */
    @RequestMapping("/back.do")
    public String backLogin(){

        return "background/system/login/login";
    }

    @RequestMapping(value = "/1")
    public String hll(HttpServletRequest request,String themeColor,String skinName){
        if (themeColor==null||skinName==null||"".equals(themeColor)||"".equals(skinName)){
            request.setAttribute("themeColor","green");
            request.setAttribute("skinName","grass");
        }
        else{
            request.setAttribute("themeColor",themeColor);
            request.setAttribute("skinName",skinName);
        }

        return "redirect:background/system/layout/main.html";
    }



}
