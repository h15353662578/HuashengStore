package com.hs.storemessage.controller;

import com.hs.entity.CustomerMessage;
import com.hs.storemessage.service.CustomerMessageService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/24/10:26
 * @Description:
 */
@RestController
@RequestMapping("/customerMessage")
public class CustomerMessageController {

    @Resource
    private CustomerMessageService customerMessageService;

    @GetMapping("/findOne/{customerUserName}")
    public CustomerMessage findOne(@PathVariable String customerUserName){
        return customerMessageService.findOne(customerUserName);
    }

    @GetMapping("/findAll")
    public List<CustomerMessage> findAll(){
        return customerMessageService.findAll();
    }

    @GetMapping("/add")
    public void  add(CustomerMessage customerMessage){
        customerMessageService.add(customerMessage);
    }
}
