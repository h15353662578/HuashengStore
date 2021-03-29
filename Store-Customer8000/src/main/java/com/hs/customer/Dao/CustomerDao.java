package com.hs.customer.Dao;


import com.hs.customer.entity.Customer;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
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
    @Insert("insert into customer(customer_name,customer_username,customer_password) values(#{customerName},#{customerUserName},#{customerPassword})")
    public void add(Customer customer);

}
