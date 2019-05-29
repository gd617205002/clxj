package com.one.clxj;

import com.one.clxj.mapper.ReguserMapper;
import com.one.clxj.service.AdminuserSer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CxljApplicationTests {



    @Autowired
    AdminuserSer adminuserSer;

    @Autowired
    ReguserMapper reguserMapper;

    @Test
    public void contextLoads() {

        System.out.println(reguserMapper.selectByExample2(null));
    }

}
