package com.everis.bootcamp.server.service;

import java.time.Duration;

import org.springframework.stereotype.Service;

import com.everis.bootcamp.server.repository.Person;

import reactor.core.publisher.Flux;

@Service
public class PersonServiceImpl  implements PersonServiceI{

	@Override
	public Flux<Person> personList1() {
		Person person= new Person();
		person.setFirstname("Alberto");
		person.setLastname("Suarez");
		person.setAge(30);
			
		return Flux.just(person).delayElements(Duration.ofSeconds(1));
	}

	@Override
	public Flux<Person> personList2() {
		Person person= new Person();
		person.setFirstname("Ana");
		person.setLastname("Perez");
		person.setAge(21);
		
		return Flux.just(person).delayElements(Duration.ofSeconds(2));
	}

	@Override
	public Flux<Person> personList3() {
		Person person= new Person();
		person.setFirstname("Pepe");
		person.setLastname("Rodriguez");
		person.setAge(28);
		
		return Flux.just(person).delayElements(Duration.ofSeconds(3));
	}

	@Override
	public Flux<Person> personList4() {
		Person person= new Person();
		person.setFirstname("Claudia");
		person.setLastname("Rojas");
		person.setAge(25);

		return Flux.just(person).delayElements(Duration.ofSeconds(4));
	}

}
