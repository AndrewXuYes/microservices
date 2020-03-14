package com.xuzhennan.top.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author andrew
 * @date 2020/3/15 1:05
 */
@ControllerAdvice
public class GlobalException {

    @ExceptionHandler(value = {NullPointerException.class})
    @ResponseBody //在返回自定义相应类的情况下必须有，这是@ControllerAdvice注解的规定
    public String nullPointerExceptionHandler(Exception e) {
        e.printStackTrace();
        return "NullPointerException全局错误处理";
    }

    @ExceptionHandler(value = {RuntimeException.class})
    @ResponseBody //在返回自定义相应类的情况下必须有，这是@ControllerAdvice注解的规定
    public String runtimeExceptionHandler2(Exception e) {
        e.printStackTrace();
        return "RuntimeException全局错误处理";
    }
}
