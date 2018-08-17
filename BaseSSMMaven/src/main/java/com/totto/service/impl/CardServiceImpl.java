package com.totto.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.totto.mapper.CardMapper;
import com.totto.pojo.Card;
import com.totto.service.CardService;

@Service
public class CardServiceImpl implements CardService {
	@Autowired
	private CardMapper cardMapper;
	
	@Override
	public void insertCard(Card card) {
		cardMapper.insertCard(card);
	}

}
