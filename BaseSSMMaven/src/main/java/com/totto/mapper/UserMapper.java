package com.totto.mapper;

import com.totto.pojo.User;

public interface UserMapper {
	public User selectUserById(int id);
	
	public void insertUser(User user);
}
