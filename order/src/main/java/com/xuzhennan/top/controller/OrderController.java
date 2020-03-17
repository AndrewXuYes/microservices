package com.xuzhennan.top.controller;

import com.xuzhennan.top.api.CommonResult;
import com.xuzhennan.top.model.Order;
import com.xuzhennan.top.service.OrderService;
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
    private OrderService orderService;

    @ApiOperation("创建订单")
    @RequestMapping("/creatOrder")
    public CommonResult<Integer> creatOrder(Order order) {
        int creatOrder = orderService.creatOrder(order);
        return CommonResult.success(creatOrder);
    }

    @ApiOperation("删除订单")
    @RequestMapping("/deleteOrder")
    public CommonResult<Integer> deleteOrder(Long id) {
        int deleteOrder = orderService.deleteOrder(id);
        return CommonResult.success(deleteOrder);
    }

    @ApiOperation("修改订单")
    @RequestMapping("/changeOrder")
    public CommonResult<Integer> changeOrder(Order Order) {
        int creatOrder = orderService.changeOrder(Order);
        return CommonResult.success(creatOrder);
    }

    @ApiOperation("查找订单")
    @RequestMapping("/findOrder")
    public CommonResult<Order> findOrder(Long id) {
        Order Order = orderService.findOrder(id);
        return CommonResult.success(Order);
    }
}
