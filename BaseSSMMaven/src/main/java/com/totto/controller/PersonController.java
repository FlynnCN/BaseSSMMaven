package com.totto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.totto.pojo.Card;
import com.totto.pojo.Person;
import com.totto.service.CardService;
import com.totto.service.PersonService;
import com.totto.utils.TottoResult;

@Controller
@RequestMapping("/person")
public class PersonController {
	@Autowired
	private PersonService personService;
	@Autowired
	private CardService cardService;
	
	@RequestMapping("/selectPersonById")
	@ResponseBody
	public Person selectPersonById(Integer id){
		Person person = personService.selectPersonById(id);
		return person;
	}
	
	@RequestMapping("/selectPersonById2")
	@ResponseBody
	public Person selectPersonById2(Integer id){
		Person person = personService.selectPersonById2(id);
		return person;
	}
	
	@RequestMapping("/insertPerson")
	@ResponseBody
	public TottoResult insertPerson() {
		Card card = new Card();
		card.setCode("3333333333333");
		cardService.insertCard(card);
		Person person = new Person();
		person.setAge(25);
		person.setName("wangwu");
		person.setSex("女");
		person.setCard(card);
		personService.insertPerson(person);
		return TottoResult.ok(person);
	}
}
