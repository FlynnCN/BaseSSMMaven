package com.totto.mapper;

import com.totto.pojo.Card;

public interface CardMapper {
	public Card selectCardById(int id);
	
	public void insertCard(Card card);
}
