package com.hs.service;

import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/30/8:34
 * @Description:
 */
public interface StoreStorageService {

    void decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);


}
