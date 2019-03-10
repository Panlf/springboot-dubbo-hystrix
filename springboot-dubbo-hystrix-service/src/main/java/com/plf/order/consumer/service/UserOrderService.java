package com.plf.order.consumer.service;

import com.plf.order.bean.UserOrder;

public interface UserOrderService {
	UserOrder findUserOrderInfo(Integer id);
}
