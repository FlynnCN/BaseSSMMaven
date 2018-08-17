package com.totto.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.totto.mapper.OrderMapper;
import com.totto.pojo.Order;
import com.totto.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderMapper orderMapper;
	
	@Override
	public Order selectOrderById(int id) {
		return orderMapper.selectOrderById(id);
	}

	@Override
	public void insertOrder(Order order) {
		orderMapper.insertOrder(order);
	}

}
