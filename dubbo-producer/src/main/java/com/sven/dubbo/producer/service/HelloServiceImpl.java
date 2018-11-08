package com.sven.dubbo.producer.service;

/**
 * @author sven
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        String ret = "Hello, " + name;
        System.out.println(ret);
        return ret;
    }
}
