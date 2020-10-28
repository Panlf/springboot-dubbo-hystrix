package com.plf.order.provider.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plf.order.bean.Order;
import com.plf.order.provider.service.OrderService;

@RestController
@RequestMapping("order")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@GetMapping("getOrder/{userId}")
	public List<Order> getOrderList(@PathVariable(value = "userId") Integer userId){
		return orderService.getOrderByUserId(userId);
	}
	
	@GetMapping("get")
	public String testOrder() {
		return "测试通过";
	}
}
