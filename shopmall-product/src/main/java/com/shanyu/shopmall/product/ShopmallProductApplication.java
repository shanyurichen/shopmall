package com.shanyu.shopmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.shanyu.shopmall.product.dao")
@SpringBootApplication
public class ShopmallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopmallProductApplication.class, args);
    }

}
