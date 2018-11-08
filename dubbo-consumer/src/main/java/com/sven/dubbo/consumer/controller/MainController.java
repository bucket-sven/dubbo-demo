package com.sven.dubbo.consumer.controller;

import com.sven.dubbo.consumer.service.HelloConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sven
 */
@RestController
public class MainController {
    @Autowired
    private HelloConsumerService helloConsumerService;

    @GetMapping("/sayHello")
    public String sayHello(@RequestParam String name) {
        return helloConsumerService.helloService.sayHello(name);
    }
}
