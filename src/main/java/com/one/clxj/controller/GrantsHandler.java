package com.one.clxj.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.one.clxj.pojo.Grants;
import com.one.clxj.pojo.GrantsExample;
import com.one.clxj.service.GrantsSer;
import com.one.clxj.util.DataIsNullException;
import com.one.clxj.util.ExcelToPojo;
import com.one.clxj.util.TransitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RequestMapping(value = "/Grants")
@Controller
public class GrantsHandler {
    @Autowired
    private GrantsSer grantsSer;

    /**
     * 款物发放查询所有或条件查询
     *
     * @param grants
     * @param pageIndex
     * @param pageSize
     * @return
     */
    @GetMapping("/findAllGrants.do")
    @ResponseBody
    public Map<String, Object> findAllGrantsSelect(Grants grants, Integer pageIndex, Integer pageSize) {
        Map<String, Object> map = new HashMap<String, Object>();

        GrantsExample grantsExample = new GrantsExample();
        GrantsExample.Criteria criteria = grantsExample.createCriteria();
        if (grants != null) {
            if (grants.getDonationname() != null && !"".equals(grants.getDonationname()))
                criteria.andDonationnameLike("%" + grants.getDonationname() + "%");
            if (grants.getRecipients() != null && !"".equals(grants.getRecipients()))
                criteria.andRecipientsLike("%" + grants.getRecipients() + "%");
        }
        PageHelper.startPage(pageIndex, pageSize);

        List<Grants> list = grantsSer.selectByExample(grantsExample);

        PageInfo<Grants> pageInfo = new PageInfo<Grants>(list);

        map.put("total", pageInfo.getTotal());

        map.put("rows", pageInfo.getList());

        return map;
    }

    /**
     * 删除款物发放
     *
     * @param grantsid
     * @return
     */
    @DeleteMapping("/deleteGrants/{grantsid}")
    @ResponseBody
    public String deleteGrants(@PathVariable("grantsid") Integer[] grantsid) {
        int k = 0;
        if (grantsid != null) {
            for (Integer id : grantsid)
                k = grantsSer.deleteByPrimaryKey(id);
        }
        return k > 0 ? "true" : "false";
    }

    /**
     * 文件导入
     * @param upexcel
     * @return
     */
    @PostMapping("/importGrants.do")
    @ResponseBody
    public String importGrants(MultipartFile upexcel) {
        if (upexcel!=null) {
            ExcelToPojo excelToPojo = null;
            List<Grants> list = null;
            try {
                excelToPojo = new ExcelToPojo(upexcel);
                list = excelToPojo.toGrants();
            } catch (IOException e) {
                e.printStackTrace();
                return "没有选择文件";
            } catch (TransitionException e) {
                e.printStackTrace();
                return "格式错误";
            } catch (DataIsNullException e) {
                e.printStackTrace();
                return "文件没有数据";
            }
            for (Grants grants : list) {
                grantsSer.insertSelective(grants);
            }
        }else{
            return "没有选择文件";
        }
        return "导入成功!";
    }
}