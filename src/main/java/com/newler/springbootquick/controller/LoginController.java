package com.newler.springbootquick.controller;

import com.newler.springbootquick.pojo.User;
import com.newler.springbootquick.service.UserService;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class LoginController {
    @Resource
    public UserService userService;
    @ResponseBody
    @GetMapping("/login")
    public String login() {
        User user = userService.getUser(1);
        return "login" +user;
    }
}
