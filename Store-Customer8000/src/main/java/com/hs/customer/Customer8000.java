package com.hs.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/23/16:01
 * @Description:
 */

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Customer8000 {
    public static void main(String[] args) {
        SpringApplication.run(Customer8000.class,args);
    }
}
