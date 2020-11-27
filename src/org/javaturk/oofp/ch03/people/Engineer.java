package org.javaturk.oofp.ch03.people;

public class Engineer extends Person{
	protected String branch;

	public Engineer(String name, int age, String branch) {
		super(name, age);
		this.branch = branch;
	}

}
