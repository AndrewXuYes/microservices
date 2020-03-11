package com.xuzhennan.top.order.controller;

import com.xuzhennan.top.model.Test;
import com.xuzhennan.top.order.service.TestService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
        List<Test> test = TestService.listAll();

        return "这是test页面";
    }
}
