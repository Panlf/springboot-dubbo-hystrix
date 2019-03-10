package com.plf.order.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@SpringBootConfiguration
@EnableAutoConfiguration
public class SpringBootDubboHystrixProviderApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDubboHystrixProviderApplication.class, args);
	}
}
