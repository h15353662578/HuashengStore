package com.hs.dao;

import com.hs.entity.CustomerOrder;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/29/20:07
 * @Description:
 */
@Mapper
public interface StoreOrderDao {

    /***
     * 新建订单
     * @param customerOrder
     * @return
     */

    @Insert("insert into customer_order(customer_id,product_id,count,money,status) values (#{customerId},#{productId},#{count},#{money},0)")
    int create(CustomerOrder customerOrder);

    /**
     * 2 修改订单状态,从0改为1
     *
     * @param customerId
     * @param status
     * @return
     */

    @Update("update customer_order set status =1 where customer_id =#{customerId} and status=#{status}")
    int update(@Param("customerId") Long customerId, @Param("status") Integer status);
}
