package com.hs.service;

import java.math.BigDecimal;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/29/17:28
 * @Description:
 */
public interface CustomerAccountService {
    /***
     *
     * @param customerId
     * @param money
     */
    Boolean decrease(Long customerId, BigDecimal money);

}
