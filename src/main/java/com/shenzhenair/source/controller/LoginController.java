package com.shenzhenair.source.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 登录控制中心
 *
 * @author mariston
 * @version V1.0
 * @since 2016/10/25
 */
@Controller
@RequestMapping("/")
public class LoginController {

    /**
     * 登录
     *
     * @return path
     */
    @RequestMapping(value = "/login")
    public String login() {
        return "index";
    }

    /**
     * 首页
     *
     * @return path
     */
    @RequestMapping(value = "/home")
    public String home() {
        return "home/home";
    }
}
