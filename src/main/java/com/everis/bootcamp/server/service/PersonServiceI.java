package com.everis.bootcamp.server.service;

import com.everis.bootcamp.server.repository.Person;

import reactor.core.publisher.Flux;

public interface PersonServiceI {
	
	public Flux<Person> personList1();
	
	public Flux<Person> personList2();
	
	public Flux<Person> personList3();
	
	public Flux<Person> personList4();
}
