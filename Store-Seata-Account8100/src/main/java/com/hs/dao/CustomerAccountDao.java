package com.hs.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.math.BigDecimal;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/29/17:29
 * @Description:
 */

@Mapper
public interface CustomerAccountDao {

    @Update("update customer_account set used = used + #{money}, residue = residue - #{money} where customer_id = #{customerId};")
    void decrease(@Param("customerId") Long customerId, @Param("money") BigDecimal money);

}
