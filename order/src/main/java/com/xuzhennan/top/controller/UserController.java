package com.xuzhennan.top.controller;

import com.xuzhennan.top.api.CommonResult;
import com.xuzhennan.top.model.User;
import com.xuzhennan.top.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author andrew
 * @date 2020/2/24 22:26
 */
@Controller
@Api(tags = "UserController", description = "用户管理")
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation("创建用户")
    @RequestMapping("/creatUser")
    public CommonResult<Integer> creatUser(User user) {
        int creatUser = userService.creatUser(user);
        return CommonResult.success(creatUser);
    }

    @ApiOperation("删除用户")
    @RequestMapping("/deleteUser")
    public CommonResult<Integer> deleteUser(int id) {
        int creatUser = userService.deletcUser(id);
        return CommonResult.success(creatUser);
    }
}
