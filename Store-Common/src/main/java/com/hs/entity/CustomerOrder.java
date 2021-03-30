package com.hs.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/23/15:50
 * @Description:订单信息
 */

@Data
public class CustomerOrder implements Serializable {

    private Integer xid;

    private Long customerId;

    private Long productId;

    private Integer count;

    private BigDecimal money;

    private String status;
}
