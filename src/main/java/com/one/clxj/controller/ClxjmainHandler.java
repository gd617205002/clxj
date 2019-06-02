package com.one.clxj.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.one.clxj.pojo.Adminuser;
import com.one.clxj.pojo.Clxjmain;
import com.one.clxj.pojo.ClxjmainExample;
import com.one.clxj.service.ClxjmainSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping(value = "/Clxjmain")
@Controller
public class ClxjmainHandler {

    @Autowired
    private ClxjmainSer clxjmainSer;

    /**
     * 丛林查询所有或条件查询
     * @return
     */
    @GetMapping("/findAllClxjMain.do")
    @ResponseBody
    public Map<String,Object> findAllCarinfoAndSelect(Integer pageIndex,Integer pageSize,Clxjmain clxjmain){

        ClxjmainExample clxjmainExample = new ClxjmainExample();

        ClxjmainExample.Criteria criteria = clxjmainExample.createCriteria();

        Map<String,Object> map = new HashMap<String, Object>();

        criteria.andType2EqualTo(1);//代表查询丛林的

         if (clxjmain!=null||!"".equals(clxjmain.getName())){
             if (!"".equals(clxjmain.getName())&&clxjmain.getName()!=null){//名称
               criteria.andNameLike("%"+clxjmain.getName()+"%");
             }
             if (clxjmain.getType1()!=null){//地址类型
               criteria.andType1EqualTo(clxjmain.getType1());
             }
             if (clxjmain.getCheckStatus()!=null){//审核状态
               criteria.andCheckStatusEqualTo(clxjmain.getCheckStatus());
             }

             PageHelper.startPage(pageIndex,pageSize);

             List<Clxjmain>  list = clxjmainSer.selectByExample(clxjmainExample);

             PageInfo<Clxjmain> pageInfo  = new PageInfo<Clxjmain>(list);

             map.put("total",pageInfo.getTotal());

             map.put("rows",pageInfo.getList());
         }else{

             List<Clxjmain> list = clxjmainSer.selectByExample(clxjmainExample);

             PageHelper.startPage(pageIndex,pageSize);

             PageInfo<Clxjmain> pageInfo  = new PageInfo<Clxjmain>(list);

             map.put("total",pageInfo.getTotal());

             map.put("rows",pageInfo.getList());
         }

        return map;
    }

    /**
     * 更新数据回显
     * @param id
     * @param request
     * @return
     */
    @GetMapping("/findByIdClxjMain.do")
    public String findByIdClxjmain(Integer id, HttpServletRequest request){

        Clxjmain clxjmain = clxjmainSer.selectByPrimaryKey(id);

        System.out.println("结果出来了======================"+clxjmain);
        request.getSession().setAttribute("clxjmain",clxjmain);

        return "redirect:/back_clshenhe_update.do";
    }


    /**
     * 更新丛林信息
     * @param clxjmain
     * @param request
     * @return
     */
    @PutMapping("/updateClxjmain.do")
    @ResponseBody
    public String updateClxjmain(Clxjmain clxjmain,HttpServletRequest request){

        System.out.println("输出结果===="+clxjmain);

        int k = clxjmainSer.updateByPrimaryKeySelective(clxjmain);

        return k>0?"true":"false";
    }





    //分页
    public PageInfo<Clxjmain> pageInfo(List<Clxjmain> list, Integer pageIndex, Integer pageSize){

        PageHelper.startPage(pageIndex,pageSize);

        return  new PageInfo<Clxjmain>(list);
    }
}