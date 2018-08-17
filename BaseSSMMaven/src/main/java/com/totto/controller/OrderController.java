package com.totto.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.totto.mapper.OrderMapper;
import com.totto.pojo.Article;
import com.totto.pojo.Item;
import com.totto.pojo.Order;
import com.totto.pojo.User;
import com.totto.service.ArticleService;
import com.totto.service.OrderService;
import com.totto.service.UserService;
import com.totto.utils.TottoResult;

@Controller
@RequestMapping("/order")
public class OrderController {
	@Autowired
	private OrderService orderService;
	@Autowired
	private UserService userService;
	@Autowired
	private ArticleService articleService;
	@Autowired
	private OrderMapper orderMapper;
	
	@RequestMapping("/selectOrderById")
	@ResponseBody
	public Order selectOrderById(Integer id){
		Order order = orderService.selectOrderById(id);
		return order;
	}
	
	@RequestMapping("/insertOrder")
	@ResponseBody
	public TottoResult insertOrder() {
		User user = new User();
		user.setAddress("茂名");
		user.setLoginname("Flynn");
		user.setUsername("wangwang");
		user.setPhone("1234567");
		user.setPassword("asdfgfd123456");
		userService.insertUser(user);
		Order order = new Order();
		order.setCode("sadfsdf34");
		order.setTotal(200.34);
		order.setUser(user);
		List list = new ArrayList<>();
		Article article1 = articleService.selectArticleById(1);
		Article article2 = articleService.selectArticleById(2);
		list.add(article1);
		list.add(article2);
		order.setArticles(list);
		orderService.insertOrder(order);
		Integer[] ids = {1,2};
		for (Integer integer : ids) {
			Item item = new Item();
			item.setArticle_id(integer);
			item.setOrder_id(order.getId());
			orderMapper.insertItem(item);
		}
		return TottoResult.ok(order);
	}
}
