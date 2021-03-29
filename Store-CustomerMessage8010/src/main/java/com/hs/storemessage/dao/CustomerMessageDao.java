package com.hs.storemessage.dao;

import com.hs.storemessage.entity.CustomerMessage;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/24/10:24
 * @Description:
 */
@Mapper
public interface CustomerMessageDao {

    /***
     * 查询所有用户信息
     * @return
     */
    @Select("select * from customer")
    public List<CustomerMessage> findAll();


    /***
     * 查询单个用户信息 根据账号
     * @return
     */
    @Select("select * from customer_message where customer_username=#{customerUserName}")
    public CustomerMessage findOne(String customerUserName);

    @Insert("insert into customer_message (create_date) values(#{createDate})")
    public void  add(CustomerMessage customerMessage);
}