package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @email wangiegie@gmail.com
 * @data 2017-08
 */
@RestController
public class ResourceController {
    @GetMapping("/getResource")
    public String getResource(Principal principal) {
        return "SUCCESS，授权成功拿到资源啦.当前用户：" + principal.getName();
    }
}