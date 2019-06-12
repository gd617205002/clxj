package com.one.clxj.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.one.clxj.pojo.Carinfo;
import com.one.clxj.pojo.CarinfoExample;
import com.one.clxj.service.CarinfoSer;
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

@RequestMapping(value = "/Carinfo")
@Controller
public class CarinfoHandler {

   @Autowired
   private CarinfoSer carinfoSer;

    /**
     * 条件查询用车审核
     * @param carinfo
     * @param pageIndex
     * @param pageSize
     * @return
     */
    @GetMapping("/findAllCarInfo.do")
    @ResponseBody
    public  Map<String,Object> findAllCarInfoAndSelect(Carinfo carinfo,Integer pageIndex,Integer pageSize){
        Map<String,Object> map = new HashMap<String,Object>();

        CarinfoExample carinfoExample = new CarinfoExample();

        CarinfoExample.Criteria criteria= carinfoExample.createCriteria();

        if (carinfo!=null){
            if (carinfo.getCartitle()!=null&&!"".equals(carinfo.getCartitle()))
                criteria.andCartitleLike(carinfo.getCartitle());

            if (carinfo.getCheckstatus()!=null)
                criteria.andCheckstatusEqualTo(carinfo.getCheckstatus());
        }
        PageHelper.startPage(pageIndex,pageSize);
        List<Carinfo> list = carinfoSer.selectByExample(carinfoExample);

        PageInfo<Carinfo> pageInfo = new PageInfo<Carinfo>(list);//分页

        map.put("total",pageInfo.getTotal());

        map.put("rows",pageInfo.getList());

        return map;
    }

    /**
     * 通过id查询
     * @param id
     * @param request
     * @return
     */
    @GetMapping("/findByIdCarInfo.do")
    public String findByIdCarInfo(Integer id, HttpServletRequest request){

        Carinfo carinfo = carinfoSer.selectByPrimaryKey(id);

        request.getSession().setAttribute("carinfo",carinfo);

        return "redirect:/back_ycshenhe_update.do";
    }

    /**
     * 修改审核状态
     * @param carinfo
     * @return
     */
    @PutMapping("/updateCarInfo.do")
    @ResponseBody
    public String updateCarInfo(Carinfo carinfo,HttpServletRequest request){

        int k = carinfoSer.updateByPrimaryKeySelective(carinfo);

        request.removeAttribute("carinfo");

        return k>0?"true":"false";
    }

    //分页
    public PageInfo<Carinfo> pageInfo(List<Carinfo> list, Integer pageIndex, Integer pageSize){

        PageHelper.startPage(pageIndex,pageSize);

        return  new PageInfo<Carinfo>(list);
    }
}