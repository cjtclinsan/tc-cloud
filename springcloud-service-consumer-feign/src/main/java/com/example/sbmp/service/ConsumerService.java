package com.example.sbmp.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @email wangiegie@gmail.com
 * @data 2017-08
 */
@FeignClient("PROVIDER-SERVICE")
public interface ConsumerService {
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    String test2();
}
