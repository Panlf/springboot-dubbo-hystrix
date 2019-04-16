package com.plf.order.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages={"com.plf.order.consumer.*"})
@EnableHystrix
public class SpringBootDubboHystrixConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDubboHystrixConsumerApplication.class);
    }

}
