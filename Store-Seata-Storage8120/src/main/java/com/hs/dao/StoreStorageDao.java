package com.hs.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/30/8:36
 * @Description:
 */
@Mapper
public interface StoreStorageDao {

    void decrease(@Param("productId") Long productId, @Param("count") Integer count);

}
