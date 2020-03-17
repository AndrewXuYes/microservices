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
@RequestMapping("/user")
@Api(tags = "UserController", description = "用户管理")
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
    public CommonResult<Integer> deleteUser(Long id) {
        int creatUser = userService.deletcUser(id);
        return CommonResult.success(creatUser);
    }

    @ApiOperation("修改用户")
    @RequestMapping("/changeUser")
    public CommonResult<Integer> changeUser(User user) {
        int creatUser = userService.changeUser(user);
        return CommonResult.success(creatUser);
    }

    @ApiOperation("查找用户")
    @RequestMapping("/findUser")
    public CommonResult<User> findUser(Long id) {
        User user = userService.findUser(id);
        return CommonResult.success(user);
    }
}
