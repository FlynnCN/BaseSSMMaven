package com.totto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.totto.pojo.User;
import com.totto.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/selectUserById")
	@ResponseBody
	public User selectUserById(Integer id){
		User user = userService.selectUserById(id);
		System.out.println(user);
		return user;
	}
}
