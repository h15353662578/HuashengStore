package com.hs.entity;

import lombok.Data;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/23/15:49
 * @Description:
 */
@Data
public class ProductStorage {

    private int id;

    private int productId;

    private  int total;

    private int used;

    private int residue;

}
