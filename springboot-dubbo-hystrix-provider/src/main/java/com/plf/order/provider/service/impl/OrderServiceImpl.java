package com.plf.order.provider.service.impl;

import java.util.List;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.plf.order.bean.Order;
import com.plf.order.provider.mapper.OrderMapper;
import com.plf.order.provider.service.OrderService;

@Component
@Service(version="1.0.0") //暴露服务
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderMapper orderMapper;
	
	@Override
	public List<Order> getOrderByUserId(Integer userId) {
		return orderMapper.getOrderList(userId);
	}

}
