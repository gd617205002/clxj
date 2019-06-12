package com.one.clxj.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.one.clxj.miaodi.IndustrySMS;
import com.one.clxj.pojo.Reguser;
import com.one.clxj.pojo.ReguserExample;
import com.one.clxj.service.ReguserSer;
import com.one.clxj.util.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping(value = "/Reguser")
@Controller
public class ReguserHandler {

    @Autowired
    private ReguserSer reguserSer;

    /**
     * 查询所有注册用户
     * @return
     */
    @GetMapping("/findAllRegUser.do")
    @ResponseBody
    public Map<String,Object> findAll(Integer pageSize,Integer pageIndex,String realname){
        Map<String,Object> map = new HashMap<String,Object>();

        ReguserExample reguserExample = new ReguserExample();
        ReguserExample .Criteria criteria = reguserExample.createCriteria();
        if (realname!=null&&!"".equals(realname))
            criteria.andRealnameLike("%"+realname+"%");
           PageHelper.startPage(pageIndex,pageSize);
           List<Reguser> list = reguserSer.selectByExample(reguserExample);
           PageInfo<Reguser> pageInfo =new PageInfo<Reguser>(list);//分页
           map.put("total",pageInfo.getTotal());
           map.put("rows",pageInfo.getList());

        return map;
    }

    /**
     * 批量删除注册用户
     */
    @DeleteMapping("/deleteRegUser/{reguserid}")
    @ResponseBody
    public String deleteRegUsers(@PathVariable("reguserid") Integer[] reguserid){
        int k = 0;//判断删除是否成功
        if (reguserid!=null){
            for(Integer id:reguserid){
                k = reguserSer.deleteByPrimaryKey(id);
            }
        }
        return k>0?"true":"false";
    }


    /**
     * 修改状态
     */
    @PutMapping("/updateRegUser.do")
    @ResponseBody
    public String updateRegUsers(Reguser reguser){
        int k = 0;//判断更新是否成功

        k = reguserSer.updateByPrimaryKeySelective(reguser);

        return k>0?"true":"false";
    }

    /**
     * 查看用户是否存在
     * @param reguser
     * @return
     */
    @RequestMapping("/reguserByUsername.do")
    @ResponseBody
    public Reguser reguserByUsername(Reguser reguser){
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
            IndustrySMS.execute(phone,yzm,num);
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
        if (reguser.getPwd()!=null&&reguser.getPwd().length()>0){ //判断是否修改密码
            reguser.setPwd(MD5.MD5(reguser.getPwd())); //加密
        }
        int flag = reguserSer.updateByPrimaryKeySelective(reguser);
        if (flag > 0&&session.getAttribute("reguser")!=null){
            session.removeAttribute("reguser");
            Reguser reguser1 = reguserSer.selectByPrimaryKey(reguser.getId());
            session.setAttribute("reguser",reguser1); //更新用户信息
        }
        return flag>0 ? true : false;
    }



}