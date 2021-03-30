package com.hs.controller;

import com.hs.config.CommonResult;
import com.hs.entity.CustomerOrder;
import com.hs.service.StoreOrderService;
import com.hs.service.StoreStorageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/29/20:07
 * @Description:
 */

@RestController
public class StoreOrderController {

    @Resource
    private StoreOrderService storeOrderService;

    /**
     * 创建订单
     * http://localhost:7000/order/create?customerId=用户ID&productId=商品ID&count=消费件数&money=花费余额
     * @param customerOrder
     * @return
     */
    @GetMapping("/order/create")
    public CommonResult create(CustomerOrder customerOrder) {
        storeOrderService.create(customerOrder);
        return new CommonResult(200, "订单创建成功");
    }

}
