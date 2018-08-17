package com.totto.mapper;

import com.totto.pojo.Person;

public interface PersonMapper {
	public Person selectPersonById(Integer id);
	
	public Person selectPersonById2(Integer id);
	
	public void insertPerson(Person person);
}
