package com.one.clxj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    /**
     * 后台主页
     */
    @RequestMapping("/main.do")
    public  String main(){

        return "background/system/layout/main";
    }

    /**
     * 注册用户管理
     */
    @RequestMapping("/back_user.do")
    public String backUser(){
        return "background/reguser/back_user";
    }

    /**
     * 后台用户管理
     */
    @RequestMapping("/back_admin.do")
    public String backAdmin(){
        return "background/adminuser/back_admin";
    }


    /**
     * 更新用户信息
     * @return
     */
    @RequestMapping("/back_admin_update.do")
    public String backAdminUpdate(){
        return "background/adminuser/back_admin_update";
    }

    /**
     * 添加用户信息
     * @return
     */
    @RequestMapping("/back_admin_add.do")
    public String backAdminAdd(){
        return "background/adminuser/back_admin_add";
    }

    /**
     * 更新丛林信息
     * @return
     */
    @RequestMapping("/back_clshenhe_update.do")
    public  String backClshenheUpdate(){
        return "background/release/back_clshenhe_update";
    }

    /**
     * 查询丛林
     * @return
     */
    @RequestMapping("/back_clshenhe.do")
    public  String backClshenhe(){
        return "background/release/back_clshenhe";
    }

}
