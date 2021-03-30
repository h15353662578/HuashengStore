package com.hs;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/29/20:02
 * @Description:
 */

@EnableDiscoveryClient
@SpringBootApplication
@EnableDubbo
public class StoreOrder8110 {
    public static void main(String[] args) {
        SpringApplication.run(StoreOrder8110.class,args);
    }
}
