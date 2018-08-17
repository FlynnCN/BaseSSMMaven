package com.totto.service;

import com.totto.pojo.User;

public interface UserService {
	public User selectUserById(int id);
	
	public void insertUser(User user);
}
