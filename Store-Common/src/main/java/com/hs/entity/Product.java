package com.hs.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/23/15:46
 * @Description:商品信息
 */

@Data
public class Product implements Serializable {

    private int productId;

    private String productName;

    private int productPrice;

    private int productStatus;

    private String productType;
}
