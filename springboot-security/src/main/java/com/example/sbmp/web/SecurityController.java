package com.example.sbmp.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author lengleng
 * @since 2017-08-19
 */
@SuppressWarnings("unused")
@Controller
public class SecurityController {
    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/home")
    @ResponseBody
    public String home() {
        return "HOME";
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "HELLO";
    }
}
