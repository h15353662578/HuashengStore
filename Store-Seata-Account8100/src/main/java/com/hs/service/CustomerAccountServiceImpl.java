package com.hs.service;

import com.hs.dao.CustomerAccountDao;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/29/17:29
 * @Description:
 */

@Slf4j
@DubboService(group = "customer-account-service")
public class CustomerAccountServiceImpl implements CustomerAccountService {

    @Resource
    private CustomerAccountDao customerAccountDao;

    @Override
    public Boolean decrease(Long customerId, BigDecimal money) {
        log.info("---> AccountService中扣减账户余额");
        customerAccountDao.decrease(customerId, money);
        log.info("---> AccountService中扣减账户余额完成");
        return true;
    }
}
