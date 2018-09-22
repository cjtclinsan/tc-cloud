package com.example.sbmp.web;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author lengleng
 * @since 2017-08-19
 */
@SuppressWarnings("unused")
@RestController
public class ProviderController {
    @GetMapping("/test")
    public String test() {
        return "PROVIDER";
    }
}
