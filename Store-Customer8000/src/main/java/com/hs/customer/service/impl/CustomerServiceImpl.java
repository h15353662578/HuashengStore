package com.hs.customer.service.impl;

import com.hs.customer.Dao.CustomerDao;
import com.hs.customer.service.CustomerMessageService;
import com.hs.customer.service.CustomerService;
import com.hs.entity.Customer;
import com.hs.entity.CustomerMessage;
import io.seata.spring.annotation.GlobalTransactional;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Resource;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/23/16:03
 * @Description:
 */

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    @Resource
    private CustomerDao customerDao;

    @Resource
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Reference
    private CustomerMessageService customerMessageService;


    @Override
    @GlobalTransactional(name = "customer-service", rollbackFor = Exception.class)
    public void add(Customer customer) {
        customer.setCustomerPassword(bCryptPasswordEncoder.encode(customer.getCustomerPassword()));
        //新建用户
        log.info("---开始新建用户---");
        customerDao.add(customer);
        CustomerMessage customerMessage=new CustomerMessage();

        //新建用户信息表
        log.info("---开始创建用户信息表---");
        customerMessageService.add(customerMessage);
    }





}
