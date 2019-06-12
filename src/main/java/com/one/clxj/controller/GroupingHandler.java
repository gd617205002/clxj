package com.one.clxj.controller;

import com.one.clxj.pojo.Grouping;
import com.one.clxj.pojo.GroupingExample;
import com.one.clxj.service.GroupingSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping(value = "/Grouping")
@Controller
public class GroupingHandler {
    @Autowired
    private GroupingSer groupingSer;

    /**
     * 查询城市分组
     * @param num  0：国内外   1：国内   2：国外
     * @return
     */
    @RequestMapping("/groupingFind.do")
    @ResponseBody
    public List<Grouping> groupingFind(int num){
        GroupingExample groupingExample = new GroupingExample();
        if(num==1){
            groupingExample.createCriteria().andTypeNotLike("%国际%").andTypeNotLike("%国外%");
        }else if(num==2){
            groupingExample.createCriteria().andTypeNotLike("%国内%");
        }
        List<Grouping> list = groupingSer.selectByExample(groupingExample);
        System.out.println("list:"+list.size());
        for (Grouping g:list
        ) {
            System.out.println(g);
        }
        return list;
    }

}