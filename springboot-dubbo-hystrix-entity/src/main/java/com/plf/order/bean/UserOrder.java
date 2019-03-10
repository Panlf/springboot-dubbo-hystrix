package com.plf.order.bean;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserOrder implements Serializable{


	private static final long serialVersionUID = 6444901447393431901L;
	
	private Integer id;
	
	private String username;
	
	private List<Order> orderList;
	
	
}
