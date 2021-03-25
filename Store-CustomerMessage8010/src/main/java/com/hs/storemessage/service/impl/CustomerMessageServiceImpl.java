package com.hs.storemessage.service.impl;

import com.hs.entity.CustomerMessage;
import com.hs.storemessage.dao.CustomerMessageDao;
import com.hs.storemessage.service.CustomerMessageService;
import org.checkerframework.checker.units.qual.C;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/24/10:26
 * @Description:
 */
@Service
public class CustomerMessageServiceImpl implements CustomerMessageService {

    @Resource
    private CustomerMessageDao customerMessageDao;

    @Override
    public CustomerMessage findOne(String customerUserName){
        return customerMessageDao.findOne(customerUserName);
    }

    @Override
    public List<CustomerMessage> findAll(){
        return customerMessageDao.findAll();
    }

    @Override
    public void add(CustomerMessage customerMessage){
        customerMessage.setCreateDate(new Date());
        customerMessageDao.add(customerMessage);
    }
}