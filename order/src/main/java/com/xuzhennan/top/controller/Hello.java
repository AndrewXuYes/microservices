package com.xuzhennan.top.controller;

import com.xuzhennan.top.component.AroundLog;
import io.swagger.annotations.ApiOperation;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Log
@RestController
public class Hello {

    @AroundLog
    @ApiOperation("打招呼页面")
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String Hello(String astr) {
        log.info("helloInit");
        return "谢谢观看:这是初始化页面  " + astr;
    }

}
