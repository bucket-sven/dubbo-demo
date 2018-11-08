package com.sven.dubbo.producer;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author sven
 */
@SpringBootApplication
@DubboComponentScan(basePackages = "com.sven.dubbo.producer.service")
public class DubboProducer {
    public static void main(String[] args) {
        SpringApplication.run(DubboProducer.class, args);
    }
}
