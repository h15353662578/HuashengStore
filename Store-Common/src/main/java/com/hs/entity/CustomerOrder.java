package com.hs.entity;

import lombok.Data;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/23/15:50
 * @Description:订单信息
 */

@Data
public class CustomerOrder {

    private Integer id;

    private String userId;

    private String productId;

    private String count;

    private Integer money;

    private String status;
}
