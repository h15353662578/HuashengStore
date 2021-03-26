package com.hs.customer.controller;

import com.hs.customer.service.CustomerService;
import com.hs.entity.Customer;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/23/16:05
 * @Description:
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Resource
    private CustomerService customerService;

    @GetMapping("/add")
    public void add(@RequestParam Customer customer){
        customerService.add(customer);
    }

}
