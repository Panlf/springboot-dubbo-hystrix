package com.plf.order.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootConfiguration
@EnableAutoConfiguration
@EnableHystrix
public class SpringBootDubboHystrixProviderApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDubboHystrixProviderApplication.class, args);
	}
}
