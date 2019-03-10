package com.plf.order.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages={"com.plf.order.consumer.*"})
public class SpringBootDubboHystrixConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDubboHystrixConsumerApplication.class);
    }

}
