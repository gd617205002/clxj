package com.one.clxj.controller;

import com.one.clxj.pojo.*;
import com.one.clxj.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 初始化控制器
 * 作者:高鼎
 */
@Controller
public class InitController {

    @Autowired
    private ClxjorderSer clxjorderSer;

    @Autowired
    private ClxjmainSer clxjmainSer;

    @Autowired
    private CarorderSer carorderSer;

    @Autowired
    private HelpinfoSer helpinfoSer;

    @Autowired
    private JoinclSer joinclSer;

    @Autowired
    private JoinxjSer joinxjSer;

    @Autowired
    private JoincarSer joincarSer;

    /**
     * 通往前台
     * @return
     */
    @RequestMapping("/desk.do")
    public String deskIndex(){

        return "front_desk/index";
    }

    /**
     * 登录
     * @return
     */
    @RequestMapping("/login.do")
    public String login(){
        System.out.println("登录");
        return "front_desk/login";
    }

    /**
     * 注册
     */
    @RequestMapping("/register.do")
    public String register(){
        return "front_desk/register";
    }
    /**
     * 个人信息
     */
    @RequestMapping("/userPersonal.do")
    public String userPersonal(){
        System.out.println("个人信息");
        return "front_desk/UserPersonal";
    }
    /**
     * 忘记密码
     */
    @RequestMapping("/retrievePassword.do")
    public String retrievePassword(){
        return "front_desk/RetrievePassword";
    }
    /**
     * 修改密码
     */
    @RequestMapping("/userCPassword.do")
    public String userCPassword(){
        System.out.println("修改密码");
        return "front_desk/UserCPassword";
    }
    /**
     * 丛林闲居订单
     */
    @RequestMapping("/userJAOrder.do")
    public String userJAOrder(String state, Model model, HttpSession session){
        Reguser reguser = (Reguser) session.getAttribute("reguser");
        ClxjorderExample clxjorderExample = new ClxjorderExample();
        clxjorderExample.createCriteria().andUidEqualTo(reguser.getId());
        List<Clxjorder> list = clxjorderSer.selectByExample(clxjorderExample);
        System.out.println(list);
        int countAll = list.size(); //用户所有订单
        int countNo = 0; //用户未完成订单
        int countOk = 0; //用户已完成订单
        for (int i=0;i<countAll;i++){
            if(list.get(i).getState()==1){
                countNo++;
            }else{
                countOk++;
            }
        }
        System.out.println("countAll:"+countAll+" countNO:"+countNo+" countOK:"+countOk);
        System.out.println("丛林闲居订单");
        model.addAttribute("state",state);
        model.addAttribute("countAll",countAll);
        model.addAttribute("countNo",countNo);
        model.addAttribute("countOk",countOk);
        return "front_desk/UserJAOrder";
    }
    /**
     * 用车订单
     */
    @RequestMapping("/userCarOrder.do")
    public String userCarOrder(String state, Model model, HttpSession session){
        Reguser reguser = (Reguser) session.getAttribute("reguser");
        CarorderExample carorderExample = new CarorderExample();
        carorderExample.createCriteria().andUidEqualTo(reguser.getId());
        List<Carorder> list = carorderSer.selectByExample(carorderExample);
        System.out.println(list);
        int countAll = list.size(); //用户所有订单
        int countNo = 0; //用户未完成订单
        int countOk = 0; //用户已完成订单
        for (int i=0;i<countAll;i++){
            if(list.get(i).getState()==1){
                countNo++;
            }else{
                countOk++;
            }
        }
        System.out.println("countAll:"+countAll+" countNO:"+countNo+" countOK:"+countOk);
        System.out.println("用车订单");
        model.addAttribute("state",state);
        model.addAttribute("countAll",countAll);
        model.addAttribute("countNo",countNo);
        model.addAttribute("countOk",countOk);
        return "front_desk/UserCarOrder";
    }
    /**
     * 求助查询
     */
    @RequestMapping("/userPquery.do")
    public String userPquery(String applystatus, Model model, HttpSession session){
        Reguser reguser = (Reguser) session.getAttribute("reguser");
        HelpinfoExample helpinfoExample = new HelpinfoExample();
        helpinfoExample.createCriteria().andUidEqualTo(reguser.getId());
        List<Helpinfo> list = helpinfoSer.selectByExample(helpinfoExample);
        System.out.println(list);
        int all = list.size(); //用户所有订单
        int no = 0; //用户未通过
        int ok = 0; //用户初审通过
        int ok2 = 0; //用户终审通过
        for (int i=0;i<all;i++){
            if(list.get(i).getApplystatus()==1){
                ok++;
            }else if(list.get(i).getApplystatus()==2){
                ok2++;
            }else if(list.get(i).getApplystatus()==3){
                no++;
            }
        }
        System.out.println("all:"+all+" no:"+no+" ok:"+ok+" ok2:"+ok2);
        System.out.println("求助订单");
        model.addAttribute("all",all);
        model.addAttribute("no",no);
        model.addAttribute("ok",ok);
        model.addAttribute("ok2",ok2);
        model.addAttribute("applystatus",applystatus);
        return "front_desk/UserPquery";
    }
    /**
     * 加盟查询
     */
    @RequestMapping("/userJPquery.do")
    public String userJPquery( Model model, HttpSession session){
        Reguser reguser = (Reguser) session.getAttribute("reguser");
        //丛林数量
        JoinclExample joinclExample = new JoinclExample();
        joinclExample.createCriteria().andUidEqualTo(reguser.getId());
        int cl = joinclSer.countByExample(joinclExample);
        //闲居数量
        JoinxjExample joinxjExample = new JoinxjExample();
        joinxjExample.createCriteria().andUidEqualTo(reguser.getId());
        int xj = joinxjSer.countByExample(joinxjExample);
        //车辆数量
        JoincarExample joincarExample = new JoincarExample();
        joincarExample.createCriteria().andUidEqualTo(reguser.getId());
        int car = joincarSer.countByExample(joincarExample);

        System.out.println("cl:"+cl+" xj:"+xj+" car:"+car);
        System.out.println("求助订单");
        model.addAttribute("cl",cl);
        model.addAttribute("xj",xj);
        model.addAttribute("car",car);
        return "front_desk/UserJPquery";
    }
    /**
     * 丛林查看
     * @return
     */
    @RequestMapping("/atList.do")
    public String atList(){

        return "front_desk/AtList";
    }
    /**
     * 闲居查看
     * @return
     */
    @RequestMapping("/jungleList.do")
    public String jungleList(){

        return "front_desk/JungleList";
    }
    /**
     * 丛林闲居预定
     * @return
     */
    @RequestMapping("/resFiorder.do")
    public String resFiorder(Model model, int clxjmainId){
        System.out.println(clxjmainId);
        Clxjmain clxjmain = clxjmainSer.selectByPrimaryKey(clxjmainId);
        System.out.println("预定："+clxjmain);
        model.addAttribute("clxjmain",clxjmain);
        return "front_desk/ResFiorder";
    }
    /**
     * 丛林详细信息
     * @return
     */
    @RequestMapping("/atDetails.do")
    public String atDetails(Model model, int clxjmainId){
        System.out.println(clxjmainId);
        Clxjmain clxjmain = clxjmainSer.selectByPrimaryKey(clxjmainId);
        model.addAttribute("clxjmain",clxjmain);
        return "front_desk/AtDetails";
    }
    /**
     * 闲居详细信息
     * @return
     */
    @RequestMapping("/jungleDetails.do")
    public String jungleDetails(Model model, int clxjmainId){
        System.out.println(clxjmainId);
        Clxjmain clxjmain = clxjmainSer.selectByPrimaryKey(clxjmainId);
        model.addAttribute("clxjmain",clxjmain);
        return "front_desk/JungleDetails";
    }
    /**
     * 通往后台
     * @return
     */
    @RequestMapping("/back.do")
    public String backLogin(){

        return "background/system/login/login";
    }
}
