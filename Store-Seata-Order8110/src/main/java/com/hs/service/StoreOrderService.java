package com.hs.service;

import com.hs.entity.CustomerOrder;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/29/20:08
 * @Description:
 */
public interface StoreOrderService {
    /**
     * 创建订单
     * @param customerOrder
     */
    void create(CustomerOrder customerOrder);

}
