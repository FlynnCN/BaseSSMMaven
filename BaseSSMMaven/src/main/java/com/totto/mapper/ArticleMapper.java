package com.totto.mapper;

import com.totto.pojo.Article;

public interface ArticleMapper {
	public Article selectArticleByOrderId(int id);
	
	public Article selectArticleById(int id);
}
