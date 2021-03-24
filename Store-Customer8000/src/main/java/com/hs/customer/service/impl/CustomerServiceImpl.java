package com.hs.customer.service.impl;

import com.hs.customer.Dao.CustomerDao;
import com.hs.customer.service.CustomerService;
import com.hs.entity.Customer;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/23/16:03
 * @Description:
 */

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



    @Override
    public void add(Customer customer) {
        customer.setCustomerPassword(bCryptPasswordEncoder.encode(customer.getCustomerPassword()));
        customerDao.add(customer);
    }



}
