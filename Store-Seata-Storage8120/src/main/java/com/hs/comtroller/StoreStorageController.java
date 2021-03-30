package com.hs.comtroller;

import com.hs.config.CommonResult;
import com.hs.service.StoreStorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/30/8:38
 * @Description:
 */

@RestController
@Slf4j
public class StoreStorageController {

    @Resource
    private StoreStorageService storeStorageService;

    @RequestMapping("/storage/decrease")
    public CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count){
        storeStorageService.decrease(productId, count);
        log.info("扣减库存成功!");
        return new CommonResult(200, "扣减库存成功!");
    }
}
