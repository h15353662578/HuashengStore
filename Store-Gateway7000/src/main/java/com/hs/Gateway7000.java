package com.hs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/23/15:10
 * @Description:
 */

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class Gateway7000 {

    public static void main(String[] args) {
        SpringApplication.run(Gateway7000.class,args);
    }
}
