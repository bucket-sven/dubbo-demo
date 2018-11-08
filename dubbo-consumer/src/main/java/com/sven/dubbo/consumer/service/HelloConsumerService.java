package com.sven.dubbo.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sven.dubbo.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * @author sven
 */
@Component
public class HelloConsumerService {
    @Reference
    public HelloService helloService;
}
