package com.one.clxj.controller;

import com.one.clxj.pojo.Reguser;
import com.one.clxj.pojo.ReguserExample;
import com.one.clxj.service.ReguserSer;
import com.one.clxj.util.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;
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
    public Reguser reguserByUsername(Reguser reguser){
        System.out.println("reguser: "+reguser);
        ReguserExample reguserExample = new ReguserExample();
        reguserExample.createCriteria().andUsernameEqualTo(reguser.getUsername()); //加入手机号
        List<Reguser> list = reguserSer.selectByExample(reguserExample);
        System.out.println(list);

        return list.size()>0?list.get(0):null;

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
        criteria.andPwdEqualTo(MD5.MD5(reguser.getPwd())); //加入密码

        List<Reguser> list = reguserSer.selectByExample(reguserExample);
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
    public boolean reguserYZM(String phone, String yzm, int num){
        try {
            System.out.println("phone:"+phone+"  yzm="+yzm);
           // IndustrySMS.execute(phone,yzm,num);
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

            List<Reguser> list = reguserSer.selectByExample(reguserExample);
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

    /**
     * 用户退出
     *
     */
    @RequestMapping("/reguserLogout.do")
    @ResponseBody
    public Boolean reguserLogout(HttpSession session){
        try{
            session.removeAttribute("reguser");
            return true;
        }catch (Exception e){
            e.getMessage();
            return false;
        }

    }
    /**
     * 用户注册
     */
    @RequestMapping("/reguserRegister.do")
    @ResponseBody
    public boolean reguserRegister(Reguser request){
        request.setSex(1); //性别 默认：男
        request.setEnableflag(1); //账号状态
        request.setMobile(request.getUsername());
        request.setPwd(MD5.MD5(request.getPwd())); //密码加密
        request.setRegtime(new Date());
        int flag = reguserSer.insertSelective(request);

        return flag>0 ? true : false;
    }

    /**
     * 用户修改
     */
    @RequestMapping("/retrievePassword.do")
    @ResponseBody
    public boolean retrievePassword(Reguser reguser, HttpSession session){
        System.out.println("修改密码："+reguser);
        if (reguser.getPwd()!=null&&reguser.getPwd().length()>0){ //判断是否修改密码
            reguser.setPwd(MD5.MD5(reguser.getPwd())); //加密
        }
        System.out.println("修改密码之后："+reguser);
        int flag = reguserSer.updateByPrimaryKeySelective(reguser);
       if (flag > 0&&session.getAttribute("reguser")!=null){
           System.out.println("修改");
           session.removeAttribute("reguser");
           Reguser reguser1 = reguserSer.selectByPrimaryKey(reguser.getId());
           session.setAttribute("reguser",reguser1); //更新用户信息
       }
        return flag>0 ? true : false;
    }


}