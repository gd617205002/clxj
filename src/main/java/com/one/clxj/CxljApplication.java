package com.one.clxj;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import tk.mybatis.spring.annotation.MapperScan;


@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@MapperScan("com.one.clxj.mapper")
public class CxljApplication {

    public static void main(String[] args) {
        SpringApplication.run(CxljApplication.class, args);
    }

}
