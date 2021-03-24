package com.hs.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/23/15:44
 * @Description:用户详细信息
 */
@Data
public class CustomerMessage {
    private int id;

    private int customerId;

    private String customerUserName;

    private String customerPhone;

    private int customerSex;

    private int customerAge;

    private Date customerCreateDate;

    private String customerAddress;

}
