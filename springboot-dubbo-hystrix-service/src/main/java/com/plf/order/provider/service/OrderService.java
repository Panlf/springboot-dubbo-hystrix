package com.plf.order.provider.service;

import java.util.List;

import com.plf.order.bean.Order;

public interface OrderService {

	List<Order> getOrderByUserId(Integer id);
}
