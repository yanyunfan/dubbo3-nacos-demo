package com.dubbo.consumer.controller;

import com.dubbo.api.TestService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @DubboReference
    private TestService testService;

    @GetMapping("/test")
    public String test(Integer id) {
        return testService.getName(id);
    }
}
