package com.sven.dubbo.producer.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.sven.dubbo.service.HelloService;

/**
 * @author sven
 */
@Service(timeout = 5000)
public class HelloServiceImpl implements HelloService  {
    @Override
    public String sayHello(String name) {
        return "Hello, " + name;
    }
}
