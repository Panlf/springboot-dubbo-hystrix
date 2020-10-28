package com.plf.order.bean;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * 订单的对象
 * @author plf 2019年3月9日下午6:27:20
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order implements Serializable{

	
	private static final long serialVersionUID = -7580587173873225694L;
	
	private Long id;
	
	private Date createtime;
	
	private Double price;
	
	private Integer userid;

}
