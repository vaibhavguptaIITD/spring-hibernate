package com.demo.person.service;

import com.demo.person.model.Person;

public interface PersonService {
	
	public void create(Person person);
	
	public void update(Person person);
	
	public Person get(Long personId);
	
	public void delete(Person person);
}
