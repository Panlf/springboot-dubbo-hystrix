package com.plf.order.provider.service.impl;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.plf.order.bean.Order;
import com.plf.order.provider.mapper.OrderMapper;
import com.plf.order.provider.service.OrderService;

@Component
//默认超时时间1s
@Service(version="1.0.0",timeout = 5000) //暴露服务
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderMapper orderMapper;
	
	@Override
	public List<Order> getOrderByUserId(Integer userId) {
		
		/**
		 * 测试超时时间，认为加时间
		 */
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return orderMapper.getOrderList(userId);
	}

}
