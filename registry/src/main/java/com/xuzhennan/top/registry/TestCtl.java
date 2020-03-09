package com.xuzhennan.top.registry;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author andrew
 * @date 2020/3/9 13:33
 */

@RestController

public class TestCtl {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @Value("${server.port}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo() {
        return configInfo;
    }

}
