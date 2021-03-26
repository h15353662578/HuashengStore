package com.hs.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/23/15:49
 * @Description:
 */
@Data
public class ProductStorage implements Serializable {

    private int id;

    private int productId;

    private  int total;

    private int used;

    private int residue;

}
