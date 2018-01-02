package com.yubrajpokharel.model;

import javax.persistence.Id;

public class Person {

	@Id
	private String id;

	private String name;

	public Person() {}

	public Person(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("Person [id=%s, name=%s]", id, name);
	}
}
