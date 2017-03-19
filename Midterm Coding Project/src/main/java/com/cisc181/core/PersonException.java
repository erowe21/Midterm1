package com.cisc181.core;

public class PersonException extends Exception{
	Person person;

	public PersonException(Person person, String Message){
		super(Message);
		this.person =person;
	}
}
