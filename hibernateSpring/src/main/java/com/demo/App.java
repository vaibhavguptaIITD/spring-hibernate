package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.person.model.Person;
import com.demo.person.service.PersonService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext appContext = 
    	    	  new ClassPathXmlApplicationContext("spring/applicationContext.xml");
    	PersonService personService = (PersonService)appContext.getBean("personService");
    	
    	Person person = new Person();
    	person.setName("Vaibhav");
    	person.setSsn("abcd");
    	
    	personService.create(person);
    }
}
