package com.sven.dubbo.consumer.controller;

import com.google.common.collect.Maps;
import com.sven.dubbo.consumer.service.HelloServiceConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sven
 */
@RestController
public class MainController {
    @Autowired
    private HelloServiceConsumer helloServiceConsumer;

    @GetMapping("/sayHello")
    public Map<String, Object> sayHello(@RequestParam String name) {
        HashMap<String, Object> hashMap = Maps.newHashMap();
        String data = helloServiceConsumer.sayHello(name);
        hashMap.put("data", data);
        return hashMap;
    }
}
