package com.one.clxj;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;


@SpringBootApplication()
@MapperScan("com.one.clxj.mapper")
@EnableTransactionManagement
public class CxljApplication {

    public static void main(String[] args) {
        SpringApplication.run(CxljApplication.class, args);
    }

}
