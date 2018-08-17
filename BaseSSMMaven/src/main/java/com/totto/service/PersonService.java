package com.totto.service;

import com.totto.pojo.Person;

public interface PersonService {
	public Person selectPersonById(Integer id);
	
	public Person selectPersonById2(Integer id);
	
	public void insertPerson(Person person);
}
