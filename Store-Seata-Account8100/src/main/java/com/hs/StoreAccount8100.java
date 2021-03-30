package com.hs;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/29/17:26
 * @Description:
 */

@EnableDubbo
@SpringBootApplication
public class StoreAccount8100 {
    public static void main(String[] args) {
        SpringApplication.run(StoreAccount8100.class,args);
    }
}
