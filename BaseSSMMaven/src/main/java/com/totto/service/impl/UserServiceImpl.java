package com.totto.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.totto.mapper.UserMapper;
import com.totto.pojo.User;
import com.totto.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User selectUserById(int id) {
		return userMapper.selectUserById(id);
	}

	@Override
	public void insertUser(User user) {
		userMapper.insertUser(user);
	}

}
