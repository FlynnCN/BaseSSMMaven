package com.totto.service;

import com.totto.pojo.Article;

public interface ArticleService {
	public Article selectArticleByOrderId(int id);
	
	public Article selectArticleById(int id);
}
