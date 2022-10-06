package com.everis.bootcamp.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.everis.bootcamp.app.repository.Person;
import com.everis.bootcamp.app.service.PersonServiceI;

import reactor.core.publisher.Flux;

@Controller
public class PersonListController {
	
	@Autowired
	PersonServiceI personService;
	
	@GetMapping("/person-list")
	public String personList(final Model model) {
		final Flux<Person> personList = personService.allPersons();
		model.addAttribute("personList",personList);
		return "personlist";
	}
}
