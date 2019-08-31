package com.yusun.eurekaclientuserservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author SunYu
 * @date 2019/8/31 21:17
 */
@RestController
public class UserController {
    @GetMapping("/user/hello")
    public String hello(){
        return "hello";
    }
}
