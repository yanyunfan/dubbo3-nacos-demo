package com.dubbo.provider.service;


import com.dubbo.api.TestService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class TestServiceImpl implements TestService {
    @Override
    public String getName(Integer id) {
        // 模拟查询数据库操作，返回了"张三"；
        return "张三";
    }
}
