package com.hs.customer.service;

import com.hs.entity.Customer;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/23/16:02
 * @Description:
 */

@FeignClient(value = "customer-service")
public interface CustomerService {

    public void add(Customer customer);

}
