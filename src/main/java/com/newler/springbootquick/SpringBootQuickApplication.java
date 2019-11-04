package com.newler.springbootquick;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
@MapperScan(basePackages = {"com.newler.springbootquick.dao"})
public class SpringBootQuickApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootQuickApplication.class, args);
    }

}
