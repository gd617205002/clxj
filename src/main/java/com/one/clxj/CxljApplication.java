package com.one.clxj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class CxljApplication {

    public static void main(String[] args) {
        SpringApplication.run(CxljApplication.class, args);
    }

}
