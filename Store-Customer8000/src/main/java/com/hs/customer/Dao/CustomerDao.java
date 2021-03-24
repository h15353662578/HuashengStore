package com.hs.customer.Dao;


import com.hs.entity.Customer;
import com.hs.entity.CustomerMessage;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/23/16:03
 * @Description:
 */

@Mapper
public interface CustomerDao {

    /***
     * 添加用户
     * @param customer
     * @return
     */
    @Insert("insert into customer(customer_id,customer_name,customer_username,customer_password) values(#{customerId},#{customerName},#{customerUserName},#{customerPassword})")
    public void add(Customer customer);

}
