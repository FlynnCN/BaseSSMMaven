package com.totto.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.totto.mapper.ArticleMapper;
import com.totto.pojo.Article;
import com.totto.service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService {
	@Autowired
	private ArticleMapper articleMapper;
	
	@Override
	public Article selectArticleByOrderId(int id) {
		return articleMapper.selectArticleByOrderId(id);
	}

	@Override
	public Article selectArticleById(int id) {
		return articleMapper.selectArticleById(id);
	}

}
