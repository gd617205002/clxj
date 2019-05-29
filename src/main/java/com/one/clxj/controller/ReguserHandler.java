package com.one.clxj.controller;

import com.one.clxj.pojo.Reguser;
import com.one.clxj.pojo.ReguserExample;
import com.one.clxj.service.ReguserSer;
import com.one.clxj.util.miaodi.IndustrySMS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.misc.Request;

import javax.servlet.http.HttpSession;
import java.util.List;

@RequestMapping(value = "/Reguser")
@Controller
public class ReguserHandler {

    @Autowired
    private ReguserSer reguserSer;


    /**
     * 查看用户是否存在
     * @param reguser
     * @return
     */
    @RequestMapping("/reguserByUsername.do")
    @ResponseBody
    public boolean reguserByUsername(Reguser reguser){
        System.out.println("reguser: "+reguser);
        ReguserExample reguserExample = new ReguserExample();
        reguserExample.createCriteria().andUsernameEqualTo(reguser.getUsername()); //加入手机号
        List<Reguser> list = reguserSer.conditionFind(null,reguserExample);
        System.out.println(list);
        if (list.size()>0){
            return true;
        }else {
            return false;
        }
    }

    /**
     * 用户登录
     * @param reguser
     * @return
     */
    @RequestMapping("/reguserLogin.do")
    @ResponseBody
    public int reguserLogin(Reguser reguser, HttpSession session){
        System.out.println("reguser: "+reguser);
        ReguserExample reguserExample = new ReguserExample();
        ReguserExample.Criteria criteria = reguserExample.createCriteria();
        criteria.andUsernameEqualTo(reguser.getUsername()); //加入手机号
        criteria.andPwdEqualTo(reguser.getPwd()); //加入密码

        List<Reguser> list = reguserSer.conditionFind(null,reguserExample);
        System.out.println(list);
        int k=0; //存放登录状态  0 成功  1 密码错误  2  账号冻结
        if (list.size()>0){  //判断用户是否存在
            if (list.get(0).getEnableflag()==0){  //是否冻结
                k = 2;
            }else{
                session.setAttribute("reguser",list.get(0));
            }
        }else {
            k = 1;
        }
        return  k;
    }
    /**
     * 发送验证码
     */
    @RequestMapping("/reguserYZM.do")
    @ResponseBody
    public boolean reguserYZM(String phone, String yzm){
        try {
            System.out.println("phone:"+phone+"  yzm="+yzm);
            IndustrySMS.execute(phone,yzm);
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    /**
     * 用户短信
     * @param reguser
     * @return
     */
    @RequestMapping("/reguserLoginDX.do")
    @ResponseBody
    public int reguserLoginDX(Reguser reguser, HttpSession session,String yzm, String hqyzm){
        System.out.println("reguser: "+reguser+" yzm="+yzm+" hqyzm="+hqyzm);
        ReguserExample reguserExample = new ReguserExample();
        ReguserExample.Criteria criteria = reguserExample.createCriteria();
        criteria.andUsernameEqualTo(reguser.getUsername()); //加入手机号

        int k=0; //存放登录状态  0 成功  1 验证码错误  2  账号冻结

        if(hqyzm.equals(yzm)){ //判断验证码是否正确

            List<Reguser> list = reguserSer.conditionFind(null,reguserExample);
            System.out.println(list);

            if (list.size()>0){  //判断用户是否存在
                if (list.get(0).getEnableflag()==0){  //是否冻结
                    k = 2;
                }else{
                    session.setAttribute("reguser",list.get(0));
                }
            }
        }else {
            k = 1;
        }

        return  k;
    }

}