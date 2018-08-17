package com.totto.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.totto.mapper.PersonMapper;
import com.totto.pojo.Person;
import com.totto.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {
	@Autowired
	private PersonMapper personMapper;
	
	@Override
	public Person selectPersonById(Integer id) {
		return personMapper.selectPersonById(id);
	}

	@Override
	public void insertPerson(Person person) {
		personMapper.insertPerson(person);
	}

	@Override
	public Person selectPersonById2(Integer id) {
		return personMapper.selectPersonById2(id);
	}

}
