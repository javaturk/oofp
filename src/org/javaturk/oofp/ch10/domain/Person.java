package org.javaturk.oofp.ch10.domain;

public class Person {
	protected String firstName;
	protected String lastName;

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
}
