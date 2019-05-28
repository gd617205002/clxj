package com.one.clxj.controller;

import com.one.clxj.pojo.Reguser;
import com.one.clxj.service.CitySer;
import com.one.clxj.service.ReguserSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping(value = "/Reguser")
@Controller
public class ReguserHandler {

    @Autowired
    private ReguserSer reguserSer;

    @Autowired
    private CitySer citySer;

    @RequestMapping("/ReguserAll")
    @ResponseBody
    public String ReguserAll() {
        Reguser reguser = new Reguser();
        reguser.setId(3);

        System.out.println("hell");

        List<Reguser> list = reguserSer.reguserAll();
        for (Reguser c:list
                ) {
            System.out.println(c);
        }
        System.out.println("end");
        System.out.println("Reguser1:"+reguserSer.reguserById(3));
        return "hello";
    }
}