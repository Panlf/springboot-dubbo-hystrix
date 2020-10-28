package com.plf.order.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.plf.order.bean.UserOrder;
import com.plf.order.consumer.service.UserOrderService;

@RestController
public class UserOrderController {
	@Autowired
	private UserOrderService userOrderService;
	
	@GetMapping(value="/find/{id}")
	public UserOrder getUserOrder(@PathVariable(value="id") Integer id){
		return userOrderService.findUserOrderInfo(id);
	}
	
	@HystrixCommand(fallbackMethod="findCallBack")
	@GetMapping(value="/find")
	public UserOrder getUserOrderById(@RequestParam Integer id){
		return userOrderService.findUserOrderInfo(id);
	}
	
	@GetMapping(value="/get")
	public String hello(){
		return "helllo";
	}
	
	//服务降级
	public UserOrder findCallBack(@RequestParam Integer id){
		return new UserOrder(id,"服务降级数据",null);
	}
}
