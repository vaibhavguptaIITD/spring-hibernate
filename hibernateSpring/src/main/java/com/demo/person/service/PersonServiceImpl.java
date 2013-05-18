package com.demo.person.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.GenericDAO;
import com.demo.person.model.Person;

@Transactional
public class PersonServiceImpl implements PersonService{
	
	@Autowired
	private GenericDAO<Person> genericDAO;

	@Override
	public void create(Person person) {
		genericDAO.create(person);
		
	}

	@Override
	public void update(Person person) {
		genericDAO.update(person);
		
	}

	@Override
	public Person get(Long personId) {
		return genericDAO.get(Person.class, personId);
	}

	@Override
	public void delete(Person person) {
		genericDAO.delete(person);
		
	}
	
	public void setGenericDAO(GenericDAO<Person> genericDAO) {
		this.genericDAO = genericDAO;
	}

}
