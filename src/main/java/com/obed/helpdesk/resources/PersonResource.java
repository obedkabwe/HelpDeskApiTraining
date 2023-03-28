package com.obed.helpdesk.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.obed.helpdesk.entities.Person;
import com.obed.helpdesk.repositories.PersonRepository;

@RestController
@RequestMapping(value = "/persons")
public class PersonResource {

	private PersonRepository repository;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Person> listAll(){
		Person person = new Person();
		
		List<Person> list = new ArrayList<>();
		list.add(person);
		return list;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
