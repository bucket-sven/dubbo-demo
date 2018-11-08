package com.sven.dubbo.consumer.service;

import com.sven.dubbo.producer.service.HelloService;
import com.sven.dubbo.producer.service.HelloServiceImpl;

/**
 * @author sven
 */
public class Main {
    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        helloService.sayHello("sven");
    }
}
