package com.hs.controller;

import com.hs.config.R;
import com.hs.service.CustomerAccountService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/29/17:34
 * @Description:
 */
@RestController
public class CustomerAccountController {

    @Resource
    private CustomerAccountService customerAccount;

    @RequestMapping("/account/decrease")
    public R decrease(@RequestParam("customerId") Long customerId, @RequestParam("money") BigDecimal money) {
        Boolean a=customerAccount.decrease(customerId, money);
        if (a){
            return R.ok();
        }else {
            return R.error();
        }
    }
}
