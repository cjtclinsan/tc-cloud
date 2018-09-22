package com.example.sbmp.web;


import com.example.sbmp.config.RateLimiter;
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
public class IndexController {
    @RateLimiter(limit = 2, timeout = 10000)
    @GetMapping("/test")
    public void test() {
    }

    @RateLimiter(limit = 2, timeout = 5000)
    @GetMapping("/test2")
    public void test2() {
    }

}
