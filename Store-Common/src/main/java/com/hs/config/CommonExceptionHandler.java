package com.hs.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLIntegrityConstraintViolationException;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/29/16:12
 * @Description:
 */

@ControllerAdvice
@Slf4j
public class CommonExceptionHandler {

    @ExceptionHandler(SQLIntegrityConstraintViolationException.class)
    @ResponseBody
    public R error(SQLIntegrityConstraintViolationException e){
        e.printStackTrace();
        return R.error().message("注册失败 用户已存在");
    }
}
