package com.one.clxj.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    @GetMapping("/findAllClMain.do")
    @ResponseBody
    public Map<String,Object> findAllClAndSelect(Integer pageIndex,Integer pageSize,Clxjmain clxjmain){

        ClxjmainExample clxjmainExample = new ClxjmainExample();

        ClxjmainExample.Criteria criteria = clxjmainExample.createCriteria();

        Map<String,Object> map = new HashMap<String, Object>();

        criteria.andType2EqualTo(clxjmain.getType2());//代表查询丛林的

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

            List<Clxjmain>  list  = clxjmainSer.selectByExample(clxjmainExample);

            PageInfo<Clxjmain> pageInfo = new PageInfo<Clxjmain>(list);

             map.put("total",pageInfo.getTotal());

             map.put("rows",pageInfo.getList());

        return map;
    }

    /**
     * 更新数据回显
     * @param id
     * @param request
     * @return
     */
    @GetMapping("/findByIdClMain.do")
    public String findByIdClmain(Integer id, HttpServletRequest request){

        Clxjmain clxjmain = clxjmainSer.selectByPrimaryKey(id);

        request.getSession().setAttribute("clxjmain",clxjmain);

        return "redirect:/back_clshenhe_update.do";
    }


    /**
     * 更新丛林闲居信息
     * @param clxjmain
     * @param request
     * @return
     */
    @PutMapping("/updateClxjmain.do")
    @ResponseBody
    public String updateClxjmain(Clxjmain clxjmain,HttpServletRequest request){

        int k = clxjmainSer.updateByPrimaryKeySelective(clxjmain);

        request.getSession().removeAttribute("clxjmain");

        return k>0?"true":"false";
    }

    /**
     * 闲居查询所有或条件查询
     * @return
     */
    @GetMapping("/findAllXjMain.do")
    @ResponseBody
    public Map<String,Object> findAllXjAndSelect(Integer pageIndex,Integer pageSize,Clxjmain clxjmain){

        ClxjmainExample clxjmainExample = new ClxjmainExample();

        ClxjmainExample.Criteria criteria = clxjmainExample.createCriteria();

        Map<String,Object> map = new HashMap<String, Object>();

        criteria.andType2EqualTo(clxjmain.getType2());//代表查询闲居的
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

            List<Clxjmain>  list  = clxjmainSer.selectByExample(clxjmainExample);

            PageInfo<Clxjmain> pageInfo = new PageInfo<Clxjmain>(list);

            map.put("total",pageInfo.getTotal());

            map.put("rows",pageInfo.getList());

        return map;
    }

    /**
     * 更新数据回显
     * @param id
     * @param request
     * @return
     */
    @GetMapping("/findByIdXjMain.do")
    public String findByIdXjmain(Integer id, HttpServletRequest request){

        Clxjmain clxjmain = clxjmainSer.selectByPrimaryKey(id);

        request.getSession().setAttribute("clxjmain",clxjmain);

        return "redirect:/back_xjshenhe_update.do";
    }

    /**
     * 前台头部丛林、闲居查询
     */
    @RequestMapping("/clxjmainList.do")
    @ResponseBody
    public Map<String,Object> clxjmainList(int page, Clxjmain clxjmain,String gjz){

        System.out.println("gjz:"+gjz+" 丛林闲居查询:"+page+" "+clxjmain);
        int pageSize = 3; //显示记录数
        Map<String,Object> map = new HashMap<>();
        ClxjmainExample clxjmainExample = new ClxjmainExample();
        ClxjmainExample.Criteria criteria = clxjmainExample.createCriteria();
        criteria.andType2EqualTo(clxjmain.getType2()); //查看丛林、闲居

        if(!"".equals(clxjmain.getBelong_city())){ //目的地查询
            System.out.println("!");
            criteria.andBelong_cityEqualTo(clxjmain.getBelong_city());
        }
        if ((!"".equals(gjz))&&gjz!=null){
            System.out.println("2");
            criteria.andIntroductionLike("%"+gjz+"%");
        }
        PageHelper.startPage(page,pageSize);
        List<Clxjmain> list = clxjmainSer.selectByExample(clxjmainExample);
        PageInfo pageInfo = new PageInfo(list);

        map.put("data",pageInfo.getList());
        map.put("pages",pageInfo.getPages());
        System.out.println("map:"+map);
        return map;
    }

}