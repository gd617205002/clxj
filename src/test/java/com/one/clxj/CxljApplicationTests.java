package com.one.clxj;

import com.one.clxj.pojo.Grants;
import com.one.clxj.pojo.Reguser;
import com.one.clxj.service.GrantsSer;
import com.one.clxj.service.ReguserSer;
import com.one.clxj.service.impl.SupperMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CxljApplicationTests {

    @Autowired
    ReguserSer reguserSer;

    @Autowired
    GrantsSer grantsSer;

@Autowired
SupperMapper supperMapper;
    @Test
    public void contextLoads() {

        List<Grants> list = grantsSer.selectByExample(null);
        System.out.println("list:"+list);
    }

}
