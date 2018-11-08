package com.sven.dubbo.consumer;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author sven
 */
@SpringBootApplication
@DubboComponentScan(basePackages = "com.sven.dubbo.consumer.service")
@Slf4j
public class DubboConsumer {
    public static void main(String[] args) {
        SpringApplication.run(DubboConsumer.class, args);
    }
}
