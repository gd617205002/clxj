package com.one.clxj.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.one.clxj.pojo.Adminuser;
import com.one.clxj.pojo.Reguser;
import com.one.clxj.pojo.ReguserExample;
import com.one.clxj.service.ReguserSer;
import com.one.clxj.service.SuperService;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.genid.GenId;

import java.util.ArrayList;
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
        if (realname!=null&&!"".equals(realname)){
            ReguserExample reguserExample = new ReguserExample();
            ReguserExample .Criteria criteria = reguserExample.createCriteria();
            criteria.andRealnameLike("%"+realname+"%");
           List<Reguser> list = reguserSer.selectByExample(reguserExample);
           PageInfo<Reguser> pageInfo = pageInfo(list,pageIndex,pageSize);
           map.put("total",pageInfo.getTotal());
           map.put("rows",pageInfo.getList());
        }else {
            List<Reguser> list = reguserSer.selectByExample(null);
            PageInfo<Reguser> pageInfo = pageInfo(list,pageIndex,pageSize);

            map.put("total",pageInfo.getTotal());

            map.put("rows",pageInfo.getList());
        }

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

    public PageInfo<Reguser> pageInfo(List<Reguser> list,Integer pageIndex,Integer pageSize){
        PageHelper.startPage(pageIndex,pageSize);
        return  new PageInfo<Reguser>(list);
    }
}