package com.yubrajpokharel.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.yubrajpokharel.model.Person;

@DataMongoTest
@RunWith(SpringRunner.class)
public class PersonMongoDbRepositoryTest {

	@Autowired
	PersonMongoDbRepository personRepository;

	@Test
	public void simpleTest(){
		personRepository.deleteAll();
		personRepository.save(new Person("name1"));
		personRepository.save(new Person("name2"));
		
		for (Person person : personRepository.findAll()) {
			System.out.println(person);
		}
		
		System.out.println(personRepository.findByName("name1"));
		
		System.out.println(personRepository.count());
	}

	@Test
	public void deleteAllUsers(){
		personRepository.deleteAll();
		System.out.println(personRepository.findAll().size());


	}
}