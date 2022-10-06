package com.everis.bootcamp.app.service;

import com.everis.bootcamp.app.repository.Person;

import reactor.core.publisher.Flux;

public interface PersonServiceI {

	public Flux<Person> allPersons();

}
