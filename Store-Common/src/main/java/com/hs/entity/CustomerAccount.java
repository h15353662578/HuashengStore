package com.hs.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/23/15:51
 * @Description:用户余额信息
 */

@Data
public class CustomerAccount implements Serializable {

    private int id;

    private int userId;

    private int total;

    private int used;

    private int residue;
}
