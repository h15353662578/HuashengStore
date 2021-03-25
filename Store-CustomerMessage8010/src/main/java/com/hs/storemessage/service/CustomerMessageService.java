package com.hs.storemessage.service;

import com.hs.entity.CustomerMessage;

import java.util.List;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/24/10:25
 * @Description:
 */
public interface CustomerMessageService {

    public CustomerMessage findOne(String customerUserName);

    public List<CustomerMessage> findAll();

    public void add(CustomerMessage customerMessage);
}
