package com.totto.mapper;

import com.totto.pojo.Item;
import com.totto.pojo.Order;

public interface OrderMapper {
	public Order selectOrderById(int id);
	
	public void insertOrder(Order order);
	
	public void insertItem(Item item);
}
