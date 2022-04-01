package com.north;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.north.mapper")
public class WebApp {
    public static void main(String[] args) throws RuntimeException {
        SpringApplication.run(WebApp.class, args);
    }

}


