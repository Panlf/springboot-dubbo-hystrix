package com.plf.order.consumer.service.impl;

import java.util.List;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import com.plf.order.bean.Order;
import com.plf.order.bean.UserOrder;
import com.plf.order.consumer.service.UserOrderService;
import com.plf.order.provider.service.OrderService;

@Service
public class UserOrderServiceImpl implements UserOrderService{
	
	
	@Reference(version="1.0.0")
	private OrderService orderService;
	
	public UserOrder findUserOrderInfo(Integer id) {
		List<Order> orderList = orderService.getOrderByUserId(id);
		UserOrder userOrder = new UserOrder(id,"Elise",orderList);
		return userOrder;
	}
}
