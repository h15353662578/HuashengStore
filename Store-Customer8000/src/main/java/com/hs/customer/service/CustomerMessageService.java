package com.hs.customer.service;

import com.hs.entity.CustomerMessage;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/25/11:31
 * @Description:
 */

@FeignClient(value = "customer-message-service")
public interface CustomerMessageService {

    @RequestMapping(value = "/userMessage/add" ,method = RequestMethod.POST)
    public CustomerMessage add(@RequestParam CustomerMessage customerMessage);

}
