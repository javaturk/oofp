
package org.javaturk.oofp.ch03.factory2;

public abstract class Person {
	protected String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void live();

}
