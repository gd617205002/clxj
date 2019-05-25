package com.one.cxlj.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class DemoController {
    /**
     * 默认显示前台主页
     * @return
     */
    @GetMapping("/")
    public String hello(){
        return "front_desk/index";
    }
}
