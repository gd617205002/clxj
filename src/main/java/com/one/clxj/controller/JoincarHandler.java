package com.one.clxj.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.one.clxj.pojo.Joincar;
import com.one.clxj.pojo.JoincarExample;
import com.one.clxj.pojo.Payformonth;
import com.one.clxj.pojo.PayformonthExample;
import com.one.clxj.service.JoincarSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping(value = "/Joincar")
@Controller
public class JoincarHandler {
    @Autowired
    private JoincarSer joincarSer;

    /**
     * 查询用车加盟信息所有或按条件查询
     * @param joincar
     * @param pageIndex
     * @param pageSize
     * @return
     */
    @GetMapping("/findAllJoincar.do")
    public Map<String,Object> findAllPayformonth(Joincar joincar, Integer pageIndex, Integer pageSize){
        Map<String,Object> map = new HashMap<String, Object>();

        JoincarExample joincarExample = new JoincarExample();
        JoincarExample.Criteria criteria = joincarExample.createCriteria();
        if (joincar!=null){
            if (joincar.getCarname()!=null&&!"".equals(joincar.getCarname()))
                criteria.andCarnameLike(joincar.getCarname());
            if (joincar.getJoinstatus()!=null&&!"".equals(joincar.getJoinstatus()))
                criteria.andJoinstatusEqualTo(joincar.getJoinstatus());
        }
        PageHelper.startPage(pageIndex,pageSize);

        List<Joincar> list = joincarSer.selectByExample(joincarExample);

        PageInfo<Joincar> pageInfo = new PageInfo<Joincar>(list);

        map.put("total",pageInfo.getTotal());

        map.put("rows",pageInfo.getList());

        return  map;
    }

    /**
     *    加盟查询
     */
    @RequestMapping("/userJPquery.do")
    @ResponseBody
    public Map<String,Object> userJPquery(int page, Joincar joincar){

        System.out.println("订单查询:"+page+" "+joincar);
        int pageSize = 2; //显示记录数
        Map<String,Object> map = new HashMap<>();
        JoincarExample joincarExample = new JoincarExample();
        joincarExample.createCriteria().andUidEqualTo(joincar.getReguser().getId());  //加入用户编号

        PageHelper.startPage(page,pageSize);
        List<Joincar> list = joincarSer.selectByExample(joincarExample);
        PageInfo pageInfo = new PageInfo(list);

        map.put("data",pageInfo.getList());
        map.put("pages",pageInfo.getPages());
        return map;
    }

}