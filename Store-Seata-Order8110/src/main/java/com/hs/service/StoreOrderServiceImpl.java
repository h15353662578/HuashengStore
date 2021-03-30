package com.hs.service;

import com.hs.dao.StoreOrderDao;
import com.hs.entity.CustomerOrder;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/29/20:08
 * @Description:
 */

@Slf4j
@DubboService(timeout = 10000,group = "store-order-service")
public class StoreOrderServiceImpl implements StoreOrderService{

    @Resource
    private StoreOrderDao storeOrderDao;

    @DubboReference(group = "customer-account-service")
    private CustomerAccountService customerAccountService;

    @DubboReference(group = "store-storage-service")
    private StoreStorageService storeStorageService;

    @Override
    @GlobalTransactional(name = "store-order-service", rollbackFor = Exception.class)
    public void create(CustomerOrder customerOrder) {
        // 1 新建订单
        log.info("----->开始新建订单");
        storeOrderDao.create(customerOrder);

        // 2 扣减库存
        log.info("----->订单微服务开始调用库存,做扣减Count");
        storeStorageService.decrease(customerOrder.getProductId(), customerOrder.getCount());
        log.info("----->订单微服务开始调用库存,做扣减End");

        // 3 扣减账户
        log.info("----->订单微服务开始调用账户,做扣减Money");
        customerAccountService.decrease(customerOrder.getCustomerId(), customerOrder.getMoney());
        log.info("----->订单微服务开始调用账户,做扣减End");

        // 4 修改订单状态,从0到1,1代表已完成
        log.info("----->修改订单状态开始");

        storeOrderDao.update(customerOrder.getCustomerId(), 0);

        log.info("----->下订单结束");
    }

}
