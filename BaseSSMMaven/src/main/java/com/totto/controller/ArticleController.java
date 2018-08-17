package com.totto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.totto.pojo.Article;
import com.totto.service.ArticleService;

@Controller
@RequestMapping("/article")
public class ArticleController {
	@Autowired
	private ArticleService articleService;
	
	@RequestMapping("/selectArticleByOrderId")
	@ResponseBody
	public Article selectArticleByOrderId(Integer id){
		Article article = articleService.selectArticleByOrderId(id);
		return article;
	}
}
