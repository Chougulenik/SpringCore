package com.springcore.constructorinjection;


public class Person {

	private String name;
	private String email;
	
	
	public Person() {
		
	}

	public Person(String name, String email) {
		
		this.name = name;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + "]";
	}
	
	
	
	
}
