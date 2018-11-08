package com.sven.dubbo.consumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sven.dubbo.consumer.service.HelloServiceConsumer;
import com.sven.dubbo.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @author sven
 */
@Service
public class HelloServiceConsumerImpl implements HelloServiceConsumer {
    @Reference
    private HelloService helloService;

    @Override
    public String sayHello(String name) {
        return helloService.sayHello(name);
    }
}
