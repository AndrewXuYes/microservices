package com.xuzhennan.top.controller;

import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.ObjectUtil;
import com.xuzhennan.top.api.Consts;
import com.xuzhennan.top.component.AroundLog;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 页面跳转 Controller
 */
@Controller
@RequestMapping("/page")
public class PageController {
    /**
     * 跳转到 首页
     *
     * @param request 请求
     */
    @AroundLog
    @ApiOperation("index")
    @GetMapping("/index")
    public ModelAndView index(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();

        String token = (String) request.getSession().getAttribute(Consts.SESSION_KEY);
        mv.setViewName("index");
        mv.addObject("token", token);
        return mv;
    }

    /**
     * 跳转到 登录页
     *
     * @param redirect 是否是跳转回来的
     */
    @AroundLog
    @ApiOperation("login")
    @GetMapping("/login")
    public ModelAndView login(Boolean redirect) {
        ModelAndView mv = new ModelAndView();

        if (ObjectUtil.isNotNull(redirect) && ObjectUtil.equal(true, redirect)) {
            mv.addObject("message", "请先登录！");
        }
        mv.setViewName("login");
        return mv;
    }

    @AroundLog
    @ApiOperation("doLogin")
    @GetMapping("/doLogin")
    public String doLogin(HttpSession session) {
        session.setAttribute(Consts.SESSION_KEY, IdUtil.fastUUID());

        return "redirect:/page/index";
    }
}