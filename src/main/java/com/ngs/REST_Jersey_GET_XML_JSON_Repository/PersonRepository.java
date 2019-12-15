package com.ngs.REST_Jersey_GET_XML_JSON_Repository;

import java.util.ArrayList;
import java.util.List;

public class PersonRepository {
	
	List <Person> persons; 
	public PersonRepository() {
		persons=new ArrayList<Person>();
		Person p1=new Person();
		p1.setId(1);
		p1.setName("Dhruv");
		persons.add(p1);
		Person p2=new Person();
		p2.setId(2);
		p2.setName("Sreshta");
		persons.add(p2);
	}
	public List<Person> getPersons() {
		return persons;
	}

}
