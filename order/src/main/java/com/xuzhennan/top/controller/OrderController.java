package com.xuzhennan.top.controller;

import com.xuzhennan.top.api.CommonResult;
import com.xuzhennan.top.model.User;
import com.xuzhennan.top.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author andrew
 * @date 2020/2/24 22:26
 */
@Controller
@ResponseBody
@RequestMapping("/order")
@Api(tags = "OrderController", description = "订单管理")
public class OrderController {
    @Autowired
    private UserService userService;

    @ApiOperation("创建订单")
    @RequestMapping("/creatOrder")
    public CommonResult<Integer> creatOrder(User user) {
        int creatUser = userService.creatUser(user);
        return CommonResult.success(creatUser);
    }

    @ApiOperation("删除订单")
    @RequestMapping("/deleteOrder")
    public CommonResult<Integer> deleteOrder(Long id) {
        int creatUser = userService.deletcUser(id);
        return CommonResult.success(creatUser);
    }
}
