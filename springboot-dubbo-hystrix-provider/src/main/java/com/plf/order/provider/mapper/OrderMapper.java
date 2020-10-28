package com.plf.order.provider.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.plf.order.bean.Order;

@Mapper
public interface OrderMapper {

	@Select("select * from c_order where userid=#{userId}")
	public List<Order> getOrderList(@Param("userId") Integer userId);
}
