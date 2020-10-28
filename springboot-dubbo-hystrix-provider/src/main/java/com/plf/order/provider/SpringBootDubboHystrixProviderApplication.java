package com.plf.order.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableAutoConfiguration
@EnableHystrix
@SpringBootApplication
public class SpringBootDubboHystrixProviderApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDubboHystrixProviderApplication.class, args);
	}
}
