package com.totto.service;

import com.totto.pojo.Order;

public interface OrderService {
	public Order selectOrderById(int id);
	
	public void insertOrder(Order order);
}
