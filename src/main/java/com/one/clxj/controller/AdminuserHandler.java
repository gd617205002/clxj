package com.one.clxj.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.one.clxj.pojo.Adminuser;
import com.one.clxj.pojo.AdminuserExample;
import com.one.clxj.service.AdminuserSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping(value = "/Adminuser")
@Controller
public class AdminuserHandler {

    @Autowired
    private AdminuserSer adminuserSer;
    /**
     * 管理员登录
     * @return
     * @param adminuser 接收前台参数
     * @param request
     */
    @GetMapping("/login.do")
    @ResponseBody
    public Adminuser adminUserLogin(Adminuser adminuser, HttpServletRequest request){
        AdminuserExample adminuserExample = new AdminuserExample();//查询条件
        AdminuserExample.Criteria criteria = adminuserExample.createCriteria();
        criteria.andUsernameEqualTo(adminuser.getUsername()).andPwdEqualTo(adminuser.getPwd());
        List<Adminuser> adminuserList = adminuserSer.selectByExample(adminuserExample);//查询出来得结果
        Adminuser adminuser1 = null;//登录成功后管理员信息
        if (adminuserList.size()!=0){
            adminuser1 = adminuserList.get(0);
            request.getSession().setAttribute("adminuser",adminuser1);
        }
        return adminuser1;
    }

    /**
     * 查询所有管理员
     * @param pageIndex 当前页
     * @param pageSize  当前页大小
     * @param username 查询条件用户名
     * @return
     */
    @GetMapping("/findAllAdminUser.do")
    @ResponseBody
    public Map<String,Object> findAll(Integer pageIndex,Integer pageSize,String username) {
        Map<String,Object> map = new HashMap<String,Object>();
        if (username!=null&&!"".equals(username)){
            AdminuserExample adminuserExample = new AdminuserExample();//查询条件
            AdminuserExample.Criteria criteria = adminuserExample.createCriteria();
            criteria.andUsernameLike("%"+username+"%");
            List<Adminuser> list = adminuserSer.selectByExample(adminuserExample);
            PageInfo<Adminuser> pageInfo =  pageInfo(list,pageIndex,pageSize);
            map.put("total",pageInfo.getTotal());

            map.put("rows",pageInfo.getList());
        }else {
            List<Adminuser> adminuserList = adminuserSer.selectByExample(null);
            PageInfo<Adminuser> pageInfo = pageInfo(adminuserList,pageIndex,pageSize);
            map.put("total",pageInfo.getTotal());

            map.put("rows",pageInfo.getList());
        }
        return map;
    }

    /**
     * 用户更新数据回显
     * @param id
     * @return
     */
    @GetMapping("/findByIdAdminUser.do")
    public String findByIdAdminUser(Integer id,HttpServletRequest request){

        Adminuser adminuser = adminuserSer.selectByPrimaryKey(id);

        request.getSession().setAttribute("adminusers",adminuser);

        return "redirect:/back_admin_update.do";
    }

    /**
     * 添加用户
     * @param adminuser
     * @return
     */
    @PostMapping("/addAdminUser.do")
    @ResponseBody
    public String addAdminUser(Adminuser adminuser){

        int k = adminuserSer.insertSelective(adminuser);

        return k>0?"true":"false";
    }

    /**
     * 删除用户
     * @param adminuserid
     * @return
     */
    @DeleteMapping("/deleteAdminUser/{adminuserid}")
    @ResponseBody
    public String deleteAdminUser(@PathVariable("adminuserid") Integer[] adminuserid){
        int k = 0;
        if (adminuserid!=null) {
            for (Integer id : adminuserid)
                k= adminuserSer.deleteByPrimaryKey(id);
        }
        return k>0?"true":"false";
    }

    /**
     * 更新用户
     * @param adminuser
     * @return
     */
    @PutMapping("/updateAdminUser.do")
    @ResponseBody
    public String updateAdminUser(Adminuser adminuser,HttpServletRequest request){
        int k = adminuserSer.updateByPrimaryKeySelective(adminuser);

        request.getSession().removeAttribute("adminusers");

        return k>0?"true":"false";
    }

    //分页
    public PageInfo<Adminuser> pageInfo(List<Adminuser> list,Integer pageIndex,Integer pageSize){
        PageHelper.startPage(pageIndex,pageSize);
        return  new PageInfo<Adminuser>(list);
    }
}