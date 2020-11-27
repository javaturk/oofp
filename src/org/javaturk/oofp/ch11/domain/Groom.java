package org.javaturk.oofp.ch11.domain;

public class Groom extends Person {

	public Groom(String firstName, String lastName) {
		super(firstName, lastName);
	}

	@Override
	public String toString() {
		return "Groom [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
}
