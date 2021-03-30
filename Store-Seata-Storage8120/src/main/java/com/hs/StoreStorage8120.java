package com.hs;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/30/8:32
 * @Description:
 */

@EnableDubbo
@EnableDiscoveryClient
@SpringBootApplication
public class StoreStorage8120 {
    public static void main(String[] args) {
        SpringApplication.run(StoreStorage8120.class,args);
    }
}
