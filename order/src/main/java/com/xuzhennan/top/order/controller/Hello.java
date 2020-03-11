package com.xuzhennan.top.order.controller;

import com.xuzhennan.top.order.aop.Justalog;
import io.swagger.annotations.ApiOperation;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Log
@RestController
public class Hello {

    @Justalog
    @ApiOperation("打招呼页面")
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String sayHello0(String astr) {
        log.info("helloInit");
        return "谢谢观看:这是初始化页面";
    }

}
