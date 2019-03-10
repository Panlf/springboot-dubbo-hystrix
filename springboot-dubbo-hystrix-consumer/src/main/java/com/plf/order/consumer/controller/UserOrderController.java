package com.plf.order.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.plf.order.bean.UserOrder;
import com.plf.order.consumer.service.UserOrderService;

@Controller
public class UserOrderController {
	@Autowired
	private UserOrderService userOrderService;
	
	@RequestMapping(value="/find/{id}",method=RequestMethod.GET)
	@ResponseBody
	public UserOrder getUserOrder(@PathVariable(value="id") Integer id){
		return userOrderService.findUserOrderInfo(id);
	}
	
	@RequestMapping(value="/find",method=RequestMethod.GET)
	@ResponseBody
	public UserOrder getUserOrderById(@RequestParam Integer id){
		return userOrderService.findUserOrderInfo(id);
	}
	
	@RequestMapping(value="/get",method=RequestMethod.GET)
	@ResponseBody
	public String hello(){
		return "helllo";
	}
}
