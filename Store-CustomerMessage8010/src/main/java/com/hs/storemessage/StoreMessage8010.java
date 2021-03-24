package com.hs.storemessage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/24/10:20
 * @Description:
 */

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class StoreMessage8010 {
    public static void main(String[] args) {
        SpringApplication.run(StoreMessage8010.class,args);
    }
}
