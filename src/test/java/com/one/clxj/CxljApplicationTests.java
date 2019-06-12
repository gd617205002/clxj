package com.one.clxj;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.one.clxj.pojo.*;
import com.one.clxj.service.AdminuserSer;
import com.one.clxj.service.ClxjorderSer;
import com.one.clxj.service.GrantsSer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CxljApplicationTests {



    @Autowired
    AdminuserSer adminuserSer;

    @Autowired
    ClxjorderSer clxjorderSer;

    @Autowired
    GrantsSer grantsSer;
    @Test
    public void contextLoads() {

       //List<Grants> list = grantsSer.selectByExample(null);
       Grants grants = grantsSer.selectByPrimaryKey(2);
        System.out.println("grants:"+grants);
      //  System.out.println(list);


    }

}
