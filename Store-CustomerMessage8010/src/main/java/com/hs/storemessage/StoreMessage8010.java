package com.hs.storemessage;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/24/10:20
 * @Description:
 */

@EntityScan(value = "com.hs.entity")
@EnableDubbo
@EnableDiscoveryClient
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class StoreMessage8010 {
    public static void main(String[] args) {
        SpringApplication.run(StoreMessage8010.class,args);
    }
}
