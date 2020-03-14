package com.xuzhennan.top.controller;

import com.xuzhennan.top.model.User;
import com.xuzhennan.top.service.TestService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author andrew
 * @date 2020/2/24 22:26
 */
@Log
@RestController
public class TestCtl {
    @Autowired
    private TestService TestService;

    @ApiOperation("打招呼页面")
    @RequestMapping("/test")
    public String sayHello0(String astr) {
        User test = TestService.listAll();
        System.out.println("HelloCtl===" + test.toString());
        return "这是test页面";
    }
}
