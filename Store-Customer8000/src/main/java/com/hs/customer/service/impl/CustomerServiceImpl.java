package com.hs.customer.service.impl;

import com.hs.customer.Dao.CustomerDao;
import com.hs.customer.service.CustomerService;
import com.hs.entity.Customer;
import com.hs.entity.CustomerMessage;
import com.hs.storemessage.service.CustomerMessageService;
import io.seata.spring.annotation.GlobalTransactional;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Resource;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/23/16:03
 * @Description:
 */

@Slf4j
@DubboService(timeout = 10000,group = "customer-service")
public class CustomerServiceImpl implements CustomerService {

    @Resource
    private CustomerDao customerDao;

    @Resource
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @DubboReference(group = "customer-message-service")
    private CustomerMessageService customerMessageService;


    @Override
    @GlobalTransactional(name = "customer-service", rollbackFor = Exception.class)
    public void add(Customer customer) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
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
