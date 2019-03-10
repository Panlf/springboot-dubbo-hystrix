package com.plf.order.provider.service.impl;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import com.plf.order.bean.Order;
import com.plf.order.provider.service.OrderService;

@Component
@Service(version="1.0.0") //暴露服务
public class OrderServiceImpl implements OrderService {

	@Override
	public List<Order> getOrderByUserId(Integer id) {
		Order order1 = new Order(11,new Date(),58.8,id);
		Order order2 = new Order(12,new Date(),123.4,id);
		Order order3 = new Order(13,new Date(),526.7,id);
		
		return Arrays.asList(order1,order2,order3);
	}

}
