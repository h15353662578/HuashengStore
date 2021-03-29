package com.hs.customer.service;

import com.hs.customer.entity.CustomerMessage;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/26/10:54
 * @Description:
 */

@FeignClient(value = "customer-message-service")
public interface CustomerMessageService {

    public void add(CustomerMessage customerMessage);

}
