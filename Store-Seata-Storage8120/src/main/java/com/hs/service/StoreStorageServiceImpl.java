package com.hs.service;

import com.hs.dao.StoreStorageDao;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/30/8:37
 * @Description:
 */

@DubboService(group = "store-storage-service")
@Slf4j
public class StoreStorageServiceImpl implements StoreStorageService{

    @Resource
    private StoreStorageDao storeStorageDao;

    @Override
    public void decrease(Long productId, Integer count) {
        log.info("----> StorageService中扣减库存");
        storeStorageDao.decrease(productId, count);
        log.info("----> StorageService中扣减库存完成");
    }



}
