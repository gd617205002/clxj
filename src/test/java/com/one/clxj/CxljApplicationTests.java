package com.one.clxj;

import com.one.clxj.pojo.Reguser;
import com.one.clxj.service.ReguserSer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CxljApplicationTests {

    @Autowired
    ReguserSer reguserSer;
    @Test
    public void contextLoads() {

     int a = Integer.parseInt("0");
        Reguser reguser = new Reguser();
        reguser.setId(1);
        reguser.setPwd("1234567989");

    }

}
