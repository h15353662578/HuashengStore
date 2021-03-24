package com.hs.entity;

import lombok.Data;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/23/15:25
 * @Description:用户账号信息
 */
@Data
public class Customer {

    private int customerId;

    private String customerName;

    private String customerUserName;

    private String customerPassword;


}
