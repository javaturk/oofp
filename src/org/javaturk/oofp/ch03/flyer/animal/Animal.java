package org.javaturk.oofp.ch03.flyer.animal;

public class Animal {
	
	protected String name;
	
	public Animal(String name) {
		this.name = name;
	}



	public void eat(){
		System.out.println("Animal is eating.");
	}
}
