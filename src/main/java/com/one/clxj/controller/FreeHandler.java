package com.one.clxj.controller;

import com.one.clxj.service.FreeSer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping(value = "/Free")
@Controller
public class FreeHandler {

    @Autowired
    private FreeSer freeSer;


}